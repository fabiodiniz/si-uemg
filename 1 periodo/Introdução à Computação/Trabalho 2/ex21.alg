algoritmo "exercicio21"
var
   preco, codigo:real
inicio
   escreva("Digite o valor do produto: ")
   leia(preco)
   escreva("Digite o codigo do produto: ")
   leia(codigo)
   se codigo = 1 entao
      escreva("Sul")
   fimse
   se codigo = 2 entao
      escreva("Norte")
   fimse
   se codigo = 3 entao
      escreva("Leste")
   fimse
   se codigo = 4 entao
      escreva("Oeste")
   fimse
   se (codigo = 5) ou (codigo = 6) entao
      escreva("Nordeste")
   fimse
   se (codigo = 7) ou (codigo = 8) ou (codigo = 9) entao
      escreva("Sudeste")
   fimse
   se (codigo >= 10) e (codigo <= 20) entao
      escreva("Centro-oeste")
   fimse
   se (codigo >= 21) e (codigo <= 30) entao
      escreva("Nordeste")
   fimse
fimalgoritmo
