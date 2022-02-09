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
    <title>Title</title>
</head>
<body>

<p>
    Are you sure you want to remove contest with id ${userContestId} ?
</p>
<div>
    <a href="/contest/delete/${userContestId}"> Yes </a>
    <a href="/contest/list"> No </a>
</div>

</body>
</html>
