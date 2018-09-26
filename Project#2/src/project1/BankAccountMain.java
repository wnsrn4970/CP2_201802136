package project1;

public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount("이준구", 300000, 0.1);
		int month;
		int money;
		
		System.out.println("계좌 주인은 "+account.getName()+"이고, 잔액은 "+account.getBalance()+" 입니다..\n" );
		
		money = 100000;
		account.deposit(money);
		System.out.println("계좌에 "+money+"원을 입급하여, 잔액이 "+account.getBalance()+"원이 되었습니다.");
		
		money = 200000;
		if (account.withdraw(money) == -1) {
			System.out.println("잔액이 부족하여 출금할 수 업습니다.");
		} else {
			System.out.println("계좌에 "+money+"원을 츨금하여, 잔액이 "+account.getBalance()+"원이 되었습니다.");
		}
		
		money = 10000;
		month = 12;
		System.out.println("매월 "+money+"원씩 "+month+"개월 적급하면, 잔액이 "+account.installmentSavingPredict(month, money)+"원이 됩니다.");
		
		money = 2000000;
		month = 24;
		System.out.println(money+"원을 "+month+"개월 정기 예급하면, 잔액이 "+account.fixedDepositPredict(month, money)+"원이 됩니다.");


	}

}
