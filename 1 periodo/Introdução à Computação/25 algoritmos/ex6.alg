algoritmo "exercicio6"
var
   salario,vendas,salario_final:real
inicio
   escreva("Escreva o salário: ")
   leia(salario)
   escreva("Escreva o valor das vendas: ")
   leia(vendas)
   salario_final <- salario + (vendas * 0.04)
   escreval("O salário final é: ", salario_final)
   escreva("A comissão total é: ", (vendas * 0.04))
fimalgoritmo
