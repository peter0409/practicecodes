<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2 align="center">Product Record</h2>
	
	<div align="center">
	
	
	<table border="2">
	
	<tr>
	
	<th>ProductID</th>
	<th>Name</th>
	<th>Price</th>
	<th>Description</th>
	<th>Actions</th>
	
	</tr>
	
	
	
	<c:forEach items="${products}" var="product" >

	<tr>
	
		<td>${product.id } </td>
		<td>${product.name } </td>
		<td>${product.price } </td>
		<td>${product.description} </td>
	
	<td>
	
		<a href="${pageContext.request.contextPath}/products?action=EDIT&id=${product.id}"> Edit </a>
	</td>
		 
	</tr>
	
	
	</c:forEach>

	
	
	</table>
	
	</div>

</body>
</html>