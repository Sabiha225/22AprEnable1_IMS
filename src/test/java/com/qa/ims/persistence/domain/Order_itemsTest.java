package com.qa.ims.persistence.domain;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class Order_itemsTest {
	
	@Test
	public void testEquals() {
		EqualsVerifier.simple().forClass(Order_Items.class).verify();
	}
}
