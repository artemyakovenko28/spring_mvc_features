<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<p>Enter url in address bar "users/1" or "users/2" ... (choose numbers between 0 - 9) (@PathVariable example)</p>
<p>Enter parameter "?querier=..." (type querier name) (@RequestParam example)</p>
<p><a href="/">Main page</a></p>
</body>
</html>
