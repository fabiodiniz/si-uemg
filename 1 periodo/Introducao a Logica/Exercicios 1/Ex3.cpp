//  Created by Fábio Diniz on 12/4/14.
//  Copyright (c) 2014 Fabio. All rights reserved.

#include <stdio.h>

int main(){

    int numero1, numero2, numero3;

    printf("Digite o primeiro numero: ");
    scanf("%d", &numero1);
    printf("Digite o segundo numero: ");
    scanf("%d", &numero2);
    printf("Digite o terceiro numero: ");
    scanf("%d", &numero3);

    printf("O valor de delta eh: %d", numero2 * numero2 - 4 * numero1 * numero3);

    return 0;

}
