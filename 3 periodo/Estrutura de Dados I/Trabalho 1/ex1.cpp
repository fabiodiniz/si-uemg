#include <stdio.h>
#include <string.h>

typedef struct {
	int raio;
	float pi = 3.1415;
	float area;
} Circulo;

typedef struct {
	int base;
	int altura;
	float area;
} Retangulo;

int main(){
	Circulo circulo;
	Retangulo retangulo;

	printf("Digite o valor da base do retângulo: ");
	scanf("%d", &retangulo.base);
	printf("Digite o valor da altura do retângulo: ");
	scanf("%d", &retangulo.altura);

	printf("Digite o valor do raio do circulo: ");
	scanf("%d", &circulo.raio);

	circulo.area = circulo.raio * circulo.raio * circulo.pi;
	retangulo.area = retangulo.base * retangulo.altura;

	printf("Área do retângulo: %f\n", retangulo.area);
	printf("Área do círculo: %f\n", circulo.area);

	return 0;
}