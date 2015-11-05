algoritmo "exercicio20"
var
   idade:real
inicio
   escreva("Digite sua idade: ")
   leia(idade)
   se (idade >= 5) e (idade <= 7) entao
      escreva("Infantil")
   fimse
   se (idade >= 8) e (idade <= 10) entao
      escreva("Juvenil")
   fimse
   se (idade >= 11) e (idade <= 15) entao
      escreva("Adolescente")
   fimse
   se (idade >= 16) e (idade <= 30) entao
      escreva("Adulto")
   fimse
   se idade > 30 entao
      escreva("Senior")
   fimse
fimalgoritmo
