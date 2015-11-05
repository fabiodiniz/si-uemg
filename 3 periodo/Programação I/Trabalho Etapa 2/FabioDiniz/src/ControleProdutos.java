import javax.swing.JOptionPane;

/*
	Discente: Fábio Diniz
	Disciplina: Programação I
	Docente: Kamila da Hora
*/

public class ControleProdutos {
	private Produto[] produtos = new Produto[10];
	private int contadorProdutos = 0;
	private double caixa = 0;
	
	public ControleProdutos(){
		final int SAIR = 5;
		int opcao_menu;
		
		do {
			opcao_menu = Integer.parseInt(JOptionPane.showInputDialog(
				"Produtos\n" +
				"------------------------------\n" +
				"Escolha uma opção:\n\t" +
				"1 - Inserir produto\n\t" +
				"2 - Ver produtos cadastrados\n\t" +
				"3 - Realizar venda\n\t" +
				"4 - Caixa\n\t" +
				SAIR + " - Sair"
			));
			
			switch(opcao_menu){
				case 1:
					inserirProdutos();
					break;
				case 2:
					verProdutos();
					break;
				case 3:
					realizarVenda(Integer.parseInt(JOptionPane.showInputDialog(
						"Digite o código do produto: \n" +
						"Produtos cadastrados até o código " + contadorProdutos
					)));
					break;
				case 4:
					verCaixa();
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
	
	private void inserirProdutos(){
		if(contadorProdutos < produtos.length){
			produtos[contadorProdutos] = new Produto();
			produtos[contadorProdutos].setPrecoCusto(
				JOptionPane.showInputDialog("Digite o preço de custo do produto " + (contadorProdutos + 1) + ":")
			);
			produtos[contadorProdutos].setPrecoVenda(
				JOptionPane.showInputDialog("Digite o preço de venda do produto " + (contadorProdutos + 1) + ":")
			);
			contadorProdutos++;
		} else {
			JOptionPane.showMessageDialog(null, "Você pode cadastrar apenas 10 produtos");
		}
	}
	
	private void verProdutos(){
		if(contadorProdutos > 0){
			int contador = 0;
			Object detalhesProdutos = "";
			do {
				detalhesProdutos += "Cód. Produto: " + (contador + 1) +
									"\n\t\tPreço de custo: R$" + produtos[contador].getPrecoCusto() +
									"\n\t\tPreço de venda: R$" + produtos[contador].getPrecoVenda() +
									"\n\n";
				contador++;
			} while(contador < contadorProdutos);
			JOptionPane.showMessageDialog(null, detalhesProdutos.toString());
		} else {
			JOptionPane.showMessageDialog(null, "Não há produtos cadastrados");
		}
	}
	
	private void realizarVenda(int codProduto){
		caixa += produtos[codProduto - 1].getPrecoVenda() - produtos[codProduto - 1].getPrecoCusto();
	}
	
	private void verCaixa(){
		JOptionPane.showMessageDialog(null, "Caixa total: R$" + caixa);
	}
}
