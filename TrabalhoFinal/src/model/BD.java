package model;

import java.util.ArrayList;

import util.DocumentReader;
import util.DocumentWriter;

public class BD {

	private ArrayList<Musica> musicas;
	private String fileName = "musica.txt";
	
	
	public BD(){
	
		this.musicas = new ArrayList<Musica>();
	
		DocumentReader dr = new DocumentReader();
	
		ArrayList<String> linhas = dr.read(fileName);
	
		for (int i = 0; i < linhas.size(); i++) {
		
			String[] linhaCliente = linhas.get(i).split(";");
	
			Musica m = new Musica(linhaCliente[0], null, linhaCliente[2], Integer.parseInt(linhaCliente[3]));
		
			this.musicas.add(m);
		}
	}
	
	//Metodo que grava Cliente
	public void gravarMusica(Musica m){
	
		this.musicas.add(m);
	
		String musica = m.getNome() + ";" + m.getArtista() + ";" + m.getAlbum() +  ";" + m.getAnolancamento();
	
		DocumentWriter dw = new DocumentWriter();
	
		dw.write(this.fileName, musica);
	}

	public ArrayList<Musica> getMusicas() {
		return musicas;
	}
	
}
