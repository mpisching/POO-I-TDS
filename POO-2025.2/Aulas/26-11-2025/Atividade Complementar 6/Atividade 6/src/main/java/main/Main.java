package main;

import agendamento.EPrioridade;
import consultas.Consulta;
import consultas.HistoricoMedicacao;
import consultas.Medicamento;
import consultas.RegistroConsulta;
import exceptions.MedicamentoIndicadoException;
import informacoes.pessoais.Cidade;
import pessoas.Medico;
import pessoas.Paciente;


public class Main{
	
    public static void main( String[] args ){
    	
    	// DECLARAÇÃO DAS INFOS PESSOAIS
    	Cidade cidade1 = new Cidade("Florianópolis", "SC");
    	Cidade cidade2 = new Cidade("Biguaçu", "SC");
    	// DECLARAÇÃO DOS PACIENTES
    	Paciente paciente1 = new Paciente("Gabriel", "123456789-00", "(48)91234-5678", "Rua Vila Nova", cidade1);
        Paciente paciente2 = new Paciente("Clara", "000000111-22", "(48)11111-1111", "Rua Cruz e Souza", cidade2);
    	// DECLARAÇÃO DOS MÉDICOS
    	Medico medico1 = new Medico("Dráuzio Varella", "987654321-00", "Clínico Geral", "000000-00");
        
    	// GERAÇÃO DAS CONSULTAS
        Consulta consulta1 = new Consulta("10/10/2025", "16:00", medico1, paciente1, EPrioridade.BAIXA, "Consulta bem-sucedida, paciente recebeu atestado e a receita completa");
        Consulta consulta2 = new Consulta("12/10/2025", "20:00", medico1, paciente2, EPrioridade.MÉDIA, "Paciente foi enviado com um medicamento temporário, irá retornar para mais exames");
        
        // GERAÇÃO DOS REGISTROS
//        RegistroConsulta registro1 = new RegistroConsulta("Consulta bem-sucedida, paciente recebeu atestado e a receita completa" ,consulta1);
//        RegistroConsulta registro2 = new RegistroConsulta("Paciente foi enviado com um medicamento temporário, irá retornar para mais exames", consulta2);
        
        // GERAÇÃO DOS MEDICAMENTOS
        Medicamento medicamento1 = new Medicamento("Advil", "Guanabara");
        Medicamento medicamento2 = new Medicamento("Prednisona", "Itajubira");
        Medicamento medicamento3 = new Medicamento("Seki", "Cuiabá");
        
        // ADIÇÃO DOS MEDICAMENTOS EM CADA REGISTRO
        try {
			consulta1.getRegistroConsulta().adicionarMedicamento("Medicamento para dor de cabeça", medicamento1);
		} catch (MedicamentoIndicadoException e) {
			System.out.println("Medicamento não existente/Descrição não inserida");
		}
        
        try {
            consulta2.getRegistroConsulta().adicionarMedicamento("Medicamento para tosse", medicamento2);
		} catch (MedicamentoIndicadoException e) {
			System.out.println("Medicamento não existente/Descrição não inserida");
		}
        
        try {
            consulta2.getRegistroConsulta().adicionarMedicamento("Xarope para tosse", medicamento3);
		} catch (MedicamentoIndicadoException e) {
			System.out.println("Medicamento não existente/Descrição não inserida");
		}
        // TÉRMINO DA ADIÇÃO DOS MEDICAMENTOS
        
        //APLICAÇÃO DOS REGISTROS ÀS CONSULTAS
//        consulta1.setRegistroConsulta(registro1);
//        consulta2.setRegistroConsulta(registro2);
        
        // AGENDAMENTO DAS CONSULTAS AOS MÉDICOS
        medico1.agendarConsulta(consulta1);
        medico1.agendarConsulta(consulta2);
        
        // AGENDAMENTO DAS CONSULTAS AO PACIENTES
        paciente1.agendarConsulta(consulta1);
        paciente2.agendarConsulta(consulta2);
        
        
        // CONFERÊNCIAS ATRAVÉS DO PRINT
        System.out.println("---------------CONFERÊNCIA DE PACIENTES------------");
        paciente1.exibirInformacoes();
        System.out.println("--------------------------------");
        paciente2.exibirInformacoes();
        System.out.println("----------FIM DA CONFERÊNCIA DE PACIENTES----------");
        System.out.println("--------------CONFERÊNCIA DE MÉDICOS---------------");
        medico1.exibirInformacoes();
        System.out.println("---------FIM DA CONFERÊNCIA DE MÉDICOS-------------");
        System.out.println("-------CONFERÊNCIA DE CONSULTAS POR MÉDICO---------");
        verificarConsultasDoMedico(medico1);
        System.out.println("---------FIM DA CONFERÊNCIA DE CONSULTAS-----------");
        System.out.println("------CONFERÊNCIA DE HISTÓRICO DOS PACIENTES-------");
        verificarHistoricoDoPaciente(paciente1);
        verificarHistoricoDoPaciente(paciente2);
        System.out.println("----------------FIM DAS CONFERÊNCIAS---------------");
        
    }
    
