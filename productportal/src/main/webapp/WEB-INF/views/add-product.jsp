<%@ include file="./common/header.jspf"%>
<%@ include file="./common/navigation.jspf"%>

<div class="container">
	<div class="row">

		<div class="col-md-12">
			<h2>ADD A NEW PRODUCT +</h2>
		</div>

		<div class="col-md-6">

			<div class="card">
				<div class="card-body">

					<h3>Add a product to the database:</h3>
					<hr class="my-4">

					<form action="addproduct" method="post">

						<div class="form-group">
							<label for="id">Enter Product Id:</label> <input type="text"
								name="id" class="form-control"
								placeholder="Enter Product Id here">
						</div>

						<div class="form-group">
							<label for="name">Enter Product Name:</label> <input type="text"
								name="name" class="form-control"
								placeholder="Enter Product Name">
						</div>

						<div class="form-group">
							<label for="price">Enter Product Price</label> <input
								type="number" name="price" class="form-control"
								placeholder="Enter Product Price here">
						</div>

						<div class="form-group">
							<label for="description">Enter Product Description:</label> <input
								type="text" name="description" class="form-control"
								placeholder="Enter Product Description here">
						</div>

						<div class="form-group">
							<label for="quantity">Enter Product Qty</label> <input
								type="text" name="quantity" class="form-control"
								placeholder="Enter Product quantity here">
						</div>

						<div class="form-group">
							<input type="submit" class="btn btn-success" value="ADD PRODUCT">
						</div>
					</form>

				</div>
			</div>

		</div>

	</div>
</div>

<%-- <%@ include file="./common/footer.jspf"%> --%>