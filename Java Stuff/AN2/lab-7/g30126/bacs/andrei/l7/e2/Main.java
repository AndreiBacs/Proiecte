package g30126.bacs.andrei.l7.e2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import g30126.bacs.andrei.e1.BankAccount;

public class Main {

	public static void main(String[] args) {
		ArrayList<BankAccount> bankAccounts=new ArrayList<>();
		Bank bank=new Bank(bankAccounts);
		bank.addAccounts("haralamb", 50);
		bank.addAccounts("ismail", 500);
		bank.printAccounts();
		bank.printAccount(40, 100);
		Collections.sort(bank.getAllAccount(),BankAccount.bComparator);
		bank.printAccounts();

	}

}