    // FORA DA MAIN
    
    // FUNÇÃO PARA VERIFICAR HISTÓRICO DE CONSULTAS DO MÉDICO
    public static void verificarConsultasDoMedico(Medico medico) {
    	for (Consulta consulta : medico.getConsultas()) {
    		System.out.println("---------DETALHES DA CONSULTA:"+medico.getNome()+"---------");
    		System.out.println("Paciente atendido____________________: "+consulta.getPaciente().getNome());
        	System.out.println("Dia da consulta______________________: "+consulta.getData());
        	System.out.println("Hora da consulta_____________________: "+consulta.getHorario());
        	System.out.println("Prioridade da consulta_______________: "+consulta.getPrioridade());
        	System.out.println("Quantidade de medicamentos prescritos: "+consulta.getRegistroConsulta().getListaMedicamentos().size());
        	System.out.println("Medicamentos prescritos: ");
        	for (HistoricoMedicacao medicamentos : consulta.getRegistroConsulta().getListaMedicamentos()) {
        		if(consulta.getRegistroConsulta().getListaMedicamentos().isEmpty()) {
        			System.out.println("Nenhum medicamento foi prescrito a esse paciente");
        		}
        		else {
        			System.out.println("- Nome:"+medicamentos.getMedicamento().getNome()+" | Fabricante: "+medicamentos.getMedicamento().getFabricante());
        		}
        	}
    	}
    }
    
    // FUNÇÃO PARA VERIFICAR O HISTÓRICO DO PACIENTE (MÉDICOS COM QUE SE CONSULTOU E MEDICAMENTOS QUE FORAM RECEITADOS)
    public static void verificarHistoricoDoPaciente(Paciente paciente) {
    	System.out.println("----------DETALHES DO PACIENTE:"+paciente.getNome()+"---------");
    	paciente.exibirInformacoes();
    	System.out.println("Médicos com quem se consultou: ");
    	for(Consulta consulta : paciente.getConsultas()) {
    		if(paciente.getConsultas().isEmpty()) {
    			System.out.println("O paciente não se consultou com nenhum médico!!");
    			break;
    		}
    		else {
    			System.out.println("- "+consulta.getMedico().getNome());
    		}
    	}
    	System.out.println("Medicamentos receitados para o paciente: ");
    	for(Consulta consulta : paciente.getConsultas()) {
    		if(paciente.getConsultas().isEmpty()) {
    			System.out.println("Nenhum medicamento foi receitado ao paciente!");
    		}
    		else {
    			for (HistoricoMedicacao medicamento : consulta.getRegistroConsulta().getListaMedicamentos()) {
    				System.out.println("- "+medicamento.getMedicamento().getNome());
    			}
    		}
    	}
    }
    
    
    
//    public static void verificarHistorico(HistoricoMedicacao historico) {
//    	System.out.println("Histórico de Medicações do Paciente: "+historico.getRegistroConsulta().getConsulta().getPaciente().getNome());
//    	for (Medicamento medicamento : historico.getRegistroConsulta().getMedicamentos()) {
//    		System.out.println("Medicamento: "+medicamento.getNome()+" | Fabricante: "+medicamento.getFabricante());
//    	}
//    }
}
