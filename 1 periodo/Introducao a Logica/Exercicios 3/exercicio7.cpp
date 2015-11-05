#include <stdio.h>

int main(){
    int numeros[4], i;

    numeros[0] = 3;
    numeros[1] = 5;
    numeros[2] = 2;
    numeros[3] = 4;

    for(i = 0; i < 4; i++){
        printf("%d - ", numeros[i]);
    }

    return 0;
}
