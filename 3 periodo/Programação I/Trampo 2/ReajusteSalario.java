import java.util.Scanner;
public class ReajusteSalario {
	static String nome;
	static double salario;
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o seu nome: ");
		nome = scanner.nextLine();
		System.out.println("Digite o seu salario: ");
		salario = scanner.nextDouble();
		
		scanner.close();

		salario = Alterar_salario(salario);
		Consultar_salario();
	}
	
	public static void Consultar_salario(){
		System.out.printf("O salário reajustado de %s é: %2f\n", nome, salario);
	}
	
	public static double Alterar_salario(double salario){
		return salario * 1.1;
	}
}