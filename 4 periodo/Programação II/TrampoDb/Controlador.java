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
	private Ex6 ex6;
	
	public Controlador(JComboBox<String> menu, JPanel painel, JFrame janela){
		this.menu = menu;
		this.painel = painel;
		this.janela = janela;
		
		menu.addActionListener(this);
		
		painel.setLayout(new BorderLayout());
		painel.add(menu, BorderLayout.CENTER);
		painel.setBackground(Color.GREEN);
		
		janela.add(painel);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(500, 500);
		janela.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		exercicio = menu.getSelectedIndex();
		nomeExercicio = menu.getSelectedItem().toString();
		janela.setTitle(nomeExercicio);
		
		switch(exercicio){
			case 1:
				ex1 = new Ex1(painel, janela);
				break;
			case 6:
				ex6 = new Ex6(painel, janela);
				break;
		}
	}
}
