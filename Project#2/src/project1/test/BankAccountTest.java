package project1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import project1.BankAccount;

class BankAccountTest {

	@Test
	void testWithdraw() {
		BankAccount account = new BankAccount("이준구", 400000, 0.1);
		account.withdraw(200000);
		assertEquals(200000,account.getBalance());
	}

	@Test
	void testGetName() {
		BankAccount account = new BankAccount("이준구", 400000, 0.1);
		assertEquals("이준구",account.getName());
	}

	@Test
	void testGetBalance() {
		BankAccount account = new BankAccount("이준구", 300000, 0.1);
		assertEquals(300000,account.getBalance());
	}

	@Test
	void testDeposit() {
		BankAccount account = new BankAccount("이준구", 300000, 0.1);
		account.deposit(100000);
		assertEquals(400000,account.getBalance());
	}

	@Test
	void testInstallmentSavingPredict() {
		BankAccount account = new BankAccount("이준구", 200000, 0.1);
		assertEquals(326500,account.installmentSavingPredict(12, 10000));
	}

	@Test
	void testFixedDepositPredict() {
		BankAccount account = new BankAccount("이준구", 300000, 0.1);
		assertEquals(2440781,account.fixedDepositPredict(24, 2000000));
	}

}
