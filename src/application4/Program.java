package application4;

import java.util.Locale;
import java.util.Scanner;

import util4.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollar will be bought? ");
		double bought = sc.nextDouble();
		double pay = CurrencyConverter.dollar(dollarPrice, bought);
		System.out.printf("Amount to be paid in reals = %.2f", pay);
		sc.close();
	}

}
