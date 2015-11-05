#include <stdio.h>

int main(){
    int i, ii;

    for(i = 1; i <= 10; i++){
        for(ii = 1; ii <= 10; ii++){
            printf("\t%d\t*\t%d\t=\t%d\n", ii, i, i * ii);
        }
        printf("\n");
    }

    return 0;
}
