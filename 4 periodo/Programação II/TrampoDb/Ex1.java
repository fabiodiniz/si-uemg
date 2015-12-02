package TrampoDb;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author fabiodiniz
 */
public class Ex1 {
	private JPanel esquerda;
	private JPanel centro;
	private JPanel direita;
	private JFrame janela;
	private JCheckBox checkbox1;
	private JCheckBox checkbox2;
	private JTextField textfield1;
	private JTextField textfield2;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JLabel label1;
	private JLabel label2;
	
	public Ex1(JPanel painel, JFrame janela){
		checkbox1 = new JCheckBox("Snap to Grid");
		checkbox2 = new JCheckBox("Show Grid");
		
		esquerda = new JPanel(new GridLayout(2, 1));
		esquerda.setBackground(Color.WHITE);
		esquerda.add(checkbox1);
		esquerda.add(checkbox2);
		
		textfield1 = new JTextField("0");
		textfield2 = new JTextField("0");
		label1 = new JLabel("X:");
		label2 = new JLabel("Y:");
		
		centro = new JPanel(new GridLayout(2, 2));
		centro.setBackground(Color.WHITE);
		centro.add(label1);
		centro.add(textfield1);
		centro.add(label2);
		centro.add(textfield2);
		
		btn1 = new JButton("Ok");
		btn2 = new JButton("Cancel");
		btn3 = new JButton("Help");
		
		direita = new JPanel(new GridLayout(3, 1));
		direita.setBackground(Color.WHITE);
		direita.add(btn1);
		direita.add(btn2);
		direita.add(btn3);
		
		painel.setLayout(new BorderLayout(50, 50));
		painel.setBackground(Color.WHITE);
		painel.removeAll();
		painel.add(esquerda, BorderLayout.WEST);
		painel.add(centro, BorderLayout.CENTER);
		painel.add(direita, BorderLayout.EAST);
		painel.updateUI();
		
		janela.setTitle("Align");
		janela.setSize(400, 130);
	}
}
