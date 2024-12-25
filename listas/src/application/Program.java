package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("------------------------------");
		list.removeIf( y -> y.charAt(0) == "M");
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("------------------------------");
		System.out.println("Index of Bob "+ list.indexOf("Bob"));
		System.out.println("Index of Bob "+ list.indexOf("Marco"));
		System.out.println("------------------------------");
		List<String> result = list.stream().filter(x -> x.substring(0,1) == "A").collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
	}

}
