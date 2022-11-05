package SistemaDeVendas;

import java.util.ArrayList;

public class Estoque {
	
	//Lista onde fica as bebidas cadastradas em estoque.
	ArrayList<Bebida> bebidas = new ArrayList<>();
	
	//metodo que adiciona bebidas a lista
	public void adiconarBebida(Bebida bebida) {
		bebidas.add(bebida);
	}
	
	//metodo que remove alguma bebida da lista
	public void removerBebida(Bebida bebida) {
		bebidas.remove(bebida);
	}
	
	// metodo para procurar alguma bebida no estoque
	public Bebida buscarBebida(String bebida) {
		for(Bebida b : bebidas) {
			if(b.getNome().equals(bebida)) {
				return b;
			}
		}
		return null;
		
	}
}
