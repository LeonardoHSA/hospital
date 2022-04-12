package br.com.competencia.hospital;

public class Ocorrencia {
	
	private String exame;
	private String consulta;
	private String medicamentosMinistrados;
	private String dataHora;
	private String convenio;
	
	public Ocorrencia(String exame, String consulta, String medicamentosMinistrados, String dataHora, String convenio) {
		
		this.exame = exame;
		this.consulta = consulta;
		this.medicamentosMinistrados = medicamentosMinistrados;
		this.dataHora = dataHora;
		this.convenio = convenio;
	}
	
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
	
	public void status() {
		System.out.println("Exame: " + this.exame);
		System.out.println("Consulta: " + this.consulta);
		System.out.println("Medicamentos: " + this.medicamentosMinistrados);
		System.out.println("Data/Hora: " + this.dataHora);
		System.out.println("Convenio: "  + this.convenio);
	}
}
