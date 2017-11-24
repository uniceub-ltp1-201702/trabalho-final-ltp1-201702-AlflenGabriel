package model;


public class Artista {
	
	private String nome;
	private String genero;
	private String pais;
	

	
	public Artista(String nome, String genero, String pais) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.pais = pais;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", Genero=" + genero + ", Pais=" + pais + "]";
	}

}
