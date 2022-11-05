package SistemaDeVendas;

public class Bebida {
	//atributos necessários para registrar uma bebida.
	
	private String nome;
	private double tamanho;
	private double preco;
	
	
	//*** construtor ***
	
	public Bebida(String nome, double tamanho, double preco , String tipo) {
		super();
		this.nome = nome;
		this.tamanho = tamanho;
		this.preco = preco;
	}

	// ***gets e sets ***
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getTamanho() {
		return tamanho;
	}


	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	

	
	
	
	
}
