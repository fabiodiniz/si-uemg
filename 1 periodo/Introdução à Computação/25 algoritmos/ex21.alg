algoritmo "exercicio21"
var
   salario_minimo,salario:real
   horas_trabalhadas,horas_extras:inteiro
inicio
   escreva("Escreva o n�mero de horas trabalhadas: ")
   leia(horas_trabalhadas)
   escreva("Escreva o sal�rio m�nimo: ")
   leia(salario_minimo)
   escreva("Escreva o n�mero de horas extras trabalhadas: ")
   leia(horas_extras)
   salario <-  ((salario_minimo / 8) * horas_trabalhadas) + ((salario_minimo / 4) * horas_extras)
   escreva("O sal�rio a receber �: ", salario)
   escreva(" reais")
fimalgoritmo
