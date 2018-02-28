<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2/23/2018
  Time: 4:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Choose exception</title>
</head>
<body>
<h3>Choose exception to throw</h3>
<div>Different unhandled exceptions have processed by different implementations of HandlerExceptionResolver</div>
<div><a href="/exception/arithmetic">Throw ArithmeticException</a></div>
<div><a href="/exception/npe">Throw NullPointerException</a></div>
<div><a href="/exception/class-cast">Throw ClassCastException</a></div>
<div><a href="/exception/illegal-state">Throw IllegalStateException</a></div>
<div><a href="/exception/number-format">Throw NumberFormatException</a></div>
<p>Write in the address bar parameter '?exceptionParam=...' to throw SQLException through interceptor</p>
<p><a href="/">Main page</a></p>
</body>
</html>
