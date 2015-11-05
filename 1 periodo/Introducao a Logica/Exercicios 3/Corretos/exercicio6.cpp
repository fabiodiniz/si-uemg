#include <stdio.h>

int main(){
  int i = 0;
  int soma = 0;

  for(i; i <= 50; i++){
    if(i % 2 == 0){
        soma = soma + i;
    }
  }

  printf("Resultado: %d", soma);

  return 0;
}
