<%--
  Created by IntelliJ IDEA.
  User: filip
  Date: 31.01.2022
  Time: 13:09
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
    <sec:authorize access="isAuthenticated()">

    <h3><a href="/contest/create">Create Contest</a></h3>

    <h3><a href="/userContest/list">Show your contests</a></h3>

    <h3><a href="/contest/list">Show All Contests</a></h3>

    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>



    </sec:authorize>

</body>
</html>
