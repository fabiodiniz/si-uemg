#include <stdio.h>

int main(){
    int IDcidade[6], veiculos_passeio[6], acidentes[6], maior_indice[2], i, ii;
    float media, media2;

    media = 0;
    media2 = 0;
    ii = 0;

    for(i = 0; i < 6; i++){
        printf("Digite o codigo da cidade %d: ", i + 1);
        scanf("%d", &IDcidade[i]);

        printf("Digite o numero de veiculos de passeio em 2007: ");
        scanf("%d", &veiculos_passeio[i]);

        printf("Digite o numero de acidentes com vitimas em 2007: ");
        scanf("%d", &acidentes[i]);

        maior_indice[0] = acidentes[0];
        maior_indice[1] = IDcidade[i];

        if(acidentes[i] > acidentes[i - 1]){
            maior_indice[0] = acidentes[i];
            maior_indice[1] = IDcidade[i];
        }
    }

    for(i = 0; i < 6; i++){
        media = veiculos_passeio[i] + media;
        if(veiculos_passeio[i] < 2000){
            media2 = acidentes[i] + media2;
            ii++;
        }
    }

    printf("a) Maior indice de acidentes das 6 cidades e o codigo: %d, %d\n", maior_indice[0], maior_indice[1]);
    printf("b) Media de veiculos nas 6 cidades: %.1f\n", media / 6);
    printf("c) Media de acidentes de transito em cidades com menos de 2000 automoveis de passeio: %.1f\n", media2 / ii);

    return 0;
}
