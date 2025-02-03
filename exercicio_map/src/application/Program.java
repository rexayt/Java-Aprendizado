package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;


public class Program {

	public static void main(String[] args) {
		String in = "S:\\Documentos\\Cursos\\Java\\exercicio_map\\in.csv", line;
		Map<String, Integer> candidates = new TreeMap<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(in))){
			
			while ((line = br.readLine()) != null) {
				String [] out = line.split(",");
				
				if (candidates.containsKey(out[0]) != false) {
					candidates.put(out[0], candidates.get(out[0]) + Integer.parseInt(out[1]));
				}
				else {
					candidates.put(out[0], Integer.parseInt(out[1]));
				}
				
			}
			System.out.println();	
			for (String key: candidates.keySet()) {
				System.out.println(key + ": " + candidates.get(key));
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}