package br.com.competencia.hospital;

import java.util.ArrayList;

public class Medico extends Pessoa {
	
	
	private String especialidade;
	private String crm;
	private int idMedico;
	
	ArrayList<Medico> listaMedicos = new ArrayList<Medico>();
	
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
	
public void status() {
		
		System.out.println("ID Paciente: " + this.getIdMedico());
		System.out.println("Nome: " + this.getNome());
		System.out.println("RG: " + this.getRg());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Endereço: " + this.getEndereco());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("Especialidade: " + this.getEspecialidade());
		System.out.println("CRM: " + this.getCrm());
		
	}
	
}
