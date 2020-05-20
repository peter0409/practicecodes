<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.sql.*" %>
    
    <%@ taglib prefix = "c" uri ="h" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
101<br>
Navin<br>
88<br>

<%
String url = "jdbc:mysql://localhost:3306/project1";
String ursername ="root";
String password ="123456";
String sql = "select * from project1 where FirstName = zhao";

 Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection(url);
Statement st = con.createStatement();

ResultSet rs = st.executeQuery(sql);


%>

Rollno : <%= rs.getString(1) %><br>
Name:  <%= rs.getString(2) %><br>
Marks: <%= rs.getString(3) %><br>


</body>
</html>