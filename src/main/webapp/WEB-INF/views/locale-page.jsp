<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Locale</title>
</head>
<body>
<h1><spring:message code="label.welcome"/></h1>
<div><spring:message code="label.select_language"/></div>
<div>
    <a href="locale?locale=en_EN">EN</a>
    <a href="locale?locale=ru_RU">RU</a>
    <a href="locale?locale=uk_UA">UK</a>
</div>
<p><a href="/">Main page</a></p>
</body>
</html>
