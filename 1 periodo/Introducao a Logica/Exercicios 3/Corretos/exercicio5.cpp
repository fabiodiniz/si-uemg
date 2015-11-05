#include <stdio.h>

int main(){
  int x, y, alterador, n, i;

  x = 0;
  y = 1;

  printf("0 - 1 - ");

  for(i = 0; i < 8; i++){
    alterador = x + y;
    x = y;
    y = alterador;

    printf("%d - ", alterador);
  }

  return 0;
}
