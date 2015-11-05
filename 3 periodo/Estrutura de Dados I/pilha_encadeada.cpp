#include <iostream>

using namespace std;

/*
	Discente: Fábio Diniz
	Disciplina: Estrutura de Dados I
	Docente: Ivan Filho
*/

typedef struct no {
	float info;
	no* anterior;
} No;

typedef struct {
	No* topo;
} Pilha;

bool checkPilha(Pilha* pilhaZika){
	cout << "\n---------------------------------------\n";
	if(pilhaZika->topo == NULL){
		cout << "A pilha está vazia.";
		cout << "\n---------------------------------------\n";
		return false;
	} else {
		cout << "A pilha não está vazia.";
		cout << "\n---------------------------------------\n";
		return true;
	}
}

Pilha* addElemento(Pilha* pilhaZika){
	int valor;

	cout << "\n---------------------------------------\n";
	cout << " Qual elemento você quer adicionar? ";
	cin >> valor;

	No* elemento = (No*) malloc(sizeof(No));
	elemento->info = valor;

	if(pilhaZika->topo != NULL){
		elemento->anterior = pilhaZika->topo;
	} else {
		elemento->anterior = NULL;
	}

	pilhaZika->topo = elemento;
	cout << "---------------------------------------\n";

	return pilhaZika;
}

Pilha* removeElemento(Pilha* pilhaZika){
	if(checkPilha(pilhaZika)){
		No* topo = pilhaZika->topo;
		pilhaZika->topo = topo->anterior;
		cout << "Elemento " << topo->info << " removido com sucesso.";
		free(topo);

		cout << "\n---------------------------------------\n";
	}

	return pilhaZika;
}

void showPilha(Pilha* pilhaZika){
	No* aux = pilhaZika->topo;
	if(checkPilha(pilhaZika)){
		while(aux->anterior != NULL){
			cout << "Valor: " << aux->info << "\n";
			aux = aux->anterior;
		}
		cout << "Valor: " << aux->info << "\n";
		cout << "---------------------------------------\n";
	}
}

Pilha* cleanPilha(Pilha* pilhaZika){
	No* aux = pilhaZika->topo;
	if(checkPilha(pilhaZika)){
		while(aux->anterior != NULL){
			free(aux);
			aux = aux->anterior;
		}
		free(aux);
		pilhaZika->topo = NULL;
		cout << "Pilha esvaziada com sucesso.\n";
		cout << "---------------------------------------\n";
	}
	return pilhaZika;
}

int main(){
	int opcao;

	Pilha* pilhaZika = (Pilha*) malloc(sizeof(Pilha));
	pilhaZika->topo = NULL;

	cout << "\n---------------------------------------\n";
	cout << "Pilha com lista encadeada";
	cout << "\n---------------------------------------\n";

	do {
		cout << "\n1 - Inserir elemento";
		cout << "\n2 - Remover elemento";
		cout << "\n3 - Mostrar elementos";
		cout << "\n4 - Verificar se a pilha está vazia";
		cout << "\n5 - Limpar pilha";
		cout << "\n6 - Sair\n";
		cout << "\nEscolha a opção: ";
		cin >> opcao;

		switch(opcao){
			case 1:
				pilhaZika = addElemento(pilhaZika);
				break;
			case 2:
				pilhaZika = removeElemento(pilhaZika);
				break;
			case 3:
				showPilha(pilhaZika);
				break;
			case 4:
				checkPilha(pilhaZika);
				break;
			case 5:
				pilhaZika = cleanPilha(pilhaZika);
				break;
			case 6:
				cout << "\n---------------------------------------\n";
				cout << "Então flwww! :)";
				cout << "\n---------------------------------------\n\n";
				break;
			default:
				cout << "\n---------------------------------------";
				cout << "\nOpção inválida.";
				cout << "\n---------------------------------------\n";
		}
	} while(opcao != 6);

	return 0;
}