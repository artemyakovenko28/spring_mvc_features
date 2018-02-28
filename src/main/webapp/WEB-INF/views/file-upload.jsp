<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2/19/2018
  Time: 7:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>File upload</title>
    <link rel="stylesheet" type="text/css" href="main.css">
</head>
<body>
<h3>Upload file form</h3>
<form action="upload" method="post" enctype="multipart/form-data">
    Upload file <input type="file" name="upload-file">
    <input type="submit" value="Upload">
</form>
<p class="error">${emptyFile}</p>
<p><a href="/">Main page</a></p>
</body>
</html>
