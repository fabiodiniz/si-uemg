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
	float salario;

	// Inserindo o salário
	cout << "Digite o salário: ";
	cin >> salario;

	// Mostra o salário com reajuste de 30%
	salario = salario * 1.3;
	cout << "\na) Reajuste de 30%: " << salario;

	// Mostra a gratificação de 20% em cima do reajuste
	salario = salario * 1.2;
	cout << "\nb) Gratificação de 20%: " << salario;

	// Mostra o desconto de 10% no salário final
	salario = salario * 0.9;
	cout << "\nc) Desconto de 10%: " << salario << "\n";

	return 0;
}