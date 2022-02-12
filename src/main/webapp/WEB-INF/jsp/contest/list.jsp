<%--
  Created by IntelliJ IDEA.
  User: filip
  Date: 04.02.2022
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link rel="stylesheet" type="text/css" href="webjars/bootstrap/css/bootstrap.min.css" />
<html>
<%@ include file="/WEB-INF/jsp/fragments/header.jsp" %>
<head>
    <title>Contest List</title>
</head>
<body>
<sec:authorize access="isAuthenticated()">
<div class=container
<div class="m-3">
<%--@elvariable id="userContest" type="com.example.contestapp.model.UserContest"--%>
<%--@elvariable id="contest" type="com.example.contestapp.model.Contest"--%>
<%--@elvariable id="question" type="com.example.contestapp.model.Question"--%>


<ul>
    <div>
        <div style="text-align: center">   <h1><b>List of contests</b></h1>
        </div>

    <c:forEach items="${contest}" var="contest">
        <div style="text-align: center"/>
        <div style="font-family: 'Ubuntu Condensed'"
        <li>
      <h2><c:out value=" ${contest.name} "/>

        <a href="/question/add/${contest.id}">Add Question</a>
        <a href="/question/list/${contest.id}">Show Questions</a>
          <a class="nav-link disabled" href="/contest/listTest/${contest.id}">Show Details</a>
        <c:forEach items="${userContest}" var="userContest">
          <%---  <a href="/contest/remove/${userContest.id}/${contest.id}">Delete contest ${userContest.id}</a> ---%>
      </h2>
        </li>
    </c:forEach>


    </c:forEach>
        <img src="<c:url value="/resources/img/facebook-contest_featured-image-3.png"/> "

   <%--- <c:forEach items="${question}" var="question">
        <a href="/question/add/${question.contest_id}">Add Question</a>
        <a href="/form/books/remove/${userContest}">Add Anwser</a>
        <a href="/question/list">Show Questions</a>
    </c:forEach> ---%>

</div>

    </sec:authorize>


</ul>
</body>
<%@ include file="/WEB-INF/jsp/fragments/footer.jsp" %>
</html>
