<%--
  Created by IntelliJ IDEA.
  User: filip
  Date: 11.02.2022
  Time: 13:49
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
    <title>Vote!</title>
</head>
<%@ include file="/WEB-INF/jsp/fragments/header.jsp" %>
<body>
<sec:authorize access="isAuthenticated()">

<div>
    <%--@elvariable id="answer" type="com.example.contestapp.model.Answer"--%>
        <div style="text-align: center"/>
        <div style="font-family: 'Ubuntu Condensed'"
    <label>Give points from 0 to 12 </label>
<form:form method="post" modelAttribute="vote">

    <div>
    <label for="points">Give points</label>
    <form:input path="points" items="${points}" type="number" id="points"/>
    <form:errors path="points" cssClass="error"/>

</div>
    <div>
        <input type="submit" value="Save">
    </div>
    </form:form>
</body>
</sec:authorize>
<%@ include file="/WEB-INF/jsp/fragments/footer.jsp" %>
</html>
