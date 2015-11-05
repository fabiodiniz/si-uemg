#include <iostream>

using namespace std;

struct Noh {
	int elemento;
	Noh *FilhoEsq;
	Noh *FilhoDir;
	Noh *pai;
};

typedef struct Noh* noArvore;

void criarNo(noArvore *no, noArvore *pai, int valor){
	*no = new Noh;
	(*no)->elemento = valor;
	(*no)->FilhoEsq = NULL;
	(*no)->FilhoDir = NULL;

	if(pai != NULL){
		(*no)->pai = *pai;
	} else {
		(*no)->pai = NULL;
	}
}

void inserir(noArvore *noArv, noArvore *pai, int elemento){
	if(*noArv == NULL){
		criarNo(noArv, pai, elemento);
		cout << "Elemento adicionado: " << (*noArv)->elemento;
	} else if(elemento < (*noArv)->elemento){
		cout << "Elemento: " << (*noArv)->elemento;
		cout << " - Acessando filho a esquerda\n";
		inserir(&((*noArv)->FilhoEsq), noArv, elemento);
	} else {
		cout << "Elemento: " << (*noArv)->elemento;
		cout << " - Acessando filho a direita\n";
		inserir(&((*noArv)->FilhoDir), noArv, elemento);
	}
}

void buscar(noArvore *noArv, int elemento){
	if(*noArv != NULL){
		if((*noArv)->elemento == elemento){
			cout << "Elemento encontrado: " << (*noArv)->elemento;
			if((*noArv)->pai != NULL){
				cout << "\nPai: " << (*noArv)->pai->elemento;
			} else {
				cout << "\nPai: NULL";
			}

			if((*noArv)->FilhoEsq != NULL){
				cout << "\nFilho da esquerda: " << (*noArv)->FilhoEsq->elemento;
			} else {
				cout << "\nFilho da esquerda: NULL";
			}

			if((*noArv)->FilhoDir != NULL){
				cout << "\nFilho da direita: " << (*noArv)->FilhoDir->elemento;
			} else {
				cout << "\nFilho da direita: NULL";
			}
		} else {
			buscar(&((*noArv)->FilhoEsq), elemento);
			buscar(&((*noArv)->FilhoDir), elemento);
		}
	}
}

void mostrarEmOrdem(noArvore *noArv){
	if((*noArv) != NULL) {
		mostrarEmOrdem(&(*noArv)->FilhoEsq);
		cout << "\nElemento: " << (*noArv)->elemento;
		mostrarEmOrdem(&(*noArv)->FilhoDir);
	}
}

void mostrarPreOrdem(noArvore *noArv){
	if((*noArv) != NULL){
		cout << "\nElemento: " << (*noArv)->elemento;
		mostrarPreOrdem(&(*noArv)->FilhoEsq);
		mostrarPreOrdem(&(*noArv)->FilhoDir);
	}
}

void mostrarPosOrdem(noArvore *noArv){
	if((*noArv) != NULL){
		mostrarPosOrdem(&(*noArv)->FilhoEsq);
		mostrarPosOrdem(&(*noArv)->FilhoDir);
		cout << "\nElemento: " << (*noArv)->elemento;
	}
}


int main(){
	noArvore raiz = NULL;

	cout << "====================================\n\n";
	cout << "Disciplina: Estrutura de Dados I\n";
	cout << "Docente: Ivan Filho\n";
	cout << "Discentes: Fábio Diniz e Ramon Sposito\n";
	cout << "Trabalho: Árvore binária";

	int opcao_menu = 0, elemento;

	do {
		cout << "\n\n==============  MENU  ==============\n";
		cout << "1 - Inserir elemento\n";
		cout << "2 - Buscar elemento\n";
		cout << "3 - Mostrar percurso EM ORDEM\n";
		cout << "4 - Mostrar percurso PRÉ ORDEM\n";
		cout << "5 - Mostrar percurso PÔS ORDEM\n";
		cout << "6 - Sair\n";
		cout << "====================================\n\n";
		cout << "Digite a opção desejada: ";
		cin >> opcao_menu;

		switch(opcao_menu){
			case 1:
				cout << "Digite o valor que você quer inserir: ";
				cin >> elemento;
				inserir(&raiz, NULL, elemento);
				break;
			case 2:
				if(raiz != NULL){
					cout << "Digite o elemento que você quer encontrar: ";
					cin >> elemento;
					buscar(&raiz, elemento);
				} else {
					cout << "Você precisa inserir elementos para usar a busca.";
				}
				break;
			case 3:
				if(raiz != NULL){
					mostrarEmOrdem(&raiz);
				} else {
					cout << "Você precisa inserir elementos primeiro.";
				}
				break;
			case 4:
				if(raiz != NULL){
					mostrarPreOrdem(&raiz);
				} else {
					cout << "Você precisa inserir elementos primeiro.";
				}
				break;
			case 5:
				if(raiz != NULL){
					mostrarPosOrdem(&raiz);
				} else {
					cout << "Você precisa inserir elementos primeiro.";
				}
				break;
			case 6:
				cout << "Então flwwww!\n";
				break;
			default:
				cout << "Opção inválida.";
		}
	} while(opcao_menu != 6);

	return 0;
}