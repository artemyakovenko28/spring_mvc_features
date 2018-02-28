<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2/18/2018
  Time: 4:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Traders page</title>
</head>
<body>
<h2>Trades</h2>
<h3>Message: ${msg}</h3>
<br/>
<h4>Current visitor history</h4>
<p>ip: ${visitor.ip}</p>
Enter in address bar url like "trades/**" (for example, "trades/name", "trades/type/name")
<c:forEach items="${visitor.pageVisited}" var="page">
    <p>${page}</p>
</c:forEach>
<p><a href="/trades/clear">Clear history</a></p>
<p><a href="/">Main page</a></p>
</body>
</html>
