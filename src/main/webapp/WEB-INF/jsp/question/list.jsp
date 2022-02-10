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
    <title>Title</title>
</head>
<body>
<ul>
<%--@elvariable id="questionList" type="com.example.contestapp.model.Question"--%>
    <ul>
       <%-- <c:forEach items="${contest}" var="contest">
            <li>

            </li>
        </c:forEach> --%>


        <c:forEach items="${questionList}" var="questionList">


                <li>
                        ${questionList.contest_id} ${questionList.questName}
                </li>
            </c:forEach>

           <a href="/contest/list">Show Contest</a>
           <h3><a href="/answer/add">Add Answer to this question</a></h3>




    </ul>
</ul>
</body>
</html>
