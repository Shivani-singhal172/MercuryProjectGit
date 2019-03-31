package Scripts;

import org.testng.annotations.Test;

import Utils.Base;
import pages.Homepage;

public class Login extends Base{
public Homepage homepage;

@Test
public void testlogin() throws Exception {
		
	homepage=Login();
		homepage = homepage.VerifyHomePageandRegister();
	}
}
