<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
		<tr>
			<td>Student ID :</td>
			<td>${student.studentId}</td>
		</tr>

		<tr>
			<td>Student Name :</td>
			<td>${student.studentName}</td>
		</tr>

		<tr>
			<td>Student Gender :</td>
			<td>${student.studentGender}</td>
		</tr>

		<tr>
			<td>Course Name :</td>
			<td>${student.courseName}</td>
		</tr>

		<tr>
			<td>Timings :</td>
			<td>${timings}</td>
		</tr>

	</table>

	<a href="student">Go Back</a>



</body>
</html>