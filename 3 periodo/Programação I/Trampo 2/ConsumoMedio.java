import java.util.Scanner;
public class ConsumoMedio {
	public static void main(String[] args){
		int total_combustivel, distancia_percorrida;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira o total de combustível gasto (litros): ");
		total_combustivel = scanner.nextInt();
		System.out.println("Insira a distancia percorrida (km): ");
		distancia_percorrida = scanner.nextInt();
		
		scanner.close();
		
		System.out.printf("A média de consumo é: %fkm/l", (float) distancia_percorrida / total_combustivel);
	}
}