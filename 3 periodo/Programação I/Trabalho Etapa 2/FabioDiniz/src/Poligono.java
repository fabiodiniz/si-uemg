import javax.swing.JOptionPane;

/*
	Discente: Fábio Diniz
	Disciplina: Programação I
	Docente: Kamila da Hora
*/

public class Poligono {
	private int lados;
	
	public Poligono(int l){
		this.lados = l;
	}
	
	public void verPoligono(){
		switch(lados){
			case 1:
				JOptionPane.showMessageDialog(null, "Não existe polígono de 1 lado.");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Não existe polígonos de 2 lados.");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "O polígono é um triângulo.");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "O polígono é um quadrado.");
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "O polígono é um pentágono.");
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "O polígono é um hexágono.");
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "O polígono é heptágono.");
				break;
			case 8:
				JOptionPane.showMessageDialog(null, "O polígono é um octágono.");
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "O polígono é um enágono.");
				break;
			case 10:
				JOptionPane.showMessageDialog(null, "O polígono é um decágono.");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Digite um valor de 1 a 10.");
		}
	}
}