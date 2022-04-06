package br.com.competencia.hospital;

public class Prontuario {
	
	private int idPronturio;
	private Medico medResponsavel;
	private Paciente paciente;
	private Ocorrencia listaOcorrencias;
	
	
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
}
