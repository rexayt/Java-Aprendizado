package application;

import java.util.Scanner;

import model.entities.Account;
import model.exception.WithdrawError;

public class Program {

	public static void main(String[] args) {
		
		Integer number;
		String holder;
		Double balance, withdrawLimit, withdraw;
		Account acc;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			holder = sc.nextLine();
			System.out.print("Initial balance: ");
			balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			withdrawLimit = sc.nextDouble();
			
			acc = new Account(number, holder, balance, withdrawLimit);
			
			System.out.print("Enter amount for withdraw: ");
			withdraw = sc.nextDouble();
			acc.withdraw(withdraw);
		}
		catch (WithdrawError e) {
			System.out.println("Withdraw error: "+ e.getMessage());
		}

	}

}
