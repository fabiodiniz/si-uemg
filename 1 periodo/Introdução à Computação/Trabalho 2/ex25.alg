algoritmo "exercicio25"
var
   horas_ext, faltas, h, grat:real
inicio
   escreva("Digite as horas extras: ")
   leia(horas_ext)
   escreva("Digite as horas de faltas: ")
   leia(faltas)
   h <- (horas_ext) - 2/3 * (faltas)
   se h > 2400 entao
      grat <- 500
   fimse
   se (h > 1800) e (h <= 2400) entao
      grat <- 400
   fimse
   se (h >= 1200) e (h <= 1800) entao
      grat <- 300
   fimse
   se (h >= 600) e (h < 1200) entao
      grat <- 200
   fimse
   se h < 600 entao
      grat <- 100
   fimse
   escreva("Gratificacao: ", grat)
fimalgoritmo
