package com.nivtek.solrportal.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.nivtek.solrportal.entity.EmployeeDomain;

public class EmployeeRepo {

	private JdbcTemplate jdbcTemplate;

	public EmployeeRepo(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<EmployeeDomain> findAll(HashMap<String, Object> paramMap) {
		if (paramMap == null) {
			paramMap = new HashMap<>();
		}
		String sql = "SELECT * FROM EmployeeDomain WHERE 1=1";
		if (paramMap.get("ID") != null) {
			sql += " AND id = " + paramMap.get("ID");
		}
		final String keyword = (String) paramMap.get("keyword");
		if (keyword != null) {
			sql += " AND (name LIKE '%" + paramMap.get("keyword") +  "%'" + "OR address LIKE '%" + paramMap.get("keyword") + "%'"+ ")";
		}
		final List<EmployeeDomain> list = jdbcTemplate.query(sql, new RowMapper<EmployeeDomain>() {
			@Override
			public EmployeeDomain mapRow(ResultSet rs, int rowNum) throws SQLException {
				EmployeeDomain employeeVO = new EmployeeDomain();
				employeeVO.setId(rs.getInt("id"));
				employeeVO.setName(rs.getString("name"));
				employeeVO.setAddress(rs.getString("address"));

				return employeeVO;
			}
		});
		return list;
	}

	public EmployeeDomain findById(int id) {
		HashMap<String, Object> paramMap = new HashMap<>();
		paramMap.put("ID", id);
		List<EmployeeDomain> list = findAll(paramMap);
		return list != null && list.size() > 0 ? list.get(0) : null;
	}
}
