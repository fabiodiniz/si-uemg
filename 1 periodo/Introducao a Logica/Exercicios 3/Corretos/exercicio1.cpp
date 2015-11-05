#include <stdio.h>

int main(){
    int x, y, i, resultado;

    printf("Digite um numero: ");
    scanf("%d", &x);

    printf("Digite outro numero: ");
    scanf("%d", &y);

    for(i = 1; i < y; i++){
        if(i == 1){
            resultado = x * x;
        } else {
            resultado = resultado * x;
        }
    }

    printf("Resultado: %d", resultado);

    return 0;
}
