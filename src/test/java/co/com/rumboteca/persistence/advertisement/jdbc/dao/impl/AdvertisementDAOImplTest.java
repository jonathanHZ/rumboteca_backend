package co.com.rumboteca.persistence.advertisement.jdbc.dao.impl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.rumboteca.persistence.advertisement.jdbc.dao.AdvertisementDAO;
import co.com.rumboteca.persistence.advertisement.jdbc.entity.Advertisement;


public class AdvertisementDAOImplTest {

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testFindByAdvertisementId() {
    ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    AdvertisementDAO advertisementDAO = (AdvertisementDAO) context.getBean("advertisementDAO");
    Advertisement advertisement = advertisementDAO.findByAdvertisementId(1);
    System.out.println(advertisement);
  }

}
