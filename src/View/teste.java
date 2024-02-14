package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Pessoa;
import Model.Servico;
import Model.Usuario;

public class teste {

	public static void main(String[] args) {
		Servico servico = new Servico(1, "barba", 30);
		
		Cliente cliente = new Cliente (1, "tiago");
		System.out.println(cliente.getNome());
		System.out.println();
		
		Usuario usuario = new Usuario (1,"barbeiro", "senha");
		System.out.println(usuario.getNome());
		
		Agendamento agendamento =  new Agendamento (1, cliente, servico,30,"18/12/2024 09:15");
		System.out.println(agendamento.getCliente().getNome()	);
	}

}
