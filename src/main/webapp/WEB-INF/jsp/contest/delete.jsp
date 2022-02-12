<%--
  Created by IntelliJ IDEA.
  User: filip
  Date: 05.02.2022
  Time: 19:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Remove</title>
</head>
<%@ include file="/WEB-INF/jsp/fragments/header.jsp" %>
<body>

<p>
    Are you sure you want to remove contest with id ${userContestId} ?
</p>
<div>
    <a href="/contest/delete/${userContestId}/${contestId}"> Yes </a>
    <a href="/contest/list"> No </a>
</div>

</body>
<%@ include file="/WEB-INF/jsp/fragments/footer.jsp" %>
</html>
