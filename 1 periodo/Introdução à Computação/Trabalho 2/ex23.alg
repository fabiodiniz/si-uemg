algoritmo "exercicio23"
var
   codigo, qtd, preco_uni, preco_total, desconto, preco_desconto:real
inicio
   escreva("Digite o codigo do produto: ")
   leia(codigo)
   escreva("Digite a quantidade: ")
   leia(qtd)
   se (codigo >= 1) e (codigo <= 10) entao
      preco_uni <- 10
   fimse
   se (codigo >= 11) e (codigo <= 20) entao
      preco_uni <- 15
   fimse
   se (codigo >= 21) e (codigo <= 30) entao
      preco_uni <- 20
   fimse
   se (codigo >= 31) e (codigo <= 40) entao
      preco_uni <- 30
   fimse
   preco_total <- preco_uni * qtd
   se preco_total <= 250 entao
      desconto <- preco_total * 0.05
   fimse
   se (preco_total > 250) e (preco_total <= 500) entao
      desconto <- preco_total * 0.1
   fimse
   se preco_total > 500 entao
      desconto <- preco_total * 0.15
   fimse
   escreval("Preco unitario: ", preco_uni)
   escreval("Total da nota: ", preco_total)
   escreval("Desconto: ", desconto)
   preco_total <- preco_total - desconto
   escreva("Preco com desconto: ", preco_total)
fimalgoritmo
