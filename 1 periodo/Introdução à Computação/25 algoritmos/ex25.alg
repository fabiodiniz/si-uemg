algoritmo "exercicio25"
var
   horas,minutos,horas_min,minutos_total:inteiro
inicio
   escreva("Esreva as horas: ")
   leia(horas)
   escreva("Escreva os minutos: ")
   leia(minutos)
   horas_min <- horas * 60
   escreval("As horas escritas em minutos: ", horas_min)
   minutos_total <- horas_min + minutos
   escreval("A quantidade total de minutos é: ", minutos_total)
   escreval("O horário escrito em segundos é: ", minutos_total * 60)
fimalgoritmo
