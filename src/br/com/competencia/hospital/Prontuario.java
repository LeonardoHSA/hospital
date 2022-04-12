package br.com.competencia.hospital;



public class Prontuario {
	
	private int idPronturio;
	private Medico medResponsavel;
	private Paciente paciente;
	private Ocorrencia listaOcorrencias;
	
	
	public Prontuario(int idProntuario, Medico medResponsavel, Paciente paciente, Ocorrencia listaOcorrencias) {
		
		this.idPronturio = idProntuario;
		this.medResponsavel = medResponsavel;
		this.paciente = paciente;
		this.listaOcorrencias = listaOcorrencias;
		
	}
	
	
	public int getIdPronturio() {
		return idPronturio;
	}
	public void setIdPronturio(int idPronturio) {
		this.idPronturio = idPronturio;
	}
	public Medico getMedResponsavel() {
		return medResponsavel;
	}
	public void setMedResponsavel(Medico medResponsavel) {
		this.medResponsavel = medResponsavel;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Ocorrencia getListaOcorrencias() {
		return listaOcorrencias;
	}


	public void setListaOcorrencias(Ocorrencia listaOcorrencias) {
		this.listaOcorrencias = listaOcorrencias;
	}

	
	public void status() {
		
		System.out.println("ID Prontuario: " + this.getIdPronturio());
		System.out.println("Médico responsável: " + this.getMedResponsavel().getNome());
		System.out.println("Paciente: " + this.getPaciente().getNome());
		
	}


	
	
}
