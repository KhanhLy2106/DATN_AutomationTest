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

public class OrderProductWithoutLogin extends Initialization {
	@BeforeClass()
	public void setUpClass() throws Exception {
		driver = HomeScreen.openScreenWithoutLogin(browser);
	}

	@BeforeMethod()
	public void setUpMethod(Method method) throws Exception {
		PaymentInfoScreen.openScreen(driver);
		Utilities.testID = method.getName();
	}

	@Test()
	public void TC_09_01() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE, Constant.BASE_EMAIL, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.SUCCESS_MSG);
	}

	@Test()
	public void TC_09_02() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.EMPTY_STRING, Constant.BASE_PHONE, Constant.BASE_EMAIL, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.EMPTY_NAME_MSG);
	}	
	
	@Test()
	public void TC_09_03() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.FULL_SPACE_STRING, Constant.BASE_PHONE, Constant.BASE_EMAIL, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.EMPTY_NAME_MSG);
	}	
	
	@Test()
	public void TC_09_04() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME1, Constant.BASE_PHONE, Constant.BASE_EMAIL, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.SUCCESS_MSG);
	}	
	
	@Test()
	public void TC_09_05() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME2, Constant.BASE_PHONE, Constant.BASE_EMAIL, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.SUCCESS_MSG);
	}	
	
	@Test()
	public void TC_09_06() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME3, Constant.BASE_PHONE, Constant.BASE_EMAIL, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.SUCCESS_MSG);
	}	
	
	@Test()
	public void TC_09_07() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.EMPTY_STRING, Constant.BASE_EMAIL, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.EMPTY_PHONE_MSG);
	}
	
	@Test()
	public void TC_09_08() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.FULL_SPACE_STRING, Constant.BASE_EMAIL, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.EMPTY_PHONE_MSG);
	}
	
	@Test()
	public void TC_09_09() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE1, Constant.BASE_EMAIL, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.SUCCESS_MSG);
	}
	
	@Test()
	public void TC_09_10() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE2, Constant.BASE_EMAIL, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.INVALID_PHONE_MSG);
	}
	
	@Test()
	public void TC_09_11() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE3, Constant.BASE_EMAIL, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.INVALID_PHONE_MSG);
	}
	
	@Test()
	public void TC_09_12() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE4, Constant.BASE_EMAIL, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.INVALID_PHONE_MSG);
	}
	
	@Test()
	public void TC_09_13() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE5, Constant.BASE_EMAIL, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.INVALID_PHONE_MSG);
	}
	
	@Test()
	public void TC_09_14() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE6, Constant.BASE_EMAIL, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.INVALID_PHONE_MSG);
	}
	
	@Test()
	public void TC_09_15() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE7, Constant.BASE_EMAIL, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.SUCCESS_MSG);
	}
	
	@Test()
	public void TC_09_16() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE8, Constant.BASE_EMAIL, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.INVALID_PHONE_MSG);
	}
	
	@Test()
	public void TC_09_17() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE9, Constant.BASE_EMAIL, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.INVALID_PHONE_MSG);
	}
	
	@Test()
	public void TC_09_18() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE, Constant.EMPTY_STRING, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.SUCCESS_MSG);
	}
	
	@Test()
	public void TC_09_19() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE, Constant.FULL_SPACE_STRING, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.SUCCESS_MSG);
	}
	
	@Test()
	public void TC_09_20() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE, Constant.BASE_EMAIL1, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.SUCCESS_MSG);
	}
	
	@Test()
	public void TC_09_21() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE, Constant.BASE_EMAIL2, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.INVALID_EMAIL_MSG);
	}
	
	@Test()
	public void TC_09_22() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE, Constant.BASE_EMAIL3, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.INVALID_EMAIL_MSG);
	}
	
	@Test()
	public void TC_09_23() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE, Constant.BASE_EMAIL4, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.INVALID_EMAIL_MSG);
	}
	
	@Test()
	public void TC_09_24() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE, Constant.BASE_EMAIL5, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.INVALID_EMAIL_MSG);
	}
	
	@Test()
	public void TC_09_25() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE, Constant.BASE_EMAIL6, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.INVALID_EMAIL_MSG);
	}
	
	@Test()
	public void TC_09_26() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE, Constant.BASE_EMAIL, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.SUCCESS_MSG);
	}
	
	@Test()
	public void TC_09_27() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE, Constant.BASE_EMAIL_UPPER, Constant.BASE_ADDRESS, Constant.BASE_NOTE, PaymentInfoScreen.SUCCESS_MSG);
	}
	
	@Test()
	public void TC_09_28() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE, Constant.BASE_EMAIL, Constant.EMPTY_STRING, Constant.BASE_NOTE, PaymentInfoScreen.EMPTY_ADDRESS_MSG);
	}
	
	@Test()
	public void TC_09_29() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE, Constant.BASE_EMAIL, Constant.FULL_SPACE_STRING, Constant.BASE_NOTE, PaymentInfoScreen.EMPTY_ADDRESS_MSG);
	}
	
	@Test()
	public void TC_09_30() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE, Constant.BASE_EMAIL, Constant.BASE_ADDRESS1, Constant.BASE_NOTE, PaymentInfoScreen.SUCCESS_MSG);
	}
	
	@Test()
	public void TC_09_31() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE, Constant.BASE_EMAIL, Constant.BASE_ADDRESS2, Constant.BASE_NOTE, PaymentInfoScreen.SUCCESS_MSG);
	}
	
	@Test()
	public void TC_09_32() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE, Constant.BASE_EMAIL, Constant.BASE_ADDRESS3, Constant.BASE_NOTE, PaymentInfoScreen.SUCCESS_MSG);
	}
	
	@Test()
	public void TC_09_33() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE, Constant.BASE_EMAIL, Constant.BASE_ADDRESS, Constant.EMPTY_STRING, PaymentInfoScreen.SUCCESS_MSG);
	}
	
	@Test()
	public void TC_09_34() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE, Constant.BASE_EMAIL, Constant.BASE_ADDRESS, Constant.FULL_SPACE_STRING, PaymentInfoScreen.SUCCESS_MSG);
	}
	
	@Test()
	public void TC_09_35() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE, Constant.BASE_EMAIL, Constant.BASE_ADDRESS, Constant.BASE_NOTE1, PaymentInfoScreen.SUCCESS_MSG);
	}
	
	@Test()
	public void TC_09_36() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE, Constant.BASE_EMAIL, Constant.BASE_ADDRESS, Constant.BASE_NOTE2, PaymentInfoScreen.SUCCESS_MSG);
	}
	
	@Test()
	public void TC_09_37() throws IOException {
		PaymentInfoScreen.orderProductWithoutLogin(driver, Constant.BASE_NAME, Constant.BASE_PHONE, Constant.BASE_EMAIL, Constant.BASE_ADDRESS, Constant.BASE_NOTE3, PaymentInfoScreen.SUCCESS_MSG);
	}
}
