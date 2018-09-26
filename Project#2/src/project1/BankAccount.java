package project1;

public class BankAccount {
	private String name;
	private String account;
	private long balance;
	private double interest;
	
	public BankAccount(String Name, int Balance, double Interest) {
		name = Name;
		interest = Interest;
		balance = Balance;
	}
	
	public int withdraw(long money){
		if (balance > money) {
			balance -= money;
			return 1;
		}else {
			return -1;
		}
		
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public long getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	public void deposit(long money) {
		// TODO Auto-generated method stub
		balance += money;
	}

	public int installmentSavingPredict(int month, long money) {
		// TODO Auto-generated method stub
		return (int) (balance + money*interest/12*month*(month+1)/2+money*month);
	}

	public int fixedDepositPredict(int month, long money) {
		// TODO Auto-generated method stub
		return (int) (money*Math.pow(1+(interest/12),month));
	}
	
	
}
