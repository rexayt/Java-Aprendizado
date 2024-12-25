import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double z;

		System.out.print("Digite um texto: ");
		x = sc.next();

		System.out.print("Digite um número: ");
		y = sc.nextInt();

		System.out.print("Digite um número decimal: ");
		z = sc.nextDouble();

		System.out.println("Você digitou: " + x);
		System.out.println("Você digitou: " + y);
		System.out.println("Você digitou: " + z);

		sc.close();

	}

}
