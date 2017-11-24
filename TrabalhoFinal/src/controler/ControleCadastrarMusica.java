package controler;

	import model.BD;
	import model.Musica;
	import view.ViewCadastrarMusica;

	public class ControleCadastrarMusica {
		//Atributo
		private BD bd;

		//Metodo construtor
		public ControleCadastrarMusica(BD bd) {
			this.bd = bd;
		}
		
		//Metodo para obter dados do cliente e grava no BD
		public void cadastrarMusica(){
			//Instanciar a view
			ViewCadastrarMusica vcm = new ViewCadastrarMusica();
			//Chamar metodo para obter os dados
			vcm.obterDadosMusica();
			//Instanciar um objeto da classe Cliente com os dados digitados
			Musica m = new Musica(vcm.getNome(), null, vcm.getAlbum(), Integer.parseInt(null, vcm.getAnolancamento()));
			//Guardar cliente no BD
			this.bd.gravarMusica(m);
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
