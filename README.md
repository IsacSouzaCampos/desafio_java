# Desafio de Programação

O desafio é dividido em duas etapas. Na primeira devem ser respondidas questões teóricas envolvendo assuntos ligados à computação. Já a segunda é uma etapa prática, que consiste em resolver problemas ligados a algoritmos tradicionais da área de desenvolvimento.


## Etapa Teórica

1. Diferenciar as camadas 2 e 3 do modelo OSI, e indicar os protocolos utilizados para endereçamento nestas camadas.

> Resposta: 
  As camadas 2 e 3 do modelo OSI são, respectivamente, a de __enlace__ e de __rede__. 
  
>  A camada de __rede__ é responsável pelo enpacotamento e endereçamento do conteúdo a ser transmitido pela internet. Por ter essas responsabilidades, a camada 3 utiliza protocolos de endereçamento para isso, tais como o IP (Internet Protocol), ICMP (Internet Control Message Protocol), NAT (Network Address Translation) e ARP (Address Resolution Protocol), por exemplo.
  
>  Diferentemente da camada de __rede__, que envolve a parte lógica da comunicação pela internet, a camanda de __enlace__ tem relação com a parte física. É nessa camada que será definida a tecnologia usada na comunicação e seus respectivos protocolos: Wi-Fi (onda de rádio), Ethernet (cabeada), etc.


2. Qual a diferença entre adotar uma solução proprietária como o sistema operacional Windows quando comparado a adoção de uma solução OpenSource como o sistema operacional Ubuntu? Quais seriam os pontos negativos e positivos de cada abordagem?

> Resposta:
  O Sistema Operacional Windows é bastante conhecido e popular entre usuários _desktop_. Ele é projetado para ser de fácil uso e não necessitar conhecimento aprofundado em coputação, o que torna certas tarefas mais práticas de se executarem. Além disso, é um sistema pago e que, portanto, tende a oferecer um serviço de suporte mais dedicado aos clientes. Por se tratar de uma solução proprietária, é mais difícil aplicar modificações e adaptações nesse SO, pois não é dada muita liberdade aos usuários para tal.
  
>  O Ubuntu, por sua vez, é um sistema de código aberto e gratuito. Apesar de exigir um conhecimento mais aprofundado na área de computação para ser usado e não haver um serviço pago de suporte técnico, é possível encontrar muitas soluções online ou em conversas por fórums, uma vez que a comunidade que o utiliza é bastante ativa e interessada em ajudar. Diferentemente do Windows, o Ubuntu permite mais alterações no SO, tornando-o mais flexível a adaptações.


3. O que seria um projeto OpenSource? Como empresas podem adotar tais tecnologias e o que isso acarreta?

> Resposta: 
  _OpenSource_ é um modelo de desenvolvimento que permite diversos colaboradores participarem de um projeto de forma cooperativa. Seu código é público e de livre acesso para quem queira adaptá-lo. Diferentemente do conceito de Software Livre, o _OpenSource_ funciona como um modelo de negócios que utiliza alguns princípios do anterior mas pode ter como finalidade a monetização da ferramenta desenvolvida. Além disso, um projeto _OpenSource_ pode utilizar ferramentas proprietárias como pré-requisito para o seu fucionamento, o que fere os princípios do Software Livre, por exemplo. Essas diferenças ocorrem pelo fato de o modelo _OpenSource_ ter se desvencilhado dos ideais filosóficos e políticos do movimento Software Livre.
  
  
>  Para um projeto ser considerado _OpenSource_, as emprsas que o adotarem devem garantir que a ferramenta desenvolvida siga as diretrizes definidas no documento _Debian Free Software Guideline_ (https://www.debian.org/social_contract#guidelines).
  

## Etapa Prática

1. Fibonacci
    
    + Criar uma função em sua linguagem preferida. A função deve receber um numero N >= 0 (deve validar o input para a função), e retornar o valor correspondente desse número na sequencia fibonnaci. EX. fib(0) =0; fib(1) = 1; fib(2) = 1; fib(3) = 2; fib(5) = 5; fib(6) = 8.
    + Criar uma função recursiva que resolva _Fibonacci_
    + Criar uma função linear que resolva _Fibonacci_

> Resposta: Para esse desafio foi criado o projeto de nome _Fibonacci_ visto no repositório.


> No método linear foi utilizada uma fórmula para o cálculo do valor na posição escolhida pelo usuário. Essa abordagem garante que o desempenho do algoritmo será constante independente da posição escolhida e não utiliza um _loop for_, que poderia gerar uma queda de desempenho considerável para posições maiores.


> Já o método recursivo precisa necessariamente passar por todas as posições até que se chegue à escolhida pelo usuário. Nesse caso o método retorna uma lista contendo duas posições com os valores atualizados dos dois últimos valores de Fibonacci anteriores ao atual. Isso permite que não se use a recursividade duas vezes (uma para _n-1_ e outra pra _n-2_), melhorando o desempenho do código.


2. Números Primos
    
    + Criar uma função em sua linguagem preferida. A função deve receber um numero N > 1 (validar o input), e retornar todos os números primos até o numero N. EX. p(2) = [2]; p(3) = [2, 3]; p(10) = [2, 3, 5, 7];
    + Criar uma função recursiva que resolva _p_
    + Criar uma função linear que resolva _p_
    
> Resposta: Para o desafio da Lista de Números Primos foi criado o projeto de nome _ListaNumerosPrimos_ visto no repositório. Para ambas as abordagens propostas no desafio foi utilizado o algoritmo do _Crivo de Eratóstenes_. O crivo consiste em utilizar os números primos já encontrados e adicionados à lista para conferir se o número atual também é primo. A estratégia funciona pois tira dos testes valores que não são primos, pois esses valores são resultado da multiplicação de outros dois anteriores a ele, logo, se o valor atual testado fosse divisível por um dos não primos desconsiderados, ele seria necessariamente divisível pelos valores compostos dele também, tornando desnecessário esse teste.


> Para o método linear o _Crivo de Eratóstenes_ foi implementado com dois _loops for_ aninhados. O mais externo contendo cada um dos inteiros existentes até o valor limite definido pelo usuário e o mais interno fazendo os testes com os valores contidos na lista até então.


> O caso recursivo substitui o _loop for_ mais externo do caso linear pela recursão. O restante do código funciona de maneira semelhante ao anterior.


### Referências
1. https://medium.com/@marcellguilherme/fibonacci-9aded34b2fb6
2. https://pt.wikipedia.org/wiki/Crivo_de_Erat%C3%B3stenes
3. https://www.alura.com.br/artigos/open-source-uma-breve-introducao
