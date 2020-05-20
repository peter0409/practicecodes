<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Results - All Products</title>
<link
	href="https://unpkg.com/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet" />
</head>
<body>
	<div class="container">
		<div class="row">

			<div class="col-sm-12">
				<h2>All Products in Database</h2>

				<c:if test="${!empty success}">
					<div class="alert alert-primary">
						<h5>${success}</h5>

					</div>
				</c:if>
				
				<c:if test="${!empty error}">
					<div class="alert alert-warning">
						<h5>${error}</h5>

					</div>
				</c:if>
				<hr/>
				<a href="products" class="btn btn-success">VIEW ALL PRODUCTS ></a>

			</div>

		</div>
	</div>

</body>
</html>