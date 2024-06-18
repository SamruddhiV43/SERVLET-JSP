<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action="validate" method="post">

 User name : <input type="text" name="uname" id="uname"><br>
    password : <input type="password" name="pass" id="pass">
    <br>
    <button type="submit" name="btn" id="btn">Login</button>&nbsp;&nbsp;
    <a href="register.jsp">Register User</a>
</form>


</body>
</html>