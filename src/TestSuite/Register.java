package TestSuite;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.Constant;
import Common.Initialization;
import Common.Utilities;
import CommonScreen.HomeScreen;
import CommonScreen.RegisterScreen;

public class Register extends Initialization {
	private static LocalDateTime currentDateTime;
	private static DateTimeFormatter formatter;
	private static String formattedDateTime;
	
	@BeforeClass()
	public void setUpClass() throws Exception {
		driver = RegisterScreen.openScreen(browser);
	}

	@BeforeMethod()
	public void setUpMethod(Method method) throws Exception {
		Utilities.testID = method.getName();
		if (Utilities.checkElementVisible(driver, By.xpath(HomeScreen.USERNAME_LINK_XPATH))) {
			HomeScreen.logout(driver);
		}
		Utilities.clickObscuredElement(driver, By.className(HomeScreen.REGISTER_LINK_CLASS), By.xpath(RegisterScreen.REGISTER_BTN_XPATH), Constant.WAIT_ELEMENT_EXIST);
		// Get current time
		currentDateTime = LocalDateTime.now();
        formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        formattedDateTime = currentDateTime.format(formatter);
	}

	@Test()
	public void TC_01_01() throws IOException {
		RegisterScreen.register(driver, Constant.BASE_EMAIL.replace(Constant.TEST_TEXT, formattedDateTime), Constant.BASE_NAME, Constant.BASE_PASSWORD, Constant.BASE_ADDRESS, Constant.EMPTY_STRING);
	}

	@Test()
	public void TC_01_02() throws IOException {
		RegisterScreen.register(driver, Constant.EMPTY_STRING, Constant.BASE_NAME, Constant.BASE_PASSWORD, Constant.BASE_ADDRESS, RegisterScreen.EMPTY_EMAIL_MSG);
	}
	
	@Test()
	public void TC_01_03() throws IOException {
		RegisterScreen.register(driver, Constant.FULL_SPACE_STRING, Constant.BASE_NAME, Constant.BASE_PASSWORD, Constant.BASE_ADDRESS, RegisterScreen.EMPTY_EMAIL_MSG);
	}
	
	@Test()
	public void TC_01_04() throws IOException {
		RegisterScreen.register(driver, Constant.BASE_EMAIL1.replace(Constant.TEST_TEXT, formattedDateTime), Constant.BASE_NAME, Constant.BASE_PASSWORD, Constant.BASE_ADDRESS, Constant.EMPTY_STRING);
	}
	
	@Test()
	public void TC_01_05() throws IOException {
		RegisterScreen.register(driver, Constant.BASE_EMAIL2, Constant.BASE_NAME, Constant.BASE_PASSWORD, Constant.BASE_ADDRESS, RegisterScreen.INVALID_EMAIL_MSG);
	}
	
	@Test()
	public void TC_01_06() throws IOException {
		RegisterScreen.register(driver, Constant.BASE_EMAIL3, Constant.BASE_NAME, Constant.BASE_PASSWORD, Constant.BASE_ADDRESS, RegisterScreen.INVALID_EMAIL_MSG);
	}
	
	@Test()
	public void TC_01_07() throws IOException {
		RegisterScreen.register(driver, Constant.BASE_EMAIL4, Constant.BASE_NAME, Constant.BASE_PASSWORD, Constant.BASE_ADDRESS, RegisterScreen.INVALID_EMAIL_MSG);
	}
	
	@Test()
	public void TC_01_08() throws IOException {
		RegisterScreen.register(driver, Constant.BASE_EMAIL5, Constant.BASE_NAME, Constant.BASE_PASSWORD, Constant.BASE_ADDRESS, RegisterScreen.INVALID_EMAIL_MSG);
	}
	
	@Test()
	public void TC_01_09() throws IOException {
		RegisterScreen.register(driver, Constant.BASE_EMAIL6, Constant.BASE_NAME, Constant.BASE_PASSWORD, Constant.BASE_ADDRESS, RegisterScreen.INVALID_EMAIL_MSG);
	}
	
	@Test()
	public void TC_01_10() throws IOException {
		RegisterScreen.register(driver, Constant.HTML_STRING, Constant.BASE_NAME, Constant.BASE_PASSWORD, Constant.BASE_ADDRESS, RegisterScreen.INVALID_EMAIL_MSG);
	}
	
	@Test()
	public void TC_01_11() throws IOException {
		RegisterScreen.register(driver, Constant.SQL_STRING, Constant.BASE_NAME, Constant.BASE_PASSWORD, Constant.BASE_ADDRESS, RegisterScreen.INVALID_EMAIL_MSG);
	}
	
	@Test()
	public void TC_01_12() throws IOException {
		RegisterScreen.register(driver, Constant.JAVASCRIPT_STRING, Constant.BASE_NAME, Constant.BASE_PASSWORD, Constant.BASE_ADDRESS, RegisterScreen.INVALID_EMAIL_MSG);
	}
	
	@Test()
	public void TC_01_13() throws IOException {
		RegisterScreen.register(driver, Constant.BASE_EMAIL, Constant.BASE_NAME, Constant.BASE_PASSWORD, Constant.BASE_ADDRESS, RegisterScreen.REGISTERED_EMAIL_MSG);
	}
	
