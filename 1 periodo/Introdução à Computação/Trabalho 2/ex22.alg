algoritmo "exercicio22"
var
   idade, peso, grupo:real
inicio
   escreva("Idade: ")
   leia(idade)
   escreva("Peso: ")
   leia(peso)
   se idade < 20 entao
      se peso < 60 entao
         grupo <- 9
      fimse
      se (peso >= 60) e (peso <= 90) entao
         grupo <- 8
      fimse
      se peso > 90 entao
         grupo <- 7
      fimse
   fimse
   se (idade >= 20) e (idade <= 50) entao
      se peso < 60 entao
         grupo <- 6
      fimse
      se (peso >= 60) e (peso <= 90) entao
         grupo <- 5
      fimse
      se peso > 90 entao
         grupo <- 4
      fimse
   fimse
   se idade > 50 entao
      se peso < 60 entao
         grupo <- 3
      fimse
      se (peso >= 60) e (peso <= 90) entao
         grupo <- 2
      fimse
      se peso > 90 entao
         grupo <- 1
      fimse
   fimse
   escreva("Grupo de risco: ", grupo)
fimalgoritmo
