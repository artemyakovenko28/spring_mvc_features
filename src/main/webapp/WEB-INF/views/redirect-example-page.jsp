<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2/21/2018
  Time: 2:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Redirect page</title>
</head>
<body>
<h3>Redirect successfully completed!</h3>
<p>id: ${id} (path variable)</p>
<p>attribute: ${attribute} (set as parameter when redirecting)</p>
<p>flashAttribute: ${flashAttribute} (saved as model attribute when redirecting)</p>
<p><a href="/">Main page</a></p>
</body>
</html>
