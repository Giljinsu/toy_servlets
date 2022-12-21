package com.jinsu.toy_servlets.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class Survey {
    public ArrayList<HashMap> getList() {
        Commons commons = new Commons();
        Statement questionsStatement = commons.getStatement();
        Statement answersStatement = commons.getStatement();
        Statement qaLinkStatement = commons.getStatement();
        String questionUid_compare = "";
        String query =""; // Answer 리스트
        HashMap<String, Object> question = null;
        ArrayList<HashMap> surveyList = new ArrayList<>();

        try {
            
            // 문항 답항 연결
            query = "SELECT * FROM answers ORDER BY QUESTIONS_UID;";
            ResultSet qaLinkresultSet = qaLinkStatement.executeQuery(query);
            // ArrayList<String> answers = new ArrayList<>();
            String[][] answerList = new String[10][10];
            int answerNum=0;
            int questionNum =0;
            while(qaLinkresultSet.next()) {
                String questionUid = qaLinkresultSet.getString("QUESTIONS_UID");
                if(!questionUid.equals(questionUid_compare)) {
                    answerNum = 0;
                    questionNum++;
                    answerList[questionNum-1][answerNum] = qaLinkresultSet.getString("EXAMPLE_UID");
                } else {
                   answerList[questionNum-1][answerNum] = qaLinkresultSet.getString("EXAMPLE_UID");
                }
                questionUid_compare = questionUid;
                

                //설문 답항
                query = "SELECT * FROM example_list ORDER BY ORDERS;";
                ResultSet resultSetAnswer = answersStatement.executeQuery(query);
                while(resultSetAnswer.next()) {
                    String exmple_uid = resultSetAnswer.getString("EXAMPLE_UID");
                    String example = resultSetAnswer.getString("EXAMPLE");
                    // String orders = resultSetAnswer.getString("ORDERS");
                    if(answerList[questionNum-1][answerNum].equals(exmple_uid)) {
                        answerList[questionNum-1][answerNum] = example;
                    }
                }

                answerNum++;
            }

            //설문 문항
            query = "SELECT * FROM questions_list ORDER BY ORDERS;";
            ResultSet resultSet = questionsStatement.executeQuery(query);
            int i=0;
            while(resultSet.next()) {
                question = new HashMap<>();
                ArrayList<String> question_answers = new ArrayList<>();
                    for(int j=0; j<answerList[i].length; j++) {
                        question_answers.add(answerList[i][j]);
                    }
                HashMap<String, Object> survey = new HashMap<>();
                question.put("ORDERS", resultSet.getString("ORDERS"));
                question.put("QUESTIONS", resultSet.getString("QUESTIONS"));
                question.put("QUESTIONS_UID", resultSet.getString("QUESTIONS_UID"));

                survey.put("question_answers", question_answers);
                survey.put("question", question);
                
                // question_answers.clear();
                surveyList.add(survey);
                i++;
                                
            }


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return surveyList;
    }
}
