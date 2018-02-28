<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration done</title>
</head>
<body>
<h3>Registration done</h3>
<p>User name: ${user.name}</p>
<p>User password: ${user.password}</p>
<p>User e-mail: ${user.email}</p>
<p>User role: ${user.role}</p>
<p><a href="/register">Register again</a></p>
<p><a href="/">Main page</a></p>
</body>
</html>
