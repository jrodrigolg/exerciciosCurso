package application1;

import java.util.Locale;
import java.util.Scanner;

import entities1.Retangulo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo x = new Retangulo();
		
		System.out.println("Enter retangle width and height: ");
		x.width = sc.nextDouble();
		x.height = sc.nextDouble();
		System.out.printf("AREA = %.2f\n",x.area(x.width, x.height));
		System.out.printf("PERIMETER = %.2f\n",x.perimeter(x.width, x.height));
		System.out.printf("DIAGONAL = %.2f",x.diagonal(x.width, x.height));
		sc.close();
	}

}
