<%--
  Created by IntelliJ IDEA.
  User: filip
  Date: 31.01.2022
  Time: 13:16
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
<sec:authorize access="isAuthenticated()">
<%--@elvariable id="create" type="com.example.contestapp.model.Contest"--%>
<form:form method="post" modelAttribute="create">

    <div>
    <label for="name">Name</label>
        <form:input path="name" type="text" id="name"/>
        <form:errors path="name" cssClass="error"/>

    </div>
    <div>
        <input type="submit" value="Save">
    </div>
</form:form>
</sec:authorize>
</body>
</html>
