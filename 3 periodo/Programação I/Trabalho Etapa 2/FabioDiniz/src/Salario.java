import javax.swing.JOptionPane;

/*
	Discente: Fábio Diniz
	Disciplina: Programação I
	Docente: Kamila da Hora
*/

public class Salario {
	private double salario = 0;
	
	public Salario(String salario){
		this.salario = Double.parseDouble(salario);
		
		this.salario = this.salario * 1.3;
		JOptionPane.showMessageDialog(null,
			"Salário bruto com reajuste de 30%: R$" + this.salario
		);
		
		this.salario = this.salario * 1.2;
		JOptionPane.showMessageDialog(null,
			"Gratificação de 20% em cima do salário bruto reajustado: R$" + this.salario
		);
		
		this.salario = this.salario * 0.9;
		JOptionPane.showMessageDialog(null,
			"Desconto de 10% sobre o salário total: R$" + this.salario
		);
	}
}
