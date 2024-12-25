package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int linhas, colunas, n;
		
		System.out.print("Digite a quantidade de linhas: ");
		linhas = sc.nextInt();
		System.out.print("Digite a quantidade de colunas: ");
		colunas = sc.nextInt();
		int[][] vect = new int[linhas][colunas];
		
		for (int l = 0; l<linhas; l++) {
			for (int c = 0; c<colunas; c++) {
				System.out.print("");
				vect[l][c] = sc.nextInt();
			}
		}
		
		System.out.println("Digite o número que será achado: ");
		n = sc.nextInt();
		for(int fora = 0; fora < vect.length; fora++) {
			for (int dentro = 0; dentro < vect[fora].length; dentro++) {
				if (vect[fora][dentro] == n) {
					System.out.printf("Position: %d, %d%n", fora,dentro);
					if (dentro > 0) {
						System.out.printf("Left: %d%n", vect[fora][dentro-1]);
					}
					if (dentro < vect[fora].length-1) {
						System.out.printf("Right: %d%n", vect[fora][dentro+1]);
					}
					if (fora > 0) {
						System.out.printf("Up: %d%n", vect[fora-1][dentro]);
					}
					if (fora < vect.length-1) {
						System.out.printf("Down: %d%n", vect[fora+1][dentro]);
					}
				}

			}

			
		}
		sc.close();
	}

}
