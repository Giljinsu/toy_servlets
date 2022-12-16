package com.jinsu.toy_servlets;

import java.util.ArrayList;
import java.util.HashMap;

import com.jinsu.toy_servlets.beans.SurveyQuestionBeans;

public class DataInfos {
    public ArrayList<SurveyQuestionBeans> getQuestionBeansList() {
        ArrayList<SurveyQuestionBeans> survey = new ArrayList<>();
        
        SurveyQuestionBeans questionBeans = new SurveyQuestionBeans();
        questionBeans.setNum(1);
        questionBeans.setName("길진수");
        questionBeans.setBelong("KH");
        questionBeans.setQuestion("해당 매장을 방문시 매장은 청결 하였습니까?");
        questionBeans.setAnswer("전혀 아니다");
        questionBeans.setAnswer02("아니다");
        questionBeans.setAnswer03(" ");
        questionBeans.setAnswer04(" ");
        questionBeans.setAnswer05(" ");
        survey.add(questionBeans);

        SurveyQuestionBeans questionBeans02 = new SurveyQuestionBeans();
        questionBeans.setNum(2);
        questionBeans02.setQuestion("주문시 직원은 고객님께 친절 하였습니까?");
        questionBeans02.setAnswer("전혀 아니다");
        questionBeans02.setAnswer02("아니다");
        questionBeans02.setAnswer03("보통이다");
        questionBeans02.setAnswer04(" ");
        questionBeans02.setAnswer05(" ");
        survey.add(questionBeans02);

        SurveyQuestionBeans questionBeans03 = new SurveyQuestionBeans();
        questionBeans.setNum(3);
        questionBeans03.setQuestion("주문하신 음료가 나오기까지 시간이 적당하였습니까?");
        questionBeans03.setAnswer("전혀 아니다");
        questionBeans03.setAnswer02("아니다");
        questionBeans03.setAnswer03(" ");
        questionBeans03.setAnswer04(" ");
        questionBeans03.setAnswer05(" ");
        survey.add(questionBeans03);

        SurveyQuestionBeans questionBeans04 = new SurveyQuestionBeans();
        questionBeans.setNum(4);
        questionBeans04.setQuestion("해당 매장을 다음에도 재방문 하실 의향이 있으십니까?");
        questionBeans04.setAnswer("전혀 아니다");
        questionBeans04.setAnswer02("아니다");
        questionBeans04.setAnswer03("보통이다");
        questionBeans04.setAnswer04("그렇다");
        questionBeans04.setAnswer05("매우 그렇다");
        survey.add(questionBeans04);

        SurveyQuestionBeans questionBeans05 = new SurveyQuestionBeans();
        questionBeans.setNum(5);
        questionBeans05.setQuestion("직원이 제조한 음료에 대해 맛은 좋았습니까?");
        questionBeans05.setAnswer("전혀 아니다");
        questionBeans05.setAnswer02("아니다");
        questionBeans05.setAnswer03("보통이다");
        questionBeans05.setAnswer04(" ");
        questionBeans05.setAnswer05(" ");
        survey.add(questionBeans05);

        return survey;
    }

    

}
