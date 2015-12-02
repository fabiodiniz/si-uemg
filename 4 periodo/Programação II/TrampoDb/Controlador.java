package TrampoDb;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author fabiodiniz
 */
public class Controlador implements ActionListener {
	private JComboBox<String> menu;
	private JPanel painel;
	private JFrame janela;
	private int exercicio;
	private String nomeExercicio;
	
	// Exercícios
	private Ex1 ex1;
	private Ex2 ex2;
	private Ex6 ex6;
	
	public Controlador(JComboBox<String> menu){
		this.menu = menu;
		
		painel = new JPanel(new BorderLayout());
		painel.setBackground(Color.WHITE);
		
		janela = new JFrame();
		janela.add(painel);
		janela.setSize(500, 500);
		janela.setLocation(100, 200);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		exercicio = menu.getSelectedIndex();
		nomeExercicio = menu.getSelectedItem().toString();
		
		janela.setVisible(true);
		janela.setAlwaysOnTop(true);
		
		switch(exercicio){
			case 1:
				ex1 = new Ex1(painel, janela);
				break;
			case 2:
				ex2 = new Ex2(painel, janela);
				break;
			case 6:
				ex6 = new Ex6(painel, janela);
				break;
		}
	}
}
