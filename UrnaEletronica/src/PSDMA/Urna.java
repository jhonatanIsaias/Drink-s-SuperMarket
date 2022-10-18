package PSDMA;
import java.util.ArrayList;
import java.util.Scanner;
public class Urna {

	static ArrayList <Candidato> candidato = new ArrayList<>(); 
	static ArrayList <Eleitor> eleitores = new ArrayList<>();
	static ArrayList <Voto> voto = new ArrayList<Voto>();

	public static void main(String[] args) {
		
		

		Eleitor e2 = new Eleitor(" isaias dos santos",9545796,"lagarto");
		Eleitor e3 = new Eleitor("marcos",98745632,"estancia");
		Candidato c1 = new Candidato("seu Zé","PSDSAB",1414,'P');
		Candidato c2 = new Candidato("Senhor carlos","PSDSA",1515,'P');
		Candidato c3 = new Candidato("Senhor carlos","PSDSA",1515,'P');
		eleitores.add(e2);
		eleitores.add(e3);
		candidato.add(c1);
		candidato.add(c2);
		 
	inserirVotos(e3,c1);
	inserirVotos(e2,c1);
	exibirResultado();
		
	}
	//**** para inserir um voto é necessário passar como parametro um eleitor e um candidato cadastrado dentro do array***
	public static void inserirVotos(Eleitor el , Candidato ca) {
	
	
			if(eleitores.contains(el) && candidato.contains(ca)) {
					
					Voto v = new Voto(ca,el);
					voto.add(v);
					System.out.println("voto cadastrado com sucesso");
					if(ca.getPartido().equals("PSDSA")) {
						Voto Vespecial = new Voto(ca,el);
						voto.add(Vespecial);
					}
				}
			
			else {
				System.out.println("Você não esta cadastrado com eleitor ou seu candidato não está cadastrado ");
				
			}
		
	}
	public static void exibirResultado() {
	
			
		
		
	
	
	}
	

}
