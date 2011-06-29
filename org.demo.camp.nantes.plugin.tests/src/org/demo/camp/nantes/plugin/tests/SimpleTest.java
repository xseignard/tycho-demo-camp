package org.demo.camp.nantes.plugin.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


import org.demo.camp.nantes.plugin.actions.SampleAction;
import org.junit.Test;

public class SimpleTest {
	
	@Test
	public void simpleUselessTest() {
		SampleAction action = null;
		assertNull(action);
		action = new SampleAction();
		assertNotNull(action);
	}

}