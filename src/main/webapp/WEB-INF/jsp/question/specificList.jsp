<%--
  Created by IntelliJ IDEA.
  User: filip
  Date: 07.02.2022
  Time: 19:23
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
    <title>Title</title>
</head>
<body>
<%--@elvariable id="questionListId" type="com.example.contestapp.model.Question"--%>
<ul>
    <c:forEach items="${questionListId}" var="questionListId">


<li>
${questionListId.contest_id} ${questionListId.questName}
</li>




    </c:forEach>
</body>
</html>
