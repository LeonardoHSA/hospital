package br.com.competencia.hospital;

import java.util.ArrayList;

public class TesteHospital {

	public static void main(String[] args) {
		
		
		ArrayList<Paciente> listaPacientes = new ArrayList<Paciente>();
		ArrayList<Medico> listaMedicos = new ArrayList<Medico>();
		
		listaPacientes.add(new Paciente(1, "Leonardo", "63.897.226-8", "452.897.159-78", "Rua Sem nome, 303", "(11) 94578-1245", 1 ));
		
		listaMedicos.add(new Medico("Vitória", "41.698.520-8", "478.528.698.-89", "Rua Tanto faz, 524", "(11) 98746-8941", "Ortopedista", "10235478-8/BR", 1));
		
		
	
		
		
		
	}

}
