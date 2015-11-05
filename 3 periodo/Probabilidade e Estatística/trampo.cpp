#import <iostream>

using namespace std;

/*
	Discentes: Fábio Diniz
	Disciplina: Probabilidade e Estatística
	Docente: Josney
*/
	
int fatorial(int n){
    int resultado = 1;
    for(int i = n; i > 0; i--){
        resultado *= i;
    }

    return resultado;
}

int pow(int i, int j){
	int result=1;

	do {
		result *=i;
		j--;
	} while(j>0);

	return result;
}


int main(){
	int vezes, nJogadas;
	float probabilidade;

	cout << "Digite a quantidade de vezes que a moeda será jogada: ";
	cin >> vezes;

	cout << "\tn Caras\t\tResultados possíveis\tProbabilidade\n";
	for(int i = 0; i < vezes; i++){
        nJogadas = fatorial(vezes)/(fatorial(i)*fatorial(vezes-i));
        probabilidade = (float)nJogadas/(float)pow(2,vezes);
		cout << "\t" << i << "\t\t" << nJogadas << "\t\t" << probabilidade << "\n";
	}

	return 0;
}