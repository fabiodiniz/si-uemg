import javax.swing.JOptionPane;

/*
	Discente: Fábio Diniz
	Disciplina: Programação I
	Docente: Kamila da Hora
*/

public class ControladorGeral {
	private static Poligono poligono;
	private static NumeroComplexo numeroComplexo;
	private static ControleProdutos controleProdutos;
	private static Salario salario;
	
	public static void main(String[] args){
		final int SAIR = 5;
		int opcao_menu;
		
		do {
			opcao_menu = Integer.parseInt(JOptionPane.showInputDialog(
				"Docente: Kamila da Hora\n" +
				"Discente: Fábio Diniz\n" +
				"------------------------------\n" +
				"Escolha uma opção:\n\t" +
				"1 - Polígono\n\t" +
				"2 - Número complexo\n\t" +
				"3 - Produtos\n\t" +
				"4 - Salário\n\t" +
				SAIR + " - Sair"
			));
			
			switch(opcao_menu){
				case 1:
					poligono = new Poligono(
						Integer.parseInt(JOptionPane.showInputDialog(
							"Digite o número de lados do poligono:"
						))
					);
					poligono.verPoligono();
					break;
				case 2:
					numeroComplexo = new NumeroComplexo();
					float real, imaginario;
					
					real = Float.parseFloat(
						JOptionPane.showInputDialog("Digite o número real:")
					);
					imaginario = Float.parseFloat(
						JOptionPane.showInputDialog("Digite o número imaginario:")
					);
					
					numeroComplexo.inicializaNumero(real, imaginario);
					numeroComplexo.imprimeNumero();
					break;
				case 3:
					controleProdutos = new ControleProdutos();
					break;
				case 4:
					salario = new Salario(
						JOptionPane.showInputDialog("Digite o salário:")
					);
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
