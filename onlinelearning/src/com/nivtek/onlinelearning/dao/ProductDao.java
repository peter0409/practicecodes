/**
 * 
 */
package com.nivtek.onlinelearning.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.nivtek.onlinelearning.entity.Product;

/**
 * @author AsimSubedi
 *
 */
public class ProductDao extends ConnectionDao implements IProductDao {

	private static String INSERT_QUERY = "INSERT into maheshdb.product(id, name, price, description, quantity) values(?,?,?,?,?)";

	private static String SELECT_QUERY = "SELECT * from maheshdb.product WHERE id=?";

	private static String SELECT_ALL_QUERY = "SELECT * from maheshdb.product";
	
	private static String DELETE_QUERY = "DELETE from maheshdb.product WHERE id=?";
	
	private static String UPDATE_QUERY = "UPDATE maheshdb.product SET name=?, price=?, description=?, quantity=? WHERE id=?";

	@Override
	public int add(Product product) {
		int noOfRowsUpdated = 0;

		try (Connection connection = getConnection()) {
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY);

			/*
			 * Do set the values here for preparedStatement This setting of values must be
			 * in the same order starting from 1, 2, 3, 4, 5, 6
			 * 
			 * preparedStatement.setInt(1, x); // x = product.getId() employees.getId() :)
			 * preparedStatement.setString(2, x); // x=> product.getName()
			 */
			preparedStatement.setInt(1, product.getId());
			preparedStatement.setString(2, product.getName());
			preparedStatement.setFloat(3, product.getPrice());
			preparedStatement.setString(4, product.getDescription());
			preparedStatement.setInt(5, product.getQuantity());

			// now Execute the query
			noOfRowsUpdated = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		
		return noOfRowsUpdated;

	}

	@Override
	public Product findById(int id) {

		Product product = null;

		try (Connection connection = getConnection()) {

			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_QUERY);

			// we need to set the value
			preparedStatement.setInt(1, id);

			// execute the Query and get ResultSet object in return
			ResultSet resultset = preparedStatement.executeQuery();

			// process the resultset
			if (resultset.next()) {

				product = new Product();

				product.setId(resultset.getInt("id"));
				product.setName(resultset.getString("name"));
				product.setPrice(resultset.getFloat("price"));
				product.setDescription(resultset.getString("description"));
				product.setQuantity(resultset.getInt("quantity"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return product;
	}

	@Override
	public ArrayList<Product> findAll() {

		ArrayList<Product> products = new ArrayList<Product>();

		try (Connection connection = getConnection()) {

			// statement object
			Statement statement = connection.createStatement();

			// execute query
			ResultSet resultset = statement.executeQuery(SELECT_ALL_QUERY);

			// iterate with resultset
			while (resultset.next()) {

				// first populate the product object
				Product product = new Product();

				product.setId(resultset.getInt("id"));
				product.setName(resultset.getString("name"));
				product.setPrice(resultset.getFloat("price"));
				product.setDescription(resultset.getString("description"));
				product.setQuantity(resultset.getInt("quantity"));

				// then populate arraylist of products
				products.add(product);

			}

		} catch (Exception e) {	e.printStackTrace(); }

		return products;
	}

	
	@Override
	public int update(Product product) {
		
		int noOfRowsUpdated = 0;
		
		try (Connection connection = getConnection()) {
			PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY);

			preparedStatement.setString(1, product.getName());
			preparedStatement.setFloat(2, product.getPrice());
			preparedStatement.setString(3, product.getDescription());
			preparedStatement.setInt(4, product.getQuantity());
			preparedStatement.setInt(5, product.getId());

			// now Execute the query
			noOfRowsUpdated = preparedStatement.executeUpdate();

			if (noOfRowsUpdated == 1) {

				noOfRowsUpdated = 1;

			} else {
				noOfRowsUpdated = 0;
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
		
		return noOfRowsUpdated;

	}

	
	@Override
	public int delete(int id) {
		
		int delete = 0;
		
		try (Connection connection = getConnection()) {
			PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY);
			
			preparedStatement.setInt(1, id);

			// now Execute the query
			int noOfRowsUpdated = preparedStatement.executeUpdate();

			if (noOfRowsUpdated == 1) {

				delete =1;

			} else {
				delete=0;
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return delete;

	}

}
