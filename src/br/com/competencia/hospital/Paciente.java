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
		
		Prontuario pron = new Prontuario(idProntuario);
	}
	

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
}
