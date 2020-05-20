<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container">
	
		<form action="${pageContext.request.contextPath}/products" method="POST">

			Enter name: <input type = "text" name = "productname" /> <br/>
			
			Enter Price: <input type = "number" name ="price" /> <br/>
			
			Enter Description: <input type = "text" name ="description" /> <br/>
		
		<button class="btn btn-primary" type="submit">Update Product</button>
		
		
		</form>


		

	
	</div>

</body>
</html>