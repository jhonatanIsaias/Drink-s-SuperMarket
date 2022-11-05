package SistemaDeVendas;

public class Cerveja extends Bebida {
	private double total;
	public Cerveja(String nome, double tamanho, double preco, String tipo, boolean gelada) {
		super(nome, tamanho, preco, tipo);
		// TODO Auto-generated constructor stub
		this.gelada = gelada;
		
		if(this.gelada) {
			preco = preco*1.1d;
			total = preco;
			
		}
		else {
			total = preco;
		}
	}

	private boolean gelada;
	// o preço da cerveja é alterado caso ela esteja gelada 
	@Override
	public double getPreco() {
		
		return this.total;
	
	}
}
