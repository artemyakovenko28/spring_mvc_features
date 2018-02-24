<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test Error View</title>
</head>
<body>
<h3>Test ErrorView</h3>
<h2>Handled by custom HandlerExceptionToViewResolver</h2>
<p>Request Uri: <b>${requestUri}</b></p>
<p>Exception: <b>${exception['class'].name}</b></p>
<p>Message: ${exception.message}</p>
<p>Response status: <b>${statusValue} (${statusStr})</b></p>
</body>
</html>