<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2/18/2018
  Time: 7:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Time</title>
</head>
<body>
<h1>Hello, user</h1>
<p>Your first vist time: ${sessionScope.sessionStartTime}</p>
<p>You visit site for: ${sessionTimeDuration} seconds</p>
<a href="${pageContext.request.contextPath}/time/clear">Reset time</a>
</body>
</html>
