package PSDMA;

public class Eleitor {
	private String nome;
	private int registroGeral;
	private String endereco;
	
	
	
	public Eleitor(String nome, int registroGeral, String endereco) {
	
		this.nome = nome;
		this.registroGeral = registroGeral;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(int registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
}
