package parquimetro;
import javax.swing.JOptionPane;

/*
 * Disciplina: Programação I
 * Docente: Kamila da Hora
 * Discentes: Fábio Diniz, Rodrigo Bertucci, Jonathas Correa, Wanner Menezes e Ramon Sposito
 */

public class ControladorParquimetro {
	public static void main(String[] args) {
		// Opções do menu
		final int RECEBER_DINHEIRO = 1;
		final int BOTAO_AZUL = 2;
		final int BOTAO_VERDE = 3;
		final int TOTAL_PARQUIMETRO = 4;
		final int SAIR = 5;

		Parquimetro parquimetro = new Parquimetro();
		int opcao_menu;
		
		do {
			parquimetro.setDisplay();
			opcao_menu = Integer.parseInt(JOptionPane.showInputDialog(
				"Parquímetro\n" +
				"------------------------------\n" +
				"O valor do parquímetro é R$0,50 a cada 15 minutos.\n" +
				"Você pode ficar até duas horas.\n" +
				"------------------------------\n" +
				parquimetro.display +
				"------------------------------\n" +
				"Escolha uma opção:\n\t" +
				"1 - Adicionar dinheiro\n\t" +
				"2 - Botão azul (adicionar 15 minutos)\n\t" +
				"3 - Botão verde (pegar ticket e o troco)\n\t" +
				"4 - Total parquímetro\n\t" +
				"5 - Sair"
			));
			
			switch(opcao_menu){
				case RECEBER_DINHEIRO:
					parquimetro.receberDinheiro();
					break;
				case BOTAO_AZUL:
					parquimetro.botaoAzul();
					break;
				case BOTAO_VERDE:
					parquimetro.botaoVerde();
					break;
				case TOTAL_PARQUIMETRO:
					JOptionPane.showMessageDialog(null, "Total parquímetro: R$" + parquimetro.totalParquimetro());
					break;
				case SAIR:
					JOptionPane.showMessageDialog(null, "Então flwwwww!");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida.");
					break;
			}
		} while(opcao_menu != SAIR);
	}	
}
