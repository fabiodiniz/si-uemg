//  Created by Fábio Diniz on 12/4/14.
//  Copyright (c) 2014 Fabio. All rights reserved.

#include <stdio.h>

int main(){

    int numero1, numero2;

    printf("Digite o primeiro numero: ");
    scanf("%d", &numero1);
    printf("Digite o segundo numero: ");
    scanf("%d", &numero2);
    printf("A divisao dos numeros eh: %d\n", numero1 / numero2);
    printf("O resto da divisao eh: %d\n", numero1 % numero2);

    return 0;

}
