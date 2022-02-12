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
<link rel="stylesheet" type="text/css" href="webjars/bootstrap/css/bootstrap.min.css" />
<html>
<head>
    <title>Create</title>
</head>
<%@ include file="/WEB-INF/jsp/fragments/header.jsp" %>
<body>
<sec:authorize access="isAuthenticated()">
<%--@elvariable id="create" type="com.example.contestapp.model.Contest"--%>
<form:form method="post" modelAttribute="create">

    <div>
        <div style="text-align: center"/>
        <div style="font-family: 'Ubuntu Condensed'"
    <label for="name">Give your contest a name</label>
        <form:input path="name" type="text" id="name"/>
        <form:errors path="name" cssClass="error"/>

    </div>
    <div>
        <button type="submit" class="btn-success">Create</button>
    </div>
</form:form>
    <img src="<c:url value="/resources/img/facebook-contest_featured-image-3.png"/> "
</sec:authorize>
</body>
<%@ include file="/WEB-INF/jsp/fragments/footer.jsp" %>
</html>
