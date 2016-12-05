# Lista2-JAVA-ProgI
Exercicios da Lista 2 - Programação I



FACULDADE AVANTIS (Credenciamento portaria MEC N. 1.146, Publicada no D.O.U de 13/09/2012)
Av. Marginal Leste, n. 3600, KM 132 – Bairro dos Estados – Balneário Camboriú – SC CEP 88.339-125 – Tel. (47) 3363 0631


www.avantis.edu.br




LISTA DE EXERCÍCIOS 2 - JAVA BÁSICO




Observações:

•A linguagem convencionada para o desenvolvimento desta atividade é Java.

•Os arquivos com código fonte (arquivos com extensão .java) deverão ser compactados e enviados na atividade corresponde aberta no Edmodo. Não serão considerados trabalhos entregue fora do prazo ou enviado por outros meios.

•Recomenda-se a utilização do IDE Eclipse para o desenvolvimento da atividade, no entanto, poderá se utilizar qualquer IDE.

•Favor não enviar os arquivos compilados (arquivos com extensão .class). O objetivo desta lista é praticar a implementação em estruturas de repetição na linguagem Java. Sendo assim, utilizando-se dos conceitos discutidos em aula, resolva as seguintes questões:




1)O jogo da forca é um jogo em que o jogador tem que acertar qual é a palavra proposta, tendo como dica o número de letras e o tema ligado à palavra. A cada letra errada, é desenhada uma parte do corpo do  enforcado.  O jogo  termina  ou  com  o  acerto  da  palavra  ou  com  o  término  do  preenchimento  das partes corpóreas do enforcado. Você deve digitar no teclado letras que acredita que a palavra escondida possui. Caso a letra não exista nessa palavra, desenha-se uma parte do corpo (iniciando pela cabeça, tronco,  braços e  pernas). Mas  cuidado!  Você  só  tem  6 chances  de  errar. No  desenvolvimento  deste jogo, é trivial a utilização de matrizes para guardar os valores. No entanto, aqui neste exercício, será utilizado o método charAt(int index) para obter o valor de uma   posição   da   palavra (não   será   implementado utilizando matrizes), e o método length() para saber o  tamanho  da  palavra, sendo  que ambos são  métodos da  classe String(mais  detalhes  sobre  os  métodos  da classe String pode ser vistos em http://goo.gl/OdBKSo). Para facilitar um pouco, vamos definir um único tema, nome de heróis da Marvel.


1. O nome  de  cada  personagem  deverá  ser  atribuído à  um número,  onde  também  deverá  ser  utilizado  a  Classe 
Random para  realizar  um  sorteio  aleatório  da palavra  (nome  do  personagem)  para  inicializar  a  jogada.
Lembre-se  que  é  necessário  também apresentar para o jogador as letras por ele utilizado.
1 https://pt.wikipedia.org/wiki/Universo_Marvel


2) Pensando  em  jogos  decomputadores,  nos  primórdios  (isso  no final da década de 70) haviam jogos para computadores domésticos eram   baseados   em   interações   textuais (ou jogos   em   texto). Aparecem  então  os  jogos  de  aventura  nos  quais  o computador responde a palavras digitadas. O pioneiro desses jogos foi Zork, de 1979. A ideia básica do jogo era: existe um mapa (de uma fortaleza, de uma cidade etc.) e o jogador começa em certo ponto desse mapa. Para se movimentar, pode digitar direções (ir para o norte, o sul, à direita  etc.)  e  ainda  digitar  ordens.  Uma  ação  típica interação  do jogo seria:


PC > Você está em uma sala escura.

Jogador > Vá para o norte.

PC > Parede.

Jogador > Vá para o leste.

PC > Existe uma porta fechada.

Jogador > Abra a porta.

PC > Você vê um bosque, com uma estrada que leva a uma clareira.

E assim por diante... 

