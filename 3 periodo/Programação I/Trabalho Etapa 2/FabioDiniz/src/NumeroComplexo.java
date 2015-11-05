import javax.swing.JOptionPane;

/*
	Discente: Fábio Diniz
	Disciplina: Programação I
	Docente: Kamila da Hora
*/

public class NumeroComplexo {
	private float parte_real;
	private float parte_imaginaria;
	
	public void inicializaNumero(float real, float imaginario){
		this.parte_real = real;
		this.parte_imaginaria = imaginario;
	}
	
	public void imprimeNumero(){
		JOptionPane.showMessageDialog(null, "a + bi = "
			+ parte_real
			+ " + "
			+ parte_imaginaria
			+ "i"
		);
	}
}