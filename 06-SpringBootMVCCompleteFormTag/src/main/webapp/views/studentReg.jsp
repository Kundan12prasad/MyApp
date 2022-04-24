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
<h3>Student Details</h3>

<form:form action="saveStudent" method="POST" modelAttribute="student">
Student Id:<form:input path="studentId" />         
        <br><br>  
Student Name:<form:input path="studentName" />  
        <br><br>  
Gender:   
Male<form:radiobutton path="studentGender" value="Male"/>  
Female<form:radiobutton path="studentGender" value="Female"/>  
        <br><br>   
Course:<form:select path="courseName">  
        <form:option value="Java" label="Java"/>  
        <form:option value="PHP" label="PHP"/>  
        <form:option value="Python" label="Python"/>          
        </form:select>  
        <br><br>         
 Timings: 
 Morning<form:checkbox path="timings" value="Morning"/>  
 AfterNoon<form:checkbox path="timings" value="AfterNoon"/>  
 Evening<form:checkbox path="timings" value="Evening"/>  
        <br><br>          
   
 <input type="submit" value="register" />  
</form:form>
</body>
</html>