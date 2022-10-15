package PSDMA;

public class Voto {
	private Candidato candidato;
	private Eleitor eleitor;
	
	
	
	public Voto(Candidato candidato, Eleitor eleitor) {
		
		this.candidato = candidato;
		this.eleitor = eleitor;
	}
	public Candidato getCandidato() {
		return candidato;
	}
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	public Eleitor getEleitor() {
		return eleitor;
	}
	public void setEleitor(Eleitor eleitor) {
		this.eleitor = eleitor;
	}
	@Override
	public String toString() {
		return "Voto [candidato=" + candidato + ", eleitor=" + eleitor + "]";
	}
	
	
}
