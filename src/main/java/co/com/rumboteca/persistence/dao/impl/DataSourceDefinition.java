package co.com.rumboteca.persistence.dao.impl;

import javax.sql.DataSource;

/**
 * This class has datasource for database connection
 * @author Milton
 */
public class DataSourceDefinition {

  /** Datasource connection */
  protected DataSource dataSource;
  
  /** Set datasource connection */
  public void setDataSource(DataSource dataSource) {
    this.dataSource = dataSource;
  }
}
