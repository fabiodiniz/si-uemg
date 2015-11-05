#include <iostream>
#define TAMANHO_FILA 10

using namespace std;

/*
	Discente: Fábio Diniz
	Disciplina: Estrutura de Dados I
	Docente: Ivan Filho
*/

typedef struct fila {
	int inicio;
	int fim;
	int vetor[TAMANHO_FILA];
	int total_elementos;
} Fila;

Fila addElemento(Fila fila){
	int valor;

	cout << "\n---------------------------------------\n";
	if(fila.total_elementos == TAMANHO_FILA){
		cout << "A fila está cheia!\n";
	} else {
		cout << " Qual elemento você quer adicionar? ";
		cin >> valor;

		if(fila.fim < TAMANHO_FILA - 1){
			fila.fim += 1;
		} else {
			fila.fim = 0;
		}

		fila.vetor[fila.fim] = valor;
		fila.total_elementos++;
	}
	cout << "---------------------------------------\n";

	return fila;
}

Fila removeElemento(Fila fila){
	int valor = fila.vetor[fila.inicio];

	cout << "\n---------------------------------------\n";

	//free(fila.vetor[fila.inicio]);

	if(fila.inicio < TAMANHO_FILA - 1){
		fila.inicio += 1;
	} else {
		fila.inicio = 0;
	}

	cout << "Elemento " << valor << " removido com sucesso.";
	cout << "\n---------------------------------------\n";
	fila.total_elementos--;

	return fila;
}

void showFila(Fila fila){
	int i = fila.inicio;
	
	if(fila.fim != -1 && fila.total_elementos != 0){
		cout << "\n---------------------------------------\n";
		cout << "Inicio: " << fila.inicio << "\n";
		cout << "Fim: " << fila.fim << "\n";
		cout << "Total elementos: " << fila.total_elementos;
		cout << "\n---------------------------------------";
		while(i != fila.fim){
			cout << "\nPosicao " << i << ": " << fila.vetor[i];

			if(i < TAMANHO_FILA - 1 || fila.fim == TAMANHO_FILA - 1){
				i += 1;
			} else {
				i = 0;
			}
		}
		cout << "\nPosicao " << i << ": " << fila.vetor[i];
		cout << "\n---------------------------------------\n";
	} else {
		cout << "\n---------------------------------------\n";
		cout << "Fila vazia!";
		cout << "\n---------------------------------------\n";
	}
}

int main(){
	int opcao, tamanho_fila;

	Fila filaZika;
	filaZika.inicio = 0;
	filaZika.fim = -1;
	filaZika.total_elementos = 0;

	cout << "\n---------------------------------------\n";
	cout << "Fila com vetores";
	cout << "\n---------------------------------------\n";

	do {
		cout << "\n1 - Inserir elemento";
		cout << "\n2 - Remover elemento";
		cout << "\n3 - Mostrar elementos";
		cout << "\n4 - Sair\n";
		cout << "\nEscolha a opção: ";
		cin >> opcao;

		switch(opcao){
			case 1:
				filaZika = addElemento(filaZika);
				break;
			case 2:
				filaZika = removeElemento(filaZika);
				break;
			case 3:
				showFila(filaZika);
				break;
			case 4:
				cout << "\n---------------------------------------\n";
				cout << "Então flwww! :)";
				cout << "\n---------------------------------------\n\n";
				break;
			default:
				cout << "\n---------------------------------------";
				cout << "\nOpção inválida.";
				cout << "\n---------------------------------------\n";
		}
	} while(opcao != 4);

	return 0;
}