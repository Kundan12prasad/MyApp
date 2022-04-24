<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Your reservation is confirmed successfully. Please, re-check the details.</p>
StudentId: ${student.studentId} <br>  
Last Name: ${student.studentName} <br>  
Gender: ${student.studentGender}<br> 
Course Name: ${student.courseName} <br>  
Timings:
<ul>
<c:forEach var="time" items="${student.timings}"> 
<li>${time}</li>
</c:forEach>  
</ul>	
</body>
</html>