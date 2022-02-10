<%--
  Created by IntelliJ IDEA.
  User: filip
  Date: 10.02.2022
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <title>Title</title>
</head>
<body>
<form:form method="post" modelAttribute="answer">
    <div>
        <label>Country:</label>
        <form:input path="country" type="text"/>
        <form:errors path="country" cssClass="error" element="div"/>
    </div>
    <div>
        <label>Participant:</label>
        <form:input path="participant" type="text"/>
        <form:errors path="participant" cssClass="error"/>
    </div>
    <div>
        <label>Song:</label>
        <form:input path="song" type="text"/>
        <form:errors path="song" cssClass="error"/>
    </div>

    <div>
        <input type="submit" value="Save">
    </div>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
</form:form>
</body>
</html>
