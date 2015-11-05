#include <stdio.h>

int main(){
    float altura[15], menor_alt, maior_alt, media_mulheres;
    float total_altura_mulheres = 0;
    char sexo, sexo_pessoa_alta;
    int i;
    int num_mulheres = 0;
    int num_homens = 0;
    int numero_pessoas = 15;

    for(i = 0; i < numero_pessoas; i++){
        printf("Digite a altura e o sexo (M ou F):\n");
        scanf("%f", &altura[i]);
        scanf(" %c", &sexo);

        if(i > 0){
            if(altura[i] > altura[i - 1]){
                maior_alt = altura[i];
                sexo_pessoa_alta = sexo;
            }
        } else {
            maior_alt = altura[i];
            sexo_pessoa_alta = sexo;
        }

        if(i > 0){
            if(altura[i] < altura[i - 1]){
                menor_alt = altura[i];
            }
        } else {
            menor_alt = altura[i];
        }

        if((sexo == 'M') || (sexo == 'm')){
            num_homens++;
        } else if((sexo == 'F') || (sexo == 'f')){
            num_mulheres++;
            total_altura_mulheres = total_altura_mulheres + altura[i];
        }
    }

    media_mulheres = total_altura_mulheres / num_mulheres;

    printf("A maior e a menor altura: %f e %f\n", maior_alt, menor_alt);
    printf("A media da altura das mulheres: %.2f\n", media_mulheres);
    printf("O numero de homens: %d\n", num_homens);
    printf("O sexo da pessoa mais alta: %c", sexo_pessoa_alta);

    return 0;
}
