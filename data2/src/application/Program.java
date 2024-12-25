package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.printf("d04 = %s%n", d04.format(fmt1));
		System.out.printf("d04 = %s%n", fmt1.format(d04));
		System.out.printf("d04 = %s%n", d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.printf("d05 = %s%n", d05.format(fmt1));
		System.out.printf("d05 = %s%n", d05.format(fmt2));
		System.out.printf("d05 = %s%n", d05.format(fmt4));
		
		System.out.printf("d06 = %s%n", fmt3.format(d06));
		System.out.printf("d06 = %s%n", fmt5.format(d06));
	}

}
