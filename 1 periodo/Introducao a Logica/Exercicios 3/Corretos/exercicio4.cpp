#include <stdio.h>

int main(){
    int n, i, total;

    printf("Digite um numero: ");
    scanf("%d", &n);

    total = 1;

    for(i = 1; i <= n; i++){
        total = total * i;
    }

    printf("Resultado: %d", total);

    return 0;
}
