package view;


	import javax.swing.JOptionPane;

import model.Artista;

	public class ViewCadastrarMusica {
		//Atributos
		private String nome;
		private Artista artista;
		private String album;
		private int anolancamento;
		
		//Metodos get e set
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Artista getArtista() {
			return artista;
		}
		public void setArtista(Artista artista) {
			this.artista = artista;
		}
		public String getAlbum() {
			return album;
		}
		public void setAlbum(String album) {
			this.album = album;
		}
		public int getAnolancamento() {
			return anolancamento;
		}
		public void setAnolancamento(int anolancamento) {
			this.anolancamento = anolancamento;
		}
		
		//Metodo para obter dados do cliente a ser inserido
		public void obterDadosMusica(){
			//Obtendo dados do cliente
			this.setNome(JOptionPane.showInputDialog("Informe o nome do Cliente:"));
		//	this.setArtista(JOptionPane.showInputDialog("Informe o Artista:"));
			this.setAlbum(JOptionPane.showInputDialog("Informe o Album::"));
			this.setAnolancamento(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de lancamento")));
		}

		
		
		
		
		
		
		
	}


