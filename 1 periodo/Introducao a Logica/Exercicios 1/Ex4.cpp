//  Created by Fábio Diniz on 12/4/14.
//  Copyright (c) 2014 Fabio. All rights reserved.

#include <stdio.h>

int main(){

    int numero;

    printf("Digite um numero: ");
    scanf("%d", &numero);

    printf("O numero anterior eh: %d\n", numero - 1);
    printf("O proximo numero eh: %d", numero + 1);

    return 0;

}
