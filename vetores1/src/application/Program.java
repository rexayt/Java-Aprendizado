package application;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i<n; i++) {
			System.out.print("Digite uma altura (CM) real: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i = 0; i<n; i++) {
			sum += vect[i];
		}
		System.out.printf("A altura média é %.2f%n", sum/vect.length);
		
		System.out.println("Esses foram os número digitados: "+Arrays.toString(vect));
		
		sc.close();

	}

}
