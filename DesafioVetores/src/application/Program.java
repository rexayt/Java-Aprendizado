package application;

import java.util.Scanner;

import entities.Quarto;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Quarto[] quartos = new Quarto[10];
		
		System.out.print("Digite quantos alunos serão adicionados: ");
		
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			sc.nextLine();
			System.out.print("Digite o nome do cliente: ");
			String nome = sc.nextLine();
			System.out.print("Digite o email do cliente: ");
			String email = sc.nextLine();
			System.out.print("Digite o quarto que o cliente deseja alugar: ");
			int quarto = sc.nextInt();
			
			quartos[i] = new Quarto(quarto, nome, email);
		}
		
		System.out.println(quartos[0].toString());
		
		sc.close();
	}

}
