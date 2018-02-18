<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2/18/2018
  Time: 8:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User registration</title>
</head>
<body>
<h3>Registration form</h3>
<br>
<form action="register" method="post">
    <pre>
             Name <input type="text" name="name"/>
         Password <input type="text" name="password">
    Email address <input type="text" name="email">
             Role <select name="role">
                        <option value="admin">admin</option>
                        <option value="user">user</option>
                    </select>
                                    <input type="submit" value="Sumbit">
    </pre>
</form>
</body>
</html>
