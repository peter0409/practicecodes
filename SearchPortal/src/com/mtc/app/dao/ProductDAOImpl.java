package com.mtc.app.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mtc.app.entity.Product;
import com.mtc.app.util.DBConnection;

public class ProductDAOImpl implements ProductDAO {
	
	private static final String INSERTQUERY = "insert into productdirectory.tbl_product(productId,name,price,description,quantity) values(?,?,?,?,?)";
	
	private static final String SELECTQUERY = "select * from productdirectory.tbl_product where productId=?";
	
	private static final String SELECTALLQUERY = "select * from productdirectory.tbl_product";
	
	private static final String UPDATEQUERY = "update productdirectory.tbl_product set name=?, price=?, quantity=? where productId = ?";
	
	private static final String DELETEQUERY = "delete from productdirectory.tbl_product where productId=?";
	
	

	@Override
	public void add(Product product) throws FileNotFoundException, IOException {
		
		try(Connection connection = DBConnection.getConnection()) {
		
	
			PreparedStatement ps = connection.prepareStatement(INSERTQUERY);
			
			ps.setInt(1, product.getId());
			ps.setString(2, product.getName());
			ps.setDouble(3, product.getPrice());
			ps.setString(4, product.getDescription());
			ps.setInt(5, product.getQuantity());
			
			int noOfRows = ps.executeUpdate();
			
			if(noOfRows == 1) {
				
				System.out.println("Record added successfully");
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

	@Override
	public Product findById(Integer id) throws FileNotFoundException, SQLException, IOException {
		
		Product product = null;
		
		try(Connection connection = DBConnection.getConnection()){
			
			PreparedStatement ps = connection.prepareStatement(SELECTQUERY);
			
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				product = new Product();
				
				product.setId(rs.getInt("productId"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getDouble("price"));
				product.setDescription(rs.getString("description"));
				product.setQuantity(rs.getInt("quantity"));
				
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		return product;
		
		
	}

	@Override
	public List<Product> findAll() throws FileNotFoundException, SQLException, IOException {
		
		List<Product>  productList = new ArrayList<Product>();
		
		try(Connection connection = DBConnection.getConnection()) {
			
			Statement statement = connection.createStatement();
			
			ResultSet rs = statement.executeQuery(SELECTALLQUERY);
			
			while(rs.next()) {
				
				Product product = new Product();
				
				product.setId(rs.getInt("productId"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getDouble("price"));
				product.setDescription(rs.getString("description"));
				product.setQuantity(rs.getInt("quantity"));
				
				productList.add(product);
			}
			
		}
		catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		return productList;
	}

	@Override
	public void update(Product product) throws FileNotFoundException, SQLException, IOException {
		
		try(Connection connection = DBConnection.getConnection()){
			
			PreparedStatement ps = connection.prepareStatement(UPDATEQUERY);
			ps.setString(1, product.getName());
			ps.setDouble(2, product.getPrice());
			ps.setInt(3, product.getQuantity());
			ps.setInt(4, product.getId());
			
			int noOfRows = ps.executeUpdate();
			
			if(noOfRows == 1) {
				
				System.out.println("Record Updated Successfully!");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

	@Override
	public void delete(Integer id) throws FileNotFoundException, SQLException, IOException {
		
		
		try(Connection connection = DBConnection.getConnection()){
			
			PreparedStatement ps = connection.prepareStatement(DELETEQUERY);
			ps.setInt(1, id);
			
			int noOfRows = ps.executeUpdate();
			
			if(noOfRows == 1) {
				
				System.out.println("Record deleted successfully!");
				
			}
		}
			
		 catch (Exception e) {
			
			e.printStackTrace();
		}
		}

	}




