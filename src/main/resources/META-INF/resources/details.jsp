<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.HashMap, java.util.ArrayList" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" 
    integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
    <%
        HashMap<String, Object> question = (HashMap<String, Object>)request.getAttribute("question"); 
        ArrayList<String> question_answers = (ArrayList<String>)request.getAttribute("question_answers"); 
        Object order = request.getAttribute("order"); 

    %>
    
    <div class="container border border-5">
        <!-- buttons -->
        <form action="/poll/PollServlet" method="get">
            <div class="buttons">
                <button class="btn btn-primary" id="prev" name="order" value="<%=((int)order-1)%>">Prev</button>
                <button class="btn btn-primary" id="next" name="order" value="<%=((int)order+1)%>">Next</button>
            </div>
        </form>
        <!-- poll contents -->
        <div id="poll-contents">
            <div>
            <%=question.get("ORDERS")+". "+question.get("QUESTIONS")%>
            </div>
            <% for(int i=0; i<question_answers.size(); i++) {%>
                <div>
                    <%=question_answers.get(i)%>
                </div>
            <%}%>
        </div>
        
    </div>
    <script src="./js/javascriptWithPoll_Together.js"></script>
</body>
</html>