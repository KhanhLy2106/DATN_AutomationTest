package TestSuite;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.Constant;
import Common.Initialization;
import Common.Utilities;
import CommonScreen.HomeScreen;
import CommonScreen.PaymentInfoScreen;

public class OrderProductWithLogin extends Initialization {
	@BeforeClass()
	public void setUpClass() throws Exception {
		driver = HomeScreen.openScreen(browser);
	}

	@BeforeMethod()
	public void setUpMethod(Method method) throws Exception {
		PaymentInfoScreen.openScreen(driver);
		Utilities.testID = method.getName();
	}

	@Test()
	public void TC_09_38() throws IOException {
		PaymentInfoScreen.orderProductWithLogin(driver, Constant.BASE_PHONE, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.SUCCESS_MSG);
	}

	@Test()
	public void TC_09_39() throws IOException {
		PaymentInfoScreen.orderProductWithLogin(driver, Constant.EMPTY_STRING, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.EMPTY_PHONE_MSG);
	}
	
	@Test()
	public void TC_09_40() throws IOException {
		PaymentInfoScreen.orderProductWithLogin(driver, Constant.FULL_SPACE_STRING, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.EMPTY_PHONE_MSG);
	}
	
	@Test()
	public void TC_09_41() throws IOException {
		PaymentInfoScreen.orderProductWithLogin(driver, Constant.BASE_PHONE1, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.SUCCESS_MSG);
	}
	
	@Test()
	public void TC_09_42() throws IOException {
		PaymentInfoScreen.orderProductWithLogin(driver, Constant.BASE_PHONE2, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.INVALID_PHONE_MSG);
	}
	
	@Test()
	public void TC_09_43() throws IOException {
		PaymentInfoScreen.orderProductWithLogin(driver, Constant.BASE_PHONE3, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.INVALID_PHONE_MSG);
	}
	
	@Test()
	public void TC_09_44() throws IOException {
		PaymentInfoScreen.orderProductWithLogin(driver, Constant.BASE_PHONE4, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.INVALID_PHONE_MSG);
	}
	
	@Test()
	public void TC_09_45() throws IOException {
		PaymentInfoScreen.orderProductWithLogin(driver, Constant.BASE_PHONE5, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.INVALID_PHONE_MSG);
	}
	
	@Test()
	public void TC_09_46() throws IOException {
		PaymentInfoScreen.orderProductWithLogin(driver, Constant.BASE_PHONE6, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.INVALID_PHONE_MSG);
	}
	
	@Test()
	public void TC_09_47() throws IOException {
		PaymentInfoScreen.orderProductWithLogin(driver, Constant.BASE_PHONE7, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.SUCCESS_MSG);
	}
	
	@Test()
	public void TC_09_48() throws IOException {
		PaymentInfoScreen.orderProductWithLogin(driver, Constant.BASE_PHONE8, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.INVALID_PHONE_MSG);
	}
	
	@Test()
	public void TC_09_49() throws IOException {
		PaymentInfoScreen.orderProductWithLogin(driver, Constant.BASE_PHONE9, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.INVALID_PHONE_MSG);
	}
	
	@Test()
	public void TC_09_50() throws IOException {
		PaymentInfoScreen.orderProductWithLogin(driver, Constant.BASE_PHONE, Constant.EMPTY_STRING, Constant.BASE_NOTE, PaymentInfoScreen.EMPTY_ADDRESS_MSG);
	}
	
	@Test()
	public void TC_09_51() throws IOException {
		PaymentInfoScreen.orderProductWithLogin(driver, Constant.BASE_PHONE, Constant.FULL_SPACE_STRING, Constant.BASE_NOTE, PaymentInfoScreen.EMPTY_ADDRESS_MSG);
	}
	
	@Test()
	public void TC_09_52() throws IOException {
		PaymentInfoScreen.orderProductWithLogin(driver, Constant.BASE_PHONE, Constant.BASE_ADDRESS1, Constant.BASE_NOTE, PaymentInfoScreen.SUCCESS_MSG);
	}
	
	@Test()
	public void TC_09_53() throws IOException {
		PaymentInfoScreen.orderProductWithLogin(driver, Constant.BASE_PHONE, Constant.BASE_ADDRESS2, Constant.BASE_NOTE, PaymentInfoScreen.SUCCESS_MSG);
	}
	
	@Test()
	public void TC_09_54() throws IOException {
		PaymentInfoScreen.orderProductWithLogin(driver, Constant.BASE_PHONE, Constant.BASE_ADDRESS3, Constant.BASE_NOTE, PaymentInfoScreen.SUCCESS_MSG);
	}
	
	@Test()
	public void TC_09_55() throws IOException {
		PaymentInfoScreen.orderProductWithLogin(driver, Constant.BASE_PHONE, Constant.BASE_ADDRESS, Constant.EMPTY_STRING, PaymentInfoScreen.SUCCESS_MSG);
	}
	
	@Test()
	public void TC_09_56() throws IOException {
		PaymentInfoScreen.orderProductWithLogin(driver, Constant.BASE_PHONE, Constant.BASE_ADDRESS, Constant.FULL_SPACE_STRING, PaymentInfoScreen.SUCCESS_MSG);
	}
	
	@Test()
	public void TC_09_57() throws IOException {
		PaymentInfoScreen.orderProductWithLogin(driver, Constant.BASE_PHONE, Constant.BASE_ADDRESS, Constant.BASE_NOTE1, PaymentInfoScreen.SUCCESS_MSG);
	}
	
	@Test()
	public void TC_09_58() throws IOException {
		PaymentInfoScreen.orderProductWithLogin(driver, Constant.BASE_PHONE, Constant.BASE_ADDRESS, Constant.BASE_NOTE2, PaymentInfoScreen.SUCCESS_MSG);
	}
	
	@Test()
	public void TC_09_59() throws IOException {
		PaymentInfoScreen.orderProductWithLogin(driver, Constant.BASE_PHONE, Constant.BASE_ADDRESS, Constant.BASE_NOTE3, PaymentInfoScreen.SUCCESS_MSG);
	}
}
