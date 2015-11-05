algoritmo "exercicio20"
var
   distancia,angulo,angulo_rad:real
inicio
   escreva("Escreva a distância que a escada está da parede (em metros): ")
   leia(distancia)
   escreva("Escreva o ângulo formado pela escada: ")
   leia(angulo)
   angulo_rad <- grauprad(angulo)
   escreva("A escada deve ser de ", distancia / cos(angulo_rad))
fimalgoritmo