	@Test()
	public void TC_01_14() throws IOException {
		RegisterScreen.register(driver, Constant.BASE_EMAIL_UPPER, Constant.BASE_NAME, Constant.BASE_PASSWORD, Constant.BASE_ADDRESS, RegisterScreen.REGISTERED_EMAIL_MSG);
	}
	
	@Test()
	public void TC_01_15() throws IOException {
		RegisterScreen.register(driver, Constant.BASE_EMAIL.replace(Constant.TEST_TEXT, formattedDateTime), Constant.EMPTY_STRING, Constant.BASE_PASSWORD, Constant.BASE_ADDRESS, RegisterScreen.EMPTY_NAME_MSG);
	}
	
	@Test()
	public void TC_01_16() throws IOException {
		RegisterScreen.register(driver, Constant.BASE_EMAIL.replace(Constant.TEST_TEXT, formattedDateTime), Constant.FULL_SPACE_STRING, Constant.BASE_PASSWORD, Constant.BASE_ADDRESS, RegisterScreen.EMPTY_NAME_MSG);
	}
	
	@Test()
	public void TC_01_17() throws IOException {
		RegisterScreen.register(driver, Constant.BASE_EMAIL.replace(Constant.TEST_TEXT, formattedDateTime), Constant.BASE_NAME1, Constant.BASE_PASSWORD, Constant.BASE_ADDRESS, Constant.EMPTY_STRING);
	}
	
	@Test()
	public void TC_01_18() throws IOException {
		RegisterScreen.register(driver, Constant.BASE_EMAIL.replace(Constant.TEST_TEXT, formattedDateTime), Constant.BASE_NAME2, Constant.BASE_PASSWORD, Constant.BASE_ADDRESS, RegisterScreen.INVALID_NAME_MSG);
	}
	
	@Test()
	public void TC_01_19() throws IOException {
		RegisterScreen.register(driver, Constant.BASE_EMAIL.replace(Constant.TEST_TEXT, formattedDateTime), Constant.BASE_NAME3, Constant.BASE_PASSWORD, Constant.BASE_ADDRESS, RegisterScreen.INVALID_NAME_MSG);
	}
	
	@Test()
	public void TC_01_20() throws IOException {
		RegisterScreen.register(driver, Constant.BASE_EMAIL.replace(Constant.TEST_TEXT, formattedDateTime), Constant.BASE_NAME, Constant.EMPTY_STRING, Constant.BASE_ADDRESS, RegisterScreen.EMPTY_PASSWORD_MSG);
	}
	
	@Test()
	public void TC_01_21() throws IOException {
		RegisterScreen.register(driver, Constant.BASE_EMAIL.replace(Constant.TEST_TEXT, formattedDateTime), Constant.BASE_NAME, Constant.FULL_SPACE_STRING, Constant.BASE_ADDRESS, Constant.EMPTY_STRING);
	}
	
	@Test()
	public void TC_01_22() throws IOException {
		RegisterScreen.register(driver, Constant.BASE_EMAIL.replace(Constant.TEST_TEXT, formattedDateTime), Constant.BASE_NAME, Constant.BASE_PASSWORD1, Constant.BASE_ADDRESS, RegisterScreen.MIN_PASSWORD_MSG);
	}
	
	@Test()
	public void TC_01_23() throws IOException {
		RegisterScreen.register(driver, Constant.BASE_EMAIL.replace(Constant.TEST_TEXT, formattedDateTime), Constant.BASE_NAME, Constant.BASE_PASSWORD2, Constant.BASE_ADDRESS, Constant.EMPTY_STRING);
	}
	
	@Test()
	public void TC_01_24() throws IOException {
		RegisterScreen.register(driver, Constant.BASE_EMAIL.replace(Constant.TEST_TEXT, formattedDateTime), Constant.BASE_NAME, Constant.BASE_PASSWORD3, Constant.BASE_ADDRESS, Constant.EMPTY_STRING);
	}
	
	@Test()
	public void TC_01_25() throws IOException {
		RegisterScreen.register(driver, Constant.BASE_EMAIL.replace(Constant.TEST_TEXT, formattedDateTime), Constant.BASE_NAME, Constant.BASE_PASSWORD4, Constant.BASE_ADDRESS, RegisterScreen.MAX_PASSWORD_MSG);
	}
		
	@Test()
	public void TC_01_26() throws IOException {
		RegisterScreen.register(driver, Constant.BASE_EMAIL.replace(Constant.TEST_TEXT, formattedDateTime), Constant.BASE_NAME, Constant.BASE_PASSWORD, Constant.EMPTY_STRING, Constant.EMPTY_STRING);
	}
	
	@Test()
	public void TC_01_27() throws IOException {
		RegisterScreen.register(driver, Constant.BASE_EMAIL.replace(Constant.TEST_TEXT, formattedDateTime), Constant.BASE_NAME, Constant.BASE_PASSWORD, Constant.FULL_SPACE_STRING, Constant.EMPTY_STRING);
	}
	
	@Test()
	public void TC_01_28() throws IOException {
		RegisterScreen.register(driver, Constant.BASE_EMAIL.replace(Constant.TEST_TEXT, formattedDateTime), Constant.BASE_NAME, Constant.BASE_PASSWORD, Constant.BASE_ADDRESS1, Constant.EMPTY_STRING);
	}
}
