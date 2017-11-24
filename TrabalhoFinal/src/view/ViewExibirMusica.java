package view;


	import java.util.ArrayList;

	import javax.swing.JOptionPane;

	import model.Musica;

	public class ViewExibirMusica {

		//Metodo para exibir todos os clientes
		public void exibirMusica(ArrayList<Musica> musicas){
			//Instanciar String para exibicao
			String todasMusicas = "";
			//Percorrer o ArrayList
			for (int i = 0; i < musicas.size(); i++) {
				todasMusicas = todasMusicas + musicas.get(i).toString() + "\n";
			}
			//Exibir todos os clientes
			JOptionPane.showMessageDialog(null, todasMusicas);
		}
	}



