package g30126.bacs.andrei.e1;

import java.util.Comparator;

public class BankAccount implements Comparable<BankAccount>{
	private String owner;
	private double balance;

	public BankAccount(String owner,double balance) {
		this.balance=balance;
		this.owner=owner;
	}
	public void withdraw(double amount)
	{
		if(balance<amount)
			System.out.println("nu e bani");
		else
			balance=balance-amount;
			
	}
	public void deposit(double amount) {
		balance=balance+amount;
		
	}
	public double getBalance() {
		return balance;
	}
	public String getOwner() {
		return owner;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof BankAccount){
			BankAccount bankAccount = (BankAccount)obj;
			return owner == bankAccount.owner;
		}
		return false;
	}
	@Override
	public int hashCode() {
		  return (int) (owner.hashCode()+balance);
	}
	public static void main(String[] args) {
		BankAccount bankAccount=new BankAccount("lul", 10);
		BankAccount bankAccount2=new BankAccount("lulu", 50);
		if(bankAccount.equals(bankAccount2))
			System.out.println("are equal");
		else
			System.out.println("not equal");
		System.out.println(bankAccount.hashCode());
		bankAccount.deposit(50);
		System.out.println(bankAccount.getBalance());
	}
	@Override
	public int compareTo(BankAccount o) {
		BankAccount bankAccount=(BankAccount) o;
		if(balance>bankAccount.balance)
			return 1;
		if(balance==bankAccount.balance)
			return 0;
		return -1;
	}
	public static Comparator<BankAccount> bComparator=new Comparator<BankAccount>() {
		@Override
		public int compare(BankAccount b1,BankAccount b2)
		{
			String owner1=b1.getOwner().toUpperCase();
			String owner2=b2.getOwner().toUpperCase();
			return owner1.compareTo(owner2);
			
		}
	};

}
