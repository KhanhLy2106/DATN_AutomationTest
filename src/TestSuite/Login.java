package TestSuite;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.Constant;
import Common.Initialization;
import Common.Utilities;
import CommonScreen.HomeScreen;
import CommonScreen.LoginScreen;

public class Login extends Initialization {	
	@BeforeClass()
	public void setUpClass() throws Exception {
		driver = LoginScreen.openScreen(browser);
	}

	@BeforeMethod()
	public void setUpMethod(Method method) throws Exception {
		Utilities.testID = method.getName();
		if (Utilities.checkElementVisible(driver, By.xpath(HomeScreen.USERNAME_LINK_XPATH))) {
			HomeScreen.logout(driver);
		}
		Utilities.clickObscuredElement(driver, By.className(HomeScreen.LOGIN_LINK_CLASS), By.xpath(LoginScreen.LOGIN_BTN_XPATH), Constant.WAIT_ELEMENT_EXIST);
	}

	@Test()
	public void TC_02_01() throws IOException {
		LoginScreen.login(driver, Constant.BASE_EMAIL, Constant.BASE_PASSWORD, Constant.EMPTY_STRING);
	}

	@Test()
	public void TC_02_02() throws IOException {
		LoginScreen.login(driver, Constant.BASE_EMAIL_UPPER, Constant.BASE_PASSWORD, Constant.EMPTY_STRING);
	}
	
	@Test()
	public void TC_02_03() throws IOException {
		LoginScreen.login(driver, Constant.EMPTY_STRING, Constant.BASE_PASSWORD, LoginScreen.EMPTY_EMAIL_MSG);
	}
	
	@Test()
	public void TC_02_04() throws IOException {
		LoginScreen.login(driver, Constant.FULL_SPACE_STRING, Constant.BASE_PASSWORD, LoginScreen.EMPTY_EMAIL_MSG);
	}
	
	@Test()
	public void TC_02_05() throws IOException {
		LoginScreen.login(driver, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD, Constant.EMPTY_STRING);
	}
	
	@Test()
	public void TC_02_06() throws IOException {
		LoginScreen.login(driver, Constant.BASE_EMAIL2, Constant.BASE_PASSWORD, LoginScreen.INVALID_EMAIL_MSG);
	}
	
	@Test()
	public void TC_02_07() throws IOException {
		LoginScreen.login(driver, Constant.BASE_EMAIL3, Constant.BASE_PASSWORD, LoginScreen.INVALID_EMAIL_MSG);
	}
	
	@Test()
	public void TC_02_08() throws IOException {
		LoginScreen.login(driver, Constant.BASE_EMAIL4, Constant.BASE_PASSWORD, LoginScreen.INVALID_EMAIL_MSG);
	}
	
	@Test()
	public void TC_02_09() throws IOException {
		LoginScreen.login(driver, Constant.BASE_EMAIL5, Constant.BASE_PASSWORD, LoginScreen.INVALID_EMAIL_MSG);
	}
	
	@Test()
	public void TC_02_10() throws IOException {
		LoginScreen.login(driver, Constant.BASE_EMAIL6, Constant.BASE_PASSWORD, LoginScreen.INVALID_EMAIL_MSG);
	}
	
	@Test()
	public void TC_02_11() throws IOException {
		LoginScreen.login(driver, Constant.HTML_STRING, Constant.BASE_PASSWORD, LoginScreen.INVALID_EMAIL_MSG);
	}
	
	@Test()
	public void TC_02_12() throws IOException {
		LoginScreen.login(driver, Constant.SQL_STRING, Constant.BASE_PASSWORD, LoginScreen.INVALID_EMAIL_MSG);
	}
	
	@Test()
	public void TC_02_13() throws IOException {
		LoginScreen.login(driver, Constant.JAVASCRIPT_STRING, Constant.BASE_PASSWORD, LoginScreen.INVALID_EMAIL_MSG);
	}
	
	@Test()
	public void TC_02_14() throws IOException {
		LoginScreen.login(driver, Constant.BASE_EMAIL.replace(Constant.TEST_TEXT, Constant.TEST1_TEXT), Constant.BASE_PASSWORD, LoginScreen.INVALID_INFO_MSG);
	}
	
	@Test()
	public void TC_02_15() throws IOException {
		LoginScreen.login(driver, Constant.BASE_EMAIL, Constant.EMPTY_STRING, LoginScreen.EMPTY_PASSWORD_MSG);
	}
	
	@Test()
	public void TC_02_16() throws IOException {
		LoginScreen.login(driver, Constant.BASE_EMAIL, Constant.BASE_PASSWORD1, LoginScreen.MIN_PASSWORD_MSG);
	}
	
	@Test()
	public void TC_02_17() throws IOException {
		LoginScreen.login(driver, Constant.BASE_EMAIL_PWD2, Constant.BASE_PASSWORD2, Constant.EMPTY_STRING);
	}
	
	@Test()
	public void TC_02_18() throws IOException {
		LoginScreen.login(driver, Constant.BASE_EMAIL_PWD3, Constant.BASE_PASSWORD3, Constant.EMPTY_STRING);
	}
	
	@Test()
	public void TC_02_19() throws IOException {
		LoginScreen.login(driver, Constant.BASE_EMAIL, Constant.BASE_PASSWORD4, LoginScreen.MAX_PASSWORD_MSG);
	}
	
	@Test()
	public void TC_02_20() throws IOException {
		LoginScreen.login(driver, Constant.BASE_EMAIL, Constant.BASE_PASSWORD3, LoginScreen.INVALID_INFO_MSG);
	}
	
	@Test()
	public void TC_02_21() throws IOException {
		LoginScreen.login(driver, Constant.BASE_EMAIL, Constant.BASE_PASSWORD_UPPER, LoginScreen.INVALID_INFO_MSG);
	}
}
