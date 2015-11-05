algoritmo "exercicio16"
var
   valor, desconto, novo_valor:real
inicio
   escreva("Digite o valor do produto: ")
   leia(valor)
   se valor <= 30 entao
      desconto <- 0
      novo_valor <- valor
   fimse
   se (valor > 30) e (valor <= 100) entao
      desconto <- 10
      novo_valor <- valor - desconto
   fimse
   se valor > 100 entao
      desconto <- 15
      novo_valor <- valor - desconto
   fimse
   escreval("Preço atual: ", valor)
   escreval("Valor do desconto: ", desconto)
   escreva("Novo preço: ", novo_valor)
fimalgoritmo
