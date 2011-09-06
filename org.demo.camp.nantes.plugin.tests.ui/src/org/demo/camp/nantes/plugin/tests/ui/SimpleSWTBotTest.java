package org.demo.camp.nantes.plugin.tests.ui;
 
import static org.junit.Assert.assertEquals;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
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
		try {
			bot.viewByTitle("Welcome").close();
		} catch (WidgetNotFoundException exception){
			// Do nothing if the Welcome view is not displayed
		}
	}
 
 
	@Test
	public void popupTest() throws Exception {
		bot.menu("Sample Menu").menu("Sample Action").click();
 
		SWTBotShell shell = bot.shell("Plugin");
		shell.activate();
		bot.sleep(1000);
		
		String actualText = shell.getText();
		for (SWTBotShell shell1 : bot.shells()) {
			if (shell1.equals(shell)) {
				assertEquals(actualText, "Plugin");
			}
		}
		
		bot.button("OK").click();
	}
 
 
	@AfterClass
	public static void sleep() {
		bot.sleep(2000);
	}
 
}