package parquimetro;
import javax.swing.JOptionPane;

/*
 * Disciplina: Programação I
 * Docente: Kamila da Hora
 * Discentes: Fábio Diniz, Rodrigo Bertucci, Jonathas Correa, Wanner Menezes e Ramon Sposito
 */

public class Parquimetro {
	private final int MAIS_TEMPO = 15; // em minutos
	private final int TEMPO_MAXIMO = 120;
	private final double PRECO_POR_TEMPO = 0.5;
	private int caixa = 0;
	private double dinheiro_inserido = 0;
	private double ticket_total = 0;
	private int ticket_tempo = 0;
	private double troco = 0;
	public String display = "";
	
	public void receberDinheiro(){
		dinheiro_inserido = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor:"));
	}
	
	public void botaoAzul(){
		if(ticket_tempo < TEMPO_MAXIMO && ticket_total + PRECO_POR_TEMPO <= dinheiro_inserido){
			ticket_tempo += MAIS_TEMPO;
			ticket_total += PRECO_POR_TEMPO;
			JOptionPane.showMessageDialog(null,
				"Tempo total: " + Integer.toString(ticket_tempo) + " minutos" +
				"\nPreço do ticket: R$" + Double.toString(ticket_total)
			);
		} else {
			JOptionPane.showMessageDialog(null, "Você não possui saldo para adicionar mais tempo ou já colocou duas horas.");
		}
	}
	
	public void botaoVerde(){
		if(ticket_total > 0 && ticket_tempo > 0){
			troco = dinheiro_inserido - ticket_total;
			JOptionPane.showMessageDialog(null, 
				"Seu troco é: R$" + Double.toString(troco) +
				"\nTempo total: " + Integer.toString(ticket_tempo) + " minutos"
			);
			caixa += ticket_total;
			ticket_total = 0;
			ticket_tempo = 0;
			dinheiro_inserido = 0;
		} else {
			JOptionPane.showMessageDialog(null, "Insira dinheiro e adicione tempo com o botão azul.");
		}
	}
	
	public String dinheiroInserido(){
		return Double.toString(dinheiro_inserido);
	}
	
	public String totalParquimetro(){
		return Double.toString(caixa);
	}
	
	public void setDisplay(){
		display = 
			"Dinheiro inserido: R$" + dinheiroInserido() + "\n" +
			"Tempo total: " + Integer.toString(ticket_tempo) + " minutos\n" +
			"Preço do ticket: R$" + Double.toString(ticket_total) + "\n";
	}
}
