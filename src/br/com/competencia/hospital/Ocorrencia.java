package br.com.competencia.hospital;

public class Ocorrencia {
	
	private String exame;
	private String consulta;
	private String medicamentosMinistrados;
	private String dataHora;
	private String convenio;
	
	public String getExame() {
		return exame;
	}
	public void setExame(String exame) {
		this.exame = exame;
	}
	public String getConsulta() {
		return consulta;
	}
	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}
	public String getMedicamentosMinistrados() {
		return medicamentosMinistrados;
	}
	public void setMedicamentosMinistrados(String medicamentosMinistrados) {
		this.medicamentosMinistrados = medicamentosMinistrados;
	}
	public String getDataHora() {
		return dataHora;
	}
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
	public String getConvenio() {
		return convenio;
	}
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
}
