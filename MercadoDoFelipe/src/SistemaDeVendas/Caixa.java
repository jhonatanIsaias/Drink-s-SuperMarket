package SistemaDeVendas;

import java.util.ArrayList;

public class Caixa {
	ArrayList<Venda> vendas = new ArrayList<>();
	private Estoque estoque = new Estoque();
	
	// clientes menores que 18 não podem comprar bebida 
	// verificação se a bebida está disponivel no estoque
	// se o comprador da bebida for eu mesmo acontece um desconto de 20%
	public void realizarVenda(Cliente cliente , String bebida) {
		
			if(this.getEstoque().buscarBebida(bebida)!= null && cliente.getIdade() >= 18 ) {
				Venda v = new Venda(getEstoque().buscarBebida(bebida) ,cliente);
				if(cliente.getNome().equals("Eu")) {
					v.getBebida().setPreco((v.getBebida().getPreco()*0.2d) - v.getBebida().getPreco());
				}
				vendas.add(v);
			}
	}
	
	public Estoque getEstoque() {
		
		return estoque;
	}
	// metodo que retorna o faturamento total
	public String imprimirFaturamento() {
		double cont = 0;
		for(Venda v : vendas) {
			
			cont += v.getBebida().getPreco();
			
		}
		
		return "Faturamento total: "+ "R$ "+cont;
	}
	// achar cliente que mais comprou de acordo com as vendas
	public String buscarMelhorCliente() {
		int contCliente = 0;
		int  melhorCliente = 0;
		String nome = null;
		
		for(Venda v1 : vendas) {	
			Cliente cliente1 = v1.getCliente();
			 for(Venda v : vendas) {
				Cliente cliente2 = v.getCliente();
				 if(cliente1 == cliente2) {
					 contCliente++;
				 }
				
			 }
			 if(contCliente >= melhorCliente) {
				 melhorCliente = contCliente;
				  nome = cliente1.getNome();
			 }
		}
		 return nome+" comprou mais vezes";
		
	}
	 
	public String buscarBebidaMaisVendida() {
		
		int contBebida = 0;
		int  melhorBebida = 0;
		 String nome = null;
		
		for(Venda v1 : vendas) {	
			 Bebida bebida1 = v1.getBebida();
			 for(Venda v : vendas) {
				 Bebida bebida2 = v.getBebida();
				 if(bebida1 == bebida2) {
					 contBebida++;
				 }
				
			 }
			 if(contBebida >= melhorBebida) {
				 melhorBebida = contBebida;
				  nome = bebida1.getNome();
			 }
		}
		 return nome+" foi a mais vendida";
		
	}
}
