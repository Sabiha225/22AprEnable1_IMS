package com.qa.ims.controller;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrdersDAO;
import com.qa.ims.persistence.domain.Orders;
import com.qa.ims.utils.Utils;

public class OrdersController implements CrudController<Orders> {
	
		
		public static final Logger LOGGER = LogManager.getLogger();

		private OrdersDAO orderDAO;
		private Utils utils;

		public OrdersController(OrdersDAO orderDAO, Utils utils) {
			super();
			this.orderDAO = orderDAO;
			this.utils = utils;
		}

		/** 
		 * 
		 * Reads all orders to the logger
		 */
		@Override
		public List<Orders> readAll() {
			List<Orders> orders = orderDAO.readAll();
			for (Orders order : orders) {
				LOGGER.info(orders);
			}
			return orders;
		}

		/**
		 * Create an order by taking in user input
		 * 
		 */
		@Override
		public Orders create() {
			LOGGER.info("Please enter order id");
			Long order_id = utils.getLong();
			LOGGER.info("Please enter customer_id ");
			Long customer_id = utils.getLong();
			LOGGER.info("Please enter date of order");
			String order_date = utils.getString();
			LOGGER.info("Please enter the total cost");
			Double totalcost = utils.getDouble();
			Orders orders = orderDAO.create(new Orders(order_id, customer_id, order_date, totalcost));
			LOGGER.info("Order created");
			return orders;
		}

		/**
		 * Update an existing order by taking in user input
		 * 
		 */
		@Override
		public Orders update() {
			LOGGER.info("Please enter the order id of the order you would like to update");
			Long order_id = utils.getLong();
			LOGGER.info("Please enter the customer id of the order you would like to update");
			Long customer_id = utils.getLong();
			LOGGER.info("Please enter the date of order");
			String order_date = utils.getString();
			LOGGER.info("Please enter the total cost of order");
			Double total_cost = utils.getDouble();
			Orders orders = orderDAO.update(new Orders(order_id, customer_id, order_date, total_cost));
			LOGGER.info("Order Updated");
			return orders;
		}
		
		/**
		 * Deletes an existing customer by the id of the customer
		 * 
		 * @return
		 */

		@Override
		public int delete() {
			LOGGER.info("Please enter the id of the customer you would like to delete");
			Long order_id = utils.getLong();
			return orderDAO.delete(order_id);
		}


}
