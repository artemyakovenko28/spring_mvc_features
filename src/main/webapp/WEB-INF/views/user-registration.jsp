<%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>
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
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
<h3>Registration form</h3>
<br>
<frm:form action="/register" method="post" modelAttribute="user">
    <pre>
             Name <frm:input path="name"/>
                  <frm:errors path="name" cssClass="error"/>

         Password <frm:input path="password"/>
                  <frm:errors path="password" cssClass="error"/>

    Email address <frm:input path="email"/>
                  <frm:errors path="email" cssClass="error"/>

             Role <select name="role">
                        <option value="admin">admin</option>
                        <option value="user">user</option>
                    </select>
                                    <input type="submit" value="Sumbit">
    </pre>
</frm:form>
</body>
</html>
