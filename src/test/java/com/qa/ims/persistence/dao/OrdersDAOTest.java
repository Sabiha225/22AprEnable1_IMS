package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.qa.ims.persistence.domain.Orders;
import com.qa.ims.utils.DBUtils;

public class OrdersDAOTest {

	private final OrdersDAO DAO = new OrdersDAO();
	
	@Before 
	public void setup() {
		DBUtils.connect();
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data.sql");
	}
	
	@Test 
	public void testCreate() {
		final Orders created = new Orders(5L, 5L, "05-05-2022", 100.00);
		assertEquals(created, DAO.create(created));
	}
	
	@Test
	public void testReadAll() {
		List<Orders> expected = new ArrayList<>();
		expected.add(new Orders(3L, 3L, "03-05-2022", 30.00));
		assertEquals(expected, DAO.readAll());
	}
	
	@Test 
	public void testReadLatest() {
		assertEquals(new Orders(4L, 4L, "03-05-2022", 45.00), DAO.readLatest());
		
	}
	
	@Test
	public void testRead() {
		final long Order_id = 1L;
		assertEquals(new Orders(Order_id, 1L, "03-05-2022", 15.50), DAO.read(Order_id));
		
	}
	
	@Test
	public void testUpdate() {
		final Orders updated = new Orders(3L, 3L, "03-05-2022", 30.00);
		assertEquals(updated, DAO.update(updated));
	}
	
	@Test
	public void testDelete() {
		assertEquals(1, DAO.delete(1));
	}
}
