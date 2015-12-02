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
public class Ex6 {
	
	public Ex6(JPanel painel, JFrame janela){
		painel.setLayout(new BorderLayout(50, 50));
		painel.setBackground(Color.WHITE);
		painel.removeAll();
		painel.updateUI();
		//janela.setSize(400, 130);
	}
}
