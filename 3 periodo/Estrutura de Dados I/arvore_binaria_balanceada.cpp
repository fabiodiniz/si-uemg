#include <iostream>

using namespace std;

struct noArvore {
	int elemento;
	int bal;
	struct noArvore *pai;
	struct noArvore *FilhoEsq;
	struct noArvore *FilhoDir;
};

int alturaArvore(struct noArvore *noArv){
	int FilhoEsq, FilhoDir;

	if(noArv == NULL) return -1;

	FilhoEsq = alturaArvore(noArv->FilhoEsq);
	FilhoDir = alturaArvore(noArv->FilhoDir);

	if(FilhoEsq > FilhoDir)
		return FilhoEsq + 1;
	else
		return FilhoDir + 1;
}

struct noArvore *rotacaoEsquerda(struct noArvore *noArv){
	struct  noArvore *aux;

	aux = noArv->FilhoEsq;

	noArv->FilhoEsq = aux->FilhoDir;
	if(aux->FilhoDir != NULL){
		aux->FilhoDir->pai = noArv;
	}
	aux->FilhoDir = noArv;
	aux->pai = noArv->pai;
	if(noArv->pai != NULL){
		if(noArv->pai->FilhoEsq == noArv){
			noArv->pai->FilhoEsq = aux;
		} else {
			noArv->pai->FilhoDir = aux;
		}
	}
	noArv->pai = aux;

	aux->bal = alturaArvore(aux->FilhoEsq) - alturaArvore(aux->FilhoDir);
	noArv->bal = alturaArvore(noArv->FilhoEsq) - alturaArvore(noArv->FilhoDir);

	return aux;
}

struct noArvore *rotacaoDireita (struct noArvore *noArv){
	struct noArvore *aux;

	aux = noArv->FilhoDir;

	noArv->FilhoDir = aux->FilhoEsq;
	if(aux->FilhoEsq != NULL){
		aux->FilhoEsq->pai = noArv;
	}
	aux->FilhoEsq = noArv;
	aux->pai = noArv->pai;
	if(noArv->pai != NULL){
		if ( noArv->pai->FilhoEsq == noArv )
			noArv->pai->FilhoEsq = aux;
		else
			noArv->pai->FilhoDir = aux;
	}
	noArv->pai = aux;

	aux->bal = alturaArvore(aux->FilhoEsq) - alturaArvore(aux->FilhoDir);
	noArv->bal = alturaArvore(noArv->FilhoEsq) - alturaArvore(noArv->FilhoDir);

	return aux;
}

void inserir(struct noArvore **noArv, struct noArvore **pai, int numero){
	if(*noArv == NULL){
		*noArv = (struct noArvore*) malloc(sizeof(struct noArvore));
		(*noArv)->FilhoEsq = NULL;
		(*noArv)->FilhoDir = NULL;
		(*noArv)->elemento = numero;
		(*noArv)->pai = (*pai);
		(*noArv)->bal = 0;
	} else if(numero <(*noArv)->elemento){
		inserir(&(*noArv)->FilhoEsq, &(*noArv), numero);
		(*noArv)->bal = alturaArvore((*noArv)->FilhoEsq) - alturaArvore((*noArv)->FilhoDir);
		if((*noArv)->bal == 2){
			if((*noArv)->FilhoEsq->bal == 1){
				(*noArv) = rotacaoEsquerda((*noArv));
			} else if((*noArv)->FilhoEsq->bal==-1){
				(*noArv)->FilhoEsq = rotacaoDireita((*noArv)->FilhoEsq);
				(*noArv) = rotacaoEsquerda((*noArv));
			}
		}
	} else {
		if(numero > (*noArv)->elemento){
			inserir(&(*noArv)->FilhoDir, &(*noArv), numero);
			(*noArv)->bal = alturaArvore((*noArv)->FilhoEsq) - alturaArvore((*noArv)->FilhoDir);
			if((*noArv)->bal == -2){
				if((*noArv)->FilhoDir->bal == -1)
					(*noArv)= rotacaoDireita((*noArv));
				else if((*noArv)->FilhoDir->bal == 1){
					(*noArv)->FilhoDir=rotacaoEsquerda((*noArv)->FilhoDir);
					(*noArv)= rotacaoDireita((*noArv));
				}
			}
		}
	}
}

