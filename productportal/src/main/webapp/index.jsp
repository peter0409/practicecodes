<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Product Portal</title>
<link href="<c:url value="/resources/css/bootstrap-4.3.1.min.css" />"
	rel="stylesheet">
</head>
<body>

	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">

		<a class="navbar-brand" href="">ProductManagement<span
			class="font-weight-lighter">Pro</span></a>

		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="collapsibleNavbar">

			<ul class="navbar-nav mr-auto font-weight-lighter">
				<li class="nav-item"><a class="nav-link"
					href="${request.contextPath}">HOME</a></li>
			</ul>

			<span class="navbar-text align-right"> Welcome to Product
				Management! </span>

		</div>

	</nav>

	<div class="container">
		<div class="row">

			<div class="col-md-12">
				<h2>Welcome to Product Portal!</h2>
				<p class="lead">Product Management Portal. CRUD of product
					supported.</p>
			</div>

			<div class="col-md-6">
				<div class="card">
					<div class="card-body">

						<h3>Search Product:</h3>
						<hr class="my-4">

						<form action="searchproduct">
							<div class="input-group mb-3">
								<input type="text" name="id" class="form-control"
									placeholder="Enter Product Id here">
								<div class="input-group-append">
									<button class="btn btn-success" type="submit">SEARCH ></button>
								</div>
							</div>
						</form>

					</div>
				</div>
			</div>

			<div class="col-md-6">
				<div class="Card">
					<div class="card-body">

						<h3>Add products:</h3>
						<hr class="my-4">
						<a href="addproduct" class="btn btn-success"> ADD PRODUCTS +</a>
					</div>
				</div>
			</div>

		</div>
	</div>

</body>
</html>
