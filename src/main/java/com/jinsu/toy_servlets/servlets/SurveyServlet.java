package com.jinsu.toy_servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.jinsu.toy_servlets.DataInfos;
import com.jinsu.toy_servlets.beans.SurveyQuestionBeans;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/pollListServlet")
public class SurveyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8"); // 문자셋을 UTF-8로 바꿔줌
        PrintWriter printWriter = response.getWriter();
        DataInfos dataInfos = new DataInfos();
        ArrayList<SurveyQuestionBeans> finalSurvey = dataInfos.getQuestionBeansList();

        
        printWriter.println("<html lang='en'>");
        printWriter.println("<head>");
        printWriter.println("<meta charset='UTF-8'>");
        printWriter.println("<meta http-equiv='X-UA-Compatible' content='IE=edge'>");
        printWriter.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        printWriter.println("<title>Document</title>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        for(int i=0; i<finalSurvey.size() ; i++) {
            if(i==0) {
                printWriter.println("<div> 본인 이름 : "+finalSurvey.get(i).getName()+"</div>");
                printWriter.println("<div> 본인 소속 : "+finalSurvey.get(i).getBelong()+"</div>");
            }
        printWriter.println("<div> "+(i+1)+". "+finalSurvey.get(i).getQuestion()+
        " "+finalSurvey.get(i).getAnswer()+
        " "+finalSurvey.get(i).getAnswer02()+
        " "+finalSurvey.get(i).getAnswer03()+
        " "+finalSurvey.get(i).getAnswer04()+
        " "+finalSurvey.get(i).getAnswer05()+
        "</div>");
        
        }
        printWriter.println("</body>");
        printWriter.println("</html>");
    }
}
