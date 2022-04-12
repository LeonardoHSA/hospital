package br.com.competencia.hospital;

public class Paciente extends Pessoa {
	
	private int idPaciente;
	
	public Paciente(int id, String nome, String rg, String cpf, String endereco, String telefone, int idProntuario) {
		
		this.idPaciente = id;
		this.setNome(nome);
		this.setRg(rg);
		this.setCpf(cpf);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
		
		
	}
	

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	
	public void status() {
		
		System.out.println("ID Paciente: " + this.getIdPaciente());
		System.out.println("Nome: " + this.getNome());
		System.out.println("RG: " + this.getRg());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Endereço: " + this.getEndereco());
		System.out.println("Telefone: " + this.getTelefone());
		
	}
}
