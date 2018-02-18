<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2/18/2018
  Time: 2:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Message: ${msg}</h3>
<p>Time: ${time}</p>
<p>Total visits: ${visits}</p>
<br>
<p>Requested by: ${querier}</p>
<c:if test="${user ne null}">
    <p>User id: ${user.id}</p>
    <p>User name: ${user.name}</p>
    <p>User role: ${user.role}</p>
</c:if>
</body>
</html>
