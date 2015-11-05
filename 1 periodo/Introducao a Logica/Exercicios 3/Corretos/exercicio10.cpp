#include <stdio.h>

int main(){
    int numeros, soma, maior, menor;
    float porcentagem, media, media_pares;
    int i = 0;
    int ii = 0;
    int pares = 0;

    printf("Digite um numero: ");
    scanf("%d", &numeros);
    soma = numeros;
    maior = numeros;
    menor = numeros;

    do {
        printf("Digite um numero: ");
        scanf("%d", &numeros);
        if(numeros >= 0){
            soma = soma + numeros;
            i++;
            if(maior < numeros){
                maior = numeros;
            }
            if(menor > numeros){
                menor = numeros;
            }
            if(numeros % 2 == 0){
                pares = pares + numeros;
                ii++;
            }
        }
    } while(numeros >= 0);

    porcentagem = ((soma - pares) * 100) / soma;
    media = soma / i;
    media_pares = pares / ii;

    printf("Soma de todos os numeros: %d\n", soma);
    printf("Quantidade de numeros digitados: %d\n", i);
    printf("A media dos numeros: %.1f\n", media);
    printf("O maior numero digitado: %d\n", maior);
    printf("O menor numero digitado: %d\n", menor);
    printf("A media dos numeros pares: %.1f\n", media_pares);
    printf("A porcentagem de numeros impares: %.1f", porcentagem);

    return 0;
}
