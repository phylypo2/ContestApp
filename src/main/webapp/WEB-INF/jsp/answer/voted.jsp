<%--
  Created by IntelliJ IDEA.
  User: filip
  Date: 11.02.2022
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Voted!</title>
</head>
<%@ include file="/WEB-INF/jsp/fragments/header.jsp" %>
<body>
<sec:authorize access="isAuthenticated()">
<%--@elvariable id="question" type="com.example.contestapp.model.Question"--%>
<%--@elvariable id="contest" type="com.example.contestapp.model.Contest"--%>
<%--@elvariable id="answer" type="com.example.contestapp.model.Answer"--%>
<%--@elvariable id="vote" type="com.example.contestapp.model.Vote"--%>
<div style="text-align: center"/>
<div style="font-family: 'Ubuntu Condensed'"></div>
<h2>And the ${vote.points} points goes to... ${vote.answer_id} !</h2>


<a href="/contest/list/">Back to Contest</a>
<a href="/answer/points/${vote.points}">Sum the points</a>
</sec:authorize>
</body>
<%@ include file="/WEB-INF/jsp/fragments/footer.jsp" %>
</html>
