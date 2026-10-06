Contexto:

Uma academia de Jiu-Jitsu deseja desenvolver um sistema para classificar seus atletas antes de uma competição. O programa deverá analisar a idade, o peso e a graduação do lutador para determinar sua categoria e verificar se ele está apto para competir.

Regras de classificação

Idade                     Categoria
8 a 12 anos           Infantil
13 a 15 anos         Infantojuvenil
16 a 17 anos         Juvenil
18 a 29 anos         Adulto
30 a 39 anos        Master 1
40 anos ou mais  Master 2  

Além da idade, o sistema deverá considerar o peso:

Até 70 kg → categoria Leve
De 70,01 kg até 82 kg → categoria Médio
Acima de 82 kg → categoria Pesado

Para participar da competição, o lutador deverá ter graduação mínima de faixa azul.

Considere:

1 = Branca 
2 = Azul 
3 = Roxa 
4 = Marrom 
5 = Preta

Desafio

O programa deverá:

Solicitar a idade, o peso e a graduação do lutador.
Identificar sua categoria por idade.
Identificar sua categoria por peso.
Utilizar IF aninhado para verificar se o lutador está apto para competir.
Utilizar operadores lógicos && e ||.

Exemplos de testes

| Idade |  Peso | Graduação | Resultado             |
| ----: | ----: | --------: | --------------------- |
|    12 | 60 kg |         1      | Infantil — Não apto     |
|    14 | 65 kg |         2      | Infantojuvenil — Apto |
|    17 | 75 kg |         3      | Juvenil — Apto            |
|    22 | 90 kg |        2      | Adulto — Apto             |
|    35 | 78 kg |        1       | Master 1 — Não apto  |
|    42 | 85 kg |        5      | Master 2 — Apto         |
