package TrampoDb;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JComboBox;

/**
 *
 * @author fabiodiniz
 */
public class Ex3 {
	private JComboBox<String> combobox;
	private String[] opcoes;
	private JPanel painelCheckboxes;
	private JPanel painelBtns;
	private JCheckBox checkbox1;
	private JCheckBox checkbox2;
	private JButton btn1;
	private JButton btn2;
	
	public Ex3(JPanel painel, JFrame janela){
		opcoes = new String[]{
			"RED",
			"GREEN",
			"YELLOW"
		};
		combobox = new JComboBox(opcoes);
		
		checkbox1 = new JCheckBox("Background");
		checkbox2 = new JCheckBox("Foreground");
		painelCheckboxes = new JPanel(new FlowLayout());
		painelCheckboxes.add(checkbox1);
		painelCheckboxes.add(checkbox2);
		
		btn1 = new JButton("Ok");
		btn2 = new JButton("Cancel");
		painelBtns = new JPanel(new FlowLayout());
		painelBtns.add(btn1);
		painelBtns.add(btn2);		
		
		painel.setLayout(new GridLayout(3, 1));
		painel.removeAll();
		painel.add(combobox);
		painel.add(painelCheckboxes);
		painel.add(painelBtns);
		painel.updateUI();
		
		janela.setTitle("Color Select");
		janela.setSize(400, 130);
	}
}
