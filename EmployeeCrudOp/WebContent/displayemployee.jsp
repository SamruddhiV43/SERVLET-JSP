<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.demo.beans.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
</head>
<body>
<%
		List<Employee> elist1=(List<Employee>)request.getAttribute("elist");
		
	%>
	Welcome <%=((MyUser)session.getAttribute("user")).getUname() %>
	<table border="2" >
		<tr>
			<th>id</th>
			<th>Name</th>
			<th>Gender</th>
			<th>salary</th>
			<th>email</th>
			<th>position</th>
			<th>Action</th>
			
		</tr>
		<% for(Employee e:elist1)
			{%>
				<tr>
					<td><%=e.getId() %></td>
					<td><%=e.getName() %></td>
					<td><%=e.getGender() %></td>
					<td><%=e.getSalary() %></td>
					<td><%=e.getEmail() %></td>
					<td><%=e.getPosition() %></td>
					<td>
						<a href="deleteemployee?eid=<%=e.getId()%>">Delete</a>&nbsp;&nbsp;
						<a href="editemployee?eid=<%=e.getId()%>">Edit</a>
					</td>
				</tr>
			<% }%>
			
	</table>
	<a href="AddEmp.jsp">Add New Employee</a>
</body>
</html>