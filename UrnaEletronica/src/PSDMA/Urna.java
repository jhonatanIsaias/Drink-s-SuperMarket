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
		Candidato c2 = new Candidato("Senhor carlos","PSDSA",1515,'G');
		Candidato c3 = new Candidato("Senhor carlos","PSDSA",1616,'S');
		eleitores.add(e2);
		eleitores.add(e3);
		eleitores.add(e4);
		candidato.add(c1);
		candidato.add(c2);
		candidato.add(c3);
		 
	//inserirVotos("98745632",1616);
	inserirVotos("9545796",1515,1414,1616);
	resultado();
	}
	//**** para inserir um voto é necessário passar como parametro o RG do eleitor e o numero do candidato***
	public static void inserirVotos(String RG ,int numPresidente, int numGovernador, int numSenador) {
		
		Eleitor mentiroso = new Eleitor("nome","rg","local");
		eleitores.add(mentiroso);
		
	if(validarEleitor(RG) != null) {
		if(validarCandidato(numPresidente) != null) {
			Voto v = new Voto(validarCandidato(numPresidente));
			voto.add(v);
			System.out.println("voto cadastrado com sucesso");
			if(validarCandidato(numPresidente).getPartido().equals("PSDSA")) {
				
				Voto Vespecial = new Voto(validarCandidato(numPresidente));
				voto.add(Vespecial);
			
			}
		}
		if(validarCandidato(numGovernador) != null) {
			Voto v = new Voto(validarCandidato(numGovernador));
			voto.add(v);
			System.out.println("voto cadastrado com sucesso");
			if(validarCandidato(numGovernador).getPartido().equals("PSDSA")) {
				
				Voto Vespecial = new Voto(validarCandidato(numGovernador));
				voto.add(Vespecial);
			
			}
		}
		if(validarCandidato(numSenador) != null) {
			Voto v = new Voto(validarCandidato(numSenador));
			voto.add(v);
			System.out.println("voto cadastrado com sucesso");
			if(validarCandidato(numSenador).getPartido().equals("PSDSA")) {
				
				Voto Vespecial = new Voto(validarCandidato(numSenador));
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

	
	private static int contarVoto(Candidato candidato){
        int total = 0;
        for(Voto voto: voto){
            Candidato candidato1 = voto.getCandidato();
            if(candidato1 == null)
                continue;
            if(candidato1.getNumero() == candidato.getNumero()){
                total++;
            }
        }
        return total;
    }
	 public static void resultado(){
	        
	        for(Candidato candidato: candidato){
	            System.out.println(candidato.getNome()+"("+candidato.getCargo()+"): " +
	                    ""+contarVoto(candidato));
	        }
	    }
}
