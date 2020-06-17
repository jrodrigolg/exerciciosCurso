package application5;

import java.util.Locale;
import java.util.Scanner;
import entities5.Account;

public class Program {
	
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			int number;
		String holder;
		double value;
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number:");
		number= sc.nextInt();
		System.out.print("Enter account holder:");
		sc.nextLine();
		holder = sc.nextLine();
		System.out.print("is there an initial deposit(y/n)?");
		String opc = sc.nextLine();
		if(opc.equals("y")) {
			System.out.println("enter an initial deposit value:");
			value = sc.nextDouble();
			account = new Account(number, holder,value);
		}
		else {
			account = new Account(number,holder);
		}
		System.out.println("Account data:");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a deposit value:");
		account.deposit(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value:");
		account.withdraw(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(account);
		sc.close();
	}
}
