algoritmo "exercicio6"
var
   salario,vendas,salario_final:real
inicio
   escreva("Escreva o sal�rio: ")
   leia(salario)
   escreva("Escreva o valor das vendas: ")
   leia(vendas)
   salario_final <- salario + (vendas * 0.04)
   escreval("O sal�rio final �: ", salario_final)
   escreva("A comiss�o total �: ", (vendas * 0.04))
fimalgoritmo
