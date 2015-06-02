package co.com.udem.rumboteca.persistence.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.com.udem.rumboteca.persistence.dao.ComboDAO;
import co.com.udem.rumboteca.persistence.entity.Combo;
import co.com.udem.rumboteca.persistence.entity.Product;

public class ComboDAOImpl extends DataSourceDefinition implements ComboDAO {

	// Object defition
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	@Override
	public List<Combo> getCombo() {
		// SQL Query
		String sql = "SELECT * FROM combo";
		List<Combo> combos = new ArrayList<Combo>();

		try {
			// Get database connection
			conn = dataSource.getConnection();
			// Prepared statement to execute
			ps = conn.prepareStatement(sql);
			// Query execute
			rs = ps.executeQuery();

			// Iterate result set
			while (rs.next()) {
				Combo combo = new Combo();
				combo.setId(rs.getInt("id"));
				combo.setPlaceId(rs.getInt("placeId"));
				combo.setName(rs.getString("name"));
				combo.setPrice(rs.getInt("price"));
				combo.setType(rs.getString("type"));
				combo.setPhoto(rs.getString("photo"));
				combo.setDescription(rs.getString("description"));
				System.out.println(rs.getString("type"));
				combos.add(combo);
			}

			// Close resources
			rs.close();
			ps.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			// Close database connection
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}

		return combos;
	}

	@Override
	public List<Combo> getComboTopTen() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByComboId(int comboId) {
		// SQL Query
		String sql = "SELECT pr.id, pr.name, pr.description, pr.photo, pr.price, pr.productType FROM product pr"
		+" JOIN comboproduct cp ON pr.id = cp.productId WHERE cp.comboId = ?";
		List<Product> products = new ArrayList<Product>();

		try {
			// Get database connection
			conn = dataSource.getConnection();
			// Prepared statement to execute
			ps = conn.prepareStatement(sql);
			ps.setInt(1, comboId);
			// Query execute
			rs = ps.executeQuery();

			// Iterate result set
			while (rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("id"));
				product.setName(rs.getString("name"));
				product.setDescription(rs.getString("description"));
				product.setPhoto(rs.getString("photo"));
				product.setPrice(rs.getInt("price"));
				product.setProductType(rs.getString("productType"));
				products.add(product);
			}

			// Close resources
			rs.close();
			ps.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			// Close database connection
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}

		return products;
	}

}
