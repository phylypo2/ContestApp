<%--
  Created by IntelliJ IDEA.
  User: filip
  Date: 06.02.2022
  Time: 13:27
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
<%--@elvariable id="user" type="com.example.contestapp.model.User"--%>
<ul>
    <c:forEach items="${user}" var="user">


        <c:forEach items="${userContest}" var="userContest">
            <li>
                    ${user.id} ${user.login}
                <a href="/form/books/edit/${userContest}">Add Question</a>
                <a href="/form/books/remove/${userContest}">Add Anwser</a>
                <a href="/contest/remove/${userContest.contest_id}">Delete contest</a>
            </li>
        </c:forEach>




    </c:forEach>



</ul>
</body>
</html>