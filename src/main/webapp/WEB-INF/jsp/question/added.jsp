<%--
  Created by IntelliJ IDEA.
  User: filip
  Date: 07.02.2022
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<link rel="stylesheet" type="text/css" href="webjars/bootstrap/css/bootstrap.min.css" />
<html>
<html>
<head>
    <title>Added</title>
</head>
<%@ include file="/WEB-INF/jsp/fragments/header.jsp" %>
<body>
<sec:authorize access="isAuthenticated()">

<%--@elvariable id="question" type="com.example.contestapp.model.Question"--%>
<%--@elvariable id="contest" type="com.example.contestapp.model.Contest"--%>
<%--@elvariable id="answer" type="com.example.contestapp.model.Answer"--%>

<td>
    <div style="text-align: center"/>
    <div style="font-family: 'Ubuntu Condensed'">
       <h1> Congratulations! You just add a question to your contest</h1>
<h3>  <a href="/question/list/${question.contest_id}/${answer.user_contest_id}">Show me my questions</a></h3>
        <h3>  <a href="/question/add/${question.contest_id}">Add new question</a></h3>
<h3><a href="/contest/create">Create new contest</a></h3>
    </div>
</body>
</sec:authorize>
<%@ include file="/WEB-INF/jsp/fragments/footer.jsp" %>
</html>
