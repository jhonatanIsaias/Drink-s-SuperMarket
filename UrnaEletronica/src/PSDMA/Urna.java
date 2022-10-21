package PSDMA;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;
public class Urna {

	static ArrayList <Candidato> candidato = new ArrayList<>(); 
	static ArrayList <Eleitor> eleitores = new ArrayList<>();
	static ArrayList <Voto> voto = new ArrayList<Voto>();

	public static void main(String[] args) {
		
		

		Eleitor e2 = new Eleitor(" isaias dos santos","9545796","lagarto");
		Eleitor e3 = new Eleitor("marcos","98745632","estancia");
		Eleitor e4 = new Eleitor(" isaias dos santos","976433654","lagarto");
		Candidato c1 = new Candidato("seu Zé","PSDSAB",1414,'P');
		Candidato c2 = new Candidato("Senhor carlos","PSDSA",1515,'P');
		Candidato c3 = new Candidato("Senhor carlos","PSDSA",1616,'P');
		eleitores.add(e2);
		eleitores.add(e3);
		eleitores.add(e4);
		candidato.add(c1);
		candidato.add(c2);
		candidato.add(c3);
		 
	//inserirVotos("98745632",1616);
	inserirVotos("9545796",1515);
	inserirVotos("976433654",1414);
	exibirResultado();
	}
	//**** para inserir um voto é necessário passar como parametro o RG do eleitor e o numero do candidato***
	public static void inserirVotos(String RG ,int numCandidato) {
		
		Eleitor mentiroso = new Eleitor("nome","rg","local");
		eleitores.add(mentiroso);
		
	if(validarEleitor(RG) != null) {
		if(validarCandidato(numCandidato) != null) {
			Voto v = new Voto(validarCandidato(numCandidato));
			voto.add(v);
			System.out.println("voto cadastrado com sucesso");
			if(validarCandidato(numCandidato).getPartido().equals("PSDSA")) {
				
				Voto Vespecial = new Voto(validarCandidato(numCandidato));
				voto.add(Vespecial);
			
			}
		}
	}
}
	//validando eleitor 
	public static Eleitor validarEleitor(String RG) {
		for(Eleitor e : eleitores) {
			if(e.getRegistroGeral().equals(RG)) {
				return e ;
			}
		}
		return null;
	}
	//validando candidato
	public static Candidato validarCandidato(int num) {
		for(Candidato c :candidato) {
			if(c.getNumero() == num) {
				return c;
			}
		}
		return null;
	}
	
	public static void exibirResultado() {
		 ArrayList<Voto> votoContado = new ArrayList<Voto>();
		 boolean found ;
		 
		 int counter = 0;
		for(Voto v :voto) {
			found = false;
			
			
			for(Voto v2 :votoContado){
		       
		        if (v == v2){
		          counter ++;
		          found = true;
		          break;
		        }
		        System.out.println(v.getCandidato().getNome() + " recebeu "+ counter+ " votos");
			}
			
			if(!found) {
				votoContado.add(v);
			}
			
			
		}
	
	}
	

}
