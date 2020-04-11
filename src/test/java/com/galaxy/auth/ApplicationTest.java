package com.galaxy.auth;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ApplicationTest {

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	@Before
	public void setUp() {
		// Keeping it blank for this exercise.
	}

	/**
	 * Teardown required environment.
	 */
	@After
	public void tearDown() {
		// Keeping it blank for this exercise.
	}

	@Test
	public void test() throws InterruptedException {

		log.info("Testing");
		Assert.assertTrue(true);
	}

}
