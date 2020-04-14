package g30126.bacs.andrei.l7.e3;

import java.util.ArrayList;
import java.util.TreeSet;

import g30126.bacs.andrei.e1.BankAccount;
import g30126.bacs.andrei.l7.e3.*;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		TreeSet<BankAccount> bankAccounts=new TreeSet<BankAccount>();
		Bank bank=new Bank(bankAccounts);
		bank.addAccounts("haralamb", 50);
		bank.addAccounts("ismail", 500);
		bank.addAccounts("libelul", 1000);
		bank.addAccounts("acad", 5000);
		bank.printAccounts();
		bank.printAccount(40, 100);
		System.out.println(bank.getAllAccount());

	}
}
