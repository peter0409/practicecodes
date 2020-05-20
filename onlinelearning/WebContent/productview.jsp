<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Results</title>
<link
	href="https://unpkg.com/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet" />
</head>
<body>
	<div class="container">
		<div class="row">

			<div class="col-sm-12">
				<h2>Product Details!!</h2>
				
				<c:if test="${!empty message}">
					<div class="alert alert-primary">
						<h5>${message}</h5>

					</div>
				</c:if>

				<table class="table table-striped table-bordered">
					<tr class="thead-dark">
						<th>Product ID</th>
						<th>Product Name</th>
						<th>Product Price</th>
						<th>Product Description</th>
					</tr>
					
					<tr>
						<td>${searchedProduct.id}</td>
						<td>${searchedProduct.name}</td>
						<td>${searchedProduct.price}</td>
						<td>${searchedProduct.description}</td>
					<tr>
					
				</table>
				
			</div>

		</div>
	</div>

</body>
</html>