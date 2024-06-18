<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<form action="registerUser" method="post"></form>
Id : <input type="number" name="uid" id="uid"><br>
Name : <input type="text" name="nm" id="nm"><br>
Username : <input type="text" name="uname" id="uname"><br>
Password : <input type="password" name="pass" id="pass"><br>
Role : <input type="text" name="role" id="role"><br>
Gender : Female : <input type="radio" name="gen" id="female" value="female">&nbsp;&nbsp;
		 Male : <input type="radio" name="gen" id="male" value="male"><br>
Email : <input type="text" name="email" id="email"><br>
City : <input type="text" name="city" id="city"><br>
<button type="submit" name="btn" id="btn">Register</button>
</body>
</html>
