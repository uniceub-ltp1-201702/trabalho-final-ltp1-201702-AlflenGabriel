package controler;

	import java.util.ArrayList;

	import model.BD;
	import model.Musica;
	import view.ViewExibirMusica;

	public class ControleExibirMusica {
		//Atributos
		private BD bd;
		private ViewExibirMusica vem;

		//Metodo construtor
		public ControleExibirMusica(BD bd) {
			this.bd = bd;
			//Instanciar a view
			this.vem = new ViewExibirMusica();
		}
		
		//Metodo que recupera os clientes e exibe
		public void exibirMusica(){
			//Retornar o ArrayList de Clientes
			ArrayList<Musica> musicas = this.bd.getMusicas();
			//Executar o metodo para exibir todos os clientes
			this.vem.exibirMusica(musicas);
		}
		

	}



