<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Exception page</title>
</head>
<body>
<h1>NullPointerException page</h1>
<p>${exception}</p>
<%((Exception) request.getAttribute("exception")).printStackTrace(response.getWriter());%>
</body>
</html>
