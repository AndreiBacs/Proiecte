package g30126.bacs.andrei.l7.e2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import g30126.bacs.andrei.e1.BankAccount;

public class Bank {
	private ArrayList<BankAccount> bankAccount;
	
	public Bank(ArrayList<BankAccount> bankAccounts) {
		this.bankAccount=bankAccounts;
	}
	public 	void addAccounts(String owner,double balance) {
		bankAccount.add(new BankAccount(owner, balance));
	}
	public void printAccounts() {
		Collections.sort(bankAccount);
		for(BankAccount x:bankAccount)
		{		
			System.out.println(x.getOwner()+" "+x.getBalance());
		}
	}
	public void printAccount(double minBalance,double maxBalance) {
		for(BankAccount x:bankAccount)
		{
			if(x.getBalance()>=minBalance && x.getBalance()<=maxBalance)
			{
				System.out.println(x.getOwner()+" "+x.getBalance());
			}
		}
	}
	public BankAccount getAccounts(String owner)
	{
		for(BankAccount x:bankAccount)
		{
			if(x.getOwner().equals(owner))
			{
				return x;
			}
		}
		return null;
	}
	public ArrayList<BankAccount> getAllAccount()
	{
		return bankAccount;
	}

}
