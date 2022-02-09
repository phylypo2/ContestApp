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
<%--@elvariable id="question" type="pl.coderslab.model.Question"--%>
<form:form method="post" modelAttribute="question">
    <div>
        <label for="questName">Question</label>
        <form:input required="questName" path="questName" type="text"/>
        <form:errors path="questName" cssClass="error"/>
    </div>

    <div>
        <input type="submit" value="Save">
    </div>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
</form:form>
<body>

</body>
</html>
