algoritmo "exercicio24"
var
   preco, cat, aumento, imposto:real
   sit:caracter
inicio
   escreva("Digite o preco: ")
   leia(preco)
   escreval("1 - Limpeza / 2 - Alimentacao / 3 - Vestuario")
   escreva("Digite a categoria: ")
   leia(cat)
   escreval("R - Produtos que precisam de refrigeracao")
   escreval("N - Produtos que nao precisam")
   escreva("Digite a situacao: ")
   leia(sit)
   se preco <= 25 entao
      se cat = 1 entao
         aumento <- preco * 0.05
      fimse
      se cat = 2 entao
         aumento <- preco * 0.08
      fimse
      se cat = 3 entao
         aumento <- preco * 0.1
      fimse
   senao
      se cat = 1 entao
         aumento <- preco * 0.12
      fimse
      se cat = 2 entao
         aumento <- preco * 0.15
      fimse
      se cat = 3 entao
         aumento <- preco * 0.18
      fimse
   fimse
   preco <- preco + aumento
   se (cat = 2) ou (sit = "R") entao
      imposto <- preco * 0.05
   senao
      imposto <- preco * 0.08
   fimse
   escreval("Valor do aumento: ", aumento)
   escreval("Valor do imposto: ", imposto)
   preco <- preco - imposto
   escreval("Novo preco: ", preco)
   se preco <= 50 entao
      escreva("Barato")
   fimse
   se (preco > 50) e (preco < 120) entao
      escreva("Normal")
   fimse
   se preco >= 120 entao
      escreva("Caro")
   fimse
fimalgoritmo
