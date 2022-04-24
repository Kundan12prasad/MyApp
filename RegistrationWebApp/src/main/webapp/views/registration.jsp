<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<h3>Registration Form Page</h3>

<form action="userdetails" method="get">

UserName<input id="Uname" name="Uname"/>  <br>
EmailID<input id="EmailId" name="EmailId"/> <br>
Password<input id="password" type="password" name="password"/>
Gender<input type="radio" name="gender" value="1" checked=true/> Male 
<input type="radio" name="gender" value="2" />Female <br>
<br>
<input type="checkbox" name="hobby" value="Dancing">Dancing
<input type="checkbox" name="hobby" value="Singing">Singing <br>
<input type="submit" value ="Register"/>
</form>
</body>
</html>