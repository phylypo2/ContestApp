<%--
  Created by IntelliJ IDEA.
  User: filip
  Date: 10.02.2022
  Time: 13:47
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
    <title>List</title>
</head>
<%@ include file="/WEB-INF/jsp/fragments/header.jsp" %>
<%--@elvariable id="answer" type="com.example.contestapp.model.Answer"--%>
<body>
<sec:authorize access="isAuthenticated()">
<div style="text-align: center"/>
<div style="font-family: 'Ubuntu Condensed'"/>

<c:forEach items="${answer}" var="answer">


        <h2>   ${answer.country} , ${answer.participant} - ${answer.song}
                <a href="/answer/vote/${answer.id}">Vote!</a></h2>


</c:forEach>

    <a href="/contest/list/">Back to contest</a>

</div>
</body>
</sec:authorize>
<%@ include file="/WEB-INF/jsp/fragments/footer.jsp" %>
</html>
