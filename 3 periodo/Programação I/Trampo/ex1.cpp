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
	float valor, juros;
	int atraso;

	// Inserindo o valor da prestação
	cout << "Digite o valor da prestação: ";
	cin >> valor;

	// Inserindo a taxa de juros
	cout << "Digite a taxa de juros do banco: ";
	cin >> juros;

	// Inserindo o número de dias em atraso
	cout << "Digite o número de dias em atraso: ";
	cin >> atraso;

	// Mostrando o resultado final
	cout << "\nO valor da prestação é: " << valor + (valor * (juros/100) * atraso) << "\n";

	return 0;
}