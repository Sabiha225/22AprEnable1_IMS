package com.qa.ims.persistence.domain;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class ProductsTest {

	@Test 
	public void testEquals() {
		EqualsVerifier.simple().forClass(Products.class).verify();
	}

}
