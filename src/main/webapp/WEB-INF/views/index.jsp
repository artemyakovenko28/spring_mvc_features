<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
<h2>Welcome to the Spring MVC features!</h2>

<h3>Working with ModelAttribute, SessionAttribute and RequestAttribute</h3>
<p>Adding attributes to Model before passing request to handler using @ModelAttribute</p>
<p><a href="/users">Try</a></p>
<p>Providing a Model attribute value to a handler method using @ModelAttribute</p>
<p>Set Model attributes to HTTP Session using @SessionAttributes</p>
<p><a href="/trades">Try</a></p>
<p>Get attributes from session using @SessionAttribute</p>
<p><a href="/time">Track time</a></p>

<h3>Form submission, Handling and Validation</h3>
<p>Registration:</p>
<p><a href="/register">Register</a></p>

<h3>File upload</h3>
<p><a href="/upload">Upload file</a></p>

<h3>Working with request and response body</h3>
<p><a href="/message">GET request</a></p>
<p>Form POST data conversion:</p>
<form action="/message" method="post">
    <div>
        <label for="login">Login: </label><br>
        <input type="text" id="login" name="login">
    </div>
    <div>
        <label for="password">Password: </label><br>
        <input type="text" id="password" name="password">
    </div>
    <input type="submit" value="Submit">
</form>

<h3>Redirecting</h3>
<a href="/redirect/5">Try redirecting</a>
<h3>Exception handling</h3>
<p><a href="/exception">Choose exception to throw</a></p>

<h3>Working with Locale</h3>
<p><a href="/locale">Locale page</a></p>

<h3>View controllers</h3>
<p>Select view controller:</p>
<p><a href="/view-controller">Default view controller</a></p>
<p><a href="/status-controller">Status code view controller</a></p>
<p><a href="/redirect-view-controller?param1=param1Value&param2=param2Value">Redirect view controller</a></p>

</body>
</html>
