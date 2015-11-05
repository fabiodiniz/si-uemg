algoritmo "exercicio21"
var
   salario_minimo,salario:real
   horas_trabalhadas,horas_extras:inteiro
inicio
   escreva("Escreva o número de horas trabalhadas: ")
   leia(horas_trabalhadas)
   escreva("Escreva o salário mínimo: ")
   leia(salario_minimo)
   escreva("Escreva o número de horas extras trabalhadas: ")
   leia(horas_extras)
   salario <-  ((salario_minimo / 8) * horas_trabalhadas) + ((salario_minimo / 4) * horas_extras)
   escreva("O salário a receber é: ", salario)
   escreva(" reais")
fimalgoritmo
