package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer studentsNumber;
		Set<Student> setA = new HashSet<>();	
		Set<Student> setB = new HashSet<>();	
		Set<Student> setC = new HashSet<>();	
		
		System.out.print("How many Students for course A? ");
		studentsNumber = sc.nextInt();
		forEach(studentsNumber, setA, sc);
		
		
		System.out.print("How many Students for course B? ");
		studentsNumber = sc.nextInt();
		forEach(studentsNumber, setB, sc);
		
		System.out.print("How many Students for course C? ");
		studentsNumber = sc.nextInt();
		forEach(studentsNumber, setC, sc);
		
		Set<Student> setD = new HashSet<>(setA);
		setD.addAll(setB);
		setD.addAll(setC);
		
		System.out.println("Total students: " + setD.size());
		for (Student s : setD) {
			System.out.println(s.toString());
		}
		sc.close();
	}
	
	public static void forEach(Integer studentsNumber, Set newSet, Scanner sc) {
		for(int i = 0; i < studentsNumber; i++) {
			Integer student = sc.nextInt();
			newSet.add(new Student(student));
		}
	}
}