void mostrarNo(struct noArvore *noArv, int nivel){
	int i;
	if(noArv){
		mostrarNo(noArv->FilhoDir, nivel+1);
		cout << "\n";
		for (i = 0; i < nivel; i++)
			cout << "    ";
		cout << "(" << noArv->bal << ")" << noArv->elemento;
		mostrarNo(noArv->FilhoEsq, nivel+1);
	}
}

void buscar(struct noArvore *noArv, int elemento){
	if(noArv != NULL){
		if(noArv->elemento == elemento){
			cout << "Elemento encontrado: " << noArv->elemento;
			if(noArv->pai != NULL){
				cout << "\nPai: " << noArv->pai->elemento;
			} else {
				cout << "\nPai: NULL";
			}

			if(noArv->FilhoEsq != NULL){
				cout << "\nFilho da esquerda: " << noArv->FilhoEsq->elemento;
			} else {
				cout << "\nFilho da esquerda: NULL";
			}

			if(noArv->FilhoDir != NULL){
				cout << "\nFilho da direita: " << noArv->FilhoDir->elemento;
			} else {
				cout << "\nFilho da direita: NULL";
			}

			cout << "\nBal: " << noArv->bal;
		} else {
			buscar(noArv->FilhoEsq, elemento);
			buscar(noArv->FilhoDir, elemento);
		}
	}
}

void mostrarEmOrdem(struct noArvore *noArv){
	if(noArv != NULL) {
		mostrarEmOrdem(noArv->FilhoEsq);
		cout << "\nElemento: " << noArv->elemento;
		mostrarEmOrdem(noArv->FilhoDir);
	}
}

void mostrarPreOrdem(struct noArvore *noArv){
	if(noArv != NULL){
		cout << "\nElemento: " << noArv->elemento;
		mostrarPreOrdem(noArv->FilhoEsq);
		mostrarPreOrdem(noArv->FilhoDir);
	}
}

void mostrarPosOrdem(struct noArvore *noArv){
	if(noArv != NULL){
		mostrarPosOrdem(noArv->FilhoEsq);
		mostrarPosOrdem(noArv->FilhoDir);
		cout << "\nElemento: " << noArv->elemento;
	}
}

int main(){
	int op, valor;

	struct noArvore *raiz, *aux;
	raiz = aux = NULL;

	cout << "====================================\n\n";
	cout << "Disciplina: Estrutura de Dados I\n";
	cout << "Docente: Ivan Filho\n";
	cout << "Discente: Fábio Diniz\n";
	cout << "Trabalho: Árvore binária balanceada";
	do {
		cout << "\n\n==============  MENU  ==============\n";
		cout << "1 - Inserir elemento\n";
		cout << "2 - Mostrar árvore\n";
		cout << "3 - Buscar elemento\n";
		cout << "4 - Mostrar percurso EM ORDEM\n";
		cout << "5 - Mostrar percurso PRÉ ORDEM\n";
		cout << "6 - Mostrar percurso PÔS ORDEM\n";
		cout << "7 - Sair\n";
		cout << "====================================\n\n";
		cout << "Digite a opção desejada: ";
		cin >> op;
		switch(op){
			case 1:
				cout << "Digite o valor que você quer inserir: ";
				cin >> valor;
				inserir(&raiz, &aux, valor);

				cout << "\nObs: visualize a árvore como se estivesse tombada para a esquerda.\n";
				mostrarNo(raiz, 1);
			break;
			case 2:
				if(raiz != NULL){
					cout << "\nObs: visualize a árvore como se estivesse tombada para a esquerda.\n";
					mostrarNo(raiz, 1);
				} else {
					cout << "Você precisa inserir elementos primeiro.";
				}
				break;
			case 3:
				if(raiz != NULL){
					cout << "Digite o elemento que você quer encontrar: ";
					cin >> valor;
					buscar(raiz, valor);
				} else {
					cout << "Você precisa inserir elementos para usar a busca.";
				}
				break;
			case 4:
				if(raiz != NULL){
					mostrarEmOrdem(raiz);
				} else {
					cout << "Você precisa inserir elementos primeiro.";
				}
				break;
			case 5:
				if(raiz != NULL){
					mostrarPreOrdem(raiz);
				} else {
					cout << "Você precisa inserir elementos primeiro.";
				}
				break;
			case 6:
				if(raiz != NULL){
					mostrarPosOrdem(raiz);
				} else {
					cout << "Você precisa inserir elementos primeiro.";
				}
				break;
			case 7:
				cout << "Então flwwww!\n";
				break;
			default:
				cout << "Opção inválida.";
		}
	} while(op != 7);

	return 0;
}