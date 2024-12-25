package entities;

public class Quarto {
	private int quarto_id;
	private boolean alugado = false;
	private String nome;
	private String email;
	
	public Quarto(int quarto) {
		this.quarto_id = quarto;
	}
	
	public Quarto(int quarto, String nome, String email) {
		this.quarto_id = quarto;
		this.nome = nome;
		this.email = email;
		this.alugado = true;
	}
	
	public boolean verificaQuarto() {
		return this.alugado;
	}
	
	public void alugaQuarto(String nome, String email) {
		boolean verificador = verificaQuarto();
		if (verificador == true) {
			System.out.println("O quarto já está alugado, tente outro!");
		}
		else {
			this.alugado = true;
			this.nome = nome;
			this.email = email;
			System.out.printf("Quarto alugado com sucesso para o cliente %s%n", this.nome);
		}
	}
	
	public void esvaziaQuarto() {
		boolean verificador = verificaQuarto();
		
		if (verificador == true) {
			this.alugado = false;
			this.nome = null;
			this.email = null;
			System.out.println("Quarto esvaziado com sucesso!");
		}
		else {
			System.out.println("Quarto já está vazio");
		}
	
	}
	
	public String toString() {
		if (verificaQuarto() == false) {
			return String.format("O quarto $d está vazio%n", quarto_id);
		}

		return String.format("O quarto %d está ocupado por %s", quarto_id, nome);
	}
		
}
