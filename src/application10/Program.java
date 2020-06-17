package application10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities10.Funcionarios;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionarios> func = new ArrayList<>();
		
		
		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #"+n);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("name: ");
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			func.add(new Funcionarios(id,name,salary));
			System.out.println();
		}
		
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		Funcionarios emp = func.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null){
			System.out.println("this id does not exist!");
		}
		else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.setSalaryPercentage(percentage);
		}
		System.out.println("List of employees:");
		for(Funcionarios x:func) {
			System.out.println(x);
		}
		sc.close();
	}

}
