package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		String source = "S:\\Documentos\\Cursos\\Java\\exercicio_arquivos\\source.csv", productString;
		File outFile = new File("S:\\Documentos\\Cursos\\Java\\exercicio_arquivos\\out\\Summary.csv");
		Product product;
		
		try (BufferedReader br = new BufferedReader(new FileReader(source))){
			BufferedWriter bw = new BufferedWriter(new FileWriter(outFile, true));
			String line;
			String[] out;
			
			while ((line = br.readLine()) != null) {
				out = line.split(",");
				product = new Product(out[0], Double.parseDouble(out[1]), Integer.parseInt(out[2]));
				productString = product.toString();
				System.out.println(productString);
				bw.write(productString);
				bw.newLine();
			}
			
			br.close();
			bw.close();
			
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
