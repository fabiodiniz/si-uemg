#include <iostream>
#include <stdio.h>
#include <stdlib.h>

using namespace std;

/*
	Discente: Fábio Diniz
	Disciplina: Programação I
	Docente: Kamila da Hora
*/

int main(){
	// Inicialização das variáveis
	int numero;

	// Inserindo o número que será usado na tabuada
	cout << "Digite o número: ";
	cin >> numero;

	for(int i = 1; i <= 10; i++){
		// Mostra o resultado da soma do número com a variável i
		cout << numero << " + " << i << " = " << numero + i << "\n";
	}

	return 0;
}