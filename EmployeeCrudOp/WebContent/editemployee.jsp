<%@ page import ="com.demo.beans.Employee" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Employee e =(Employee)request.getAttribute("employee"); %>
<form action="updateEmpDetails" method="post">
Id : <input type="text" name="eid" id="eid" value="<%=e.getId()%>" readonly>
Name : <input type="text" name="nm" id="nm" value="<%=e.getName()%>" ><br>
Gender : <input type="text" name="gen" id="gen" value="<%=e.getGender()%>" ><br>
Salary : <input type="text" name="sal" id="sal" value="<%=e.getSalary()%>" ><br>
Email : <input type="text" name="email" id="email" value="<%=e.getEmail()%>" ><br>
Position : <input type="text" name="pos" id="pos" value="<%=e.getPosition()%>" ><br>
<button type="submit" name="btn" id="btn">Update</button>
</form>
</body>
</html>

