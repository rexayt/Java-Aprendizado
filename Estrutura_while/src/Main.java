import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número (0 sairá do programa): ");
		
		int numero = sc.nextInt();
		
		int soma = 0;
		while (numero != 0) {
			
			soma += numero;
			System.out.print("Digite um número (0 sairá do programa): ");
			numero = sc.nextInt();
		};
		
		sc.close();
	}

}
