package com.qa.ims.controllers;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.controller.OrdersController;
import com.qa.ims.persistence.dao.OrdersDAO;
import com.qa.ims.persistence.domain.Orders;
import com.qa.ims.utils.Utils;

@RunWith(MockitoJUnitRunner.class)
public class OrderControllerTest {
	
	@Mock
	private Utils utils;
	
	@Mock
	private OrdersDAO dao;
	
	@InjectMocks
	private OrdersController controller;
	
	@Test
	public void testCreate() {
		final Long customer_id = 1L;
		final Long order_id = 1L;
		final String order_date = new String("05-05-2022");
		final Double total_cost = 30.50;
		final Orders created = new Orders(customer_id, order_id, order_date, total_cost);
		
		Mockito.when(utils.getLong()).thenReturn(customer_id);
		Mockito.when(utils.getLong()).thenReturn(order_id);
		Mockito.when(utils.getString()).thenReturn(order_date);
		Mockito.when(utils.getDouble()).thenReturn(total_cost);
		
		assertEquals(created, controller.create());
		
		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(utils, Mockito.times(1)).getString();
		Mockito.verify(utils, Mockito.times(1)).getDouble();
		Mockito.verify(dao, Mockito.times(1)).create(created);
	}

	@Test 
	public void testReadAll() {
		List<Orders> order = new ArrayList<>();
		order.add(new Orders(4L, 4L, new String("2022-02-18"), 34.99));
		
		Mockito.when(dao.readAll()).thenReturn(order);
		
		assertEquals(order, controller.readAll());
		Mockito.verify(dao, Mockito.times(1)).readAll();
	}
	
	@Test 
	public void testUpdate() {
		Orders updated = new Orders(1L, 1L, "05-05-2022", 26.00);
		
		Mockito.when(this.utils.getLong()).thenReturn(1L);
		Mockito.when(this.utils.getLong()).thenReturn(updated.getCustomer_id());
		Mockito.when(this.utils.getString()).thenReturn(updated.getOrder_date());
		Mockito.when(this.utils.getDouble()).thenReturn(updated.getTotal_cost());
		Mockito.when(this.dao.update(updated)).thenReturn(updated);
		
		assertEquals(updated, this.controller.update());
		
		Mockito.verify(this.utils, Mockito.times(2)).getLong();
		Mockito.verify(this.utils, Mockito.times(1)).getString();
		Mockito.verify(this.utils, Mockito.times(1)).getDouble();
		Mockito.verify(this.dao, Mockito.times(1)).update(updated);
		
	}
	
	@Test 
	public void testDelete() {
		final long order_id = 1L;
		
		Mockito.when(utils.getLong()).thenReturn(order_id);
		Mockito.when(dao.delete(order_id)).thenReturn(1);
		
		assertEquals(1L, this.controller.delete());
		
		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(dao, Mockito.times(1)).delete(order_id);
	}

}
