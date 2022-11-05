package SistemaDeVendas;

public class Venda {
	
	private Bebida bebida;
	private Cliente cliente;
	private double valor;
	
	public Venda(Bebida bebida, Cliente cliente) {
	
		this.bebida = bebida;
		this.cliente = cliente;
		this.valor = bebida.getPreco();

	}

	public Bebida getBebida() {
		return bebida;
	}

	public Cliente getCliente() {
		return cliente;
	}

	
	
	
}
