package SistemaDeVendas;

public class Cliente {
	// atributos para registrar um cliente;
	
	private String nome;
	private String cpf;
	private int anoNascimento;
	int idade = 0;
	// **Construtor**
	public Cliente(String nome , String cpf , int anoNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.anoNascimento = anoNascimento;
		idade = 2022 - this.anoNascimento ;
	}

	// **gets e sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	public int getIdade() {
		
		
		return idade;
		
	}
}
