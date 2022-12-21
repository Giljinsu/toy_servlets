package com.jinsu.toy_servlets.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.jinsu.toy_servlets.dao.Survey;
import com.jinsu.toy_servlets.dao.Survey_copy;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/poll/PollServlet")
public class DetailServlets extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Survey survey = new Survey();
        Survey_copy survey = new Survey_copy();
        ArrayList<HashMap> surveyList = survey.getList();
        // int page = 0;
        int page =  Integer.parseInt(request.getParameter("order"));;
        if(page > 4) {
            page = 4;
        } else if(page < 0) {
            page =0;
        }
        // for(int i=0; i<surveyList.size(); i++) {
            HashMap<String, Object> surveyQuestion = surveyList.get(page);//페이지
            HashMap<String, Object> question = (HashMap)surveyQuestion.get("question");
            ArrayList<String> question_answers = (ArrayList<String>)surveyQuestion.get("question_answers");
           System.out.println("");
        // }
        request.setAttribute("question", question);
        request.setAttribute("question_answers", question_answers);
        request.setAttribute("order", page);
       
        System.out.println();
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/details.jsp");
        requestDispatcher.forward(request, response);
    }

}
