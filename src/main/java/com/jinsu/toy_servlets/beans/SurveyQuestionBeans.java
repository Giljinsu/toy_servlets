package com.jinsu.toy_servlets.beans;

public class SurveyQuestionBeans {
    private String name; // 이름
    private String belong; //소속
    private int num;
    private String question; // 문항
    private String answer;
    private String answer02;
    private String answer03;
    private String answer04;
    private String answer05; 

    
    public void setNum(int num) {
        this.num = num;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBelong(String belong) {
        this.belong = belong;
    }
    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public void setAnswer02(String answer02) {
        this.answer02 = answer02;
    }
    public void setAnswer03(String answer03) {
        this.answer03 = answer03;
    }
    public void setAnswer04(String answer04) {
        this.answer04 = answer04;
    }
    public void setAnswer05(String answer05) {
        this.answer05 = answer05;
    }

    public int getNum() {
        return num;
    }
    public String getName() {
        return name;
    }
    public String getBelong() {
        return belong;
    }
    public String getQuestion() {
        return question;
    }
    public String getAnswer() {
        return answer;
    }
    public String getAnswer02() {
        return answer02;
    }
    public String getAnswer03() {
        return answer03;
    }
    public String getAnswer04() {
        return answer04;
    }
    public String getAnswer05() {
        return answer05;
    }
     
}
