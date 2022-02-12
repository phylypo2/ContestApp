<%--
  Created by IntelliJ IDEA.
  User: filip
  Date: 07.02.2022
  Time: 19:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<%@ include file="/WEB-INF/jsp/fragments/header.jsp" %>
<head>
    <title>Questions</title>
</head>
<body>
<sec:authorize access="isAuthenticated()">
<%--@elvariable id="question" type="com.example.contestapp.model.Question"--%>
<%--@elvariable id="answer" type="com.example.contestapp.model.Answer"--%>
<div style="text-align: center"/>
<div style="font-family: 'Ubuntu Condensed'"

<ul>
    <c:forEach items="${question}" var="question">
        <h2> <li>

            <%--@elvariable id="userContest" type="com.example.contestapp.model.UserContest"--%>
            <%--@elvariable id="contest" type="com.example.contestapp.model.Contest"--%>
        ${question.questName}
                <a href="/answer/add/${question.id}/">Add Answer</a>
                <a href="/answer/list/${question.id}">Show Answers</a>

    </li>
    </c:forEach>

        <a href="/contest/list">Back to Contest List</a>
        </h2>

        </sec:authorize>
</body>
<%@ include file="/WEB-INF/jsp/fragments/footer.jsp" %>
</html>
