#include <iostream>
#include <stdio.h>
#include <stdlib.h>

using namespace std;

/*
	Discentes: Fábio Diniz e Rodrigo Bertucci
	Disciplina: Estrutura de Dados I
	Docente: Ivan Filho
*/

typedef struct lista {
	int info;
	lista *prox;
	lista *ant;
}Lista;

Lista *addElemento(Lista *lista){
	int valor;
	Lista *novo = (Lista*) malloc(sizeof(Lista));

	cout << "Digite um valor: ";
	cin >> valor;

	if(lista == NULL){
		novo->info = valor;
		novo->ant = NULL;
		novo->prox = NULL;
	} else {
		novo->info = valor;
		novo->prox = lista;
		lista->ant = novo;
		novo->ant = NULL;
	}

	cout << "\n---------------------------------------";
	cout << "\nElemento " << novo->info << " inserido com sucesso.";
	cout << "\n---------------------------------------\n";

	return novo;
}

Lista *findElemento(Lista *lista, int valor){
	Lista *aux = lista;

	while(aux != NULL){
		if(aux->info == valor){
			break;
		}

		aux = aux->prox;
	}

	return aux;
}

Lista *removeElemento(Lista *lista){
	int valor;

	cout << "Digite o valor a ser removido: ";
	cin >> valor;

	Lista *aux = findElemento(lista, valor);

	if(aux != NULL){
		if(aux->ant == NULL && aux->prox == NULL){
			// único elemento, zera a lista
			lista = NULL;
		} else if(aux->ant == NULL){
			// primeiro elemento
			aux->prox->ant = NULL;
			lista = aux->prox;
		} else if(aux->prox == NULL){
			// último elemento
			aux->ant->prox = NULL;
		} else {
			aux->prox->ant = aux->ant;
			aux->ant->prox = aux->prox;
		}
		free(aux);

		cout << "\n---------------------------------------";
		cout << "\nElemento " << valor << " removido com sucesso.";
		cout << "\n---------------------------------------\n";
	} else {
		cout << "\n---------------------------------------";
		cout << "\nO elemento não foi encontrado.";
		cout << "\n---------------------------------------\n";
	}

	return lista;
}

void showLista(Lista *lista){
	Lista *aux;

	cout << "\n---------------------------------------";

	if(lista == NULL){
		cout << "\nLista vazia.";
	} else {
		for(aux = lista; aux != NULL; aux = aux->prox){
			cout << "\nNúmero: " << aux->info;
			cout << "\n\t->ant: " << aux->ant;
			cout << "\n\t->endereco: " << aux;
			cout << "\n\t->prox: " << aux->prox;
		}
	}

	cout << "\n---------------------------------------\n";
}

int main(){
	int op;

	Lista *listaZika = NULL;

	cout << "\n---------------------------------------\n";
	cout << "Lista Duplamente Encadeada\n";
	cout << "Fábio Diniz e Rodrigo Bertucci";
	cout << "\n---------------------------------------\n";

	do {
		cout << "\n1 - Inserir elemento";
		cout << "\n2 - Remover elemento";
		cout << "\n3 - Mostrar elementos";
		cout << "\n4 - Sair\n";
		cout << "\nEscolha a opção: ";
		cin >> op;

		switch(op){
			case 1:
				listaZika = addElemento(listaZika);
				break;
			case 2:
				listaZika = removeElemento(listaZika);
				break;
			case 3:
				showLista(listaZika);
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
	} while(op != 4);

	return 0;
}