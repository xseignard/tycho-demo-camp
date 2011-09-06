package org.demo.camp.nantes.plugin.tests.ui;
 
import static org.junit.Assert.assertEquals;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
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
		bot.viewByTitle("Welcome").close();
	}
 
 
	@Test
	public void popupTest() throws Exception {
		bot.menu("Sample Menu").menu("Sample Action").click();
 
		SWTBotShell shell = bot.shell("Plugin");
		shell.activate();
		
		String actualText = shell.getText();
		
		
		assertEquals(actualText, "Plugin");
		
		bot.button("OK").click();
	}
 
 
	@AfterClass
	public static void sleep() {
		bot.sleep(2000);
	}
 
}