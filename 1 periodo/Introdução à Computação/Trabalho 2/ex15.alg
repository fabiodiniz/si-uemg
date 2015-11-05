algoritmo "exercicio15"
var
   tipo, valor, valor_final:real
inicio
   escreval("1 - Poupanca")
   escreval("2 - Fundos de renda fixa")
   escreva("Digite a opcao desejada: ")
   leia(tipo)
   escreva("Digite o valor do investimento: ")
   leia(valor)
   se tipo = 1 entao
      valor_final <- valor * 1.03
   fimse
   se tipo = 2 entao
      valor_final <- valor * 1.04
   fimse
   escreva("Valor corrigido: ", valor_final)
fimalgoritmo
