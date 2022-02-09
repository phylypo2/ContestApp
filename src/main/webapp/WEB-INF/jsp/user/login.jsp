<%--
  Created by IntelliJ IDEA.
  User: filip
  Date: 27.01.2022
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<form method="post">
    <div class="form-group-row"><label class="col-form-label col-2"> Login: <input type="text" name="username"/> </label></div>
    <div class="form-group-row"><label class="col-form-label col-2"> Password: <input type="password" name="password"/> </label></div>
    <div>
        <button type="submit" class="btn btn-primary">Sign In</button>
    </div>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>


<sec:authorize access="isAuthenticated()">
    <form method="post" action="<c:url value ="/logout"/>" >
        <input type="submit" value="Wyloguj">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>
</sec:authorize>

<sec:authorize access="isAuthenticated()">
    <p>Zalogowany jako: <sec:authentication property="principal.username"/></p>
    <p>Posiada role: <sec:authentication property="authorities"/></p>
</sec:authorize>

</body>
</html>
