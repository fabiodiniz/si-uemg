#include <stdio.h>

int main(){
    float salario, porcentagem;
    int ano, ano_atual;
    salario = 600;
    porcentagem = 0.015;
    ano = 2002;

    printf("Digite o ano atual: ");
    scanf("%d", &ano_atual);
    printf("\tSalario\t\tAno\n");

    for(ano; ano <= ano_atual; ano++){
        printf("\t%.2f\t\t%d\n", salario, ano);
        salario = salario + salario * porcentagem;
        porcentagem = porcentagem * 2;
    }

    return 0;
}
