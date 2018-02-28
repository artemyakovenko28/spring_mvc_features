<%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<form:form action="/register" method="post" modelAttribute="user">
    <pre>
             Name <form:input path="name"/>
                  <form:errors path="name" cssClass="error"/>

         Password <form:input path="password"/>
                  <form:errors path="password" cssClass="error"/>

    Email address <form:input path="email"/>
                  <form:errors path="email" cssClass="error"/>

             Role <select name="role">
                        <option value="admin">admin</option>
                        <option value="user">user</option>
                    </select>
                                    <input type="submit" value="Sumbit">
    </pre>
</form:form>
<p><a href="/">Main page</a></p>
</body>
</html>
