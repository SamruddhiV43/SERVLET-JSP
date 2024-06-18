<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
<form action ="InsertEmp" method="post">
 EmpId: <input type="text" name="eid" id="eid"><br>
  EmpName: <input type="text" name="ename" id="ename"><br>
   EmpGender: <input type="text" name="gender" id="gender"><br>
    EmpSal: <input type="text" name="salary" id="salary"><br>
     EmpEmail: <input type="text" name="email" id="email"><br>
      EmpPos: <input type="text" name="position" id="position"><br>
       
       <button type="submit" name="btn" id="btn">Add Employee</button>
</form>
</body>
</html>