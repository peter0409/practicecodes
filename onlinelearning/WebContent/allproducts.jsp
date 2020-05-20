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

				<table class="table table-striped table-bordered">
					<tr class="thead-dark">
						<th>Product ID</th>
						<th>Product Name</th>
						<th>Product Price</th>
						<th>Product Description</th>
						<th>Quantity</th>
						<th>Edit</th>
						<th>Delete</th>
					</tr>

					<c:forEach items="${products}" var="product">

						<tr>
							<td>${product.id}</td>
							<td>${product.name}</td>
							<td>${product.price}</td>
							<td>${product.description}</td>
							<td>${product.quantity}</td>
							<%-- <td><a class="updatebtn" href="editproduct?id=${product.id}"
								>Edit</a></td> --%>
							<td><button class="btn btn-primary btn-xs updatebtn">Edit</button></td>
							<td><a href="deleteproduct?id=${product.id}" class="btn btn-danger btn-xs">Delete</a></td>
						<tr>
					</c:forEach>

				</table>

			</div>

		</div>
	</div>


	<!-- Modal  -->

	<!-- Edit Form -->
	<div class="modal" id="editForm">

		<div class="modal-dialog">
			<div class="modal-content">

				<!-- Modal Header -->
				<div class="modal-header">
					<h4 class="modal-title">Edit Product</h4>
					<button type="button" class="close" data-dismiss="modal">&times;</button>
				</div>

				<!-- Modal body -->
				<div class="modal-body">
					<form action="editproduct" method="post">
						<label>Product ID</label> <input type="text" name="productId"
							value="${product.id}" class="form-control" id="productId" required /> <label>Product
							Name</label> <input type="text" name="productName"
							value="${product.name}" class="form-control" id="productName"required /> <label>Product
							Price</label> <input type="text" name="productPrice"
							value="${product.price}" class="form-control" id="productPrice" required /> <label>Description</label>
						<input type="text" name="productDescription"
							value="${product.description}" class="form-control" id="productDescription" required />
						<label>Quantity</label> <input type="text" name="productQuantity"
							value="${product.quantity}" class="form-control" id="productQuantity" /> <input
							type="submit" name="Update" class="btn btn-primary">
					</form>
				</div>

			</div>
		</div>

	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
		
		<script>
			$(document).ready(function() {
				
				$('.updatebtn').on('click', function() {
					
					$('#editForm').modal('show');
					
					$tr = $(this).closest('tr');
					
					var data = $tr.children("td").map(function(){
						return $(this).text();
					}).get();
					
					$("#productId").val(data[0]);
					$("#productName").val(data[1]);
					$("#productPrice").val(data[2]);
					$("#productDescription").val(data[3]);
					$("#productQuantity").val(data[4]);
					
					
					
				});
				
			});
		</script>

</body>
</html>