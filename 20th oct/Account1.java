package javac1;

public class Account1 {

	private String accountName;
	private double accountBalance;
	
	public void createAccount(int accontnumber,String accname,double accbal) {
		this.accountName=accname;
		this.accountBalance=accbal;
	}
	public void setAmount(double amount) { //setAmount=> add amount to account balance
		accountBalance += amount;
	}
	public double getAmount() {  //getAmount=>print account balance and name account
		return accountBalance;
	}
	public double withDrawAmount(double amount){ //withDrawAmount()=to withdraw amount from accBalance
		accountBalance -= amount;
		return amount;
	}
	
	public static void main(String[] args) {
		Account1 a1= new Account1();  //object 1
		Account1 a2= new Account1();  //object 2
		a1.createAccount(10000,"barsha",1000);
		a2.createAccount(90000,"paapu",9000);
		
		a1.setAmount(300);
		System.out.println("Customer name : "+a1.accountName);
		System.out.println("Account Balance : rs "+a1.getAmount());
		
		System.out.println("                               ");
		a2.setAmount(500);
		System.out.println("Customer name : "+a2.accountName);
		System.out.println("Account Balance : rs "+a2.getAmount());
	}
}