algoritmo "exercicio14"
var
   ano_nascimento,ano_atual,idade:inteiro
inicio
   escreva("Escreva o ano que você nasceu: ")
   leia(ano_nascimento)
   escreva("Escreva o ano atual: ")
   leia(ano_atual)
   idade <- ano_atual - ano_nascimento
   escreval("Sua idade...")
   escreval("em anos: ", idade)
   escreval("em meses: ", idade * 12)
   escreval("em dias: ", idade * 365)
   escreval("em semanas: ", idade * 52.14) //365 dias dividido por 7, para saber a quantidade de semanas no ano
fimalgoritmo
