package model;


public class Musica {
	
	private String nome;
	private Artista artista;
	private String album;
	private int anolancamento;
	
	public Musica(String nome, Artista artista, String album, int anolancamento) {
		super();
		this.nome = nome;
		this.artista = artista;
		this.album = album;
		this.anolancamento = anolancamento;
	}
	
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
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", Artista=" + artista + ", Album=" + album + "Ano de Lancamento=" + anolancamento + "]";
		
	}
}
