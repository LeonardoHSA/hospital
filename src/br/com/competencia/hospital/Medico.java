package br.com.competencia.hospital;

public class Medico extends Pessoa {
	
	
	private String especialidade;
	private String crm;
	private int idMedico;
	
	public Medico (String nome, String rg, String cpf, String endereco, String telefone, String especialidade, String crm, int idMedico) {
		
		this.setNome(nome);
		this.setRg(rg);
		this.setCpf(cpf);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
		this.especialidade = especialidade;
		this.crm = crm;
		this.idMedico = idMedico;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public int getIdMedico() {
		return idMedico;
	}
	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}
	
}
