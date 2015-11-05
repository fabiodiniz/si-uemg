/*
	Discente: Fábio Diniz
	Disciplina: Programação I
	Docente: Kamila da Hora
*/

public class Produto {
	private double precoCusto;
	private double precoVenda;

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(String precoCusto) {
		this.precoCusto = Double.parseDouble(precoCusto);
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(String precoVenda) {
		this.precoVenda = Double.parseDouble(precoVenda);
	}
}