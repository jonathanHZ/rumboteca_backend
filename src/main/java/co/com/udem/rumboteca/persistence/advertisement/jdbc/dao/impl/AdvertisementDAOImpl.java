package co.com.udem.rumboteca.persistence.advertisement.jdbc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import co.com.udem.rumboteca.persistence.advertisement.jdbc.dao.AdvertisementDAO;
import co.com.udem.rumboteca.persistence.advertisement.jdbc.entity.Advertisement;

/**
 * This class implemented {@link AdvertisementDAO}
 * @author Milton
 */
public class AdvertisementDAOImpl implements AdvertisementDAO {

  private DataSource dataSource;
  
  public void setDataSource(DataSource dataSource) {
    this.dataSource = dataSource;
  }
  
  @Override
public void insert(Advertisement advertisement) {
    
//    String sql = "INSERT INTO CUSTOMER " +
//        "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
//    Connection conn = null;
//    
//    try {
//      conn = dataSource.getConnection();
//      PreparedStatement ps = conn.prepareStatement(sql);
//      ps.setInt(1, customer.getCustId());
//      ps.setString(2, customer.getName());
//      ps.setInt(3, customer.getAge());
//      ps.executeUpdate();
//      ps.close();
//      
//    } catch (SQLException e) {
//      throw new RuntimeException(e);
//      
//    } finally {
//      if (conn != null) {
//        try {
//          conn.close();
//        } catch (SQLException e) {}
//      }
//    }
  
    
  }

  @Override
public Advertisement findByAdvertisementId(int custId) {

    
    String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
    
    Connection conn = null;
    
    try {
      conn = dataSource.getConnection();
      PreparedStatement ps = conn.prepareStatement(sql);
      ps.setInt(1, custId);
//      Customer customer = null;
      ResultSet rs = ps.executeQuery();
      if (rs.next()) {
        System.out.println(rs.getInt("CUST_ID"));
        System.out.println(rs.getString("NAME"));
        System.out.println(rs.getInt("Age"));
//        customer = new Customer(
//            rs.getInt("CUST_ID"),
//            rs.getString("NAME"), 
//            rs.getInt("Age")
//        );
      }
      rs.close();
      ps.close();
      return null;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      if (conn != null) {
        try {
        conn.close();
        } catch (SQLException e) {}
      }
    }
  
  }

}
