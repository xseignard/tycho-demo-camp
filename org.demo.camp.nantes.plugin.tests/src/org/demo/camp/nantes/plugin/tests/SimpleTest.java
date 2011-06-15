package org.demo.camp.nantes.plugin.tests;

import static org.junit.Assert.assertNotNull;


import org.demo.camp.nantes.plugin.actions.SampleAction;
import org.junit.Test;

public class SimpleTest {
	
	@Test
	public void simpleUselessTest() {
		SampleAction action = new SampleAction();
		assertNotNull(action);
	}

}