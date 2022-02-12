<%--
  Created by IntelliJ IDEA.
  User: filip
  Date: 06.02.2022
  Time: 13:48
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
<title>Add Question</title>

<body>
<%@ include file="/WEB-INF/jsp/fragments/header.jsp" %>
<sec:authorize access="isAuthenticated()">
<div class="container">
    <div class="m-3">
        <div class="form-group row">
<form:form method="post" modelAttribute="question">
    <div style="text-align: center"/>
    <div style="font-family: 'Ubuntu Condensed'"
    <div>
        <label for="questName">Type something</label>
        <form:input required="questName" path="questName" type="text"/>
        <form:errors path="questName" cssClass="error"/>

    </div>

    It doesn't have to be a question!

    <div>
        <button type="submit" class="btn btn-primary">Save</button>
    </div>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
</form:form>
<img src="<c:url value="/resources/img/eurovision.jpeg"/> "
</body>
</sec:authorize>
<%@ include file="/WEB-INF/jsp/fragments/footer.jsp" %>
</html>
