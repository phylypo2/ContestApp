<%--
  Created by IntelliJ IDEA.
  User: filip
  Date: 04.02.2022
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--@elvariable id="userContest" type="com.example.contestapp.model.UserContest"--%>
<%--@elvariable id="contest" type="com.example.contestapp.model.Contest"--%>
<%--@elvariable id="question" type="com.example.contestapp.model.Question"--%>
<ul>

    <c:forEach items="${contest}" var="contest">
        <li> ${contest.id} ${contest.name}
            <a href="/question/add/${contest.id}">Add Question</a>
        </li>
    </c:forEach>
<c:forEach items="${question}" var="question">
        <a href="/question/add/${question.contest_id}">Add Question</a>
        <a href="/form/books/remove/${userContest}">Add Anwser</a>
            <a href="/question/list">Show Questions</a>
</c:forEach>
    <c:forEach items="${userContest}" var="userContest">
        <li>
            <a href="/contest/remove/${userContest.id}">Delete contest</a>
        </li>
    </c:forEach>




</ul>
</body>
</html>
