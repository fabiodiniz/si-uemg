package TrampoDb;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author fabiodiniz
 */
public class Ex2 {
	private JPanel botoes;
	private JPanel painel;
	private JFrame janela;
	private JTextField textfield;
	private JButton[] arrayBotoes = new JButton[16];
	
	public Ex2(JPanel painel, JFrame janela){
		textfield = new JTextField();
		
		arrayBotoes[0] = new JButton("7");
		arrayBotoes[1] = new JButton("8");
		arrayBotoes[2] = new JButton("9");
		arrayBotoes[3] = new JButton("/");
		arrayBotoes[4] = new JButton("6");
		arrayBotoes[5] = new JButton("5");
		arrayBotoes[6] = new JButton("4");
		arrayBotoes[7] = new JButton("*");
		arrayBotoes[8] = new JButton("3");
		arrayBotoes[9] = new JButton("2");
		arrayBotoes[10] = new JButton("1");
		arrayBotoes[11] = new JButton("-");
		arrayBotoes[12] = new JButton("0");
		arrayBotoes[13] = new JButton(".");
		arrayBotoes[14] = new JButton(",");
		arrayBotoes[15] = new JButton("=");
		
		botoes = new JPanel(new GridLayout(4, 4));		
		for(int i = 0; i < 16; i++){
			botoes.add(arrayBotoes[i]);
		}
		
		painel.setLayout(new GridLayout(2, 1));
		painel.removeAll();
		painel.add(textfield);
		painel.add(botoes);
		painel.updateUI();
		
		janela.setTitle("Calculator");
		janela.setSize(300, 350);
	}
}
