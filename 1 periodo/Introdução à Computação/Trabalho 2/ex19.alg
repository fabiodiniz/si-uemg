algoritmo "exercicio19"
var
   altura, sexo, peso_ideal:real
inicio
   escreva("Digite 1 para mulher e 2 para homem: ")
   leia(sexo)
   escreva("Digite sua altura (em metros): ")
   leia(altura)
   se sexo = 1 entao
      peso_ideal <- (72.7 * altura) - 58
   senao
      peso_ideal <- (62.1 * altura) - 44.7
   fimse
   escreva("Peso ideal: ", peso_ideal)
fimalgoritmo
