import java.util.Scanner;
public class ConversorTemperatura {
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int celsius;
		float fahrenheit;
		
		System.out.println("Insira a temperatura em celsius: ");
		celsius = scanner.nextInt();
		
		fahrenheit = ((9 * celsius) + 160) / 5;
		
		System.out.printf("A temperatura em Fahrenheit: %f", fahrenheit);
		
		scanner.close();
	}
}