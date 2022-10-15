package PSDMA;
import java.util.ArrayList;
import java.util.Scanner;
public class Urna {

	static ArrayList <Candidato> candidato = new ArrayList<Candidato>(); 
	static ArrayList <Eleitor> eleitores = new ArrayList<Eleitor>();
	static ArrayList <Voto> voto = new ArrayList<Voto>();

	public static void main(String[] args) {
		
		
		Eleitor e1 = new Eleitor("jhonatan isaias dos santos",78996643,"lagarto");
		Eleitor e2 = new Eleitor(" isaias dos santos",9545796,"lagarto");
		Candidato c1 = new Candidato("seu Zé","PSDSA",1414,'P');
		Candidato c2 = new Candidato("Senhor carlos","PSDSA",1515,'P');
		eleitores.add(e1);
		eleitores.add(e2);
		candidato.add(c1);
		candidato.add(c2);
		 
	inserirVotos();
		
	}

	public static void inserirVotos() {
	Scanner ler = new Scanner(System.in);
	
	int RG = 0;
	System.out.println("digite seu RG: ");
	RG = ler.nextInt();
	
	for(Eleitor e : eleitores) {
			if(e.getRegistroGeral() == RG) {
				int num = 0;
				System.out.println("digite o numero do seu cadidato: ");
				num = ler.nextInt();
				for(Candidato c :candidato) {
					if(num == c.getNumero()) {
						Voto v = new Voto(c,e);
						voto.add(v);
						System.out.println("Seu voto foi adicionado com sucesso");
						
					}else {
						System.out.println("não foi possivel encontrar seu candidato");
						inserirVotos();
					}
					/*if(c.getPartido().equals("PSDSA")) {
						Voto vb = new Voto(c,e);
						System.out.println("PSDSA recebeu mais um voto de brinde");
					}
					*/
					
				}
			}
			else {
				System.out.println("Você não esta cadastrado com eleitor");
				inserirVotos();
			}
		}
	}
	public static void exibirResultado() {
		int i = 0;
		for(Voto v1: voto) {
			if(v1.getCandidato().getCargo() == 'P') {
				for(Voto v2 :voto ) {
					if(v1.getCandidato() == v2.getCandidato()) {
						i++;
						System.out.println(v1.getCandidato().getNome() +" Recebeu "+i+" votos");	
					}
					
				}
			
		    }
	    }
		i= 0;
		for(Voto v1: voto) {
			if(v1.getCandidato().getCargo() == 'G') {
				for(Voto v2 :voto ) {
					if(v1.getCandidato() == v2.getCandidato()) {
						i++;
						System.out.println(v1.getCandidato().getNome() +" Recebeu "+i+" votos");	
					}
					
				}
			
		    }
	    }
	}

}
