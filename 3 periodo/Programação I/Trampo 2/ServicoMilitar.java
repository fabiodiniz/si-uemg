import java.util.Scanner;
public class ServicoMilitar {
	public static void main(String[] args){
		int opcao, idade;
		int contador = 0;
		String nome;
		char sexo;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Digite 1 para adicionar ou 2 para interromper: ");
			opcao = scanner.nextInt();
			
			if(opcao == 1){
				System.out.println("---------------------");
				System.out.println("Escreva a idade:");
				idade = scanner.nextInt();
				System.out.println("Escreva o sexo (M ou F):");
				sexo = scanner.next().charAt(0);
				System.out.println("Escreva o nome:");scanner.nextLine();
				nome = scanner.nextLine();
				System.out.println("---------------------");
				if(sexo == 'M' && idade >= 18){
					contador++;
				}
			}
		} while(opcao != 2);
		
		scanner.close();
		System.out.printf("O total de pessoas aptas é %d", contador);
	}
}