Para resolver o jogo era necessário percorrer todo o mapa, evitando os perigos (no caso de você incorrer em algo mortal, como cair em um abismo, o jogador voltava a um ponto anterior), encontrar tesouros e esclarecer eventuais mistérios. A linguagem pode ter até cerca de 80 comandos,  entre  verbos,  direções.  Zork2 é  jogo  de  aventura  e  pode  envolver  puzzles  simples.  Não 
existe exigência de destreza. Já jogos como Larry 3 mudam isso: tratase ainda de resolver mapas por meio de comandos de texto, mas existe um avatar do jogador que se move em um cenário 2D, de quem se pode exigir que se apresse para chegar a um ponto ou para fugir de alguma coisa etc. Quem é fã da série Big  Bang  Theory deve  se  lembrar  de  um  episódio  na  quarta  temporada  (The  Irish  Pub Formulation)  onde  o  personagem  Sheldon  Cooper  está  entretido  com  um adventure de  texto  que, segundo ele, “roda no chip gráfico mais poderoso do mundo: nossa imaginação!”. Sabendo disso, vamos desenvolver nossa versão do jogo Zork.


Para isso, considerei o seguinte cenário:


•As mensagens do jogo serão valores atribuidos à constantes;

•O valor da última interação deverá ser guardada para caso o jogador morra possa resurgir na interação anterior a sua morte;

•O mapa do jogo será a seguinte constante (do tipo String) que deverá ser inicializada no inicio do jogo. Essa constante deverá ter pelo menos 20 posições. Os valores para constantes deverá obedecer ao seguinte padrão (pode-se repetir o uso de um valor o quanto for necessário):

o “a” nada a sua frente;

o “b” você encontrou um Troll (Trolls são monstros inimigos);

o “c” você encontrou um tesouro;

o “d” você caiu de um abismo;

o “e” você foi devorado por um monstro;

o “f” você está em uma sala escura;

o “g” você precisa usar o punhal;

o “h” você deve cortar com o machado;

o “i” uma escada a sua frente;

o “j” um baú a sua frente;

o “l” você encontrou um machado;

o “m” você vê um punhal no chão;

o “n” você encontrou uma corda no chão;

o ”o” você encontrou um isqueiro no chão;

o “p” existe uma porta fechada;

o “q” você entrou em uma sala cheia de mortais Grues (eles só atacam suas vítimas no escuro);

o “r” você entrou em uma sala cheia de mortais Gornies (eles só atacam suas vítimas no claro);

o “s” você vê um bosque, com uma estrada que leva a uma clareira;

o “t” você vê um chalé;

o “u” você vê um descampado;

o “v” parede;

o “x” você encontra uma mortal Orc;

o “z” você encontra uma Muse Elf;



• O  personagem  do  jogo  deverá  ter  um  inventário  onde  são  adicionados  os  itens  que  ele  vai adquirindo (seu personagem poderá ter no máximo 3 itens com ele), esse inventário também será  um  String,  obecendo  a  seguinte  ordem  (cabe  lembrar  que  o  personagem  inicia  o  jogo somente com uma lanterna de bronze e uma espada élfica):


o “l” lanternar de bronze acesa;

o “a” lanterna de bronze apagada;

o “e” espada élfica;

o “m” machado da morte;

o “p” punhal Ajanti;

o “c” corda;

o “i” isqueiro;


Além  disso,  o  jogo  deve  entender  alguns  verbos  comuns,  como “pegar”, “dropar”, “examinar”, “atacar”, “subir”, “descer”, “abrir”, “fechar”, “usar”, e  dentre  outros  que  forem  necessário. O  jogo deve terminar quando o jogador encontrar os 5 tesouros (no jogo original são 20) ou quando o jogador perder  3  desafios  mortais. Vale  lembrar  que  você  pode  adicionar  mais  itens  e  interações  no  jogo. Divirta-se e use e abuse de sua imaginação para o desenvolvimento deste jogo.



3) Vamos desenvolver um Jogo Adivinhação, você deve apresentar uma mensagem para o jogador dizendo que ele deve escolher um número de 1 a 10 para ele adivinhar. O jogador tem 3 chances para  adivinhar  o  número  que  foi  escolhido  aleatoriamente  pelo computador. Quando  o  jogo  terminar,  você  deve  perguntar  ao jogador se ele quer jogar novamente.
