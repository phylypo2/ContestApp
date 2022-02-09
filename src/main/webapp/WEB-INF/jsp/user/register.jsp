<%--
  Created by IntelliJ IDEA.
  User: filip
  Date: 26.01.2022
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link rel="stylesheet" type="text/css" href="webjars/bootstrap/css/bootstrap.min.css" />
<html>

<head>
    <title>Register-Page</title>
</head>
<body>

<form:form action="/register" method="post" modelAttribute="user"
cssStyle="max-width: 600px; margin: 0 auto">
<div class="container">
    <div class="m-3">
        <h1><spring:message code="app.title"/></h1>
        User Registration - Sign Up
    </div>
    <div class="m-3">

        <div class="form-group row">
            <label class="col-form-label col-2">Login</label>
            <div class="col-8">
                <form:input required="login" cssClass="form-control" path="login" type="text"/>
                <form:errors path="login" cssClass="error"/>
            </div>

        </div>
        <div class="form-group row">
            <label class="col-form-label col-2">Email</label>
            <div class="col-8">
            <form:input required="email" cssClass="form-control" path="email" type="email"/>
            <form:errors path="email" cssClass="error"/>
            </div>
        </div>

        <div class="form-group row">
            <label class="col-form-label col-2">Password</label>
            <div class="col-8">
                <form:input required="password" cssClass="form-control" path="password"  type="password"/>
                <form:errors path="password" cssClass="error"/>
            </div>

        <div>
            <button type="submit" class="btn btn-primary">Sign Up</button>
        </div>
        </div>

    </div>
</form:form>
</div>
</body>
</html>
