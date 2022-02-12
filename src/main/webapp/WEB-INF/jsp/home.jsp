<%--
  Created by IntelliJ IDEA.
  User: filip
  Date: 31.01.2022
  Time: 12:41
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
<%@ include file="/WEB-INF/jsp/fragments/header.jsp" %>
<div style="text-align: center"/>
<div style="font-family: 'Ubuntu Condensed'"
<div class="container">
    <div class="m-3">
        <h1><spring:message code="app.title"/></h1>
    </div>
    <div class="m-3">
        <div class="form-group row">
            <label class="col-form-label col-2"></label>
            <div class="col-8">
                <h3><a href="/register">Register</a></h3>
    <h3><a href="/login">Login</a></h3>
    <sec:authorize access="isAuthenticated()">
    <h3><a href="/contest/contest">Contest</a></h3>
    </sec:authorize>
                <sec:authorize access="isAuthenticated()">
                <p>Hello <sec:authentication property="principal.username"/>!  Welcome to Contest App! Click Contest to experience more!</p>
                </sec:authorize>
    <sec:authorize access="isAuthenticated()">
    <form action="<c:url value="/logout"/>" method="post">
        <input type="submit" class="btn btn-primary" value="Log Out">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>
    </sec:authorize>



</body>
</html>
<%@ include file="/WEB-INF/jsp/fragments/footer.jsp" %>