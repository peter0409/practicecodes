/**
 * 
 */
package com.nivtek.productportal.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nivtek.productportal.entity.Product;

/**
 * @author AsimSubedi
 *
 */
public class ProductDAOImpl implements ProductDAO {
	
	private static String SELECT_QUERY = "SELECT * from maheshdb.product WHERE id=?";
	private static String INSERT_QUERY = "INSERT into maheshdb.product(id, name, price, description, quantity) values(?,?,?,?,?)";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Product findById(int id) {

			Product product = jdbcTemplate.queryForObject(SELECT_QUERY, ProductDAOImpl::mapRow, id);
			return product;
		
	}
	
	/**
	 * implementationof mapRow method
	 * 
	 * @param resultSet
	 * @param rowNo
	 * @return product
	 */
	public static Product mapRow(ResultSet resultSet, int rowNo) {
		Product product = new Product();

		try {
			product.setId(resultSet.getInt("id"));
			product.setName(resultSet.getString("name"));
			product.setPrice(resultSet.getFloat("price"));
			product.setQuantity(resultSet.getInt("quantity"));
			product.setDescription(resultSet.getString("description"));

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return product;

	}

	@Override
	public int saveProduct(Product product) {
		Object[] productToSave = new Object[] {product.getId(), product.getName(), product.getPrice(), product.getDescription(), product.getQuantity()};
		int isSaved = jdbcTemplate.update(INSERT_QUERY, productToSave);
		return isSaved;
	}

}
