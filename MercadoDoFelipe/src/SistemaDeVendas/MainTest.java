package SistemaDeVendas;

public class MainTest {
	
	public static void main(String[] args) {
		
		Caixa caixa = new Caixa();
		vendas(caixa);
		System.out.println(caixa.imprimirFaturamento());
		System.out.println(caixa.buscarBebidaMaisVendida());
		System.out.println(caixa.buscarMelhorCliente());
	}
	
	public static void bebidasEstoque(Caixa caixa) {
		
		Vodka smirnoff = new Vodka("smirnoff premium",998,100,"vodka",true);
		Cerveja bohemia = new Cerveja("bohemia gelada",350d,3d,"cerveja",true);
		Whisky bourbon = new Whisky("bourbon 18",750d,84d,"whisky",18);
		
		
		caixa.getEstoque().adiconarBebida(smirnoff);
		caixa.getEstoque().adiconarBebida(bohemia);
		caixa.getEstoque().adiconarBebida(bourbon);
	
	}
	
	public static void vendas(Caixa caixa) {
		
		// inicializando estoque
		bebidasEstoque(caixa);
		// cadastro de clientes
		Cliente cliente1 = new Cliente("jhonatan","976864532323",2001);
		Cliente cliente2 = new Cliente("isaias","798946256233",2001);
	
		
		// vendas 
		caixa.realizarVenda(cliente1, "bourbon 18");
		caixa.realizarVenda(cliente2, "smirnoff premium");
		caixa.realizarVenda(cliente1, "bohemia gelada");
		caixa.realizarVenda(cliente2, "smirnoff premium");
		caixa.realizarVenda(cliente2, "smirnoff premium");
		caixa.realizarVenda(cliente1, "bohemia gelada");
		caixa.realizarVenda(cliente2, "smirnoff premium");
		
	}
	
}
