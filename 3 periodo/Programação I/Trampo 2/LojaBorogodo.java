import java.util.Scanner;
public class LojaBorogodo {
	public static void main(String[] args){
		float valor_compra;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor da compra: ");
		valor_compra = scanner.nextInt();
		
		scanner.close();
		
		System.out.printf("Dividio em 6 prestações, o valor será: R$%f", (float) valor_compra / 6);
	}
}
