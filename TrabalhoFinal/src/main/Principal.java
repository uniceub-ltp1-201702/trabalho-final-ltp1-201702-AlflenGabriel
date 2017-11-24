package main;

import java.util.ArrayList;

import controler.ControleCadastrarMusica;
import controler.ControleExibirMusica;
import model.BD;

public class Principal {

	public static void main(String[] args) {
		//Instanciar o BD
		BD bd = new BD();
		//Instanciar ControleExibirClientes
		ControleExibirMusica cem = new ControleExibirMusica(bd);
		//Instanciar ControleCadastrarCliente
		ControleCadastrarMusica ccm = new ControleCadastrarMusica(bd);
		
		//Exibir todos os clientes
	//	cem.exibirMusica();
		
		//Inserir um novo cliente
		ccm.cadastrarMusica();

		//Exibir todos os clientes novamente
		cem.exibirMusica();
	}

}
