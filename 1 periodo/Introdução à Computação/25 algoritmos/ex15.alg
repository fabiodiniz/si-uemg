algoritmo "exercicio15"
var
   salario,conta1,conta2:real
inicio
   escreva("Seu salário: ")
   leia(salario)
   escreva("O valor da primeira conta: ")
   leia(conta1)
   escreva("O valor da segunda conta: ")
   leia(conta2)
   escreva("Restará do seu salário: ", salario - ((conta1 * 1.02) + (conta2 * 1.02)))
fimalgoritmo
