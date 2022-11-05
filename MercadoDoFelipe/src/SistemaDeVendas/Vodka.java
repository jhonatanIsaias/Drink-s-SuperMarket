package SistemaDeVendas;

public class Vodka extends Bebida {
	private double total;
	private boolean premium ;
	
	public Vodka(String nome, double tamanho, double preco, String tipo, boolean premium) {
		super(nome, tamanho, preco, tipo);
		
			this.premium = premium;
			if(this.premium) {
				preco = preco*1.3d;
				total = preco;
				
			}
			else {
				total = preco;
			}
		// TODO Auto-generated constructor stub
	}

	
	// o preço da vodka é alterado caso ela seja premium 
	@Override
	public double getPreco() {
		
		
		return this.total ;
		
	}
}
