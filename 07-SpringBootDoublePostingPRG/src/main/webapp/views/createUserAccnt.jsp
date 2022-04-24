<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"   %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font color='green'> ${msg} </font>

<h3>User Registration Details</h3>
<form:form action="createUser" modelAttribute="userModel" method="POST">
<table>
<tr>
<td> UserName </td>
<td><form:input path="uname"/> </td>
</tr>

<tr>
<td>UserEmail</td>
<td><form:input path="email"/></td>
</tr>

<tr>
<td>Phone Number</td>
<td><form:input path="phno"/></td>
</tr>

<tr>
<td><input type="reset" value="reset"/></td>
<td><input type="submit" value="submit"/></td>
</tr>

</table>
</form:form>
</body>
</html>