package com.nivtek.jdbc.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.nivtek.jdbc.Product;

public class ProductDaoo extends BaseDao  implements ProductDao {
	
	private static final String Selectquery = "select *from test.product where id=?";
	private static String InsertQuery = "insert into tabel.name(id,name,price,description,quamtity) values(?,?,?,?,?)";
	
	private static final String SelecTAll= "select*from table.name";

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub

//		Connection connection = getConnection();
		try {
//		PreparedStatement ps =connection.prepareStatement(InsertQuery);
		
//		ps.setInt(1, product.getId());
		
		
		
		}catch(Exception e) {
			
			
			
		}
		
	}

	@Override
	public Product findById(int id) {
		
		Product product = null;
		
		try (Connection connection = getConnection()){
		
			PreparedStatement ps =connection.prepareStatement(Selectquery);
             ps.setInt(1, id);
             
           ResultSet rs =  ps.executeQuery();
           
           if(rs.next()) {
        	   
        	   product = new Product();
        	   
        	   product.setId(rs.getInt("id"));
        	   product.setName(rs.getString("name"));
        	   product.setPrice(rs.getInt("price"));
        	   product.setDescription(rs.getString("description"));
        	   product.setQuantity(rs.getInt("quantity"));
           }
		
		
		}catch(Exception e) {
			e.printStackTrace();
			
			
		}
		return product;
	}

	@Override
	public List<Product> findAll() {
		
		ArrayList<Product> products = new ArrayList<>();
		
		try (Connection connection = getConnection()){
			
			Statement statement =  connection.createStatement();

			ResultSet rs = statement.executeQuery(SelecTAll);
			
			while(rs.next()) {
				
				 Product product = new Product();
	        	   
	        	   product.setId(rs.getInt("id"));
	        	   product.setName(rs.getString("name"));
	        	   product.setPrice(rs.getInt("price"));
	        	   product.setDescription(rs.getString("description"));
	        	   product.setQuantity(rs.getInt("quantity"));
	        	   
	        	   products.add(product);
				
			}
			
			
			
		}catch(Exception e) {
			
			
			e.printStackTrace();
		}
		
		return products;
	}

	@Override
	public void updata(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	
}
