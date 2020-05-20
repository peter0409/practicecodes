<%@ include file="./common/header.jspf"%>
<%@ include file="./common/navigation.jspf"%>

<div class="container">
	<div class="row">

		<div class="col-md-12">
			<h2>Your Searched Product:</h2>
			<ul class="list-group">
				<li class="list-group-item">${product.id}</li>
				<li class="list-group-item">${product.name}</li>
				<li class="list-group-item">${product.description}</li>
			</ul>
		</div>

	</div>
</div>

<%-- <%@ include file="./common/footer.jspf"%> --%>