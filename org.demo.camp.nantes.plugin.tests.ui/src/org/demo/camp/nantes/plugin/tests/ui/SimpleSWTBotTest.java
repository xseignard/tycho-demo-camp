package org.demo.camp.nantes.plugin.tests.ui;
 
import static org.junit.Assert.assertNotNull;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
 
@RunWith(SWTBotJunit4ClassRunner.class)
public class SimpleSWTBotTest {
 
	private static SWTWorkbenchBot	bot;
 
	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot();
		try {
			bot.viewByTitle("Welcome").close();
		} catch (WidgetNotFoundException exception){
			// Do nothing if the Welcome view is not displayed
		}
	}
 
 
	@Test
	public void popupTest() throws Exception {
		SWTBotMenu menu = bot.menu("Sample Menu").menu("Sample Action");
 
		assertNotNull(menu);
	}
 
 
	@AfterClass
	public static void sleep() {
		bot.sleep(2000);
	}
 
}