package TrampoDb;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
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
		
		JPanel painel = new JPanel(new BorderLayout());
		JComboBox<String> menu = new JComboBox(opcoes);
		Controlador controlador = new Controlador(menu);
		
		JButton btn = new JButton("Abrir exercício");
		btn.addActionListener(controlador);
		
		painel.setLayout(new GridLayout(2, 1));
		painel.add(menu);
		painel.add(btn);
		
		JFrame janela = new JFrame();
		janela.add(painel);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(300, 150);
		janela.setLocation(600, 100);
		janela.setVisible(true);
	}
}
