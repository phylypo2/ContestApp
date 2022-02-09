<%--
  Created by IntelliJ IDEA.
  User: filip
  Date: 25.01.2022
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="webjars/bootstrap/css/bootstrap.min.css" />
<html>

<head>
    <title>Home-Page</title>
</head>
<body>
<div class="container">
<div>
<h1><spring:message code="app.title"/></h1>

</div>
<div>
    <h3><a href="/register">Register</a></h3>
    <h3><a href="/login">Login</a></h3>

    <sec:authorize access="isAuthenticated()">
        <form action="<c:url value="/logout"/>" method="post">
            <input type="submit" value="Wyloguj">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
    </sec:authorize>
</div>
</div>
</body>
</html>
