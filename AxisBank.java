package org.system;

public class AxisBank {

	public void deposit()
	{
		System.out.println("deposit");
	}
	
	public static void main(String[] args) {
		BankInfo bnk = new BankInfo();
		AxisBank abk = new AxisBank();
		abk.deposit();
		bnk.deposit();
		bnk.fixed();
		bnk.saving();
	}
}
