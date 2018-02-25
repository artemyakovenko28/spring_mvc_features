<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2/22/2018
  Time: 1:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
    <link rel="stylesheet" href="<spring:theme code="main-css"/>" type="text/css">
</head>
<body style="background-color: <spring:theme code="background"/>;">
<div style="width: <spring:theme code="content-width"/>; margin: auto;">
    <p>Select view controller:</p>
    <p><a href="/view-controller">Default view controller</a></p>
    <p><a href="/status-controller">Status code view controller</a></p>
    <p><a href="/redirect-view-controller?param1=param1Value&param2=param2Value">Redirect view controller</a></p>
</div>
<div class="summary">Aliquam tincidunt mauris eu risus</div>
</body>
</html>
