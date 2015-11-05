algoritmo "exercicio14"
var
   salario, novo_sal:real
inicio
   escreva("Digite seu salario: ")
   leia(salario)
   se salario <= 300 entao
      novo_sal <- salario * 1.5
   fimse
   se (salario > 300) e (salario <= 500) entao
      novo_sal <- salario * 1.4
   fimse
   se (salario > 500) e (salario <= 700) entao
      novo_sal <- salario * 1.3
   fimse
   se (salario > 700) e (salario <= 800) entao
      novo_sal <- salario * 1.2
   fimse
   se (salario > 800) e (salario <= 1000) entao
      novo_sal <- salario * 1.1
   fimse
   se salario > 1000 entao
      novo_sal <- salario * 1.05
   fimse
   escreva("Novo salario: ", novo_sal)
fimalgoritmo
