<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Student Form</h3>
	<form:form action="saveStudent" method="POST" modelAttribute="student">
	
		<table>
			<tr>
				<td>Student ID</td>
				<td><form:input path="studentId" /></td>
			</tr>
			<tr>
				<td>Student Name</td>
				<td><form:input path="studentName" /></td>
			</tr>
			<tr>
				<td>Student Gender</td>
				<td><form:radiobuttons path="studentGender" items="${genders}" />
				</td>
			</tr>
			<tr>
				<td>Select Course</td>
				<td><form:select path="courseName">
						<form:options items="${courses}" />
					</form:select></td>
			</tr>
			<tr>
				<td>Choose Timings</td>
				<td><form:checkboxes items="${timings}" path="timings" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="reset" value="reset"/></td>
				<td><input type="submit" value="Submit"/>
			</tr>
		</table>
	</form:form>

</body>
</html>