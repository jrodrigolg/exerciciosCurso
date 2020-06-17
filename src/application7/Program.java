package application7;

import java.util.Locale;
import java.util.Scanner;

import entities7.Quartos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		System.out.println("How many rooms will be rented?");
		int n=sc.nextInt();//le a quantidade de quartos que seram alugados
		Quartos[] quarto = new Quartos[10];//declara o vetor do tipo quartos
		
		for (int i = 0; i < n; i++) {
			System.out.println("\nRent #"+(i+1));
			sc.nextLine();//consumir a quebra de linha
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			quarto[room] = new Quartos(name, email);//atribui os valores ao objeto
		}
		System.out.println("\nBusy rooms:");
		for (int i = 0; i < quarto.length; i++) {
			if (quarto[i]!=null) {
				System.out.print(
						i
						+": "
						+quarto[i].getName()
						+", "
						+quarto[i].getEmail()
						+"\n"); 
			}
		}
		sc.close();
	}

}
