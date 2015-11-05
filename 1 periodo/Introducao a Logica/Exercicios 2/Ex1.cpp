//  Created by Fábio Diniz on 26/4/14.
//  Copyright (c) 2014 Fabio. All rights reserved.

#include <stdio.h>

int main(){

    int numero;

    printf("Digite um numero: ");
    scanf("%d", &numero);
    if(numero % 2 == 0)
        printf("O numero eh par.");
    else
        printf("O numero eh impar.");
    return 0;

}
