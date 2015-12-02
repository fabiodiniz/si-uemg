package TrampoDb;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author fabiodiniz
 */
public class Main {
	public static void main(String[] args){
		// Opções
		String[] opcoes = new String[]{
			"Selecione o exercício...",
			"Ex. 11.8",
			"Ex. 11.9",
			"Ex. 11.10",
			"Ex. 11.11",
			"Ex. 11.15",
			"Ex. 11.18"
		};
		
		JFrame janela = new JFrame();
		JPanel painel = new JPanel(new BorderLayout());
		JComboBox<String> menu = new JComboBox(opcoes);
		Controlador controlador = new Controlador(menu, painel, janela);
	}
}
