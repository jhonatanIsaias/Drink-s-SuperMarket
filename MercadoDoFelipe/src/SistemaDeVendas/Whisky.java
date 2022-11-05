package SistemaDeVendas;

public class Whisky extends Bebida{
	private double total;
	public int idade;
	public Whisky(String nome, double tamanho, double preco, String tipo, int idade) {
		super(nome, tamanho, preco, tipo);
		
		this.idade = idade;
		if(this.idade == 16) {
			total = preco* 1.2d;
		}
		else if(this.idade == 18) {
			total = preco* 1.4d;
		}
		else {
		total = preco;
		}
	}
	

	
	// o preço do Whisky é alterado de acordo com sua idade
	@Override
	public double getPreco() {
		
		return this.total;
	}
}
