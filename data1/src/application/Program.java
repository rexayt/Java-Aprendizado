package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		
		System.out.printf("d01 = %s%n",d01);
		System.out.printf("d02 = %s%n",d02);
		System.out.printf("d03 = %s%n",d03);
		System.out.printf("d04 = %s%n",d04);
		System.out.printf("d05 = %s%n",d05);
		System.out.printf("d06 = %s%n",d06);
		System.out.printf("d07 = %s%n",d07);
		System.out.printf("d08 = %s%n",d08);
		System.out.printf("d09 = %s%n",d09);
		System.out.printf("d10 = %s%n",d10);
		System.out.printf("d11 = %s%n",d11);
	}

}
