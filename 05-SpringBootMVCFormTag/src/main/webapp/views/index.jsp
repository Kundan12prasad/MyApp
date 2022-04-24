<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>        
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>${succMsg}</p>

<h2>Student Details</h2>
<form:form action="saveStudent" method="POST" modelAttribute="student"> 
<table>
<tr>
<td> Student Id</td>
<td><form:input path="sid"/></td>
</tr>
<tr>
<td>Student Name </td>
<td><form:input path="sname"/></td>
</tr>
<tr>
<td>Student Rank</td>
<td><form:input path="srank"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="register"></input> </td>
</tr>
</table>
</form:form>   

</body>
</html>