package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.qa.ims.persistence.domain.Products;
import com.qa.ims.utils.DBUtils;

public class ProductsDAOTest {

	private final ProductsDAO DAO = new ProductsDAO();
	
	@Before
	public void setup() {
		DBUtils.connect();
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data.sql");
	}
	
	@Test 
	public void testCreate() {
		final Products created = new Products(5L, "PERFUME", 50.00);
		assertEquals(created, DAO.create(created));
	}
	
	@Test 
	public void testReadAll() {
		List<Products> expected = new ArrayList<>();
		expected.add(new Products(2L, "MAKEUP", 18.99));
		assertEquals(expected, DAO.readAll());
	}
	
	@Test
	public void testReadLatest() {
		assertEquals(new Products(2L, "MAKEUP", 18.99), DAO.readLatest());
	}
	
	@Test
	public void testRead() {
		final long ID = 2L;
		assertEquals(new Products(ID, "MAKEUP", 18.99), DAO.read(ID));
	}
	
	@Test
	public void testUpdate() {
		final Products updated = new Products(2L, "LIPSTICK", 8.00);
		assertEquals(updated, DAO.update(updated));
	}
	
	@Test
	public void testDelete() {
		assertEquals(1, DAO.delete(1));
	}
}
