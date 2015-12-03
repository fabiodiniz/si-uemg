package TrampoDb;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author fabiodiniz
 */
public class Ex5 {
	private JLabel label;
	private JLabel feedback;
	private JTextField input;
	private JButton botao;
	
	public Ex5(JPanel painel, JFrame janela){
		label = new JLabel("Estou imaginando um número de 1 à 1000. Tente advinnhá-lo:");
		feedback = new JLabel();
		input = new JTextField();
		
		botao = new JButton("Verificar");
		botao.addActionListener(new Listener(input, feedback, botao, painel));
		
		painel.setLayout(new GridLayout(4, 1));
		painel.removeAll();
		painel.add(label);
		painel.add(input);
		painel.add(feedback);
		painel.add(botao);
		painel.setBackground(Color.WHITE);
		painel.updateUI();

		janela.setTitle("Advinhe o número");
		janela.setSize(450, 150);
	}
}

class Listener implements ActionListener {
	private JTextField input;
	private JLabel feedback;
	private JPanel painel;
	private JButton botao;
	private int numero;
	private int tentativa;
	private boolean concluido;
	
	public Listener(JTextField input, JLabel feedback, JButton botao, JPanel painel){
		this.input = input;
		this.feedback = feedback;
		this.botao = botao;
		this.painel = painel;
		this.concluido = false;
		
		randomNumber();
	}
	
	private void randomNumber(){
		numero = 1 + (int) (Math.random() * 1000);
		System.out.println(numero);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		tentativa = Integer.parseInt(input.getText());
		if(concluido){
			randomNumber();
			input.setEnabled(true);
			input.setText("");
			botao.setText("Verificar");
			feedback.setText("");
			painel.setBackground(Color.WHITE);
			concluido = false;
		} else if(tentativa == numero){
			feedback.setText("Correct!");
			painel.setBackground(Color.GREEN);
			input.setEnabled(false);
			botao.setText("Tentar novamente");
			concluido = true;
		} else if(tentativa > numero){
			feedback.setText("Muito alto!");
			painel.setBackground(Color.RED);
		} else {
			feedback.setText("Muito baixo!");
			painel.setBackground(Color.CYAN);
		}
	}
}