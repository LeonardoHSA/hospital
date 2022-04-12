package br.com.competencia.hospital;

import java.util.*;

public class TesteHospital {

	

	

	public static void main(String[] args) {
		
		Paciente p;
		ArrayList<Paciente> listaPacientes = new ArrayList<Paciente>();
		Medico m;
		ArrayList<Medico> listaMedicos = new ArrayList<Medico>();
		Prontuario pro;
		ArrayList<Prontuario> listaProntuarios = new ArrayList<Prontuario>();
		Ocorrencia o;
		ArrayList<Ocorrencia> listaOcorrencias = new ArrayList<Ocorrencia>();
		
		
		listaPacientes.add(p = new Paciente(1, "Leonardo", "63.897.226-8", "452.897.159-78", 
		"Rua Sem nome, 303", "(11) 94578-1245", 1 ));
		
		listaMedicos.add(m = new Medico("Vitória", "41.698.520-8", "478.528.698.-89", 
		"Rua Tanto faz, 524", "(11) 98746-8941", "Ortopedista", "10235478-8/BR", 1));
		
		listaOcorrencias.add(o = new Ocorrencia("Exame de loucura", "Foi tensa", "Muito tarja preta por favor", "Dias de loucura e psicopatia", "SUS"));
		
		listaProntuarios.add(pro = new Prontuario(1, listaMedicos.get(0), listaPacientes.get(0), listaOcorrencias.get(0)));
		
		Iterator<Paciente> itp = listaPacientes.iterator();
        while(itp.hasNext()){
            p = itp.next();
            p.status();
            System.out.println("===========================");
        }
        
        Iterator<Medico> itm = listaMedicos.iterator();
        while(itm.hasNext()){
            m = itm.next();
            m.status();
            System.out.println("===========================");
        }
        
        Iterator<Prontuario> itpro = listaProntuarios.iterator();
        while(itpro.hasNext()){
            pro = itpro.next();
            pro.status();
        }
        Iterator<Ocorrencia> ito = listaOcorrencias.iterator();
        while(ito.hasNext()){
            o = ito.next();
            o.status();
            System.out.println("===========================");
        }
        
	}

}
