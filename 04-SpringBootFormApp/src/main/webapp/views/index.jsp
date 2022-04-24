<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Save Product Details</h2>
<form action ="savedProduct" method="Post"> 
<table>
<tr>
<td>ProductId </td>
<td> <input type="text" name="pid"> </input> </td>
</tr>

<tr>
<td>ProductName </td>
<td> <input type="text" name="pname"> </input> </td>
</tr>

<tr>
<td> ProductPrice  </td>
<td> <input type="text"  name="productPrice"> </input> </td>
</tr>

<tr>
<td> <input type= "reset" value="reset"> </input></td>
<td> <input type="submit" value="submit"> </input></td>
</tr>

</table>
</form>
</body>
</html>