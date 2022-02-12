<%--
  Created by IntelliJ IDEA.
  User: filip
  Date: 11.02.2022
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Added</title>
</head>
<%@ include file="/WEB-INF/jsp/fragments/header.jsp" %>

<sec:authorize access="isAuthenticated()">
<body>

<%--@elvariable id="question" type="com.example.contestapp.model.Question"--%>
<%--@elvariable id="contest" type="com.example.contestapp.model.Contest"--%>
<%--@elvariable id="answer" type="com.example.contestapp.model.Answer"--%>

<td>
    <div style="text-align: center"/>
    <div style="font-family: 'Ubuntu Condensed'">
        <h1> Congratulations! You just add <b>${answer.country}</b>, <b>${answer.participant}</b> and <b>${answer.song}</b> to your contest!</h1>
        <h3>  <a href="/answer/list/${answer.question_id}/">Show Answers</a></h3>
        <h3>  <a href="/answer/add/${answer.question_id}">Add new answer</a></h3>
        <h3><a href="/contest/create">Create new contest</a></h3>
    </div>
</body>
<%@ include file="/WEB-INF/jsp/fragments/footer.jsp" %>
</sec:authorize>
</html>
