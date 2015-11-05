#include <iostream>
#include <math.h>

using namespace std;

int fatorial(int numero){
	int aux;
	aux = numero;
	while(numero > 1){
		aux = aux * (numero-1);
		numero--;
	}

	return aux;
}

int main(){
	int opcao, n, k;

	cout << "\n---------------------------------------\n";
	cout << "Análise Combinatória\n";
	cout << "Discente: Fábio Diniz\n";
	cout << "Disciplina: Probabilidade e Estatística\n";
	cout << "Docente: Josney Freitas";
	cout << "\n---------------------------------------\n";

	cout << "\nDigite o número de elementos do espaço amostral: ";
	cin >> n;
	cout << "Digite o número de elementos selecionados para o evento: ";
	cin >> k;

	do {

		cout << "\n1 - Permutação";
		cout << "\n2 - Arranjo";
		cout << "\n3 - Combinação";
		cout << "\n4 - Permutação com reposição";
		cout << "\n5 - Arranjo com reposição";
		cout << "\n6 - Combinação com reposição";
		cout << "\n7 - Sair";
		cout << "\nEscolha a opção: ";
		cin >> opcao;
		cout << "\n---------------------------------------\n";

		switch(opcao){
			case 1:
				cout << "Permutação: " << fatorial(n);
				break;
			case 2:
				cout << "Arranjo: " << fatorial(n) / fatorial(n - k);
				break;
			case 3:
				cout << "Combinação: " << fatorial(n) / (fatorial(k) * fatorial(n - k));
				break;
			case 4:
				cout << "Permutação com reposição: " << pow(n, n);
				break;
			case 5:
				cout << "Arranjo com reposição: " << pow(n, k);
				break;
			case 6:
				cout << "Combinação com reposição: " << fatorial(n + k - 1) / (fatorial(k) * fatorial(n - 1));
				break;
			case 7:
				cout << "Então flwww! :)";
				break;
			default:
				cout << "\n---------------------------------------";
				cout << "\nOpção inválida.";
				cout << "\n---------------------------------------\n";
		}

		cout << "\n---------------------------------------\n";
	} while(opcao != 7);

	return 0;
}