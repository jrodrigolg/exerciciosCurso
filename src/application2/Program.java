package application2;

import java.util.Locale;
import java.util.Scanner;
import entities2.Funcionario;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario joao = new Funcionario();

		System.out.print("Name: ");
		joao.name = sc.nextLine();
		System.out.print("Gross salary: ");
		joao.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		joao.tax = sc.nextDouble();

		System.out.println("Employee: " + joao);
		System.out.print("\nWhich percentage to increase salary?");
		joao.increaseSalary(sc.nextDouble());
		System.out.println("\nUpdated data: " + joao);
		sc.close();
	}

}
