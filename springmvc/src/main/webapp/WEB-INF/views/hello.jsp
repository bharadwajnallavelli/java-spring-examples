<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
</head>
<body>
<h1>Hello from Spring MVC</h1>
<%
Integer id = (Integer) request.getAttribute("id");
String name = (String) request.getAttribute("name");
Integer salary = (Integer) request.getAttribute("salary");

out.println("Id: " + id);
out.println("Name: " + name);
out.println("Salary: " + salary);
%>
</body>
</html>