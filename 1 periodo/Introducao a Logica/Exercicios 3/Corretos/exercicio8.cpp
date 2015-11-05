#include <stdio.h>

int main(){
    int fahrenheit = 40;
    int celsius;

    while(fahrenheit <= 80){
        celsius = (fahrenheit - 32) * 0.55;
        printf("%d Fahrenheit = %d Celsius\n", fahrenheit, celsius);
        fahrenheit++;
    }

    return 0;
}
