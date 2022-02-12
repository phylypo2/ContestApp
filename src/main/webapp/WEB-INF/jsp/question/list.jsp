<%--
  Created by IntelliJ IDEA.
  User: filip
  Date: 07.02.2022
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <title>Test</title>
</head>
<%@ include file="/WEB-INF/jsp/fragments/header.jsp" %>
<body>
<sec:authorize access="isAuthenticated()">
<ul>
<%--@elvariable id="questionList" type="com.example.contestapp.model.Question"--%>
<%--@elvariable id="answer" type="com.example.contestapp.model.Answer"--%>
    <%--@elvariable id="userContest" type="com.example.contestapp.model.UserContest"--%>
    <ul>
       <%-- <c:forEach items="${contest}" var="contest">
            <li>

            </li>
        </c:forEach> --%>
         <%---  <c:forEach items="${questionList}" var="questionList"> ---%>
         <%---  ${questionList.questName} ---%>
                <li>

                            <a href="/contest/list">Show Contest</a>
                </li>
           <h3><a href="/answer/add//">Add Answer to </a></h3>




    </ul>
</ul>
</body>
</sec:authorize>
<%@ include file="/WEB-INF/jsp/fragments/footer.jsp" %>
</html>
