# Desafio de Programação

O desafio é dividido em duas etapas. Na primeira devem ser respondidas questões teóricas envolvendo assuntos ligados à computação. Já a segunda é uma etapa prática, que consiste em resolver problemas ligados a algoritmos tradicionais da área de desenvolvimento.


## Etapa Teórica

1. Diferenciar as camadas 2 e 3 do modelo OSI, e indicar os protocolos utilizados para endereçamento nestas camadas.

> Resposta: 
  As camadas 2 e 3 do modelo OSI são, respectivamente, a de __enlace__ e de __rede__. 
  A camada de __rede__ é responsável pelo enpacotamento e endereçamento do conteúdo a ser transmitido pela internet. Por ter essas responsabilidades, a camada 3 utiliza protocolos de endereçamento para isso, tais como o IP (Internet Protocol), ICMP (Internet Control Message Protocol), NAT (Network Address Translation) e ARP (Address Resolution Protocol), por exemplo.
  Diferentemente da camada de __rede__, que envolve a parte lógica da comunicação pela internet, a camanda de __enlace__ tem relação com a parte física. E nessa camada que será definida a tecnologia usada na comunicação e seus respectivos protocolos: Wi-Fi (onda de rádio), Ethernet (cabeada), etc.


2. Qual a diferença entre adotar uma solução proprietária como o sistema operacional Windows quando comparado a adoção de uma solução OpenSource como o sistema operacional Ubuntu? Quais seriam os pontos negativos e positivos de cada abordagem?

> Resposta:
  O Sistema Operacional Windows é bastante conhecido e popular entre usuários _desktop_. Ele é projetado para ser de fácil uso e não necessitar conhecimento aprofundado em coputação, o que torna certas tarefas mais práticas de se executarem. Além disso, é um sistema pago e que, portanto, tende a oferecer um serviço de suporte mais dedicado aos clientes. Por se tratar de uma solução proprietária, é mais difícil aplicar modificações e adaptações nesse SO, pois não é dada muita liberdade aos usuários para tal.
  O Ubuntu, por sua vez, é um sistema de código aberto e, consequentemente, gratuito. Apesar de exigir um conhecimento mais aprofundado na área de computação para ser usado e não haver um serviço pago de suporte técnico, é possível encontrar muitas soluções online ou em conversas por fórums, uma vez que a comunidade que o utiliza é bastante ativa e interessada em ajudar. Diferentemente do Windows, o Ubuntu permite mais alterações no SO, tornando-o flexível a adaptações quando necessárias.


3. O que seria um projeto OpenSource? Como empresas podem adotar tais tecnologias e o que isso acarreta?

> Resposta: 
  Como o próprio termo indica, um projeto _OpenSource_ (Código Aberto) tem seu código fonte disponível para quem quiser modificá-lo ou participar da implementação de novas funcionalidades. Esse tipo de projeto tem se tornado cada vez mais comum entre desenvolvedores e, por ser de acesso público, esse estilo de projeto, quando popularizado, tende a crescer e ser aprimorado rapidamente.
  Algumas formas com as quais as empresas podem adotar projetos _OpenSoure_: 
  > + Através do uso interno desse tipo de ferramenta. 
  > + Ajudando no desenvolvimento do mesmo através do fornecimento de recursos como, por exemplo, desenvolvedores. 
  > + Lançando suas próprias ferramentas e formando comunidades para os projetos, ajudando a democratizar determinadas áreas da tecnologia.


## Etapa Prática

1. Fibonacci
    
    + Criar uma função em sua linguagem preferida. A função deve receber um numero N >= 0 (deve validar o input para a função), e retornar o valor correspondente desse número na sequencia fibonnaci. EX. fib(0) =0; fib(1) = 1; fib(2) = 1; fib(3) = 2; fib(5) = 5; fib(6) = 8.
    + Criar uma função recursiva que resolva _Fibonacci_
    + Criar uma função linear que resolva _Fibonacci_

> Resposta: Para esse desafio foi criado o projeto de nome _Fibonacci_ visto no repositório. Na Main do projeto estão implementadas as abordagens da sequência de Fibonacci tanto na versão linear quanto na recursiva (a ser escolhida pelo usuário).

2. Números Primos
    
    + Criar uma função em sua linguagem preferida. A função deve receber um numero N > 1 (validar o input), e retornar todos os números primos até o numero N. EX. p(2) = [2]; p(3) = [2, 3]; p(10) = [2, 3, 5, 7];
    + Criar uma função recursiva que resolva _p_
    + Criar uma função linear que resolva _p_
    
> Resposta: Para o desafio da Lista de Números Primos foi criado o projeto de nome _ListaNumerosPrimos_ visto no repositório. Na Main deste projeto encontram-se as implementações da versão linear e recursiva do desafio proposto (a ser escolhida pelo usuário).
