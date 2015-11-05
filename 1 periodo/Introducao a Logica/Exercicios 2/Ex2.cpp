//  Created by Fábio Diniz on 26/4/14.
//  Copyright (c) 2014 Fabio. All rights reserved.

#include <stdio.h>

int main(){

    int numero;

    printf("Digite um numero: ");
    scanf("%d", &numero);
    if(numero > 20)
        printf("O numero eh maior que 20.");
    else if(numero == 20)
        printf("O numero eh igual a 20.");
    else
        printf("O numero eh menor que 20.");
    return 0;

}
