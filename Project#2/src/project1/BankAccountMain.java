package project1;

public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount("���ر�", 300000, 0.1);
		int month;
		int money;
		
		System.out.println("���� ������ "+account.getName()+"�̰�, �ܾ��� "+account.getBalance()+" �Դϴ�..\n" );
		
		money = 100000;
		account.deposit(money);
		System.out.println("���¿� "+money+"���� �Ա��Ͽ�, �ܾ��� "+account.getBalance()+"���� �Ǿ����ϴ�.");
		
		money = 200000;
		if (account.withdraw(money) == -1) {
			System.out.println("�ܾ��� �����Ͽ� ����� �� �����ϴ�.");
		} else {
			System.out.println("���¿� "+money+"���� �����Ͽ�, �ܾ��� "+account.getBalance()+"���� �Ǿ����ϴ�.");
		}
		
		money = 10000;
		month = 12;
		System.out.println("�ſ� "+money+"���� "+month+"���� �����ϸ�, �ܾ��� "+account.installmentSavingPredict(month, money)+"���� �˴ϴ�.");
		
		money = 2000000;
		month = 24;
		System.out.println(money+"���� "+month+"���� ���� �����ϸ�, �ܾ��� "+account.fixedDepositPredict(month, money)+"���� �˴ϴ�.");


	}

}
