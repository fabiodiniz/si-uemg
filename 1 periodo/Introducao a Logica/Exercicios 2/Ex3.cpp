//  Created by Fábio Diniz on 26/4/14.
//  Copyright (c) 2014 Fabio. All rights reserved.

#include <stdio.h>

int main(){

    int numero;

    printf("Digite um numero: ");
    scanf("%d", &numero);
    if(numero % 7 == 0)
        printf("O numero eh divisivel por 7.");
    else
        printf("O numero nao eh divisivel por 7.");
    return 0;

}
