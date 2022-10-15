package PSDMA;

public class Candidato {
	private String nome;
	private String partido;
	private int numero;
	private char cargo;
	private int numVotos;
	
	
	public Candidato(String nome, String partido, int numero, char cargo) {
		
		this.nome = nome;
		this.partido = partido;
		this.numero = numero;
		this.cargo = cargo;
	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public char getCargo() {
		return cargo;
	}
	public void setCargo(char cargo) {
		this.cargo = cargo;
	}
	public void setNumVotos(int numVotos) {
		this.numVotos = numVotos;
	}
	public int getNumVotos() {
		return this.numVotos;
	}
}
