<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details Here</title>
</head>
<body>

UserName: ${regobj.name} <br>
EmailId: ${regobj.emailid} <br>
Gender: ${regobj.gender} <br>
Hobby: ${regobj.hobbies[0]}, ${regobj.hobbies[1]} 

</body>
</html>