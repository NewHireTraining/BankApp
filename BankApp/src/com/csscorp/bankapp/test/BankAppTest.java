package com.csscorp.bankapp.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.csscorp.bankapp.dto.Bank;
import com.csscorp.bankapp.exception.AccountNotFoundException;
import com.csscorp.bankapp.exception.InsufficientFundException;
import com.csscorp.bankapp.utils.ExcelReader;

public class BankAppTest {

	public static Bank testBank;

	static {
		testBank = new Bank("Test123", "TestCity", "TestBank");
	}

	
	@DataProvider
	public Object[][] accountsTestData() {

		return ExcelReader.read("BankTestData.xlsx", "accounts");
	}

	@DataProvider
	public Object[][] withdrawTestData() {

		return ExcelReader.read("BankTestData.xlsx", "withdraw");
	}

	@Test(dataProvider = "accountsTestData")
	public void accountCreationTest(String accountName, double balance) {
		boolean createAccountFlag = testBank.createAccount(accountName, balance);
		Assert.assertEquals(createAccountFlag, true);
	}

	@Test(dataProvider = "withdrawTestData", dependsOnMethods = { "accountCreationTest" })
	public void withdrawTest(String accountNo, double amount) {
		boolean withdrawFlag = false;
		try {
			withdrawFlag = testBank.withdraw(accountNo, amount);
			Assert.assertEquals(withdrawFlag, false);
		} catch (AccountNotFoundException | InsufficientFundException e) {

			e.printStackTrace();
		}
	}

	@Test(expectedExceptions = AccountNotFoundException.class)
	public void ExceptionTest() throws AccountNotFoundException {
		testBank.checkAccount("11111");

	}

	@Test(expectedExceptions = { AccountNotFoundException.class, InsufficientFundException.class })
	public void ExceptionTest1() throws InsufficientFundException, AccountNotFoundException {
		testBank.withdraw("1001", 10000000);

	}
}
