import java.util.Scanner;
import java.util.Random;

public class HistoriaRPGSemTempo {
	
	/* INÍCIO FUNÇÕES GLOBAIS */
	public static int vidaUsuario = 85;
	public static int danoUsuario = 20;
	public static int armaduraUsuario = 0;
	public static int ouro = 50;
	public static int potion = 0;
	public static String maoEsquerda = "Graveto";
	public static String auxiliarString = "";
	public static String maoDireita = "Graveto";
	public static String armadura = "Pijama";
	public static String[] inventario = { "Vazio", "Vazio", "Vazio" };
	public static String nomeInimigo = "";
	public static String[][] m = new String[20][20];
	public static int linha = 0;
	public static int coluna = 0;
	public static String[][] localizacao = new String[20][20];
	public static String nomeUsuario = "";
	public static String companion = "";
	public static int gameOver = 0;

	public static int decisaoInt = 0;
	public static String decisaoString = "";

	public static int[] inimigoMorto = { 0, 0, 0, 0, 0, 0, 0, 0 };
	public static int tesouro1 = 1;
	public static int tesouro2 = 1;
	public static int tesouro3 = 1;
	public static int tesouro4 = 1;
	/* FIM FUNÇÕES GLOBAIS */
	
	/* INÍCIO MAIN */
	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bem vindo ao formidável RPG da Loba Enterprise!");
		System.out.println("Para maiores informações, acesse: www.lobaenterprise.com.br");
		System.out.println("\n\n");
		System.out.println("▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒");
		System.out.println("▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▄░░▒▒▒▒▒");
		System.out.println("▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██▌░░▒▒▒▒");
		System.out.println("▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░▄▄███▀░░░░▒▒▒");
		System.out.println("▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░█████░▄█░░░░▒▒");
		System.out.println("▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░▄████████▀░░░░▒▒");
		System.out.println("▒▒░░░░░░░░░░░░░░░░░░░░░░░░▄█████████░░░░░░░▒");
		System.out.println("▒░░░░░░░░░░░░░░░░░░░░░░░░░░▄███████▌░░░░░░░▒");
		System.out.println("▒░░░░░░░░░░░░░░░░░░░░░░░░▄█████████░░░░░░░░▒");
		System.out.println("▒░░░░░░░░░░░░░░░░░░░░░▄███████████▌░░░░░░░░▒");
		System.out.println("▒░░░░░░░░░░░░░░░░░░░░░▄███████████▌░░░░░░░░▒");
		System.out.println("▒░░░░░░░░░░░░░░░▄▄▄▄██████████████▌░░░░░░░░▒");
		System.out.println("▒░░░░░░░░░░░▄▄███████████████████▌░░░░░░░░░▒");
		System.out.println("▒░░░░░░░░░▄██████████████████████▌░░░░░░░░░▒");
		System.out.println("▒░░░░░░░░████████████████████████░░░░░░░░░░▒");
		System.out.println("▒█░░░░░▐██████████▌░▀▀███████████░░░░░░░░░░▒");
		System.out.println("▐██░░░▄██████████▌░░░░░░░░░▀██▐█▌░░░░░░░░░▒▒");
		System.out.println("▒██████░█████████░░░░░░░░░░░▐█▐█▌░░░░░░░░░▒▒");
		System.out.println("▒▒▀▀▀▀░░░██████▀░░░░░░░░░░░░▐█▐█▌░░░░░░░░▒▒▒");
		System.out.println("▒▒▒▒▒░░░░▐█████▌░░░░░░░░░░░░▐█▐█▌░░░░░░░▒▒▒▒");
		System.out.println("▒▒▒▒▒▒░░░░███▀██░░░░░░░░░░░░░█░█▌░░░░░░▒▒▒▒▒");
		System.out.println("▒▒▒▒▒▒▒▒░▐██░░░██░░░░░░░░▄▄████████▄▒▒▒▒▒▒▒▒");
		System.out.println("▒▒▒▒▒▒▒▒▒██▌░░░░█▄░░░░░░▄███████████████████");
		System.out.println("▒▒▒▒▒▒▒▒▒▐██▒▒░░░██▄▄███████████████████████");

		// Thread.sleep(3000);

		System.out.println("\n");

		System.out.println("Esse jogo é baseado em decisões. Todas as suas escolhas possuem consequências.");

		System.out.print("Por favor, digite o seu nome: ");
		nomeUsuario = sc.nextLine();

		/* INÍCIO INTRODUÇÃO */
		System.out.println("\n");
		System.out.println("Você é um humano comum, vivendo pacificamente em seu vilarejo.");
		// Thread.sleep(3000);

		System.out.println("Possuindo uma bela casa, um belo campo de cultivo, tendo tudo para viver uma pacata vida.");
		// Thread.sleep(6000); /* 8000 */
		System.out.println(
				"Todos no vilarejo conhecem você, sendo conhecido como uma pessoa totalmente solitária,\nsem muito o que querer da vida, sem nunca ter saído nem mesmo do condado.");
		// Thread.sleep(10000);
		System.out.println(
				"Você, " + nomeUsuario + ", é uma pessoa digna de confiança, que sempre foi ensinada a ser honesta.");
		System.out.println("\n");
		// Thread.sleep(5000);

		System.out.println("O reino onde você vive está sob o domínio do grandioso Rei Elvis.");
		// Thread.sleep(5000);
		System.out.println(
				"O vilarejo é pequeno, onde todos se conhecem. Toda a atenção da cidade é baseada na Taverna do Centauro,\nlocalizada bem ao centro do vilarejo.");
		// Thread.sleep(6000);
		System.out.println(
				"Além da Taverna, o vilarejo consta com outras pequenas lojas que atendem as necessidades de seus vilões.");
		// Thread.sleep(6000); /* 8000 */
		System.out.println(
				"Na taverna e em grandes festivais que ocorrem normalmente no solstício de verão,\né comum escutar histórias sobre maldições, dragões e seres demoníacos.");
		// Thread.sleep(6000);

		System.out.println("\n");
		System.out.println(
				"E foi assim que você cresceu, ouvindo essas histórias, fantasiando sobre o mundo... \n...Mas nunca saindo de dentro do condado.");
		System.out.println("\n");
		// Thread.sleep(6000);

		System.out.println("Mesmo sendo considerado uma pessoa tranquila, que nunca fez nada de mais.");
		// Thread.sleep(2000);
		System.out.println("Você se orgulha disso. Se orgulha da sua terra e dos seus frutos cultivados.");
		// Thread.sleep(4000);
		System.out.println("E hoje é apenas mais um dia comum, dentro da sua rotina.");
		// Thread.sleep(2000);
		System.out.println("\n\n");
		System.out
				.println("Você está descansando em sua cadeira de balanço, ouvindo o criptar do fogo em sua lareira.");
		// Thread.sleep(6000);
		System.out.println("Fumando um belo cachimbo e pensando em quão bom será o dia de amanhã.");
		// Thread.sleep(6000);
		System.out.println(
				"Quando você está prestes a dormir, você começa a escutar um pequeno jegue fazendo estardalhaço se aproximando de sua casa.");
		// Thread.sleep(6000);
		System.out.println("\n");
		System.out.println(
				"Um leve pensamento de revolta começa a passar pela sua cabeça,\npois qual seria a razão de alguém sair por aí a essa hora da noite?");
		// Thread.sleep(6000);

		System.out.println("...");
		// Thread.sleep(1000);
		System.out.println("TOC TOC.");
		// Thread.sleep(2000);
		System.out.println("TOC TOC TOC!");
		// Thread.sleep(2000);
		System.out.println("TOC TOC TOC TOC! TOC TOC TOC TOC!");
		// Thread.sleep(3000);

		System.out.println(
				"\nVocê se levanta com raiva e vai em direção a sua porta para tentar entender o que diabos está acontecendo.");
		// Thread.sleep(5000);
		System.out.println(
				"Ao abrir a porta você se depara com um homem alto, vestido em um couro envelhecido, com as botas toda enlamaçada.");
		// Thread.sleep(5000);
		System.out.println("\n");

		System.out.println("Você o encara por um momento e fala rabujentamente:");
		// Thread.sleep(2000);
		System.out.println(nomeUsuario + ": Boa Noite.");
		// Thread.sleep(2000);
		System.out.println(
				"Axel: Que queres dizer? Desejas-me uma boa noite, ou queres dizer que está uma boa noite,\nquer eu o queira, quer não? Ou que te sentes bem está noite?\nOu que é uma noite para ser bom?");
		// Thread.sleep(12000);
		System.out.println(nomeUsuario + ": Tudo isso de uma vez, eu acho.");
		// Thread.sleep(3000);
		System.out.println(nomeUsuario + ": Posso ajudá-lo?");
		// Thread.sleep(3000);
		System.out.println("Axel: Isso é o que veremos.");
		// Thread.sleep(3000);
		System.out.println("Axel: Meu nome é Axel, e estou procurando alguém para uma aventura.");
		// Thread.sleep(3000);
		System.out.println(nomeUsuario
				+ ": Uma aventura? Não... Não consigo imaginar ninguém neste condado que tenha algum interesse em aventuras.");
		// Thread.sleep(6000);
		System.out.println(nomeUsuario + ": Aventuras são coisas perigosas, desagradáveis e desconfortáveis.");
		// Thread.sleep(2000);
		System.out.println(nomeUsuario + ": E além do mais, fazem nos atrasar para o jantar.");
		// Thread.sleep(2000);
		System.out.println("Axel: Não lhe proponho apenas ouro, pense que estou te proponto uma mudança de vida.");
		// Thread.sleep(5000);
		System.out.println("Axel: Se você aceitar vir comigo, saiba que a sua vida nunca mais será a mesma.");
		// Thread.sleep(5000);
		System.out
				.println("Axel: Você nunca pensou em mudar de vida? Sair um pouco do condado? Conhecer novos lugares?");
		// Thread.sleep(5000);
		System.out.println("Axel: Saiba que eu estou te propondo riquezas inimigináveis!");
		// Thread.sleep(2000);
		System.out.println("\n");
		/* FIM INTRODUÇÃO */

		System.out.println("Ei, " + nomeUsuario);
		// Thread.sleep(2000);

		main: while (true) {
			System.out.println("Deseja ir nessa aventura com o Axel? Deixar todo o condado para trás? ( S ou N )");
			System.out.print("Resposta: ");
			decisaoString = sc.nextLine();
			decisaoString = decisaoString.toUpperCase();

			/* INÍCIO PIRATA */
			if (decisaoString.startsWith("S")) {
				companion = "Axel";

				// Thread.sleep(1000);
				System.out.println(nomeUsuario + ": E exatamente O QUE seria essa tal aventura?");
				// Thread.sleep(2000);
				System.out.println(
						"Axel: Primeiramente, eu estarei te colocando como membro-fundador de nossa pequena companhia");
				// Thread.sleep(2000);
				System.out.println(nomeUsuario + ": Companhia?");
				// Thread.sleep(1000);
				System.out.println(
						"Axel: Considere-se um caçador de tesouros, por assim dizer... Logo, é bom legalizar as coisas...");
				// Thread.sleep(5000);
				System.out.println(nomeUsuario + ": Mas como assim? Você me parece ser um pirata!");
				// Thread.sleep(2000);
				System.out.println("Axel: E é isso mesmo! Sou um pirata, um contrabadista, um sequestrador etc");
				// Thread.sleep(2000);
				System.out.println(
						"Axel: Mas como eu não quero que aconteça o que me aconteceu recentemente, legalizaremos as coisas");
				// Thread.sleep(6000);
				System.out.println(nomeUsuario + ": Então... você foi roubado, é isso?");
				// Thread.sleep(3000);
				System.out.println(
						"Axel: Mais ou menos isso, mas só vou poder te contar mais se você assinar o contrato");
				// Thread.sleep(6000);

				System.out.print("Assinatura: ");
				decisaoString = sc.nextLine();

				System.out.println("\n");
				System.out.println(
						"-------------------------------------------------------------------------------------");
				System.out.println(
						"|                     Contrato de Adesão à Companhia ROSES                          ");
				System.out.println(
						"|                                                                                   ");
				System.out.println(
						"|       A companhia ROSES tem por finalidade desvendar todos os mistérios que       ");
				System.out.println(
						"|       Estão atrás do 'ARTEFATO', e por meio deste contrato fica afirmado que      ");
				System.out.println(
						"|       Todos os membros-fundadores tem direito a uma porcentagem igual de todos    ");
				System.out.println(
						"|       Os tesouros adquiridos durante essa empreitada.                             ");
				System.out.println(
						"|       Caso haja o falecimento de um membro fundador, o tesouro que este tinha     ");
				System.out.println(
						"|       Direito passa a ser repartido para todos os demais membros-fundadores.      ");
				System.out.println(
						"|                                                                                   ");
				System.out.println(
						"|       Fundador: AXEL														        ");
				System.out.println(
						"|                                                                                   ");
				System.out.println("|       Membro-Fundador: " + decisaoString);
				System.out.println(
						"|                                                                                   ");
				System.out.println(
						"-------------------------------------------------------------------------------------");
				// Thread.sleep(10000);
				System.out.println("\n");
				System.out.println("Axel: Bom, então parece que está tudo certo...");
				// Thread.sleep(2000);
				System.out.println(nomeUsuario + ": Então pode me contar do que se trata toda essa questão?");
				// Thread.sleep(3000);
				System.out.println("Axel: Ah, claro, bom... ");
				// Thread.sleep(2000);
				System.out.println("Axel: Vamos pelo começo...");
				// Thread.sleep(2000);
				System.out.println("Axel: Eu fazia parte de uma sociedade secreta chamada 'Unidos do Artefato'");
				// Thread.sleep(2000);
				System.out.println(nomeUsuario
						+ ": Ah, então, pera, eu acabei de ser membro-fundador de uma daquelas coisas de lunáticos?");
				// Thread.sleep(6000);
				System.out.println(nomeUsuario + ": Daqueles que usam chapéu de metal e tudo o mais?");
				// Thread.sleep(2000);
				System.out.println("Axel: Como ousa?! Nós somos sérios! Fazemos parte de uma tradição centenária!");
				// Thread.sleep(2000);
				System.out.println("Axel: Bem... Quero dizer, fazia... Pois acabei sendo expulso...");
				// Thread.sleep(2000);
				System.out.println(nomeUsuario
						+ ": Hahahahaha! Como conseguiu ser expulso de uma coisa tão ridícula quanto essa?");
				// Thread.sleep(2000);
				System.out.println("Axel: OLHA AQUI! Me leve a sério!");
				// Thread.sleep(2000);
				System.out.println("Axel: Essa sociedade está enraizada em diversos reinos!");
				// Thread.sleep(3000);
				System.out.println(
						"Axel: Nós acreditamos que existam alguns artefatos que possam nos dar acesso a outra dimensão...");
				// Thread.sleep(6000);
				System.out.println("Axel: E eu encontrei um desses!");
				// Thread.sleep(2000);
				System.out.println(nomeUsuario + ": Então você realmente acredita nessas baboseiras, né?");
				// Thread.sleep(2000);
				System.out.println(
						"Axel: Eu só não vou embora pelo fato de você já ter assinado esse contrato! Mas que coisa!");
				// Thread.sleep(6000);
				System.out.println("Axel: Enfim, nós temos um líder, digo, eu tinha... Enfim, o Adolfo.");
				// Thread.sleep(2000);
				System.out.println("Axel: Eu nunca gostei muito das ideias revolucionárias dele, de querer unificar");
				// Thread.sleep(2000);
				System.out.println("Axel: Todos os reinos em prol dos artefatos...");
				// Thread.sleep(2000);
				System.out.println(
						"Axel: Então eu queria ir em busca dos meus ideias! De que apenas aqueles que acreditaram");
				// Thread.sleep(6000);
				System.out.println("Axel: E apoiaram a busca do artefato conseguissem ter acesso a outra dimensão!");
				// Thread.sleep(2000);
				System.out.println(nomeUsuario + ": No meu ponto de vista, quem tem os ideais meio... É você");
				// Thread.sleep(2000);
				System.out.println("Axel: Enfim, estava tudo certo... Até a minha namorada me roubar!");
				// Thread.sleep(2000);
				System.out.println(nomeUsuario + ": Ha! Sempre as mulheres!");
				// Thread.sleep(2000);
				System.out.println("Axel: Sim! Ela queria vender esse artefato que eu consegui!");
				// Thread.sleep(2000);
				System.out.println(nomeUsuario + ": E ela conseguiu?");
				// Thread.sleep(2000);
				System.out.println("Axel: Bom, parece que o destino foi generoso comigo e... Alguém também a roubou!");
				// Thread.sleep(6000);
				System.out.println(nomeUsuario + ": Então parece que esse artefato é bem disputado, ein?");
				// Thread.sleep(2000);
				System.out.println("Axel: Enfim, vamos indo? Está tendo uma confraternização na Taverna do Minotauro");
				// Thread.sleep(3000);
				System.out.println("Axel: Lá é o melhor lugar para se conseguir alguma informação");
				// Thread.sleep(2000);
				System.out.println("...");
				// Thread.sleep(3000);

				/* INÍCIO TAVERNA - PIRATA */
				taverna: while (true) {
					System.out.println("Engraçado como o seu dia mudou rapidamente...");
					// Thread.sleep(2000);
					System.out.println("Com apenas uma única visita de um estranho você se sente preso a um maluco");
					// Thread.sleep(6000);
					System.out
							.println("Indo para uma aventura sobre algo que você não faz a mínima ideia de que seja.");
					// Thread.sleep(6000);
					System.out.println("E agora aqui estão vocês, chegando no centro da cidade.");
					// Thread.sleep(2000);
					System.out.println(
							"Era possível ouvir de longe uma pequena festança que ocorria na Taverna do Centauro.");
					// Thread.sleep(6000);
					System.out
							.println("Do lado de fora, acima da porta de entrada era possível ver a placa da Taverna.");
					// Thread.sleep(6000);
					System.out.println(
							"A Taverna do Centauro é famosa em todo o reino devido\na sua placa de um centauro com um grande volume em suas calças.");
					// Thread.sleep(6000);
					System.out.println("Ninguém ao certo sabe dizer o que isso significa.");
					// Thread.sleep(2000);
					System.out.println(
							"Quando vocês entram na taverna, vocês se deparam com umo bacanal que estava ocorrendo no lugar.");
					// Thread.sleep(6000);
					System.out.println(nomeUsuario + ": Mas que porra é essa?");
					// Thread.sleep(2000);
					System.out.println("Axel: Obviamente é umo bacanal. Nunca viu?");
					// Thread.sleep(2000);
					System.out.println("...");
					// Thread.sleep(2000);
					System.out.println("No balcão estava o Afonso, o centauro, o dono do estabelecimento.");
					// Thread.sleep(3000);
					System.out.println("Afonso estava orgulhosamente servindo hidromel para a sua clientela,");
					// Thread.sleep(2000);
					System.out.println("De modo que o bacanal ficava cada vez mais animado.");
					// Thread.sleep(2000);
					System.out.println("...");
					// Thread.sleep(2000);
					System.out.println("Axel: Grande Afonso! Como está a vida, meu chefe?");
					// Thread.sleep(2000);
					System.out.println("Afonso: Axel! Velho amigo! Como está essa vida?");
					// Thread.sleep(2000);
					System.out.println("Afonso: Deve ser muito bom viver da desgraça alheia, não é?");
					// Thread.sleep(2000);
					System.out.println("Axel: Bom, digamos que a minha é que está desgraçada agora...");
					// Thread.sleep(2000);
					System.out.println("Afonso: Mas e aí, quem é esse seu amigo?");
					// Thread.sleep(2000);
					System.out.println("Axel: Ah, esse é " + nomeUsuario);
					// Thread.sleep(2000);
					System.out.println("Axel: Está me ajudando a ir atrás de uma coisa minha que me foi roubada");
					// Thread.sleep(6000);
					System.out.println(nomeUsuario + ": Opa! Fala chefia!");
					// Thread.sleep(2000);
					System.out.println("Afonso: Ele não é daqui, né?");
					// Thread.sleep(2000);
					System.out.println("Axel: Não se preocupe com ele... Mas enfim, Afonso, preciso de informações...");
					// Thread.sleep(3000);
					System.out.println(
							"Afonso: Ih... Isso não é comigo, recomendo que você ou participe do bacanal ou fale com a Cassandra");
					// Thread.sleep(6000);
					System.out.println("Axel: Putz, não curto muito essas loucuras... Ei, " + nomeUsuario
							+ ", tenta descobrir algo aí");
					// Thread.sleep(4000);
					System.out.println("\n");

					escolhaTaverna: while (true) {
						System.out.println("Digite 1 para participar do Bacanal.");
						System.out.println("Digite 2 para falar com a Cassandra.");
						System.out.print("Opção: ");
						decisaoInt = sc.nextInt();
						/* INÍCIO BACANAL - TAVERNA - PIRATA */
						if (decisaoInt == 1) {
							System.out.println("\n");
							System.out.println("No meio do rale e rola você decide descansar um pouco");
							// Thread.sleep(2000);
							System.out.println("A princípio ninguém sou lhe dizer nada sobre esse tal artefato");
							// Thread.sleep(2000);
							System.out.println(
									"Ao ir verificar os seus pertences, você vê que todo o ouro que estava guardado contigo foi roubado.");
							// Thread.sleep(6000);
							System.out.println(
									nomeUsuario + ": COMO ASSIM ROUBARAM O MEU OURO?! Era todo o ouro que eu tinha!");
							// Thread.sleep(6000);

							ouro = 0;

							System.out.println("Seu ouro atual: " + ouro);

							// Thread.sleep(2000);
							System.out.println("\n");
							System.out.println("Deseja ir atrás do ouro que lhe foi roubado? ( S ou N )");
							System.out.print("Resposta: ");
							decisaoString = sc.next();
							decisaoString = decisaoString.toUpperCase();

							/*
							 * INÍCIO BUSCA PELA BOLSA DE OURO - BACANAL -
							 * TAVERNA
							 */
							if (decisaoString.startsWith("S")) {
								// Thread.sleep(2000);
								System.out.println("Você faz o maior alvoroso dentro da taverna.");
								// Thread.sleep(2000);
								System.out.println(
										"Começa a perguntar a todos se alguém flagrou algum outro ser mexendo em suas coisas.");
								// Thread.sleep(6000);
								System.out.println(nomeUsuario + ": Ei! Você com a flauta!");
								// Thread.sleep(2000);
								System.out.println("Flautista: Eu?");
								// Thread.sleep(2000);
								System.out.println(nomeUsuario
										+ ": Só tem você com uma flauta aqui. Por favor, você viu alguém mexendo em minhas coisas?");
								// Thread.sleep(6000);
								System.out.println("Flautista: Vi sim! Aquele minotauro ali estava fuçou um pouco");
								// Thread.sleep(2000);
								System.out.println(
										"Bom... 'aquele minotauro' nada mais era do que o dono da Taverna. O Afonso.");
								// Thread.sleep(4000);
								System.out.println("Afonso: OUSAS ME ACUSAR?!");
								// Thread.sleep(2000);
								System.out.println("\n");
								System.out.println("Ei, " + nomeUsuario + ", deseja confrontar o Afonso? (S ou N)");
								System.out.print("Resposta: ");
								decisaoString = sc.next();
								decisaoString = decisaoString.toUpperCase();

								if (decisaoString.startsWith("S")) {
									// Thread.sleep(2000);
									System.out.println(nomeUsuario
											+ ": Então foi você quem roubou todo o meu ouro! Quero um julgamento por combate!");
									// Thread.sleep(6000);
									System.out.println(
											"Afonso: HAHAHAHAHAHA! Você realmente deseja morrer assim... Tão jovem?");
									// Thread.sleep(2000);
									System.out.println("Afonso: Ei, Axel! Você devia cuidar melhor dos seus amigos!");
									// Thread.sleep(2000);
									System.out.println(
											"Sem mais nem menos, o Afonso pega um taco de sinuca, quebra de forma com que o taco acabe virando uma lança");
									// Thread.sleep(6000);
									System.out.println(
											"E sem que você possa reagir, ele corre em sua direção com o taco mirando em sua cabeça");
									// Thread.sleep(6000);
									System.out.println("\n");
									System.out.println("Você morreu.");
									// Thread.sleep(2000);
									System.out.println("\n");
									System.out.println("Check point: Taverna.");
									System.out.println("\n");
									// Thread.sleep(10000);
									continue taverna;
								} else {
									System.out.println(nomeUsuario + ": O que? Acusar o senhor? Jamais!");
									// Thread.sleep(2000);
									System.out.println(nomeUsuario + ": Esse Flautista está bêbado, simples assim...");
									// Thread.sleep(2000);
									System.out.println(nomeUsuario
											+ ": Muito obrigado por me proporcionar tamanha festa, seu Afonso!");
									// Thread.sleep(3000);
									System.out.println(nomeUsuario
											+ ": Afonso, por gentileza, poderia me informar quem é a Cassandra?");
									// Thread.sleep(3000);
									System.out.println("Afonso: É aquela anã logo ali, ó!");
									// Thread.sleep(2000);
									System.out.println(nomeUsuario + ": Aquilo não é um anão?");
									// Thread.sleep(2000);
									System.out.println(
											"Afonso: Hahahahaha! Você não sabia que as anãs também tem barba?");
									// Thread.sleep(5000);
									System.out.println(nomeUsuario + "Oh sim... Muito obrigado...");
									// Thread.sleep(3000);
									System.out.println(
											"Você sai o mais rapidamente o possível de perto do Afonso em direção à Cassandra.");
									// Thread.sleep(3000);
									break;
								}

							} /*
								 * FIM BUSCA PELA BOLSA DE OURO - BACANAL -
								 * TAVERNA
								 */
							else {
								System.out.println(nomeUsuario
										+ ": Que absurdo! A criminalidade nessa região está ultrapassando dos limites.");
								// Thread.sleep(3000);
								break;
							}
							/* FIM BACANAL - TAVERNA - PIRATA */
						} else if (decisaoInt != 1 && decisaoInt != 2) {
							System.out.println("Digite um comando válido.");
							// Thread.sleep(2000);
							continue escolhaTaverna;
						}
						break;
					}

					/* INÍCIO CASSANDRA - TAVERNA - PIRATA */
					System.out.println(nomeUsuario + ": Oi, por gentileza, você seria a Cassandra?");
					// Thread.sleep(3000);
					System.out.println("Cassandra: Sim, sou eu mesma! O que deseja?");
					// Thread.sleep(2000);
					System.out.println(nomeUsuario + ": Eu preciso de algumas informações sobre um tal artefato...");
					// Thread.sleep(3000);
					System.out.println("Cassandra: Ah, você é colecionador? Que amável!");
					// Thread.sleep(2000);
					System.out.println(
							nomeUsuario + ": Bom... Mais ou menos, sabe quem pode me apresentar ao mercado negro?");
					// Thread.sleep(6000);
					System.out.println("Cassandra: Sempre soube que arte rendia uma bela montanha de moedas de ouro");
					// Thread.sleep(6000);
					System.out.println(
							"Cassandra: Infelizmente não conheço ninguém que seja metido com essas coisas mas...");
					// Thread.sleep(3000);
					System.out.println(nomeUsuario + ": Mas...?");
					// Thread.sleep(2000);
					System.out.println("Cassandra: Bom, ele é um tanto quanto peculiar, assim como os seus clientes");
					// Thread.sleep(4000);
					System.out.println(nomeUsuario + ": Não importa, acho que só esse ser pode me ajudar");
					// Thread.sleep(3000);
					System.out.println(
							"Cassandra: Ele é conhecido como Elfo Fértil e é dono de um Sex Shop na Cidadela.");
					// Thread.sleep(4000);
					System.out.println("Cassandra: OH MEU DEUS! O Axel está aqui? Ele me deve 30 moedas de ouro!");
					// Thread.sleep(4000);
					System.out.println(nomeUsuario + ": Muito obrigado pelo seu tempo!");
					// Thread.sleep(2000);
					System.out.println(nomeUsuario + ": Axel! Pare de encher a cara! Já sei onde temos que ir!");
					// Thread.sleep(4000);
					/* FIM CASSANDRA - TAVERNA - PIRATA */
					break;
				}
				/* FIM PIRATA - TAVERNA */

				/* INÍCIO PIRATA - SEX SHOP */
				System.out.println("A cidadadela é o coração do reino.");
				// Thread.sleep(3000);
				System.out.println("Para você, " + nomeUsuario + ", isso era o máximo que você já havia ousado andar.");
				// Thread.sleep(4000);
				System.out.println("Praticamente um grande centro urbano, muito maior do que qualquer outro vilarejo.");
				// Thread.sleep(5000);
				System.out.println(
						"O lugar onde era possível se encotrar todas as raças e pessoas de todos os cantos do reino.");
				// Thread.sleep(6000);
				System.out.println("Bem ao centro da cidade ficava uma pequena mas luxuosa loja.");
				// Thread.sleep(4000);
				System.out.println("Com uma placa em formato de coração com orelhas élficas.");
				// Thread.sleep(3000);
				System.out.println("Era fácil saber que esse era o destino de toda essa viagem.");
				// Thread.sleep(3000);
				System.out.println("...");
				// Thread.sleep(3000);
				System.out.println("Axel: Eu devia já ter vindo direto falar com esse orelhudo...");
				// Thread.sleep(4000);
				System.out
						.println("Axel: Digamos que aqui seja o ponto de encontro das pessoas mais bizarras do reino.");
				// Thread.sleep(6000);
				System.out.println();
				System.out.println("...");
				// Thread.sleep(2000);
				System.out.println("Ao entrarem no Sex Shop, era possível ver diversos aparatos sexuais");
				// Thread.sleep(3000);
				System.out.println(
						"Mais ao fundo ficava o balcão, onde o Elfo Fértil estava atendendo um casal de gnomos.");
				// Thread.sleep(4000);
				System.out.println("...");
				// Thread.sleep(3000);
				System.out.println("Sid: Elfo Fértil, mas eu lhe imploro! Só você pode nos ajudar!");
				// Thread.sleep(3000);
				System.out
						.println("Nancy: Sim! Estamos a anos tentando ter um filho, por favor Elfo Fértil, nos ajude!");
				// Thread.sleep(4000);
				System.out.println("Elfo Fértil: Bom, vocês sabem que não é bem assim que as coisas funcionam...");
				// Thread.sleep(3000);
				System.out.println(
						"Elfo Fértil: Eu posso no máximo lhes dar alguns igredientes secretos mas infelizmente não é 100% garantido.");
				// Thread.sleep(6000);
				System.out.println(
						"Elfo Fértil: A menos que você, Nancy, queira que o seu filho seja meu... Já que né, não erro uma.");
				// Thread.sleep(4000);
				System.out.println(
						"Sid: Estou aqui pensando se ser você é algo bom ou uma maldição devido a quantidades de elfinhos.");
				// Thread.sleep(4000);
				System.out.println(
						"Elfo Fértil: Pense que nos dia do pai eu sou a pessoa mais presenteada desse reino hahaha.");
				// Thread.sleep(5000);
				System.out.println("Sid: Mas eu duvido qie você não tenha NADA que possa nos ajudar!");
				// Thread.sleep(3000);
				System.out.println("\n");
				System.out.println("Ei, " + nomeUsuario);
				// Thread.sleep(2000);
				System.out.println("Digite 1 para falar com o Elfo Fértil.");
				System.out.println("Digite 2 para falar com o casal de gnomo.");
				System.out.print("Opção: ");
				decisaoInt = sc.nextInt();

				System.out.println(nomeUsuario
						+ ": Boa noite, senhores! Desculpa vos interromper... Mas precisamos de uma informação");
				// Thread.sleep(6000);
				System.out.println("Axel: Não se preocupe, " + nomeUsuario + ", eu conheço esses gnomos!");
				// Thread.sleep(4000);
				System.out.println("Sid: Axel? Você ainda está vivo?!");
				// Thread.sleep(4000);
				System.out.println("Nancy: Mas que surpresa!");
				// Thread.sleep(3000);
				System.out.println("Sid: Desculpe, Elfo Fértil, logo mais voltaremos a falar com o senhor");
				// Thread.sleep(3000);
				System.out.println("Elfo Fértil: Tudo bem, estarei a disposição");
				// Thread.sleep(3000);
				System.out.println("Axel: Vocês tiveram notícias do Adolfo?");
				// Thread.sleep(3000);
				System.out.println("Sid: Sim sim! Ele esteve lá em casa conversando com a nossa filha");
				// Thread.sleep(3000);
				System.out.println("Axel: Filha? Como assim filha?");
				// Thread.sleep(3000);
				System.out.println(
						"Nancy: Ah, é que bom... Estamos passando por um pequeno problema para ter filhos... Então... Bem...");
				// Thread.sleep(6000);
				System.out.println(nomeUsuario + ": Oh sim... Agora entendi o Elfo Fértil...");
				// Thread.sleep(4000);
				System.out.println("Axel: Certo, ok, mas e o Adolfo?");
				// Thread.sleep(3000);
				System.out.println(
						"Sid: Ele apareceu esses dias para tomar uma xícara de chá e falar sobre uma aventura que ele ia fazer");
				// Thread.sleep(6000);
				System.out.println(
						"Nancy: E pensar que esse pessoal do seu grupinho era fã de aventuras, ein Hahahahaha");
				// Thread.sleep(4000);
				System.out.println(
						"Axel: É, o único que era mais aventureiro era eu... Por questões de negócio, é claro");
				// Thread.sleep(5000);
				System.out.println(
						"Sid: Pois então! Você é o primeiro pirata que eu vejo se misturar com essas pessoas que pasasm a vida lendo livros!");
				// Thread.sleep(6000);
				System.out.println("Axel: Mas o Adolfo deixou alguma coisa com vocês? Falou algo sobre um artefato?");
				// Thread.sleep(4000);
				System.out.println("Nancy: Artefato? Não... Mas bem, deve ter falado algo com a nossa filha");
				// Thread.sleep(3000);
				System.out.println("Sid: Vamos lá em casa, aí vocês podem ver direitinho com ela!");
				// Thread.sleep(3000);
				System.out.println(nomeUsuario + ": Olha... Seria muito bem vindo uma xícara de chá");
				// Thread.sleep(3000);
				System.out.println("Nancy: Não seja abusado, humano!");
				// Thread.sleep(2000);
				System.out.println(nomeUsuario + ": Mas... vocês comentaram sobre. Ok, desculpe :(");
				// Thread.sleep(2000);
				System.out.println("...");
				// Thread.sleep(2000);
				System.out.println(
						"No caminho em direção a casa do casal de gnomos, Sid & Nancy foram contando a história de vida deles, de como se conheceram.");
				// Thread.sleep(6000);
				System.out.println(
						"O único desejo de vida deles era ter um bebê, depois que resgataram uma humana que estava em apuros e quase morrendo.");
				// Thread.sleep(6000);
				System.out.println("Os dois criaram uma afinidade com a paternidade após terem que ser os " + "pais"
						+ " dessa humana.");
				// Thread.sleep(6000);
				System.out.println("...");
				// Thread.sleep(2000);
				System.out.println("Sid: QUERIDA! Cheguei!");
				// Thread.sleep(2000);
				System.out.println("Nancy: Abdalah, temos visitas!");
				// Thread.sleep(2000);
				System.out.println("Abdalah: Oi! Estava orgaizando algumas coisas.");
				// Thread.sleep(2000);
				System.out.println("Abdalah: Quem são esses, Nancy?");
				// Thread.sleep(2000);
				System.out.println(nomeUsuario + ": Prazer, eu sou o...");
				// Thread.sleep(2000);
				System.out.println(
						"Sid: A Nancy fica achando qualquer mendigo na rua e trazendo para dentro de casa. Só querem o nosso chá mesmo.");
				// Thread.sleep(6000);
				System.out.println("Nancy: Não ligue para ele.");
				// Thread.sleep(2000);
				System.out.println("Nancy: Abdalah, prepare um chá para os nossos convidados.");
				// Thread.sleep(2000);
				System.out.println("...");
				// Thread.sleep(2000);
				System.out.println("Obviamente isso tudo parecia estranho. Um casal de gnomos adotando uma humana?");
				// Thread.sleep(6000);
				System.out.println("...");
				// Thread.sleep(2000);
				System.out.println("Abdalah: Psiu! Ei, me ajude!");
				// Thread.sleep(2000);
				System.out.println(nomeUsuario + ": Oi? O que está acontecendo?");
				// Thread.sleep(2000);
				System.out.println("Sid: Falou alguma coisa, filha?");
				// Thread.sleep(2000);
				System.out.println("Abdalah: Não falei nada não, papai");
				// Thread.sleep(2000);
				System.out.println(nomeUsuario + ": Ei, Axel, tem algo estranho aqui...");
				// Thread.sleep(3000);
				System.out.println("Nancy: Pois não querido?");
				// Thread.sleep(3000);
				System.out.println(nomeUsuario
						+ ": Nada! Só queria perguntar quanto ao Artefato que estamos atrás. Podemos discutir sobre isso agora?");
				// Thread.sleep(6000);
				System.out.println("Axel: Abdalah, digamos que estamos aqui para tratar de... Negócios");
				// Thread.sleep(3000);
				System.out.println(nomeUsuario + ": E aqui temos um pirata burguês. Pra mim essa é nova");
				// Thread.sleep(3000);
				System.out.println("Nancy: Filha, lembra do nosso amigo, o Adolfo?");
				// Thread.sleep(3000);
				System.out.println("Abdalah: Aquele lunático?!");
				// Thread.sleep(2000);
				System.out.println(nomeUsuario + ": Viu! Eu disse que você parecia um maluco, Axel!");
				// Thread.sleep(2000);
				System.out.println("Axel: Mas porque não te calas?");
				// Thread.sleep(2000);
				System.out.println("Abdalah: Oh sim, você também é do grupinho dele, né?");
				// Thread.sleep(2000);
				System.out.println("Axel: Eu era! ERA! Eu sai por causa do artefato!");
				// Thread.sleep(2000);
				System.out.println("Abdalah: Ah... Você quer dizer... Por causa desse mapa?");
				// Thread.sleep(3000);
				System.out.println("Axel: O que?! Ele conseguiu um mapa para a outra dimensão?!");
				// Thread.sleep(3000);
				System.out.println(
						"Sid: Deixa eu ver esse mapa aqui... Oh sim... Então o Palácio é essa outra dimensão que vocês tanto falam?");
				// Thread.sleep(6000);
				System.out.println(nomeUsuario + ": Viu? Lunáticos!");
				// Thread.sleep(3000);
				System.out.println("Axel: Como assim o Palácio?!");
				// Thread.sleep(2000);
				System.out.println("Nancy: É, olha aqui ó");
				// Thread.sleep(2000);
				System.out.println(
						"Axel: Então quer dizer que o Palácio foi construído em cima de uma fortaleza... Interessante...");
				// Thread.sleep(6000);
				System.out.println(nomeUsuario + ": Isso significa mais tesouros, é isso?");
				// Thread.sleep(3000);
				System.out.println("Axel: Gosto da maneira como você pensa...");
				// Thread.sleep(3000);
				System.out.println(
						"Abdalah: Ótimo... Como vocês estão tratando de negócios, eu vendo esse mapa para vocês");
				// Thread.sleep(4000);
				System.out.println(nomeUsuario + ": Mas que absurdo! Você é mais mercenária que esse pirata!");
				// Thread.sleep(3000);
				System.out.println("Axel: Hahahaha menina esperta!");
				// Thread.sleep(2000);
				System.out.println(
						"Abdalah: 20 moedas de ouro por algo tão importante, acho que seria um bom negócio...");
				// Thread.sleep(3000);

				System.out.println("Sid: Isso aí, menina! Tá na hora de ajudar com as despesas de casa!");
				// Thread.sleep(6000);
				System.out.println("Axel: Quantas moedas de ouro você tem, " + nomeUsuario + "?");
				// Thread.sleep(3000);
				if (ouro >= 20) {
					System.out.println(nomeUsuario + ": Bom... eu tenho " + ouro + " moedas de ouro");
					// Thread.sleep(2000);
					System.out.println("Axel: Ótimo!");
					// Thread.sleep(2000);
					System.out.println("\n");
					System.out.println("Abdalah: E então " + nomeUsuario + "? Negócio fechado? (S ou N)");
					System.out.print("Resposta: ");
					decisaoString = sc.nextLine();
					decisaoString = decisaoString.toUpperCase();

					if (decisaoString.startsWith("S")) {

						System.out.println(nomeUsuario
								+ ": Axel, pode ir anotando em algum lugar que a Companhia ROSES me deve 20 moedas de ouro!");
						// Thread.sleep(6000);
						ouro = ouro - 25;
						System.out.println(nomeUsuario + ": Bom, muito obrigado por tudo... Vamos indo...");
						// Thread.sleep(3000);
						System.out.println("Abdalah: Tem certeza de que vocês não precisam de companhia?");
						// Thread.sleep(2000);
						System.out.println("Axel: Não... Não se preocupe...");
						// Thread.sleep(2000);
						System.out.println("Abdalah: Bom... Então simplesmente não vou deixar vocês irem!");
						// Thread.sleep(2000);
						System.out.println("Abdalah: Ou vocês me levam junto ou eu destruo esse mapa!");
						// Thread.sleep(3000);
						System.out.println(
								nomeUsuario + ": Qual o teu problema Abdalah?! Não era ouro que você queria?!");
						// Thread.sleep(3000);

					} else if (decisaoString.startsWith("N")) {
						System.out.println(
								nomeUsuario + ": Eu não vou te dar absolutamente NADA! Pode ir se virando aí, Axel!");
						// Thread.sleep(3000);
					}

					/* INÍCIO SUBORNO ABDALAH - GNOMOS - SEX SHOP - PIRATA */
				}
				if (ouro <= 19) {
					System.out.println(nomeUsuario + ": Eu não tenho nada! Me roubaram naquela maldita Taverna!");
					// Thread.sleep(3000);
				}
				System.out.println("Axel: Bom, então não resta outra opção...");
				// Thread.sleep(2000);
				System.out.println("Abdalah: Como assim outra opção?");
				// Thread.sleep(2000);
				System.out.println("Você vê o Axel se levantando e sacando a sua espada");
				// Thread.sleep(2000);
				System.out.println("Axel: Você primeiramente deve lembrar que eu sou um PIRATA!");
				// Thread.sleep(2000);
				System.out.println("Axel: Estuprar, matar, esquartejar faz parte do meu dia a dia, mocinha!");
				// Thread.sleep(2000);
				System.out.println(
						"Axel: Eu estou com pressa e pelo visto ainda tenho muito chão pela frente. Anda! O Mapa!");
				// Thread.sleep(4000);
				int dados = dadosUsuario();

				if (dados > 5) {

					System.out.println(
							"Você vê a Abdalah puxando uma espada de baixo do sofá onde vocês estavam sentados!");
					// Thread.sleep(5000);
					System.out.println("Pelo visto ela não era simplesmente uma filha adotiva de um casal de gnomos");
					// Thread.sleep(4000);
					System.out.println("Como você está mais próximo, ela parte em sua direção para tentar te ferir");
					// Thread.sleep(3000);
					System.out.println(
							"Por sorte o Axel consegue arremessar o seu sabre, atingindo a Abdalah antes que ela pudesse se aproximar de você");
					// Thread.sleep(6000);

				} else if (dados <= 5) {
					System.out.println(
							"Você vê a Abdalah puxando uma espada de baixo do sofá onde vocês estavam sentados!");
					// Thread.sleep(4000);
					System.out.println("Pelo visto ela não era simplesmente uma filha adotiva de um casal de gnomos");
					// Thread.sleep(4000);
					System.out.println("Como você está mais próximo, ela parte em sua direção para tentar te ferir");
					// Thread.sleep(4000);
					System.out.println(
							"O Axel ficou perplexo com a reação dela. Ele realmente não esperava que isso fosse acontecer");
					// Thread.sleep(4000);
					System.out.println(
							"Essa falta de reação proporcionou a oportunidade perfeita da Abdalah em tentar te matar");
					// Thread.sleep(4000);
					dados = dadosUsuario();

					if (dados > 5) {

						System.out.println("Você vê a espada dela vindo na direção de sua face");
						// Thread.sleep(3000);
						System.out.println("Em um momento de desespero você consegue se jogar para o lado");
						// Thread.sleep(4000);
						System.out.println(
								"Mas isso não foi o suficiente para que ela conseguisse acertar de raspão o seu braço");
						// Thread.sleep(4000);
						System.out.println("Você perdeu 10 pontos de vida.");
						// Thread.sleep(2000);
						vidaUsuario = vidaUsuario - 10;
						System.out.println(
								"Por sorte, o Axel conseguiu cravar o sabre dele no peito de Abdalah antes que ela pudesse tentar te golpear novamente");
						// Thread.sleep(6000);

					} else if (dados <= 5) {
						System.out.println("Você vê a espada dela vindo na direção de sua face");
						// Thread.sleep(2000);
						System.out.println("Em um momento de desespero você consegue se jogar para o lado");
						// Thread.sleep(3000);
						System.out.println(
								"Mas isso não foi o suficiente para que ela conseguisse cravar a espada em seu braço");
						// Thread.sleep(3000);
						System.out.println("Você perdeu 20 pontos de vida.");
						// Thread.sleep(2000);
						vidaUsuario = vidaUsuario - 20;
						System.out.println(
								"Por sorte, o Axel conseguiu cravar o sabre dele no peito de Abdalah antes que ela pudesse tentar te golpear novamente");
						// Thread.sleep(6000);
					}
				}
				System.out.println("Sid: O QUE VOCÊS FIZERAM COM A MINHA FILHA?!");
				// Thread.sleep(3000);
				System.out.println("Nancy: NÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃOOOOOOOOO!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				// Thread.sleep(3000);
				System.out.println("Sid: MALDITOS SEJAM! VÃO EMBORA DAQUI! EU VOS AMALDIÇOO!");
				// Thread.sleep(3000);
				System.out.println("Axel: " + nomeUsuario + " ANDA! PEGUE O MAPA! VAMOS EMBORA!");
				// Thread.sleep(3000);
				System.out.println("...");
				// Thread.sleep(2000);
				System.out.println("Você e o Axel corriam em direção ao Castelo");
				// Thread.sleep(2000);
				System.out
						.println("Era difícil de tentar compreender exatamente o que acabou de acontecer naquela casa");
				// Thread.sleep(4000);
				System.out
						.println("Como que uma moça a princípio tão inocente estava armada e pronta para um combate?");
				// Thread.sleep(4000);
				System.out.println("...");
				// Thread.sleep(2000);
				// Thread.sleep(2000);

				/* FIM SUBORNO ABDALAH - GNOMOS - SEX SHOP - PIRATA */
				/* FIM PIRATA - SEX SHOP */

				/* INÍCIO CASTELO - PIRATA */

				System.out.println(
						"O castelo era visível de muito longe, um enorme monumento construído em meio a cidadela.");
				// Thread.sleep(4000);
				System.out.println(
						"Extremamente luxuoso, perfeito para qualquer realeza viver tranquilamente sem se preocupar com nada.");
				// Thread.sleep(4000);
				System.out.println("O castelo foi construído como se fosse uma mini-cidade, feita para servir o rei.");
				// Thread.sleep(3000);
				System.out.println(
						"Vocês chegam até a entrada do castelo, onde a guarda real está vistoriando todos que entram no castelo.");
				// Thread.sleep(6000);
				System.out
						.println("A guarda real era uma guarda um tanto quanto peculiar, formada apenas por mulheres.");
				// Thread.sleep(3000);
				System.out.println(
						"Segundo o rei, é mais vergonhoso para o inimigo ser derrotado por mulheres. Não sei se devemos concordar com isso.");
				// Thread.sleep(6000);
				System.out.println(
						"Já que as mulheres da guarda real eram extremamente mais fortes do que muito pirata por aí.");
				// Thread.sleep(4000);
				System.out.println("...");
				// Thread.sleep(2000);

				System.out.println("Axel: Vamos parar por aqui um instante");
				// Thread.sleep(3000);
				System.out.println(nomeUsuario + ": Mas? Estamos tão próximos!");
				// Thread.sleep(2000);
				System.out.println("Axel: Seu animal! Você se esqueceu do que acabamos de fazer?");
				// Thread.sleep(2000);
				System.out.println("Axel: Além do mais eu sou um pirata! Todo o reino deve estar atrás da gente");
				// Thread.sleep(4000);
				System.out.println(nomeUsuario + ": Eu só não entendi o que a gente fez para ela nos atacar");
				// Thread.sleep(3000);

				System.out.println(
						"Axel: Possivelmente ela era um alto oficial do Reino... Eu sempre soube que tinham alguns deles infiltrados em nossa ordem");
				// Thread.sleep(6000);
				System.out.println(nomeUsuario + ": Bom, estou começando a achar que vocês não são tão malucos assim");
				// Thread.sleep(4000);
				System.out.println(
						"Axel: Toma, vista essa túnica... Vamos tentar passar despercebidos pela guarda em meio a essa multidão");
				// Thread.sleep(6000);
				System.out.println(
						"Axel: Hoje é o dia em que a população deve fazer as suas petições diretamente ao rei");
				// Thread.sleep(4000);
				System.out.println(nomeUsuario
						+ ": Com toda essa gente vindo em direção ao Palácio, acho que podemos ter uma chance");
				// Thread.sleep(3000);
				System.out.println(nomeUsuario + ": Certo! Já estou pronto... Vamos tentar a sorte");
				// Thread.sleep(3000);
				dados = dadosUsuario();

				if (dados > 5) {

					System.out.println(
							"Vocês tiveram a grande sorte de que a Guarda Real não conseguia revistar todas as pessoas");
					// Thread.sleep(3000);
					System.out.println(
							"Era simplesmente uma multidão, para alguém do condado que nunca vira mais do que meia duzia de pessoas");
					// Thread.sleep(6000);

					System.out.println("Na festa anual do queijo, aquilo era assustador.");
					// Thread.sleep(2000);
					System.out.println("...");
					// Thread.sleep(2000);
					System.out.println(
							"Axel: Bom, vamos tentar achar uma forma de passar pelos corredores de uma forma mais tranquila");
					// Thread.sleep(4000);
					System.out.println("Axel: Venha! Ali tem uma sala com as roupas dos servos!");
					// Thread.sleep(3000);
					System.out.println("O Axel se veste como mordomo, enquanto você ainda está com o seu pijama");
					// Thread.sleep(3000);
					System.out.println("A ideia é de que você aparentasse ser um burguês, e ele o seu servo");
					// Thread.sleep(3000);
					System.out.println(
							"Se bem que com essa sua cara e expressão de assustado, como se todo o explendor do palácio fosse algo absurdo para você");
					// Thread.sleep(6000);
					System.out.println("...");
					// Thread.sleep(2000);
					System.out.println(
							nomeUsuario + ": Então quer dizer que essa antiga fortificação se estende até a floresta?");
					// Thread.sleep(3000);
					System.out.println("Axel: Sim! Isso aí, e é lá a entrada do portal... Vamos!");
					// Thread.sleep(3000);
					System.out.println("...");
					// Thread.sleep(2000);
					System.out.println(
							"Após uma longa caminhada seguindo uma pequena trilha dentro de toda a densa floresta, vocês vêem algo estranho a frente");
					// Thread.sleep(6000);
					System.out.println("...");
					// Thread.sleep(2000);
					System.out.println("Axel: Aquilo ali é um portal?! ENTÃO É REAL!");
					// Thread.sleep(3000);
					System.out
							.println(nomeUsuario + ": Então nem você mesmo acreditava nas suas loucuras, né? Hahahaha");
					// Thread.sleep(3000);
					System.out.println("Axel: SHHHHHHHHHH Fala baixo!");
					// Thread.sleep(3000);
					System.out.println("Guarda: TEM ALGUÉM AÍ?!");
					// Thread.sleep(2000);
					System.out.println(
							"Guarda: QUEM SÃO VOCÊS? QUEM LHES DEU PERMISSÃO PARA VIR ATÉ AQUI?! ESSA É UMA ZONA PROIBIDA!");
					// Thread.sleep(6000);
					System.out.println("Axel: ANDA " + nomeUsuario
							+ "! ENTRA LOGO NESSE MALDITO PORTAL! EU VOU SEGURAR ELE AQUI FORA!");
					// Thread.sleep(4000);
					System.out.println("Você vê o Axel sacando o seu sabre e se preparando para o combate");
					// Thread.sleep(4000);
					System.out.println(nomeUsuario + ": MAS! NÃO! ENTRA VOCÊ!");
					// Thread.sleep(2000);
					System.out.println(
							"Guarda: EM NOME DO REI ELVIS! EU ORDENO QUE VOCÊ ABAIXE A ESPADA, SEU MALDITO MORDOMO!");
					// Thread.sleep(6000);
					System.out.println(
							"Axel: EU NÃO SOU UM MORDMOMO! SOU UM FODENDO PIRATA! YAAAAAAAAARRRRRRRRRRR!!!!!!!!!!!!!");
					// Thread.sleep(4000);
					System.out.println("...");
					// Thread.sleep(2000);
					System.out.println("Prevendo o pior, você junta suas últimas forças e entra no portal.");
					// Thread.sleep(4000);
					System.out.println("...");
					// Thread.sleep(2000);
					linha = 18;
					coluna = 10;

					dungeon();
					break;
				} else if (dados <= 5) {

					System.out.println("Valquíria: PARADOS! QUEM SÃO VOCÊS?!");
					// Thread.sleep(2000);
					System.out.println(nomeUsuario + ": Ferrou!! Como ela nos achou no meio dessa multidão?!");
					// Thread.sleep(4000);
					System.out.println("Axel: Nós não somos ninguém! Meros camponeses pedintes, senhora!");
					// Thread.sleep(2000);
					System.out.println("Valquíria: Senhora é a sua mãe! Meninas! Interroguem eles!");
					// Thread.sleep(2000);
					System.out.println(
							"Valquíria: Seus tansos! Vocês são os únicos em meio a multidão tentando se esconder!");
					// Thread.sleep(2000);
					System.out.println("...");
					// Thread.sleep(2000);
					System.out.println(
							"Vocês são levados para uma carroça, onde havia um Minotauro Bêbado, um Anão Batedor de Carteira e um Hobbit.");
					// Thread.sleep(6000);
					System.out.println("...");
					// Thread.sleep(2000);
					System.out.println(
							"Hobbit: Maravilha! Como se essa porcaria desse minotauro já não ocupasse todo o espaço disponível!");
					// Thread.sleep(4000);
					System.out.println(
							"Anão Batedor de Carteira: Você só reclama! Isso que você é tão pequeno quanto eu!");
					// Thread.sleep(4000);
					System.out.println("Valquíria: Crianças! Calem a boca!");
					// Thread.sleep(2000);
					System.out.println("Minotauro Bêbado: YEY YEY YEY! Se eu pudesse eu matarra mil!");
					// Thread.sleep(3000);
					System.out.println(
							"Valquíria: Até a minha vó tem mais condições que você, seu verme! Vergonha para os Minotauros, isso sim!");
					// Thread.sleep(6000);
					System.out.println(
							"Hobbit: Ei, Capitã da Guarda! Quando você vai arrumar outra carroça para enfiar esses dois humanos aí?");
					// Thread.sleep(6000);
					System.out.println("Valquíria: Considere parte da tortura, Hobbit!");
					// Thread.sleep(2000);
					System.out.println("Valquíria: Anda! Entrem!");
					// Thread.sleep(2000);
					System.out.println(
							"Anão Batedor de Carteira: Só o que me falta! Esse Minotauro está quase vomitando");
					// Thread.sleep(2000);
					System.out.println("Hobbit: E o que vocês fizeram de errado, humanos?");
					// Thread.sleep(2000);
					System.out.println(
							"Axel: A príncipio, nada! Só estávamos querendo entrar no Palácio para pedir algumas coisas para o rei");
					// Thread.sleep(4000);
					System.out.println("Anão Batedor de Carteira: Aham! Sei! Assim como toda a masmorra");
					// Thread.sleep(3000);
					System.out.println(nomeUsuario + ": E você, Hobbit?");
					// Thread.sleep(2000);
					System.out.println("Hobbit: Dei uma apalpada na bunda da Capitã da Guarda Hahahahaha");
					// Thread.sleep(3000);
					System.out.println(nomeUsuario + ": Você tem demência?!");
					// Thread.sleep(2000);
					System.out.println("Hobbit: Bom, pensei que eu fosse furtivo o suficiente");
					// Thread.sleep(2000);
					System.out.println("Axel: Espera aí! Ela não tirou o meu sabre! Que inocente!");
					// Thread.sleep(3000);
					System.out.println(
							"Hobbit: Ótimo! Eu sou o melhor arrombador de cadeados do reino, me dê ele aqui que eu consigo nos livrar das masmorras");
					// Thread.sleep(6000);
					System.out.println(nomeUsuario + ": Ótimo! Tem cavalos ali!");
					// Thread.sleep(2000);
					System.out.println(
							"Anão Batedor de Carteira: Pelo visto o único que vai ficar para trás é o Minotauro...");
					// Thread.sleep(3000);
					System.out.println("Hobbit: Pronto! Vamos embora!!!");
					// Thread.sleep(2000);
					System.out.println("...");
					// Thread.sleep(2000);
					System.out.println(
							"Você, o Axel, o Hobbit e o Anão Batedor de Carteiras correm o mais rápido que podem em direção aos cavalos que estão ali estacionados");
					// Thread.sleep(6000);
					System.out.println("...");
					// Thread.sleep(2000);
					System.out.println("Valquíria: ELES ESTÃO ESCAPANDO! ARQUEIROS! ATIREM PARA MATAR!!!");
					// Thread.sleep(2000);
					System.out.println("Axel: SANTO KRAKEN! SÃO 12 ARQUEIROS!!! CORRE NEGADA!");
					// Thread.sleep(4000);
					System.out.println("Hobbit: Vamos!!!!");
					// Thread.sleep(2000);
					System.out.println("...");
					// Thread.sleep(2000);
					System.out.println(
							"Várias saraivadas de flechas começam a vir na direção de vocês, e com todas as forças vocês lutam por suas vidas");
					// Thread.sleep(6000);
					System.out.println(
							"O Hobbit tinha uma habilidade incrível para desviar das flechas, mas não era possível dizer o mesmo de você e do Axel");
					// Thread.sleep(6000);
					System.out.println("Que corriam em zigzague quase sendo acertados");
					// Thread.sleep(2000);
					System.out.println("...");
					// Thread.sleep(2000);
					System.out.println("Hobbit: Vamos! Humano! Pegue o maldito cavalo! E vamos dar o fora daqui!!!");
					// Thread.sleep(3000);
					System.out.println("...");
					// Thread.sleep(2000);
					System.out.println(
							"Você sobe no seu cavalo, mas na hora em que você olha para trás para ver se o Axel estava seguindo você e o Hobbit");
					// Thread.sleep(6000);
					System.out.println(
							"O Axel estava deitado no chão, gritando de dor por ter levado uma flechada no joelho.");
					// Thread.sleep(2000);
					System.out.println("...");
					// Thread.sleep(2000);
					System.out.println("Hobbit: Ele já está morto! Vamos! A cavalaria deles está vindo!!!");
					// Thread.sleep(3000);
					System.out.println(nomeUsuario + ": Eles chegaram antes do que o esperado!!");
					// Thread.sleep(2000);
					System.out.println("...");
					// Thread.sleep(2000);
					System.out.println(
							"Era possível ver 4 cavaleiros galopando hardcoremente atrás de vocês com as suas lanças fixamente apontadas");
					// Thread.sleep(5000);
					dados = dadosUsuario();

					if (dados > 5) {

						System.out.println(
								"Milagrosamente vocês conseguem deixar os cavaleiros para trás ao entrarem dentro da densa floresta que fica atrás do castelo");
						// Thread.sleep(6000);
						System.out.println(
								"Após uma longa caminhada seguindo uma pequena trilha dentro de toda a densa floresta, vocês vêem algo estranho a frente");
						// Thread.sleep(6000);
						System.out.println("...");
						System.out.println(nomeUsuario + ": Aquilo ali é um portal?! ENTÃO É REAL!");
						// Thread.sleep(2000);
						System.out.println("Hobbit: O que é real? E o que diabos é isso aí?!");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario + ": Essa é a razão para o Axel ter perdido a vida");
						// Thread.sleep(3000);
						System.out.println("Hobbit: Ah... Aquele humano lá?");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario + ": Muito obrigado Hobbit! Mas é aqui que nos separamos");
						// Thread.sleep(2000);
						System.out.println("Hobbit: Tudo bem, se cuida, humano!");
						// Thread.sleep(2000);
						linha = 1;
						coluna = 18;
						dungeon();
						break;

					} else if (dados <= 5) {

						System.out.println(
								"Um dos cavaleiros consegue enfiar a lança no seu cavalo, fazendo com que você fosse arremessado pelo animal");
						// Thread.sleep(6000);
						System.out.println(
								"Por sua sorte, você acaba caindo dentro da vala do castelo, onde todos os dejetos do Palácio eram jogados");
						// Thread.sleep(4000);
						System.out.println(
								"Você decide seguir o caminho até o esgoto, onde para a sua surpresa existiam dezenas de pessoas vivendo ali");
						// Thread.sleep(4000);
						System.out.println(
								"Eram pessoas assustadas, como se elas realmente não vissem a luz do dia a anos... Todas pálidas");
						// Thread.sleep(2000);
						System.out.println("...");
						// Thread.sleep(2000);
						System.out.println("Bruxo Ozzy: QUEM VEM LÁ?!");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario + ": Apenas alguém perdido!");
						// Thread.sleep(2000);
						System.out.println("Bruxo Ozzy: E como você espera se encontrar aqui?!");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario
								+ ": Bom, na verdade, eu apenas estou procurando um... portal... Acho que é isso");
						// Thread.sleep(2000);
						System.out.println("Bruxo Ozzy: UM PORTAL?! ENTÃO VOCÊ CONHECE A NOSSA ORDEM?!");
						// Thread.sleep(3000);
						System.out.println(nomeUsuario + ": Mais ou menos, eu conheço o Axel, isso conta?");
						// Thread.sleep(2000);
						System.out.println("Bruxo Ozzy: Aquele pirata desprezível! Mas tudo bem, conta sim");
						// Thread.sleep(3000);
						System.out.println(
								"Bruxo Ozzy: Mas olha, meu amigo, eu sei que você quer chegar no portal e tudo o mais...");
						// Thread.sleep(5000);
						System.out.println(nomeUsuario + ": Certo...");
						// Thread.sleep(2000);
						System.out.println(
								"Bruxo Ozzy: Bom, as coisas estão difíceis para nós... Eu te mostro o caminho se você me der algum ouro");
						// Thread.sleep(6000);
						System.out.println(
								"Bruxo Ozzy: Sabe como é né, precisamos nos alimentar, ir em umas tavernas... Essas coisas");
						// Thread.sleep(3000);
						System.out.println("Bruxo Ozzy: Por 10 moedas de ouro eu te mostro o caminho!");
						System.out.print("Resposta (S ou N): ");
						decisaoString = sc.next();
						decisaoString = decisaoString.toUpperCase();
						System.out.println("\n");

						linha = 1;
						coluna = 18;

						if (decisaoString.startsWith("S")) {
							if (ouro >= 10) {
								// Thread.sleep(2000);
								System.out.println(nomeUsuario + ": Claro! todo seu, meu amigo!");
								// Thread.sleep(2000);
								System.out.println(
										"Bruxo Ozzy: Hahahaha! Muito obrigado, mas eu ia te mostrar de qualquer forma!");
								// Thread.sleep(2000);
								System.out.println(
										"Bruxo Ozzy: Bom, ele está ali no final do corredor! Boa sorte, jovem!");
								// Thread.sleep(2000);
								System.out.println("...");
								// Thread.sleep(2000);
								System.out.println(
										"No final do corredor você via uma coisa estranha, nunca antes vista por você...");
								// Thread.sleep(2000);
								System.out.println("Era realmente um portal...");
								// Thread.sleep(2000);
								System.out.println("...");
								// Thread.sleep(2000);
								dungeon();
								break;
							} else if (ouro < 10) {
								System.out.println(
										nomeUsuario + ": Eu até queria te dar o ouro, Bruxão, mas bom, estou sem nada");
								// Thread.sleep(2000);
								System.out.println("Bruxo Ozzy: Tudo bem! Não se preocupe!");
								// Thread.sleep(2000);
								System.out.println(
										"Bruxo Ozzy: Bom, ele está ali no final do corredor! Boa sorte, jovem!");
								// Thread.sleep(2000);
								System.out.println("...");
								// Thread.sleep(2000);
								System.out.println(
										"No final do corredor você via uma coisa estranha, nunca antes vista por você...");
								// Thread.sleep(2000);
								System.out.println("Era realmente um portal...");
								// Thread.sleep(2000);
								System.out.println("...");
								// Thread.sleep(2000);
								dungeon();
								break;
							}
						} else if (decisaoString.startsWith("N")) {
							// Thread.sleep(2000);
							System.out
									.println(nomeUsuario + ": Eu não vou te dar nada! Chega de ficarem me subornando!");
							// Thread.sleep(4000);
							System.out.println("Bruxo Ozzy: COMO OUSA!? EU TE AMALDIÇOO!");
							// Thread.sleep(3000);
							System.out.println("Bruxo Ozzy: A partir de hoje, depois das 00h00 você trocará de sexo!");
							// Thread.sleep(2000);
							System.out.println(nomeUsuario + ": QUE?! COMASSIM?!");
							// Thread.sleep(2000);
							System.out.println("Bruxo Ozzy: Bom, agora que você já foi amaldiçoado...");
							// Thread.sleep(2000);
							System.out.println("Bruxo Ozzy: Bom, ele está ali no final do corredor! Boa sorte, jovem!");
							// Thread.sleep(2000);
							System.out.println("...");
							// Thread.sleep(2000);
							System.out.println(
									"No final do corredor você via uma coisa estranha, nunca antes vista por você...");
							// Thread.sleep(4000);
							System.out.println("Era realmente um portal...");
							// Thread.sleep(2000);
							System.out.println("...");
							// Thread.sleep(2000);
							dungeon();
							break;

						}

					}

				}
				/* FIM CASTELO - PIRATA */

			}
			/* FIM PIRATA */

			/* INÍCIO MERETRIZ */
			else if (decisaoString.contentEquals("N")) {
				companion = "Kurtney";

				System.out.println("\n");
				// Thread.sleep(0000);
				System.out.println(nomeUsuario + ": Não, obrigado. Tenha uma boa noite.");
				// Thread.sleep(0000);

				System.out.println(
						"\nVocê bate a porta na cara do Axel e calmamente caminha em direção a sua cadeira de balanço.");
				// Thread.sleep(6000);
				System.out.println("enquanto escuta o Axel bravejando e amaldiçoando até a sua 13ª geração.");
				// Thread.sleep(2000);
				System.out.println("\n");
				System.out.println(
						"Ao se sentar novamente, começa a passar um pensamento em sua cabeça de quão louco esse dia foi, e tão fora da rotina.");
				// Thread.sleep(6000);
				System.out.println("Apenas por aparecer um completo estranho te propondo coisas mais estranhas ainda.");
				// Thread.sleep(4000);
				System.out.println(
						"Quem iria trocar o conforto de sua casa por uma aventura? Ninguém é louco a esse ponto.");
				// Thread.sleep(4000);
				System.out.println(
						"E pronto. A vida voltou a normalidade, você com a sua lareira, seu cachimbo e a sua cadeira.");
				// Thread.sleep(6000);
				System.out.println("Apenas aguardando o próximo dia.");
				// Thread.sleep(2000);

				System.out.println("...");
				// Thread.sleep(2000);
				System.out.println("...");
				// Thread.sleep(2000);
				System.out.println("...");
				// Thread.sleep(2000);

				System.out.println("Um cheiro estranho começa a entrar na sala.\n");
				// Thread.sleep(2000);
				System.out.println("A janela do seu quarto que dá de frente para a sua plantação ");
				// Thread.sleep(3000);
				System.out.println("estava aberta para poder deixar o ar circular, e é de lá que o cheiro vem.");
				// Thread.sleep(2000);
				System.out.println("Um forte cheiro de fumaça. Agora o cheiro é extremamente familiar.");
				// Thread.sleep(2000);
				System.out
						.println("Por mais que você se recusa a acreditar, é exatamente isso o que está acontecendo.");
				// Thread.sleep(3000);
				System.out.println("Aquele estranho, o Axel, simplesmente ateou fogo em sua plantação.");
				// Thread.sleep(3000);
				System.out.println(
						"VOCÊ CORRE DESESPERADO PARA TENTAR SALVAR A SUA PLANTAÇÃO, PEGANDO TODOS OS BALDES QUE PODE CARREGAR.");
				// Thread.sleep(6000);
				System.out.println(
						"Suas tentativas parecem ser em vão. Todos os baldes, toda a água jogada parece não surtir efeito.");
				// Thread.sleep(4000);
				System.out.println("O que farei? E agora?");
				// Thread.sleep(2000);
				System.out.println("Apesar de todas as suas tentativas, o fogo se alastrava cada vez mais.");
				// Thread.sleep(2000);
				System.out.println("Kurtney: EI! Você é aquele a quem chamam de " + nomeUsuario + ", o Pacato?");
				// Thread.sleep(3000);

				System.out.println("\n");
				System.out.println("Ei, " + nomeUsuario);
				System.out.println("Você vai falar que sim ou não? ( S ou N )");
				System.out.print("Resposta: ");
				decisaoString = sc.nextLine();
				decisaoString = decisaoString.toUpperCase();
				System.out.println("\n");
				/* INÍCIO DECISÃO NÃO MUDA NADA */
				if (decisaoString.startsWith("S")) {
					// Thread.sleep(2000);
					System.out.println(nomeUsuario + ": snif... snif...");
					// Thread.sleep(2000);
					System.out.println(nomeUsuario + ": Sim, sou eu.");
					// Thread.sleep(2000);
					System.out.println(nomeUsuario + ": O que você quer?");
					// Thread.sleep(2000);
				} else {
					// Thread.sleep(2000);
					System.out.println(nomeUsuario + ": Não sou eu! O que você quer? Vá embora!");
				}
				/* FIM DECISÃO QUE NÃO MUDA NADA */

				// Thread.sleep(2000);
				System.out.println("Kurtney: Sabia que era você!");
				// Thread.sleep(2000);
				System.out.println("Kurtney: O que aconteceu com a sua plantação? Quem fez isso?");
				// Thread.sleep(2000);
				System.out.println(nomeUsuario + ": Um bastardo chamado Axel fez isso!");
				// Thread.sleep(2000);
				System.out.println(nomeUsuario + ": Eu juro que vou buscar vingança pelo que ele fez!");
				// Thread.sleep(3000);
				System.out.println(nomeUsuario + ": E quem é você? O que você quer?!");
				// Thread.sleep(4000);
				System.out.println("Kurtney: Meu nome é Kurtney. Eu vim buscar ajuda.");
				// Thread.sleep(3000);
				System.out.println("Kurtney: Me falaram que você era o único por aqui que poderia me ajudar.");
				// Thread.sleep(3000);
				System.out.println("Kurtney: E é justamente me ajudar contra o maldito desse Axel!");
				// Thread.sleep(3000);
				System.out.println("Kurtney: Esse Axel, ele é um pirata, um contrabadista.");
				// Thread.sleep(3000);
				System.out.println(nomeUsuario + ": Como assim um pirata?! Porque ele queria a minha ajuda?");
				// Thread.sleep(3000);
				System.out.println("Kurtney: Eu não sei. Acho que ele queria a sua ajuda para me encontrar.");
				// Thread.sleep(4000);
				System.out.println(nomeUsuario + ": Te encontrar? Como assim? O que você fez?");
				// Thread.sleep(3000);
				System.out.println("Kurtney: Eu sou a ex-namorada dele.");
				// Thread.sleep(2000);
				System.out.println("Kurtney: Eu roubei um de seus artefatos. E agora ele quer me matar.");
				// Thread.sleep(3000);
				System.out.println(nomeUsuario + ": E o que faria você pensar que eu sou útil para você, Kurtney?");
				// Thread.sleep(3000);
				System.out.println("Kurtney: Eu vim atrás de você para poder me ajudar a encontrar esses artefatos.");
				// Thread.sleep(3000);
				System.out.println("Kurtney: Esse artefato é MUITO poderoso!");
				// Thread.sleep(2000);
				System.out.println("Kurtney: Eu roubei dele, mas alguém acabou me roubando!");
				// Thread.sleep(2000);
				System.out.println("Kurtney: Por favor, me ajude! Ele queimou a sua plantação, você viu como ele é!");
				// Thread.sleep(4000);
				System.out.println("...");
				// Thread.sleep(2000);
				System.out.println(nomeUsuario + ": Tudo bem. Eu só quero que ele pague pela minha plantação!");
				// Thread.sleep(2000);
				System.out.println(nomeUsuario + ": Por onde começamos?");
				// Thread.sleep(2000);
				System.out.println("Kurtney: Bom, eu também não tenho a mínima ideia.");
				// Thread.sleep(2000);
				System.out.println("Obviamente poderíamos ir na taverna ver se alguém tem alguma pista.");
				// Thread.sleep(4000);
				System.out.println("...");
				// Thread.sleep(2000);

				/* INÍCIO TAVERNA - MERETRIZ */
				taverna: while (true) {
					System.out.println("Vocês chegam no centro da cidade.");
					// Thread.sleep(3000);
					System.out.println("Ao avistarem uma pequena festança que ocorria na Taverna do Centauro.");
					// Thread.sleep(4000);
					System.out
							.println("Do lado de fora, acima da porta de entrada era possível ver a placa da Taverna.");
					// Thread.sleep(4000);
					System.out.println(
							"A Taverna do Centauro é famosa em todo o reino devido\na sua placa de um centauro com um grande volume em suas calças.");
					// Thread.sleep(6000);
					System.out.println("Ninguém ao certo sabe dizer o que isso significa.");
					// Thread.sleep(4000);
					System.out.println(
							"Quando vocês entram na taverna, vocês se deparam com umo bacanal que estava ocorrendo no lugar.");
					// Thread.sleep(6000);
					System.out.println(nomeUsuario + "Mas que porra é essa?");
					// Thread.sleep(2000);
					System.out.println("Kurtney: Obviamente é um bacanal. Nunca viu?");
					// Thread.sleep(2000);
					System.out.println("...");
					// Thread.sleep(2000);
					System.out.println("No balcão estava o Afonso, o centauro, o dono do estabelecimento.");
					// Thread.sleep(2000);
					System.out.println("Afonso estava orgulhosamente servindo hidromel para a sua clientela,");
					// Thread.sleep(3000);
					System.out.println("De modo que o bacanal ficava cada vez mais animado.");
					// Thread.sleep(2000);
					System.out.println("...");
					// Thread.sleep(2000);
					System.out.println("Kurtney: " + nomeUsuario + ", aquela ali é a Cassandra.");
					// Thread.sleep(2000);
					System.out.println("Disse Kurtney enquanto apontava para uma anã.");
					// Thread.sleep(2000);
					System.out.println(nomeUsuario + ": Anãs... tem barba? Eu jurava que era um anão!");
					// Thread.sleep(3000);
					System.out.println(
							"Kurtney: É óbvio, é meio complicado diferenciar eles, só um anão realmente consegue fazer isso.");
					// Thread.sleep(3000);
					System.out.println("Kurtney: Mas e então? Vamos participar do bacanal ou falar com a Cassandra?");
					// Thread.sleep(3000);
					System.out.println("\n");
					System.out.println("Ei, " + nomeUsuario);
					System.out.println("Digite 1 para participar do Bacanal");
					System.out.println("Digite 2 para falar com a Cassandra");
					System.out.print("Opção: ");
					decisaoInt = sc.nextInt();
					System.out.println("\n");
					/* INÍCIO BACANAL - TAVERNA */
					if (decisaoInt == 1) {

						// Thread.sleep(3000);
						System.out.println("\n");
						System.out.println("No meio do rale e rola você decide descansar um pouco");
						// Thread.sleep(2000);
						System.out.println(
								"Ao ir verificar os seus pertences, você vê que todo o ouro que estava guardado contigo foi roubado.");
						// Thread.sleep(4000);
						System.out.println(
								nomeUsuario + ": COMO ASSIM ROUBARAM O MEU OURO?! Era todo o ouro que eu tinha!");
						// Thread.sleep(3000);

						ouro = 0;

						System.out.println("Seu ouro atual: " + ouro);

						// Thread.sleep(3000);
						bacanal: while (true) {
							System.out.println("Deseja ir atrás do ouro que lhe foi roubado? ( S ou N )");
							decisaoString = sc.nextLine();
							decisaoString = decisaoString.toUpperCase();
							System.out.println("\n");

							/*
							 * INÍCIO BUSCA PELA BOLSA DE OURO - BACANAL -
							 * TAVERNA
							 */
							if (decisaoString.startsWith("S")) {
								// Thread.sleep(3000);
								System.out.println("Você faz o maior alvoroso dentro da taverna.");
								// Thread.sleep(3000);
								System.out.println(
										"Começa a perguntar a todos se alguém flagrou algum outro ser mexendo em suas coisas.");
								// Thread.sleep(3000);
								System.out.println(nomeUsuario + ": Ei! Você com a flauta!");
								// Thread.sleep(2000);
								System.out.println("Flautista: Eu?");
								// Thread.sleep(2000);
								System.out.println(nomeUsuario
										+ ": Só tem você com uma flauta aqui. Por favor, você viu alguém mexendo em minhas coisas?");
								// Thread.sleep(4000);
								System.out.println("Flautista: Vi sim! Aquele minotauro ali estava fuçou um pouco");
								// Thread.sleep(2000);
								System.out.println(
										"Bom... 'aquele minotauro' nada mais era do que o dono da Taverna. O Afonso.");
								// Thread.sleep(3000);
								System.out.println("Afonso: OUSAS ME ACUSAR?!");
								// Thread.sleep(2000);
								System.out.println("Ei, " + nomeUsuario + ", deseja confrontar o Afonso? (S ou N)");
								decisaoString = sc.nextLine();
								decisaoString = decisaoString.toUpperCase();
								System.out.println("\n");

								if (decisaoString.startsWith("S")) {
									System.out.println(nomeUsuario
											+ ": Então foi você quem roubou todo o meu ouro! Quero um julgamento por combate!");
									// Thread.sleep(4000);
									System.out.println(
											"Afonso: HAHAHAHAHAHA! Você realmente deseja morrer assim... Tão jovem?");
									// Thread.sleep(3000);
									System.out.println(
											"Sem mais nem menos, o Afonso pega um taco de sinuca, quebra de forma com que o taco acabe virando uma lança");
									// Thread.sleep(4000);
									System.out.println(
											"E sem que você possa reagir, ele corre em sua direção com o taco mirando em sua cabeça");
									// Thread.sleep(3000);
									System.out.println("\n");
									System.out.println("Você morreu.");
									System.out.println("\n");
									System.out.println("Check point: Taverna.");
									System.out.println("\n");
									// Thread.sleep(10000);
									continue taverna;
								} else if (decisaoString.startsWith("N")) {
									// Thread.sleep(2000);
									System.out.println(nomeUsuario + ": O que? Acusar o senhor? Jamais!");
									// Thread.sleep(3000);
									System.out.println(nomeUsuario + ": Esse Flautista está bêbado, simples assim...");
									// Thread.sleep(3000);
									System.out.println(nomeUsuario
											+ ": Muito obrigado por me proporcionar tamanha festa, seu Afonso!");
									// Thread.sleep(3000);
									System.out.println(nomeUsuario + ": Ei! KURTNEY! Vamos falar com a Cassandra!");
									// Thread.sleep(3000);
									break;
								} else {
									System.out.println("Digite um comando válido.");
									continue bacanal;
								}

							}
							/*
							 * FIM BUSCA PELA BOLSA DE OURO - BACANAL - TAVERNA
							 */
							else {
								// Thread.sleep(3000);
								System.out.println(nomeUsuario
										+ ": Que absurdo! A criminalidade nessa região está ultrapassando dos limites.");
								// Thread.sleep(4000);
								System.out.println(nomeUsuario + ": Kurtney, vamos falar com a Cassandra!");
								// Thread.sleep(2000);

								break;
							}
						}
					} /* FIM BACANAL - TAVERNA */
					// Thread.sleep(3000);
					System.out.println("Vocês encontram uma anã que estavam gerenciando algumas dançarinas.");
					// Thread.sleep(3000);
					System.out.println("Kurtney: Cassandra, é isso?");
					// Thread.sleep(2000);
					System.out.println("Cassandra: Sim, isso mesmo. Sou a responsável pelo RH. Posso ajudar?");
					// Thread.sleep(3000);
					System.out.println(nomeUsuario + ": Estamos atrás de um artefato mágico.");
					// Thread.sleep(2000);
					System.out.println("Cassandra: Vocês são drogados, é isso?");
					// Thread.sleep(2000);
					System.out.println("Kurtney: Não! É um artefato mágico!");
					// Thread.sleep(2000);
					System.out.println(
							"Kurtney: O Axel havia roubado ele, mas parece que alguém conseguiu roubar novamente.");
					// Thread.sleep(3000);
					System.out.println(nomeUsuario + ": Não saberia onde poderíamos encontrar, né?");
					// Thread.sleep(2000);
					System.out.println("Cassandra: Acho que sei quem pode te ajudar...");
					// Thread.sleep(2000);
					System.out.println("Cassandra: Na cidadela tem um elfo muito famoso, que é dono de um Sex Shop.");
					// Thread.sleep(3000);
					System.out.println(
							"Cassandra: Ele é conhecido como o Elfo Fértil, ele sempre está por dentro do mercado negro.");
					// Thread.sleep(2000);
					System.out.println(nomeUsuario + ": Muito obrigado Cassandra!");
					// Thread.sleep(2000);
					break;
				} /* FIM TAVERNA - MERETRIZ */

				/* INÍCIO SEX SHOP */
				sexshop: while (true) {
					// Thread.sleep(2000);
					System.out.println("A cidadadela é o coração do reino.");
					// Thread.sleep(3000);
					System.out.println(
							"Para você, " + nomeUsuario + ", isso era o máximo que você já havia ousado andar.");
					// Thread.sleep(3000);
					System.out.println(
							"Praticamente um grande centro urbano, muito maior do que qualquer outro vilarejo.");
					// Thread.sleep(3000);
					System.out.println(
							"O lugar onde era possível se encotrar todas as raças e pessoas de todos os cantos do reino.");
					// Thread.sleep(4000);
					System.out.println("Bem ao centro da cidade ficava uma pequena mas luxuosa loja.");
					// Thread.sleep(3000);
					System.out.println("Com uma placa em formato de coração com orelhas élficas.");
					// Thread.sleep(2000);
					System.out.println("Era fácil saber que esse era o destino de toda essa viagem.");
					// Thread.sleep(2000);
					System.out.println("...");
					// Thread.sleep(2000);
					System.out.println("Kurtney: Bom, acho que é aqui.");
					// Thread.sleep(3000);
					System.out.println(
							"Kurtney: Enfim, vamos entrar e dar uma olhada. Quero resolver isso o quanto antes.");
					// Thread.sleep(3000);
					System.out.println();
					System.out.println("...");
					// Thread.sleep(2000);
					System.out.println("Ao entrarem no Sex Shop, era possível ver diversos aparatos sexuais");
					// Thread.sleep(3000);
					System.out.println(
							"Mais ao fundo ficava o balcão, onde o Elfo Fértil estava atendendo um casal de gnomos.");
					// Thread.sleep(3000);
					System.out.println("...");
					// Thread.sleep(2000);
					System.out.println("Sid: Elfo Fértil, mas eu lhe imploro! Só você pode nos ajudar!");
					// Thread.sleep(3000);
					System.out.println(
							"Nancy: Sim! Estamos a anos tentando ter um filho, por favor Elfo Fértil, nos ajude!");
					// Thread.sleep(4000);
					System.out.println("Elfo Fértil: Bom, vocês sabem que não é bem assim que as coisas funcionam...");
					// Thread.sleep(3000);
					System.out.println(
							"Elfo Fértil: Eu posso no máximo lhes dar alguns igredientes secretos mas infelizmente não é 100% garantido.");
					// Thread.sleep(6000);
					System.out.println(
							"Elfo Fértil: A menos que você, Nancy, queira que o seu filho seja meu... Já que né, não erro uma.");
					// Thread.sleep(4000);
					System.out.println(
							"Sid: Estou aqui pensando se ser você é algo bom ou uma maldição devido a quantidades de elfinhos.");
					// Thread.sleep(4000);
					System.out.println(
							"Elfo Fértil: Pense que nos dia do pai eu sou a pessoa mais presenteada desse reino hahaha.");
					// Thread.sleep(3000);
					System.out.println("Sid: Mas eu duvido qie você não tenha NADA que possa nos ajudar!");
					// Thread.sleep(4000);

					System.out.println("Ei, " + nomeUsuario);
					System.out.println("Digite 1 para falar com o Elfo Fértil.");
					System.out.println("Digite 2 para falar com o casal de gnomo.");
					System.out.print("Opção: ");
					decisaoInt = sc.nextInt();
					System.out.println("\n");

					/* INÍCIO ELFO FÉRTIL */
					if (decisaoInt == 1) {
						System.out.println(nomeUsuario
								+ ": Elfo Fértil, desculpe interromper... Mas é um assunto de vida ou morte.");
						// Thread.sleep(3000);
						System.out.println("Elfo Fértil: Pois não, no que posso ajudar?");
						// Thread.sleep(3000);
						System.out.println(nomeUsuario
								+ ": Então, nós estamos desesperadamente atrás de um artefato mágico que nos foi roubado.");
						// Thread.sleep(6000);
						System.out.println("Elfo Fértil: Ah sim, compreendo.");
						// Thread.sleep(3000);
						System.out.println(
								"Elfo Fértil: Tudo bem, meus caros amigos gnomos, eu já lhes dou atenção.\n Parece que o assunto do nosso amigo aqui requer prioridade.");
						// Thread.sleep(6000);
						System.out.println("Kurtney: Então a Cassandra realmente sabia do que estava falando!");
						// Thread.sleep(3000);
						System.out.println(nomeUsuario + ": Então você sabe onde nós podemos encontrar?");
						// Thread.sleep(2000);
						System.out.println("Elfo Fértil: Bom... Mais ou menos...");
						// Thread.sleep(2000);
						System.out.println(
								"Elfo Fértil: Eu sou um colecionador, possuo diversos contatos no mercado negro");
						// Thread.sleep(3000);
						System.out.println(
								"Elfo Fértil: Nessa semana, um pirata de armas que eu nunca vi na vida entrou em contato comigo me oferecendo um artefato interessante...");
						// Thread.sleep(6000);
						System.out.println("Kurtney: Só pode ser o nosso artefato!");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario + ": E onde podemos encontrar esse maldito?");
						// Thread.sleep(3000);
						System.out.println("...");
						// Thread.sleep(2000);
						System.out.println(
								"O Elfo Fértil passa a provável localização de onde o pirata de armas está acampado.");
						// Thread.sleep(3000);
						System.out.println(
								"Pelo que o Elfo Fértil te falou, o pirata é bem conhecido como uma das pessoas mais perigosas de todo o reino.");
						// Thread.sleep(3000);
						System.out.println("...");
						// Thread.sleep(2000);

						System.out.println(
								"Você e a Kurtney chegam em um lugar bem afastado da cidade, passando por um pequeno bosque próximo ao castelo.");
						// Thread.sleep(6000);
						System.out.println(
								"Do nada, surgem dois trogloditas saindo dos arbustos, um deles usando um crossbow, enquanto o outro uma katana.");
						// Thread.sleep(4000);
						System.out.println("Kurtney: CUIDADO!!!");
						// Thread.sleep(2000);
						System.out.println("VOCÊ ESTÁ EM COMBATE!");
						// Thread.sleep(3000);
						if (dadosUsuario() > 5) {
							System.out.println("A primeira coisa que você avista foi uma pedra pequena e pontiaguda");
							// Thread.sleep(4000);
							System.out.println("Você corre com todas as suas forças para alcançar ela");
							// Thread.sleep(3000);
							System.out.println(
									"Enquanto você rola em direção a pedra, você escuta o zunir da flecha passando por cima da sua cabeça.");
							// Thread.sleep(3000);
							System.out.println(
									"Ao pegar a pedra, você avista o primeiro deles correndo em sua direção brandindo uma katana.");
							// Thread.sleep(3000);
							System.out.println("A sua primeira reação é jogar a pedra na direção dele");
							// Thread.sleep(3000);
							System.out.println(
									"Milagrosamente você acerta em cheio a cabeça do primeiro desgraçado que veio para cima de você");
							// Thread.sleep(5000);
							System.out.println("Com ele desmaiado, a Katana agora é sua.");
							// Thread.sleep(2000);
							System.out.println(
									"É possível vislumbrar o desespero do outro desgraçado que estava tentando recarregar o crossbow.");
							// Thread.sleep(3000);
							System.out.println("Ele é uma presa fácil, e assim você o faz...");
							// Thread.sleep(3000);
							System.out.println("Kurtney: MAS O QUE DIABOS FOI ISSO?");
							// Thread.sleep(3000);
							System.out.println(nomeUsuario + ": EU NÃO SEI! ACHO QUE DESESPERO!");
							// Thread.sleep(3000);
							System.out.println(nomeUsuario
									+ ": Eu disse que nunca devia ter saído do condado! Maldito seja aquele Axel!");
							// Thread.sleep(3000);
							System.out
									.println(nomeUsuario + ": Mas o que fizemos? Só queríamos conversar com o pirata!");
							// Thread.sleep(3000);
							System.out.println(
									"Kurtney: Calma, já estamos chegando, vou pegar o crossbow, quero ver esse pirata não nos permitir entrar.");
							// Thread.sleep(3000);
							System.out.println("...");
							// Thread.sleep(2000);
							System.out.println(
									"Ao vocês entrarem no acampamento, vocês conseguiam ver vários brutamontes estupefatos");
							// Thread.sleep(3000);
							System.out.println(
									"Era possível contar 12 homens mau encarados, todos estáticos olhando vocês passarem, encarando a katana que você estava portando.");
							// Thread.sleep(6000);
							System.out.println("Rupert: Vo... Vocês... Mataram o Bernardo?");
							// Thread.sleep(2000);
							System.out.println("Kurtney: Eu não matei ninguém não! Foi o " + nomeUsuario + "!");
							// Thread.sleep(3000);
							System.out.println(nomeUsuario
									+ ": Eu juro que foi legítima defesa! Nem sei qual dos dois era esse tal de Bernardo!");
							// Thread.sleep(3000);
							System.out.println("Rupert: VOCÊ TAMBÉM MATOU O ASTOLFO?!");
							// Thread.sleep(2000);
							System.out.println(nomeUsuario + ": MAS...!!!! EU NÃO TIVE CULPA!");
							// Thread.sleep(2000);
							System.out.println("Rupert: Chamem o patrão!");
							// Thread.sleep(2000);
							System.out.println("...");
							// Thread.sleep(2000);
							System.out.println(
									"Brutus: Eu sou o Brutus! Me falaram que vocês mataram o Bernardo e o Astolfo. Isso é verdade?");
							// Thread.sleep(4000);

							System.out.println("Sim ou Não? (S ou N)");
							decisaoString = sc.nextLine();
							decisaoString = decisaoString.toUpperCase();
							System.out.println("\n");
							if (decisaoString.startsWith("S")) {
								System.out.println(nomeUsuario + ": Sim! E se eu pudesse eu matarra mil!");
								// Thread.sleep(2000);
							} else {
								System.out.println(nomeUsuario + ": Nã... Nãoo!!");
								// Thread.sleep(2000);
								System.out.println("Kurtney: Matamos sim! Algo contra?");
								// Thread.sleep(2000);
							}
							System.out.println(
									"Brutus: O Bernardo era o melhor espadachim que eu já vi. Devo parabenizar você por tamanha façanha.");
							// Thread.sleep(4000);
							System.out.println("Kurtney: E o Astolfo?");
							// Thread.sleep(2000);
							System.out.println("Brutus: O Astolfo era um merda mesmo, fico feliz com a morte dele.");
							// Thread.sleep(3000);
							System.out.println(nomeUsuario
									+ ": Tá... Ok, estamos aqui pois o Elfo Fértil nos disse que você ofereceu um artefato mágico para ele.");
							// Thread.sleep(4000);
							System.out.println("Brutus: Sim, isso é verdade. Parece que eu perdi um grande negócio.");
							// Thread.sleep(3000);
							System.out
									.println("Kurtney: Como assim você perdeu um grande negócio? Cadê esse artefato?");
							// Thread.sleep(2000);
							System.out.println("Brutus: Pelo visto tem muita gente atrás dele...");
							// Thread.sleep(2000);
							System.out.println(
									"Brutus: Eu roubei ele de um pirata chamado Petelausco, mas ontem a noite alguém invadiu o meu acampamento e me roubou.");
							// Thread.sleep(5000);
							System.out.println("Kurtney: Está brincando, né?");
							// Thread.sleep(2000);
							System.out.println("Brutus: Bem que eu gostaria.");
							// Thread.sleep(2000);
							System.out.println(nomeUsuario
									+ ": E você tem alguma ideia de onde possa estar? Quem pode ter roubado?");
							// Thread.sleep(2000);
							System.out.println(
									"Brutus: Olha, acho que seria uma boa vocês darem uma olhada no castelo. Fica bem aqui pertinho mesmo.");
							// Thread.sleep(3000);
							System.out.println(
									"Brutus: E eu vou querer a katana de volta. Pode ir me devolvendo, já chega dos outros ficarem me roubando!");
							// Thread.sleep(4000);
							System.out.println(
									"Kurtney: Tudo bem, não se preocupe, eu tenho os meus contatos lá no castelo.");
							// Thread.sleep(3000);
							System.out.println("...");
							// Thread.sleep(2000);

							/* INÍCIO CASTELO - MERETRIZ - ELFO FÉRTIL */
							System.out.println(
									"O castelo era visível de muito longe, um enorme monumento construído em meio a cidadela.");
							// Thread.sleep(4000);
							System.out.println(
									"Extremamente luxuoso, perfeito para qualquer realeza viver tranquilamente sem se preocupar com nada.");
							// Thread.sleep(4000);
							System.out.println(
									"O castelo foi construído como se fosse uma mini-cidade, feita para servir o rei.");
							// Thread.sleep(3000);
							System.out.println(
									"Vocês chegam até a entrada do castelo, onde a guarda real está vistoriando todos que entram no castelo.");
							// Thread.sleep(6000);
							System.out.println(
									"A guarda real era uma guarda um tanto quanto peculiar, formada apenas por mulheres.");
							// Thread.sleep(3000);
							System.out.println(
									"Segundo o rei, é mais vergonhoso para o inimigo ser derrotado por mulheres. Não sei se devemos concordar com isso.");
							// Thread.sleep(4000);
							System.out.println(
									"Já que as mulheres da guarda real eram extremamente mais fortes do que muito pirata por aí.");
							// Thread.sleep(3000);
							System.out.println("...");
							// Thread.sleep(2000);
							System.out.println("Kurtney: VALQUÍRIA! Minha querida! Quanto tempo!");
							// Thread.sleep(3000);
							System.out.println("Valquíria: KURTNEY! Venha aqui minha gostosa! Por onde você andou?");
							// Thread.sleep(3000);
							System.out.println(
									"Kurtney: Com o desgraçado do Axel. Aquele pilantra ainda vai sofrer na minha mão!");
							// Thread.sleep(2000);
							System.out.println(
									"Valquíria: Hm... E pelo que eu vi você já arrumou um outro pretendente né, sua safada.");
							// Thread.sleep(3000);
							System.out.println(nomeUsuario
									+ ": Oi? Não!!! Que isso, não! Eu estou ajudando ela a se vingar do Axel!");
							// Thread.sleep(3000);
							System.out.println("Valquíria: Bela forma de se vingar, ein Kurtney.");
							// Thread.sleep(3000);
							System.out.println("Kurtney: Hahahaha");
							// Thread.sleep(2000);
							System.out.println("Kurtney: É que o Axel queimou a plantação dele.");
							// Thread.sleep(3000);
							System.out.println(nomeUsuario + ": Aquele bandido!");
							// Thread.sleep(3000);
							System.out.println(
									"Kurtney: Mas enfim, Valquíria, nós estamos atrás de um artefato que eu roubei do Axel... Que me roubaram e roubaram do ladrão que roubou de mim");
							// Thread.sleep(6000);

							System.out.println(nomeUsuario
									+ ": Saberia me dizer se tem alguém no castelo que se interessaria por esse tipo de artefato?");
							// Thread.sleep(4000);

							System.out.println("Valquíria: CLARO! A Princesa Janis! Ela tem uns gostos... peculiares.");
							// Thread.sleep(3000);
							System.out.println(
									"Valquíria: Vamos, eu levo vocês até ela. Acho que ela vai ficar feliz em te rever, Kurtney.");
							// Thread.sleep(3000);

							System.out.println(nomeUsuario + ": Você tem livre acesso ao castelo?!");
							// Thread.sleep(3000);
							System.out.println("Valquíria: Meu bebê, eu sou a chefe da guarda.");
							// Thread.sleep(3000);
							System.out.println("...");
							// Thread.sleep(2000);
							System.out.println("Vocês adentram ao castelo, um lugar extremamente magnífico.");
							// Thread.sleep(2000);
							System.out.println(
									"O castelo foi construído no coração da cidadela, onde a cidadela só existe para um único propósito: suprir as necessidades da realeza.");
							// Thread.sleep(6000);
							System.out.println("Tudo o que melhor é produzido no reino, vem parar aqui.");
							// Thread.sleep(2000);
							System.out.println(
									"E aqui está você, um jovem camponês advindo dos confins do condado... Andando no meio de aristocratas e nobres.");
							// Thread.sleep(4000);
							System.out.println("...");
							// Thread.sleep(2000);
							System.out.println(
									"Vocês entram em uma sala gigantesca, onde era possível ver uma moça muito bonita, aparentando estar na flor da idade.");
							// Thread.sleep(6000);
							System.out.println(
									"Era fácil dizer que aquela é a Princesa Janis, sendo atendida por diversos servos, todos ao seu lado apenas aguardando a próxima ordem.");
							// Thread.sleep(6000);

							System.out.println("...");
							// Thread.sleep(2000);
							System.out.println("Princesa Janis: KURTNEY!!!!!!!! VENHA AQUI MOAMOR!");
							// Thread.sleep(3000);
							System.out.println(
									"Kurtney: Princesa Janis? Desde quando o seu pai te deu autorização para beber?");
							// Thread.sleep(3000);
							System.out.println("Princesa Janis: Desde quando ele se importa comigo?");
							// Thread.sleep(3000);
							System.out.println("Princesa Janis: Só vocês se importam comigo, por isso eu os amo.");
							// Thread.sleep(3000);
							System.out.println("Valquíria: Princesa Janis, esse é " + nomeUsuario
									+ ", ele está aqui precisando de sua ajuda.");
							// Thread.sleep(4000);
							System.out.println("Princesa Janis: Olá " + nomeUsuario + ", o que que você quer?!");
							// Thread.sleep(3000);
							System.out
									.println("Kurtney: Não se preocupe Princesa Janis, não é para ele, é para mim...");
							// Thread.sleep(3000);
							System.out
									.println("Kurtney: Estamos atrás de um artefato mágico... Você viu algum por aí?");
							// Thread.sleep(3000);
							System.out.println("Princesa Janis: Vi sim, mas não vou contar lero lero lero");
							// Thread.sleep(3000);
							System.out.println("Valquíria: Princesa Janis?! Isso são modos?");
							// Thread.sleep(2000);
							System.out.println(
									"Princesa Janis: Ninguém se importa! milhões de pessoas no meu reino e ninguém te perguntou nada, Valquíria!");
							// Thread.sleep(6000);
							System.out.println(
									"Kurtney: Mas Princesa Janis! Nós precisamos saber! O que que eu posso fazer para que você nos diga?");
							// Thread.sleep(4000);
							System.out.println("Princesa Janis: Menage.");
							// Thread.sleep(2000);
							System.out.println(nomeUsuario + ": Como é que é?!");
							// Thread.sleep(2000);
							System.out.println(nomeUsuario + ": Como assim, é isso mesmo que ela falou?");
							// Thread.sleep(3000);
							System.out.println("Valquíria: Princesa Janis? Mas e a sua virgindade?!");
							// Thread.sleep(3000);
							System.out.println("Princesa Janis: Cansei dela. Quero o " + nomeUsuario + " e a Kurtney.");
							// Thread.sleep(3000);
							System.out.println(
									"Valquíria: Princesa Janis! Você precisa ser virgem para poder se casar com o Rei Rubinho!");
							// Thread.sleep(3000);
							System.out.println("Princesa Janis: Diplomacia? Ninguém se importa com diplomacia!");
							// Thread.sleep(3000);
							System.out.println(
									"Kurtney: Mas... mas... mas... Princesa Janis? Isso vai levar o nosso reino a guerra!");
							// Thread.sleep(3000);
							System.out.println(nomeUsuario + ": Como assim cara? Ela realmente está propondo isso?");
							// Thread.sleep(3000);
							System.out.println("Valquíria: Por favor! Não faça isso " + nomeUsuario + "!");
							// Thread.sleep(3000);

							System.out.println("Você deseja fazer o que a Princesa Janis deseja? (S ou N)");
							System.out.print("Resposta: ");
							decisaoString = sc.nextLine();
							decisaoString = decisaoString.toUpperCase();
							System.out.println("\n");
							/*
							 * INÍCIO MENAGE PRINCESA - CASTELO - MERETRIZ
							 */
							if (decisaoString.startsWith("S")) {
								System.out.println(nomeUsuario + ": Sim! Vamos lá Princesa Janis! UHU!");
								// Thread.sleep(3000);
								System.out.println("...");
								// Thread.sleep(2000);
								System.out.println("Você decide fazer relações com a Kurtney e com a Princesa Janis.");
								// Thread.sleep(3000);
								System.out.println("Você contraí gonorréia dracônica. Perde 10 pontos de vida.");
								// Thread.sleep(3000);
								vidaUsuario = vidaUsuario - 10;
								System.out.println("...");
								// Thread.sleep(2000);
								System.out.println("Princesa Janis: Era isso? Todo esse auê por causa DISTO?");
								// Thread.sleep(3000);
								System.out.println(
										"Kurtney: Princesa Janis, poderia nos falar onde você viu esse artefato?");
								// Thread.sleep(3000);
								System.out.println(nomeUsuario + ": ...Por favor?");
								// Thread.sleep(2000);
							} else {
								System.out.println("Valquíria: MUITO BOM!");
								// Thread.sleep(3000);
								System.out.println("Princesa Janis: Como ousa negar algo para a Princesa Janis?!");
								// Thread.sleep(3000);
								System.out
										.println("Valquíria: Princesa Janis! A decisão dele salvou milhares de vidas!");
								// Thread.sleep(3000);
								System.out
										.println("Valquíria: " + nomeUsuario + ", venha aqui, vou te dar um presente.");
								// Thread.sleep(3000);
								System.out.println(
										"Kurtney: Espero que não seja um menage. Na verdade... Até que seria interessante...");
								// Thread.sleep(3000);
								System.out.println("Valquíria: Não! É a lendária espada Benção da Princesa Janis.");
								// Thread.sleep(3000);
								System.out.println("Valquíria: Essa é a espada mais poderosa que existe!");
								// Thread.sleep(3000);
								System.out.println(
										"Valquíria: Agora que a virgindade da Princesa está intacta, não necessitaremos mais dela. A paz finalmente está garantida");
								// Thread.sleep(6000);
								System.out.println(
										"Kurtney: Então... Ele recebeu de presente a Espada mais bambambam de todo o Reino por... Não ter feito o que ela pediu?");
								// Thread.sleep(5000);
								System.out.println("Valquíria: Basicamente");
								// Thread.sleep(2000);
								System.out.println(nomeUsuario + ": Isso não faz sentido algum");
								// Thread.sleep(2000);

								espadaPrincesa();
								System.out.println("Princesa Janis: Tá, não quero mais saber de vocês.");
								// Thread.sleep(2000);
							}
							System.out.println("Princesa Janis: Valquíria, leve eles até o calabouço.");
							// Thread.sleep(3000);
							System.out.println(nomeUsuario + ": Estamos sendo presos?!");
							// Thread.sleep(3000);
							System.out.println(
									"Kurtney: Seu resto de aborto! Você deveria ter feito o que a Princesa Janis havia ordenado!");
							// Thread.sleep(4000);
							System.out.println(
									"Princesa Janis: Não, não se preocupem, é lá onde o rapaz que me ofereceu foi.");
							// Thread.sleep(3000);
							System.out.println(
									"Princesa Janis: Ele me ofereceu um artefato hoje, mas achei de pouca importância.");
							// Thread.sleep(3000);
							System.out.println(
									"Princesa Janis: Aí ele perguntou quem poderia estar interessado nisso, então apontei para o calabouço. Espero que ele morra lentamente.");
							// Thread.sleep(3000);
							System.out.println(nomeUsuario + ": Espera? Esse lugar é perigoso?");
							// Thread.sleep(3000);
							System.out.println(
									"Valquíria: Não se preocupe, aranhas e mais algumas coisinhas só, nada de mais.");
							// Thread.sleep(3000);
							System.out.println("Kurtney: Aranhas? Não! Não pode ser?");
							// Thread.sleep(3000);
							System.out.println(
									"Valquíria: Ah, Kurtney, o que é uma aranha para você? Você já brigou muito com elas.");
							// Thread.sleep(3000);
							System.out.println(nomeUsuario + ": Oi? Eu não compreendo vocês.");
							// Thread.sleep(3000);
							System.out.println("Kurtney: Isso que da trazer um camponês para cá.");
							// Thread.sleep(3000);
							System.out.println("Valquíria: Vamos logo antes que vocês percam o artefato de vez.");
							// Thread.sleep(3000);
							System.out.println("...");
							// Thread.sleep(2000);
							System.out.println(
									"Após uma longa caminhada em direção a parte mais afastada ao castelo vocês vão em direção ao meio de uma antiga fortificação");
							// Thread.sleep(6000);
							System.out.println(
									"O atual castelo foi construído sob a ruína de um outro antigo, que acabou se tornando o Calabouço.");
							// Thread.sleep(5000);
							System.out.println("...");
							// Thread.sleep(2000);
							System.out.println("Valquíria: Bom, eu não tenho permissão de ir mais a diante.");
							// Thread.sleep(3000);
							System.out.println(nomeUsuario + ": Como assim?");
							// Thread.sleep(2000);
							System.out.println("Kurtney: Tá de sacabrinks, né?");
							// Thread.sleep(2000);
							System.out.println("Valquíria: É aqui que eu devo deixar vocês.");
							// Thread.sleep(2000);
							System.out.println(nomeUsuario + ": Mas... nos explique o porque?");
							// Thread.sleep(2000);
							System.out.println(
									"Valquíria: Bom, esse calabouço sempre atrae muitos aventureiros... Mas infelizmente a décadas nenhum deles retorna");
							// Thread.sleep(6000);
							System.out.println(nomeUsuario + ": Mas não é um ponto de troca do mercado negro?");
							// Thread.sleep(4000);
							System.out.println(
									"Valquíria: Não! Claro que não! A nossa princesa simplesmente sacanaeou aquele rapaz!");
							// Thread.sleep(3000);
							System.out.println("Kurtney: Mas que absurdo!");
							// Thread.sleep(2000);
							System.out.println(
									nomeUsuario + ": Bom... Acho que não temos muita alternativa se não continuar...");
							// Thread.sleep(2000);
							System.out.println("Valquíria: Boa sorte, meus caros");
							// Thread.sleep(2000);
							System.out.println("...");
							// Thread.sleep(2000);
							System.out.println(
									"Vocês passam um longo período seguindo uma pequena estrada antiga seguindo pelos caminhos desconhecidos da antiga fortificação");
							// Thread.sleep(6000);
							System.out.println(
									"Era estranho como aquela área realmente parecia ser totalmente desabitada, como se ninguém andasse por aquelas bandas a muito tempo");
							// Thread.sleep(6000);
							System.out.println("...");
							// Thread.sleep(2000);
							System.out.println("ALTO! QUEM VEM LÁ?");
							// Thread.sleep(2000);
							System.out.println("Responda:");
							System.out.println("1 - Desculpe! Nós somos apenas viajantes!");
							System.out.println("2 - Estamos procurando o calabouço");
							System.out.println("3 - Quem está aí?");
							System.out.print("Resposta: ");
							decisaoInt = sc.nextInt();
							System.out.println("\n");

							if (decisaoInt == 3) {
								System.out.println(
										"Mago Hendrix: Oras bolas! Sou o Implacável Mago Hendrix! Quem mais poderia estar aqui?");
								// Thread.sleep(3000);
							} else {
								System.out.println("Mago Hendrix: Não importa!");
								// Thread.sleep(2000);
								System.out.println(
										"Mago Hendrix: Só estejam cientes de que eu sou o Implacável Mago Hendrix!");
								// Thread.sleep(3000);
							}
							System.out.println(
									"Mago Hendrix: E ah, vocês estão querendo entrar no calabouço, é isso?! (S ou N)");
							System.out.print("Resposta: ");
							decisaoString = sc.nextLine();
							decisaoString = decisaoString.toUpperCase();
							System.out.println("\n");

							if (decisaoString.startsWith("S")) {
								System.out.println(nomeUsuario + ": Sim! Você sabe onde podemos achar a entrada?");
								// Thread.sleep(3000);
								System.out.println(
										"Kurtney: É! Estamos a horas andando por aqui nessa porcaria de estrada");
								// Thread.sleep(2000);
							} else {
								System.out.println(
										nomeUsuario + ": Não! Só estamos atrás de um pirata que roubou a Kurtney");
								// Thread.sleep(3000);
								System.out.println("Kurtney: Você por algum acaso viu aquele salafrário?");
								// Thread.sleep(2000);
							}
							System.out.println(
									"Mago Hendrix: Bom, só para informar a vocês que esse amigo de vocês quis porque quis entrar nesse calabouço");
							// Thread.sleep(3000);
							System.out
									.println("Kurtney: Então " + nomeUsuario + " parece que teremos que ir atrás dele");
							// Thread.sleep(3000);
							System.out.println(nomeUsuario + ": Espero que você realmente me recompense!");
							// Thread.sleep(2000);
							System.out.println(
									"Mago Hendrix: De qualquer forma, como Guardião do Calabouço, eu tenho o dever de informar a vocês");
							// Thread.sleep(3000);
							System.out.println("Kurtney: Informar o que?");
							// Thread.sleep(2000);
							System.out.println("Mago Hendrix: Que bom que pergunta!");
							// Thread.sleep(2000);
							System.out.println(
									"Mago Hendrix: Esse calabouço fora construído para guardar a maior riqueza desse mundo");
							// Thread.sleep(3000);
							System.out.println(
									nomeUsuario + ": Ok, agora você está falando a minha língua... Riqueza... Quero!");
							// Thread.sleep(2000);
							System.out.println("Mago Hendrix: Deixe-me continuar, por favor");
							// Thread.sleep(2000);
							System.out.println(
									"Mago Hendrix: Levou 7 gerações para ser construído... E as riquezas não serão fáceis de serem tomadas!");
							// Thread.sleep(6000);
							System.out.println(
									"Mago Hendrix: Toda semana chegam aventureiros que foram criados com as histórias desse calabouço, todos sedentos por riquezas");
							// Thread.sleep(6000);
							System.out
									.println("Mago Hendirx: Mas nenhum deles foi capaz de sobreviver ao Calabouço...");
							// Thread.sleep(4000);
							System.out.println("Mago Hendrix: E existe apenas uma ÚNICA regra!");
							// Thread.sleep(4000);
							System.out.println("Kurtney: Que regra é essa?");
							// Thread.sleep(3000);
							System.out.println("Mago Hendrix: Apenas um pode desbravar o calabouço por vez!");
							// Thread.sleep(3000);
							System.out.println(nomeUsuario + ": Isso quer dizer que o nosso 'amigo' morreu aí dentro?");
							// Thread.sleep(3000);
							System.out.println("Mago Hendrix: Isso mesmo! Você entendeu bem a situação");
							// Thread.sleep(3000);
							System.out.println(
									"Mago Hendrix: Então, como você parece ser o mais espertinho, acho que é melhor você ir primeiro.");
							// Thread.sleep(3000);
							System.out.println("Mago Hendrix: Te levarei até a entrada do calabouço");
							// Thread.sleep(3000);
							System.out.println("Kurtney: MAS COMO ASSIM? QUE REGRA IDIOTA É ESSA?");
							// Thread.sleep(3000);
							System.out.println("Mago Hendrix: REGRAS SÃO REGRAS! Mocinha!");
							// Thread.sleep(3000);
							System.out.println("...");
							// Thread.sleep(2000);
							System.out.println("Ma" + "go Hendrix: Bom, é aqui.");
							// Thread.sleep(2000);
							System.out.println(
									nomeUsuario + ": Muito obrigado, mago! Tem mais alguma coisa que eu deva saber?");
							// Thread.sleep(3000);
							System.out.println("Mago Hendrix: Sim! Se você morrer, seus pertences serão todos meu :)");
							// Thread.sleep(3000);
							System.out.println("Mago Hendrix: Então me faça o favor de morrer bem rapidinho");
							// Thread.sleep(3000);
							System.out.println(
									nomeUsuario + ": E eu ainda pensando que você me reconfortaria de alguma forma...");
							// Thread.sleep(3000);
							System.out.println("...");
							// Thread.sleep(2000);
							System.out.println("Você avista uma espécie de portal mágico");
							// Thread.sleep(3000);
							System.out.println("...");
							// Thread.sleep(2000);

							linha = 18;
							coluna = 10;

							dungeon();
							break;

							/* FIM MENAGE PRINCESA - CASTELO - MERETRIZ */

							/* FIM CASTELO - MERETRIZ */

						} else {
							/*
							 * CASO O USUÁRIO TIRE MENOS QUE 5 NO DADO. TESTE
							 * COVIL DOS PIRATAS
							 */
							System.out.println("ERROW!");
							// Thread.sleep(2000);
							System.out.println(
									"A Kurtney, que estava partindo para cima do brutamontes, acaba sendo nocauteada pela sua pedra.");
							// Thread.sleep(3000);
							System.out.println(
									"Como você conseguiu perder a única oportunidade que você tinha de sair vivo?");
							// Thread.sleep(3000);
							System.out.println("Bernardo: Parece que temos aqui mais um homem morto!");
							// Thread.sleep(2000);
							System.out.println("Astolfo: Bem que você poderia deixar esse aí pra mim, né?");
							// Thread.sleep(3000);
							System.out.println(
									"Bernardo: E onde estaria a honra de matar alguém sem merecer? Francamente, Astolfo");
							// Thread.sleep(3000);
							System.out.println("Bernardo: Coloque-se no seu lugar.");
							// Thread.sleep(3000);
							System.out.println("Bernardo: Agora voltando a você, pequeno verme... Últimas palavras?");
							// Thread.sleep(3000);
							System.out.println("Bernardo: Nah, não merece ter esse direito! Morra!");
							// Thread.sleep(2000);
							System.out.println(nomeUsuario + ": Eu nunca deveria ter saído do condado!");
							// Thread.sleep(3000);
							System.out.println(nomeUsuario + ": Por favor! Eu não fiz nada!");
							// Thread.sleep(2000);
							System.out.println("...");
							// Thread.sleep(2000);
							System.out.println("Você morreu.\n");
							// Thread.sleep(2000);
							System.out.println("Check point: Sexshop.\n\n");
							// Thread.sleep(2000);
							continue sexshop;
						}
					}

					/* FIM ELFO FÉRTIL - MERETRIZ */

					/* INÍCIO GNOMOS - MERETRIZ */
					else {
						System.out.println(
								nomeUsuario + ": Oi, desculpe interromper... Mas é um assunto de vida ou morte.");
						// Thread.sleep(2000);
						System.out.println(
								"Sid: Só um minutinho, esse Elfo não quer nos ajudar, parece que vou ter que começar a ficar bem revoltado.");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario + ": NÃO, calma! Não precisa disso... Por favor, nos ajude!");
						// Thread.sleep(3000);
						System.out.println("Sid: Mas quem precisa de ajuda aqui sou eu!");
						// Thread.sleep(3000);
						System.out.println("Nancy: Sid, não se preocupe, parece que não vamos ter bebês mesmo.");
						// Thread.sleep(3000);
						System.out.println("Nancy: Deveria se envergonhar, senhor Elfo Fértil!");
						// Thread.sleep(3000);
						System.out.println(
								"Elfo Fértil: O meu negócio é o prazer, Nancy. Se o Sid não proporciona isso, não posso fazer nada.");
						// Thread.sleep(3000);
						System.out.println("Sid: Vamos embora, Nancy!");
						// Thread.sleep(2000);

						System.out.println("Kurtney: MAS PRECISAMOS DE AJUDA!");
						// Thread.sleep(2000);
						System.out.println("Sid: E EU TAMBÉM! NÃO PRECISA GRITAR! CACETA!");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario + ": Por favor!");
						// Thread.sleep(2000);
						System.out.println(
								"Nancy: Venham até a minha casa tomar uma xícara de chá, lá a gente conversa melhor.");
						// Thread.sleep(3000);
						System.out.println("Nancy: Talvez assim o Sid se acalme um pouco.");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario + ": Uma xícara de chá seria excelente!");
						// Thread.sleep(2000);
						System.out.println("Kurtney: Opa!");
						// Thread.sleep(2000);
						System.out.println("Elfo Fértil: Voltem sempre!");
						// Thread.sleep(2000);
						System.out.println("Sid: Quanta ousadia!");
						// Thread.sleep(2000);
						System.out.println("...");
						// Thread.sleep(2000);
						System.out.println(
								"No caminho em direção a casa do casal de gnomos, Sid & Nancy foram contando a história de vida deles, de como se conheceram.");
						// Thread.sleep(6000);
						System.out.println(
								"O único desejo de vida deles era ter um bebê, depois que resgataram uma humana que estava em apuros e quase morrendo.");
						// Thread.sleep(6000);
						System.out.println("Os dois criaram uma afinidade com a paternidade após terem que ser os "
								+ "pais" + " dessa humana.");
						// Thread.sleep(6000);
						System.out.println("...");
						// Thread.sleep(2000);
						System.out.println("Sid: QUERIDA! Cheguei!");
						// Thread.sleep(2000);
						System.out.println("Nancy: Abdalah, temos visitas!");
						// Thread.sleep(2000);
						System.out.println("Abdalah: Oi! Estava orgaizando algumas coisas.");
						// Thread.sleep(2000);
						System.out.println("Abdalah: Quem são esses, Nancy?");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario + ": Prazer, eu sou o...");
						// Thread.sleep(2000);
						System.out.println(
								"Sid: A Nancy fica achando qualquer mendigo na rua e trazendo para dentro de casa. Só querem o nosso chá mesmo.");
						// Thread.sleep(4000);
						System.out.println("Nancy: Não ligue para ele.");
						// Thread.sleep(2000);
						System.out.println("Nancy: Abdalah, prepare um chá para os nossos convidados.");
						// Thread.sleep(2000);
						System.out.println("...");
						// Thread.sleep(2000);
						System.out.println(
								"Obviamente isso tudo parecia estranho. Um casal de gnomos adotando uma humana?");
						// Thread.sleep(2000);
						System.out.println("...");
						// Thread.sleep(2000);
						System.out.println("Abdalah: Psiu! Ei, me ajude!");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario + ": Oi? O que está acontecendo?");
						// Thread.sleep(2000);
						System.out.println("Sid: Falou alguma coisa, filha?");
						// Thread.sleep(2000);
						System.out.println("Abdalah: Não falei nada não, papai");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario + ": Ei, Kurtney, tem algo estranho");
						// Thread.sleep(2000);
						System.out.println("Nancy: Pois não querido?");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario
								+ ": Nada! Só queria perguntar quanto ao Artefato que estamos atrás. Podemos discutir sobre isso agora?");
						// Thread.sleep(6000);
						System.out.println("Abdalah: Ah sim! Eu sei onde o Adolfo levou ele");
						// Thread.sleep(3000);
						System.out.println("Kurtney: QUE? QUEM É ESSE ADOLFO?");
						// Thread.sleep(2000);
						System.out.println("Abdalah: NÃÃO! O Adolfo, que é o amigo lunático da Sid e da Nancy");
						// Thread.sleep(2000);
						System.out.println("Sid: dos seus pais! Abdalah! Dos seus pais");
						// Thread.sleep(2000);
						System.out.println("Abdalah: Desculpa... Que é o amigo lunático dos meus PAIS");
						// Thread.sleep(2000);
						System.out.println("Kurtney: Ele é lunático?");
						// Thread.sleep(2000);
						System.out.println(
								"Nancy: Sim sim! Ele tem um grupo de amigos que acreditam que existe outro mundo, que sabem como chegar até lá e tudo o mais");
						// Thread.sleep(6000);
						System.out.println("Sid: Verdade, aquele pessoal que fica se vestindo com uns mantos bizarros");
						// Thread.sleep(4000);
						System.out.println("Nancy: Mas mesmo assim ele é um bom amigo");
						// Thread.sleep(2000);
						System.out.println(
								"Abdalah: Como eu ia falando, ele apareceu aqui em casa falando que era para alimentar o gato dele");
						// Thread.sleep(4000);
						System.out.println(
								"Abdalah: Caso ele não retornasse em uma semana... Aí ele me deu esse mapa aqui, ó");
						// Thread.sleep(3000);
						System.out.println("Kurtney: Deixa eu dar uma olhada");
						// Thread.sleep(3000);
						System.out.println("Kurtney: Hm...");
						// Thread.sleep(3000);
						System.out.println(
								"Kurtney: WOW! Eu não sabia que existia uma outra fortaleza em baixo do Palácio!");
						// Thread.sleep(3000);
						System.out.println(nomeUsuario + ": Então isso aí é uma passagem secreta?");
						// Thread.sleep(3000);
						System.out.println("Kurtney: Basicamente!");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario + ": Já posso voltar para o condado?");
						// Thread.sleep(2000);
						System.out.println("Kurtney: E você realmente vai deixar de ir atrás disso tudo? Hahahaha");
						// Thread.sleep(2000);
						System.out.println("Kurtney: Para de bobeira " + nomeUsuario);
						// Thread.sleep(2000);
						System.out.println(
								nomeUsuario + ": Bom... É, já tive tudo o que eu tinha queimado mesmo ¯\\_(ツ)_/¯");
						// Thread.sleep(3000);
						System.out.println(
								"Abdalah: Então... Eu posso ajudar vocês a irem atrás do Adolfo, o que acham?");
						// Thread.sleep(2000);
						System.out.println(
								"Sid: Seria bom você sair um pouco de casa. Fazem dias que você não sai nem para levar o lixo para fora");
						// Thread.sleep(4000);
						System.out.println("Nancy: Isso mesmo filha! Vai e passeia um pouco");
						// Thread.sleep(2000);
						System.out.println("Kurtney: Vocês tem ideia de que isso vai ser bem perigoso, né?");
						// Thread.sleep(3000);
						System.out.println("Sid: Que nada! O Adolfo é super tranquilo");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario + ": E quanto aos amigos de chapéu dele?");
						// Thread.sleep(2000);
						System.out.println("Nancy: Ah, deve ser apenas um grupo de estudos");
						// Thread.sleep(2000);
						System.out.println("Abdalah: Por favor... VAMOS!");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario + ": Por mim tudo bem, quanto mais ajuda, melhor");
						// Thread.sleep(4000);
						System.out.println("Kurtney: Claro!");
						// Thread.sleep(2000);
						System.out.println("...");
						// Thread.sleep(2000);
						System.out.println("Abdalah: Eu não sei como agradecer vocês!");
						// Thread.sleep(2000);
						System.out.println("Kurtney: Oi? Não é a gente que deveria te agradecer?");
						// Thread.sleep(3000);
						System.out.println("Abdalah: Aquele casal são completamente malucos!");
						// Thread.sleep(3000);
						System.out.println("Abdalah: Eles me SEQUESTRARAM!!! SABEM O QUE É ISSO?");
						// Thread.sleep(3000);
						System.out.println("Abdalah: Aí agora vocês citaram esse tal 'artefato' e eles me deixaram ir");
						// Thread.sleep(3000);
						System.out.println(nomeUsuario + ": Como que um casal de gnomos conseguiu te sequestrar?");
						// Thread.sleep(3000);
						System.out.println(
								"Abdalah: A questão não é essa! Deve ter algo muito obscuro sobre esse artefato");
						// Thread.sleep(3000);
						System.out.println("Kurtney: Meu bem! Só estou atrás de uma vingancinha mesmo");
						// Thread.sleep(3000);
						System.out.println(nomeUsuario
								+ ": E eu apenas quero poder conseguir ouro o suficiente para reconstruir a minha vida");
						// Thread.sleep(3000);
						System.out.println("Abdalah: MAS!!! Tudo bem, vamos em frente, vamos seguir esse mapa");
						// Thread.sleep(3000);

						/* INÍCIO CASTELO - GNOMOS - MERETRIZ */
						System.out.println("...");
						// Thread.sleep(2000);
						System.out.println(
								"O castelo era visível de muito longe, um enorme monumento construído em meio a cidadela.");
						// Thread.sleep(3000);

						System.out.println(
								"Extremamente luxuoso, perfeito para qualquer realeza viver tranquilamente sem se preocupar com nada.");
						// Thread.sleep(3000);
						System.out.println(
								"O castelo foi construído como se fosse uma mini-cidade, feita para servir o rei.");
						// Thread.sleep(3000);
						System.out.println(
								"Vocês chegam até a entrada do castelo, onde a guarda real está vistoriando todos que entram no castelo.");
						// Thread.sleep(4000);
						System.out.println(
								"A guarda real era uma guarda um tanto quanto peculiar, formada apenas por mulheres.");
						// Thread.sleep(2000);
						System.out.println(
								"Segundo o rei, é mais vergonhoso para o inimigo ser derrotado por mulheres. Não sei se devemos concordar com isso.");
						// Thread.sleep(3000);
						System.out.println(
								"Já que as mulheres da guarda real são considerados os humanos mais fortes do reino.");
						// Thread.sleep(3000);
						System.out.println("...");
						// Thread.sleep(2000);
						System.out.println("Kurtney: VALQUÍRIA! Minha querida! Quanto tempo!");
						// Thread.sleep(3000);
						System.out.println("Valquíria: KURTNEY! Venha aqui minha gostosa! Por onde você andou?");
						// Thread.sleep(3000);
						System.out.println(
								"Kurtney: Com o desgraçado do Axel. Aquele pilantra ainda vai sofrer na minha mão!");
						// Thread.sleep(3000);
						System.out.println(nomeUsuario + ": Então você conhece a capitã da guarda?");
						// Thread.sleep(2000);
						System.out.println("Valquíria: Sim! Eu e a Kurtney crescemos juntas!");
						// Thread.sleep(3000);
						System.out.println("Kurtney: Uhum!");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario
								+ ": E Kurtney, POR ALGUM ACASO VOCÊ NÃO PENSOU EM QUE ELA PODERIA TE AJUDAR?!");
						// Thread.sleep(3000);
						System.out.println("Valquíria: Você está precisando de alguma ajuda, Kurtney?");
						// Thread.sleep(3000);
						System.out.println("Kurtney: Ahhhh! " + nomeUsuario
								+ ", é meio complicado ficar pedindo favor para conhecido...");
						// Thread.sleep(3000);
						System.out.println(
								nomeUsuario + ": Eu não acredito nisso! Como assim, você me fez passar POR TUDO ISSO!");
						// Thread.sleep(3000);
						if (ouro <= 0) {
							System.out.println(
									nomeUsuario + ": Eu tive TODO o meu ouro roubado nessa 'aventura' por sua causa");
							// Thread.sleep(4000);
							System.out.println(
									nomeUsuario + ": E agora você vem me falar que conhece um alto oficial do reino?!");
							// Thread.sleep(3000);
							System.out.println(nomeUsuario + ": Estou INDIGNADO!");
							// Thread.sleep(2000);
						} else if (ouro > 0) {
							System.out.println(nomeUsuario + ": Após todo esse sufoco para chegar até aqui");
							// Thread.sleep(3000);
							System.out.println(nomeUsuario
									+ ": E você me fala que conhece um alto oficial do reino?! Francamente!");
							// Thread.sleep(3000);
							System.out.println(nomeUsuario + ": Estou INDIGNADO!");
							// Thread.sleep(2000);
						}
						System.out.println("Kurtney: Para de frescura, " + nomeUsuario
								+ ", se não fosse por mim você ainda estaria lá choramingando");
						// Thread.sleep(6000);
						System.out.println("Kurtney: Por causa da sua plantação queimada, por favor né.");
						// Thread.sleep(3000);
						System.out.println("Abdalah: Se acalmem! Se não fosse por vocês eu ainda estaria presa lá");
						// Thread.sleep(3000);
						System.out.println(
								"Valquíria: Eu não estou entendendo bolhufas. Me explique o que está acontecendo, Kurtney");
						// Thread.sleep(3000);
						System.out.println("Kurtney: Abdalah, mostra o mapa");
						// Thread.sleep(2000);
						System.out.println(
								"Abdalah: Valquíria, precisamos chegar nesse local aqui que fica dentro do castelo");
						// Thread.sleep(3000);
						System.out.println("Valquíria: WOW! Como vocês conseguiram esse mapa?!");
						// Thread.sleep(2000);
						System.out.println("Abdalah: Um lunático entregou ele para um casal de gnomos");
						// Thread.sleep(2000);
						System.out.println(
								"Abdalah: Falando que tinha um artefato que poderia mudar o mundo, e que a chave disso tudo está aqui");
						// Thread.sleep(4000);
						System.out.println("Valquíria: Gnomos? Lunático? Artefato? Tá, calma");
						// Thread.sleep(4000);
						System.out.println(nomeUsuario + ": Sabe chegar até lá?");
						// Thread.sleep(3000);
						System.out.println("Valquíria: Eu acho melhor vocês falarem com o Rei Elvis primeiro");
						// Thread.sleep(3000);
						System.out.println("Valquíria: Não posso simplesmente deixar vocês irem até esse lugar...");
						// Thread.sleep(3000);
						System.out.println("Valquíria: Por favor, me acompanhem");
						// Thread.sleep(3000);
						System.out.println("...");
						// Thread.sleep(3000);
						System.out.println("O salão principal pode ser considerado como o cérebro do Reino.");
						// Thread.sleep(3000);
						System.out.println("Era aqui onde os Generais, Conselheiros e todo o Alto Escalão auxiliavam");
						// Thread.sleep(4000);
						System.out.println("O Rei Elvis a tomar as melhores decisões para todos os seus suditos");
						// Thread.sleep(3000);
						System.out.println("Era possível ver uma multidão concentrada as portas do salão principal");
						// Thread.sleep(3000);
						System.out.println(
								"Bom, basicamente era a maior concentração de gente que você já vira em toda a sua vida");
						// Thread.sleep(4000);
						System.out.println("...");
						// Thread.sleep(2000);
						System.out.println("Valquíria: Bom, só tem um problema: ");
						// Thread.sleep(2000);
						System.out.println("Valquíria: Hoje é dia da população dar as suas demandas...");
						// Thread.sleep(2000);
						System.out.println(
								nomeUsuario + ": Tá brincando, né? Vamos ter que esperar essa fila quilométrica?!");
						// Thread.sleep(2000);
						System.out.println(
								"Kurtney: Ah, Valquíria... Eu sei que você consegue uma forma mais prática de passarmos por isso, né?");
						// Thread.sleep(4000);
						System.out.println("Valquíria: Claro... Mas bem...");
						// Thread.sleep(3000);
						System.out.println("Kurtney: Ei, " + nomeUsuario + ", abra um pouco a mão para a minha amiga");
						// Thread.sleep(3000);
						if (ouro <= 0) {
							System.out.println(nomeUsuario + ": MAS! Eu não tenho nenhuma moeda de ouro!");
							// Thread.sleep(3000);
						} else {
							System.out.println(nomeUsuario + ": MAS! Eu só tenho " + ouro + " moedas de ouro!");
							// Thread.sleep(4000);
						}
						System.out.println("Valquíria: QUÊ?! Não! Não é isso que vocês estão pensando!");
						// Thread.sleep(3000);
						System.out.println(
								"Valquíria: Esperem aqui, vou tentar falar com um dos conselheiros e ver se consigo algo");
						// Thread.sleep(3000);
						System.out.println("Kurtney: Eu sabia que podia contar com você!");
						// Thread.sleep(2000);
						System.out.println("Abdalah: Bom, vou ver se arrumo algum lugar para sentar.");
						// Thread.sleep(2000);
						System.out.println("...");
						// Thread.sleep(2000);
						System.out.println(
								"Depois de belos 40 minutos esperando, vocês conseguem avistar a Valquíria sendo seguida");
						// Thread.sleep(3000);
						System.out.println("Por um homem alto, escondido as sombras de uma túnica");
						// Thread.sleep(3000);
						System.out.println("...");
						// Thread.sleep(2000);
						System.out.println("Valquíria: Me acompanhem!");
						// Thread.sleep(3000);
						System.out.println("Abdalah: Ei, " + nomeUsuario + ", ACORDA! Vamos!");
						// Thread.sleep(3000);
						System.out.println(nomeUsuario + ": Ah, ok... Ok!");
						// Thread.sleep(2000);
						System.out.println("...");
						// Thread.sleep(2000);
						System.out
								.println("Vocês saiam de perto de toda aquela multidão, e seguiam a figura misteriosa");
						// Thread.sleep(3000);
						System.out.println("...");
						// Thread.sleep(2000);
						System.out.println("Abdalah: Quem é esse ser?");
						// Thread.sleep(2000);
						System.out.println("Kurtney: Shhh.... Só acompanhe");
						// Thread.sleep(2000);
						System.out.println("...");
						// Thread.sleep(2000);
						System.out.println("Valquíria: Vos apresento a majestade Rei Elvis!");
						// Thread.sleep(2000);
						System.out.println("Abdalah: QUÊ?");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario + ": Oi, tudo bem?");
						// Thread.sleep(2000);
						System.out.println("Kurtney: ISSO SÃO MODOS?");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario + ": E o que eu devia fazer?");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario + ": Ah, me desculpe... Prazer, meu nome é " + nomeUsuario);
						// Thread.sleep(3000);
						System.out.println("Rei Elvis: Hahahahaha! Não se preocupem! Vocês são a minha salvação");
						// Thread.sleep(3000);
						System.out.println("Valquíria: Eu consegui falar com ele, e ele quis vir falar com vocês");
						// Thread.sleep(3000);
						System.out.println("Rei Elvis: Na verdade... Só queria me livrar daqueles camponeses mesmo");
						// Thread.sleep(3000);
						System.out.println("Rei Elvis: Odeio esse dia");
						// Thread.sleep(3000);
						System.out.println("Abdalah: Mas como assim?");
						// Thread.sleep(2000);
						System.out.println(
								"Rei Elvis: Meu avô proclamou esse dia para evitar uma revolta popular... E até hoje mantemos isso");
						// Thread.sleep(4000);
						System.out.println(
								"Rei Elvis: É um saco, tenho trocentas pessoas ao meu comando e eles poderiam fazer isso por mim");
						// Thread.sleep(3000);
						System.out.println(nomeUsuario + ": Verdade, seria mais prático");
						// Thread.sleep(2000);
						System.out.println("Rei Elvis: Viu? Já gostei de você, " + nomeUsuario + "!");
						// Thread.sleep(2000);
						System.out.println(
								"Kurtney: Enfim... Rei Elvis, eu gostaria de saber se você pode nos ajudar a chegar até esse ponto aqui");
						// Thread.sleep(4000);
						System.out.println("Abdalah: AH! O MAPA! Modeos, onde eu deixei?");
						// Thread.sleep(2000);
						System.out.println("Abdalah: Calma aí, calma aí que eu vou achar!");
						// Thread.sleep(2000);
						System.out.println("Abdalah: Ufa! Achei, tó, o mapa");
						// Thread.sleep(2000);
						System.out.println("Valquíria: Vocês me assustam");
						// Thread.sleep(2000);
						System.out.println("Rei Elvis: Hm... Esse lugar é conhecido por poucos...");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario + ": Podemos ir até lá?");
						// Thread.sleep(2000);
						System.out
								.println("Rei Elvis: Na verdade vocês DEVEM! Pois eu estarei ordenando que vocês vão!");
						// Thread.sleep(3000);
						System.out.println("Valquíria: Sério? O que tem de especial nessa parte do palácio?");
						// Thread.sleep(3000);
						System.out.println(
								"Rei Elvis: Bom... Eu mandei diversos dos nossos melhores guerreiros para lá...");
						// Thread.sleep(4000);
						System.out.println(
								"Valquíria: Por isso o desaparecimento de alguns membros de minha tropa?! EU SABIA!");
						// Thread.sleep(3000);
						System.out.println("Rei Elvis: Sim... Isso mesmo...");
						// Thread.sleep(2000);
						System.out
								.println("Valquíria: VOCÊ TEM IDEIA DE QUE QUASE CAUSOU UMA GUERRA POR CAUSA DISSO?!");
						// Thread.sleep(3000);
						System.out.println("Rei Elvis: Queridinha! Se ponha em vosso lugar, sou o seu soberano!");
						// Thread.sleep(3000);
						System.out.println("Valquíria: Me perdoe...");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario + ": Mas o que tem de tão importante lá?");
						// Thread.sleep(2000);
						System.out.println(
								"Rei Elvis: Esse lugar possui o segredo do mundo, os maiores tesouros que já existiram!");
						// Thread.sleep(3000);
						System.out.println(
								"Rei Elvis: Existe um culto secreto presente em todos os reinos que estão se mobilizando para... Bom...");
						// Thread.sleep(4000);
						System.out.println("Abdalah: Então o meu vizinho não é tão maluco quanto eu pensava");
						// Thread.sleep(3000);
						System.out.println(nomeUsuario + ": Nem fudendo que eu vou ir lá! Sou apenas um camponês!");
						// Thread.sleep(3000);
						System.out.println(
								"Rei Elvis: Bom, agora que eu contei a vocês isso tudo, ou é a forca ou tentar a sorte...");
						// Thread.sleep(3000);
						System.out.println("Kurtney: MAS REI! Como assim?!");
						// Thread.sleep(2000);
						System.out.println(
								"Rei Elvis: Tudo bem, serei generoso: a forca ou tentar a sorte e nunca mais se preocupar com nada na vida");
						// Thread.sleep(4000);
						System.out.println(
								"Rei Elvis: Se conseguirem sobreviver e desvendarem o que há dentro desse lugar, eu... eu...");
						// Thread.sleep(4000);
						System.out.println("Abdalah: Eu...?");
						// Thread.sleep(2000);
						System.out.println("Rei Elvis: Lhes tratarei como REIS!");
						// Thread.sleep(3000);
						System.out.println("Kurtney: Ótimo! o " + nomeUsuario + " irá, não é verdade?");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario + ": Porque eu?! Vai você, oras!");
						// Thread.sleep(2000);
						System.out.println("Rei Elvis: Vão todos vocês! Começando por você, " + nomeUsuario);
						// Thread.sleep(3000);
						System.out.println(nomeUsuario + ": Mas... não era primeiro as damas?");
						// Thread.sleep(3000);
						System.out.println("Valquíria: Pare de choramingar! Anda! Vamos indo!");
						// Thread.sleep(2000);
						System.out.println(
								"Rei Elvis: Calma! Para você não dizer que não confio em vocês e estou os condendando...");
						// Thread.sleep(3000);
						System.out.println(
								"Rei Elvis: Essa é a espada mais poderosa de todo o reino, faça bom proveito.");
						// Thread.sleep(3000);
						espadaPrincesa();
						System.out.println(nomeUsuario + ": Olha... Não prometo nada...");
						// Thread.sleep(2000);
						System.out.println("Abdalah: Ei, vamos te esperar aqui!");
						// Thread.sleep(2000);
						System.out.println("Kurtney: Vê se traz o meu maldito artefato!");
						// Thread.sleep(3000);
						System.out.println("...");
						// Thread.sleep(2000);
						System.out.println(
								"A Valquíria ia seguindo o mapa e te guiando pela densa floresta que ficava atrás do Palácio");
						// Thread.sleep(4000);
						System.out.println(
								"Você se sente tremendo de ansiedade por não saber o que te espera no final dessa trilha");
						// Thread.sleep(3000);
						System.out.println(
								"O que será esse tesouro? O que aconteceu com todos os outros bravos soldados?");
						// Thread.sleep(3000);
						System.out.println("Afinal, por que diabos VOCÊ foi o escolhido para isso?");
						// Thread.sleep(3000);
						System.out.println("Tudo culpa daquele tal de Axel!");
						// Thread.sleep(2000);
						System.out.println("...");
						// Thread.sleep(2000);
						System.out.println("Valquíria: Pode ser a última vez que nos vemos...");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario + ": Bom... E eu só queria viver a minha vida no condado");
						// Thread.sleep(3000);
						System.out.println("Valquíria: E como você veio parar no meio dessa confusão?");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario + ": Um cara queimou a minha plantação, aí eu queria me vingar");
						// Thread.sleep(2000);
						System.out.println("Valquíria: Parece que só piorou a sua situação, não é mesmo?");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario + "O que diabos é aquilo?!");
						// Thread.sleep(2000);
						System.out.println("Valquíria: Então... Aquilo é a entrada para o calabouço");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario + ": É um portal? Isso realmente existe?!");
						// Thread.sleep(2000);
						System.out.println("Valquíria: É o que parece... Bom...");
						// Thread.sleep(2000);
						System.out.println("Valquíria: É aqui que eu devo te deixar. Boa sorte.");
						// Thread.sleep(2000);
						System.out.println(nomeUsuario + ": É, parece que a minha vida é a última coisa que me sobrou");
						// Thread.sleep(3000);
						System.out.println(nomeUsuario + ": E pelo visto vou perder ela bem rapidamente...");
						// Thread.sleep(2000);

						linha = 18;
						coluna = 10;

						dungeon();
						break;
						/* FIM CASTELO - GNOMOS - MERETRIZ */
					}
					/* FIM GNOMOS - MERETRIZ */

				}
				/* FIM SEX SHOP - MERETRIZ */
			}
			/* FIM MERETRIZ - MERETRIZ */

			else {
				// Thread.sleep(2000);
				System.out.println("Digite um comando válido.");
				continue main;
			}
		}

	}
	/* FIM MAIN */
	
	/*INÍCIO DUNGEON */
	public static void dungeon() throws InterruptedException{
		int i, j = 0;
		String comando;
		Scanner sc = new Scanner(System.in);

		for (i = 0; i < 20; i++) {
			for (j = 0; j < 20; j++) {
				m[i][j] = "1";
				localizacao[i][j] = " ";
			}

		}

		statusDano();
		statusVida();

		// PREENCHE OS ESPAÇOS QUE VÃO SER PERCORRIDOS NO MAPA COM O NÚMERO 0.
	     m[1][3] = "0"; m[1][4] = "0"; m[1][5] = "0"; m[1][6] = "0"; m[1][7] = "0"; m[1][8] = "0"; m[1][16] = "0"; m[1][17] = "0"; m[1][18] = "U";
	     m[2][3] = "0"; m[2][4] = "0"; m[2][5] = "0"; m[2][6] = "0"; m[2][7] = "0"; m[2][8] = "0"; m[2][16] = "G";
	     m[3][2] = "E"; m[3][3] = "D"; m[3][4] = "0"; m[3][5] = "0"; m[3][6] = "0"; m[3][7] = "0"; m[3][8] = "H"; m[3][9] = "0"; m[3][10] = "0"; m[3][11] = "0"; m[3][16] = "0";
	     m[4][3] = "0"; m[4][4] = "0"; m[4][5] = "0"; m[4][6] = "0"; m[4][7] = "0"; m[4][8] = "0"; m[4][11] = "0"; m[4][16] = "0";
	     m[5][3] = "0"; m[5][4] = "0"; m[5][5] = "0"; m[5][6] = "0"; m[5][7] = "0"; m[5][8] = "0"; m[5][11] = "C"; m[5][16] = "0"; m[5][17] = "0"; m[5][18] = "0";
	     m[6][11] = "0"; m[6][18] = "0";
	     m[7][1] = "0"; m[7][2] = "0"; m[7][3] = "0"; m[7][4] = "0"; m[7][5] = "0"; m[7][11] = "0"; m[7][12] = "0"; m[7][13] = "0"; m[7][18] = "0";
	     m[8][1] = "0"; m[8][2] = "0"; m[8][3] = "B"; m[8][4] = "0"; m[8][5] = "0"; m[8][12] = "T"; m[8][13] = "0"; m[8][17] = "0"; m[8][18] = "O";
	     m[9][1] = "0"; m[9][2] = "0"; m[9][3] = "0"; m[9][4] = "0"; m[9][5] = "0"; m[9][13] = "0"; m[9][17] = "0";
	     m[10][1] = "0"; m[10][2] = "0"; m[10][3] = "0"; m[10][4] = "0"; m[10][5] = "T"; m[10][13] = "0"; m[10][17] = "0";
	     m[11][1] = "Q"; m[11][10] = "F"; m[11][11] = "0"; m[11][12] = "0"; m[11][13] = "0"; m[11][17] = "0";
	     m[12][1] = "X"; m[12][2] = "0"; m[12][3] = "0"; m[12][4] = "0"; m[12][5] = "0"; m[12][6] = "0"; m[12][7] = "Z"; m[12][10] = "0"; m[12][17] = "0";
	     m[13][1] = "0"; m[13][7] = "0"; m[13][10] = "0"; m[13][12] = "0"; m[13][13] = "0"; m[13][14] = "0"; m[13][15] = "0"; m[13][16] = "0"; m[13][17] = "X";
	     m[14][1] = "0"; m[14][7] = "0"; m[14][10] = "0"; m[14][12] = "0"; m[14][17] = "Q";
	     m[15][1] = "V"; m[15][7] = "0"; m[15][8] = "0"; m[15][9] = "0"; m[15][10] = "X"; m[15][11] = "0"; m[15][12] = "0"; m[15][14] = "0"; m[15][15] = "0"; m[15][16] = "0"; m[15][17] = "0"; m[15][18] = "0";
	     m[16][1] = "0"; m[16][14] = "0"; m[16][15] = "0"; m[16][16] = "0"; m[16][17] = "0"; m[16][18] = "0";
	     m[17][1] = "0"; m[17][6] = "0"; m[17][7] = "0"; m[17][8] = "0"; m[17][9] = "G"; m[17][10] = "0"; m[17][14] = "0"; m[17][15] = "0"; m[17][16] = "A"; m[17][17] = "0"; m[17][18] = "0";
	     m[18][1] = "0"; m[18][2] = "0"; m[18][3] = "0"; m[18][4] = "0"; m[18][5] = "0"; m[18][6] = "T"; m[18][10] = "P"; m[18][14] = "0"; m[18][15] = "0"; m[18][16] = "T"; m[18][17] = "0"; m[18][18] = "0";
		// FIM - PREENCHIMENTO DO MAPA COM O NÚMERO 0.

		localizacao[linha][coluna] = "█";

		// ---------------INÍCIO - IMPRIME O MAPA
		System.out.println("\t\t  MAPA");
		for (i = 0; i < 20; i++) {
			System.out.print("__");
		}
		System.out.println();
		for (i = 0; i < 20; i++) {
			System.out.print("|");
			for (j = 0; j < 20; j++) {
				System.out.print(localizacao[i][j] + " ");
			}
			System.out.println("|");
		}
		for (i = 0; i < 20; i++) {
			System.out.print("__");
		}
		System.out.println();
		// ---------------FIM - IMPRIME O MAPA

		// ---------------INÍCIO - LISTA DE COMANDOS
		do {
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("|                             Lista de comandos.                                    |");
			System.out.println("|                                                                                   |");
			System.out.println("|                   Comandos: Leste | Oeste | Norte | Sul |                         |");
			System.out.println("|                   Ações: Percepção | Abrir | Subir                                |");
			System.out.println("|                   Personagem: Status | Inventário | Mapa | Poção                  |");
			System.out.println("|                   Opções: Ajuda |                                                 |");
			System.out.println("|                                                                                   |");
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.print("Comando: ");

			comando = sc.nextLine();
			comando = comando.toUpperCase();

			if (comando.contentEquals("LESTE")) {
				if (m[linha][coluna + 1] == "1") {
					System.out.println("----------------------------------------------");
					System.out.println("Você não pode ir para essa direção, existe uma parede!");
					System.out.println("----------------------------------------------");
					//Thread.sleep(2000);
					System.out.println("Tente outra direção.\n\n\n");
					//Thread.sleep(1000);
				}
				if (m[linha][coluna + 1] != "1") {
					coluna++;
					localizacao[linha][coluna] = "Ð";
					opcoes(m, linha, coluna);
					if (vidaUsuario > 0) {
						mapa();
					}
				}
			} else if (comando.contentEquals("OESTE")) {
				if (m[linha][coluna - 1] == "1") {
					System.out.println("----------------------------------------------");
					System.out.println("Você não pode ir para essa direção, existe uma parede!");
					System.out.println("----------------------------------------------");
					//Thread.sleep(2000);
					System.out.println("Tente outra direção.\n\n\n");
					//Thread.sleep(1000);
				}
				if (m[linha][coluna - 1] != "1") {
					coluna--;
					localizacao[linha][coluna] = "Ð";
					opcoes(m, linha, coluna);
					if (vidaUsuario > 0) {
						mapa();
					}
				}
			} else if (comando.contentEquals("NORTE")) {
				if (m[linha - 1][coluna] == "1") {
					System.out.println("----------------------------------------------");
					System.out.println("Você não pode ir para essa direção, existe uma parede!");
					System.out.println("----------------------------------------------");
					//Thread.sleep(2000);
					System.out.println("Tente outra direção.\n\n\n");
					//Thread.sleep(1000);
				}
				if (m[linha - 1][coluna] != "1") {
					linha--;
					localizacao[linha][coluna] = "Ð";
					opcoes(m, linha, coluna);
					if (vidaUsuario > 0) {
						mapa();
					}
				}
			} else if (comando.contentEquals("SUL")) {
				if (m[linha + 1][coluna] == "1") {
					System.out.println("----------------------------------------------");
					System.out.println("Você não pode ir para essa direção, existe uma parede!");
					System.out.println("----------------------------------------------");
					//Thread.sleep(2000);
					System.out.println("Tente outra direção.\n\n\n");
					//Thread.sleep(1000);
				}
				if (m[linha + 1][coluna] != "1") {
					linha++;
					localizacao[linha][coluna] = "Ð";
					opcoes(m, linha, coluna);
					if (vidaUsuario > 0) {
						mapa();
					}
				}

			} else if (comando.contentEquals("STATUS")) {
				status();
			} else if (comando.contentEquals("POÇÃO") || comando.contentEquals("POCAO")) {
				potion();
			}  else if (comando.contentEquals("INVENTARIO") || comando.contentEquals("INVENTÁRIO")) {
				inventario(inventario);
			} else if (comando.contentEquals("MAPA")) {
				mapa();
			} else if (comando.contentEquals("PERCEPCAO") || comando.contentEquals("PERCEPÇÃO") || comando.contentEquals("PERCEPÇAO") || comando.contentEquals("PERCEPCÃO")) {
				percepcao(m, linha, coluna);
			} else if (comando.contentEquals("SUBIR")) {
				if (m[linha][coluna] == "E" && inimigoMorto[3] == 1) {
					Thread.sleep(2000);
					System.out.println("Você acha a saída.");
					Thread.sleep(2000);
					sair();
				} else if (m[linha][coluna] == "E" && inimigoMorto[3] == 0) {

					System.out.println("O Dragão de Asas de Mosca ainda está vivo!");
					System.out.println("Ele não vai te deixar subir enquanto viver.");
					System.out.println("OH MEODEOS! ELE ESTÁ VINDO!");
					
					
					opcoes(m, 3, 3);
					

				} else if (m[linha][coluna] != "E") {
					Thread.sleep(2000);
					System.out.println("Não existe nada para você subir.");
					Thread.sleep(2000);
					System.out.println("Tente outro comando.");
					Thread.sleep(2000);
				}
			} else if (comando.contentEquals("ABRIR")) {
				if (m[linha][coluna] == "T") {

					testeTesouro();
					
				} else {
					Thread.sleep(1000);
					System.out.println("Não existe nada para você abrir.");
					Thread.sleep(2000);
					System.out.println("Tente outro comando.");
					Thread.sleep(1000);
				}
			} else if (comando.contentEquals("AJUDA")){
				ajuda();
			}
			else {
				System.out.println("Digite um comando válido.");
			}
			if (m[linha][coluna] != "0" && m[linha][coluna] != "1") {
				localizacao[linha][coluna] = "░";
			} else {
				localizacao[linha][coluna] = "█";
			}
			if (localizacao[linha][coluna] == localizacao[3][1]) {
				sair();
			}

		} while (gameOver != 1);
	}
	/* FIM DUNGEON */
	
	/* INÍCIO FUNÇÃO QUE DETERMINA OS MONSTROS */
	private static void opcoes(String[][] m, int linha, int coluna) throws InterruptedException {

		Scanner sc = new Scanner(System.in);

		if (vidaUsuario > 0) {
			/* INÍCIO ARANHA GIGANTE */
			if (m[linha][coluna].equals("A")) {

				nomeInimigo = "Aranha Gigante";

				if (inimigoMorto[0] == 0) {
					System.out.println(nomeUsuario + ": Caralho muleque!");
					Thread.sleep(1000);
					System.out.println(nomeUsuario + ": Uma fodenda aranha gigante!");
					Thread.sleep(2000);
					System.out.println(nomeInimigo + ": KRRSSSSRRRRRRRSSSSSSSS!");
					Thread.sleep(1000);
					System.out.println(nomeUsuario + ": Tomei no cu!");
					Thread.sleep(3000);
					System.out.println("Prepare as suas Armas! Você está em combate!\n");
					Thread.sleep(3000);
					int vidaAranha = 85;
					int danoAranha = 15;

					vidaAranha = batalha(vidaAranha, danoAranha);

					if (vidaAranha <= 0) {
						inimigoMorto[0] = 1;
					}
				} else if (inimigoMorto[0] == 1) {
					Thread.sleep(1000);
					System.out.println("----------------------------------------------");
					System.out.println(
							"Ah! Aqui está a aranha que eu matei! Essas pinças ainda me trazem péssimas lembranças.");
					System.out.println("----------------------------------------------");
					Thread.sleep(1000);
				}
			}
			/* FIM ARANHA GIGANTE */

			/* INÍCIO TROLL */
			if (m[linha][coluna].equals("B")) {

				nomeInimigo = "Troll";
				if (inimigoMorto[1] == 0) {
					System.out.println("Maldição! Um " + nomeInimigo + "!");
					Thread.sleep(1000);
					System.out.println(nomeInimigo + ": Quem é você para gritar MALDIÇÃO?!");
					Thread.sleep(1000);
					System.out.println(nomeUsuario + ": ...Eu não sou ninguém.");
					Thread.sleep(1000);
					System.out.println(nomeInimigo + ": Você é alguém! Mas alguém MORTO!");
					Thread.sleep(1000);
					System.out.println("Prepare as suas Armas! Você está em combate!\n");
					int vidaTroll = 85;
					int danoTroll = 15;

					vidaTroll = batalha(vidaTroll, danoTroll);

					if (vidaTroll <= 0) {
						inimigoMorto[1] = 1;
					}
				} else if (inimigoMorto[1] == 1) {
					Thread.sleep(1000);
					System.out.println("----------------------------------------------");
					System.out.println("Aqui está aquele Troll fedido. Não deu nem graça essa batalha... ");
					System.out.println("----------------------------------------------");
					Thread.sleep(1000);
				}
			}
			/* FIM TROLL */

			/* INÍCIO GIGANTE COM BOLAS DE OURO */
			if (m[linha][coluna].equals("C")) {

				nomeInimigo = "Gigantes com Bolas de Ouro";
				if (inimigoMorto[2] == 0) {
					System.out.println(nomeUsuario
							+ ": Que barulho é esse de metais batendo, parece um daqueles Brinquedos Bate-Bate");
					Thread.sleep(2000);
					System.out.println("Tec, tec, tec, tec, tec...");
					Thread.sleep(2000);
					System.out.println(nomeInimigo
							+ ": Quem é esse ser humando insolente que ousa atrapalhar a minha brincadeira...");
					Thread.sleep(2000);
					System.out.println(nomeUsuario + ": Você ta brincando com as suas bolas?");
					Thread.sleep(2000);
					System.out.println(nomeInimigo + ": Sim, e elas são de ouro!");
					Thread.sleep(2000);
					System.out.println(
							nomeInimigo + ": Você já levou uma surra de bagos dourados?... Não? Então prepare-se!!!");
					Thread.sleep(2000);
					System.out.println("Pegue as suas Armas! Você está em combate!\n");
					int vidaGigante = 90;
					int danoGigante = 15;

					vidaGigante = batalha(vidaGigante, danoGigante);

					if (vidaGigante <= 0) {
						inimigoMorto[2] = 1;
					}

				} else if (inimigoMorto[2] == 1) {
					Thread.sleep(1000);
					System.out.println("----------------------------------------------");
					System.out.println(
							"Olho só, o corpo daquele Gigante perventido, ainda escuto o som da sua bolas... ");
					System.out.println("----------------------------------------------");
					Thread.sleep(1000);
				}
			}
			/* FIM GIGANTE COM BOLAS DE OURO */

			/* INÍCIO DRAGÃO COM ASAS DE MOSCA */
			if (m[linha][coluna].equals("D")) {

				nomeInimigo = "Dragão com Asas de Mosca";
				if (inimigoMorto[3] == 0) {
					System.out.println(nomeUsuario + ": Hahahaha... Olha o tamanho dessas Asas.");
					Thread.sleep(2000);
					System.out.println("Flee flee flee flee flee flee flee flee flee flee flee..");
					Thread.sleep(2000);
					System.out.println(nomeInimigo
							+ ": Você está a me zombar, pequeno cocô de rato? Você já viu o tamanho do meu poder?");
					Thread.sleep(4000);
					System.out.println(nomeUsuario + ": Hahahahaha, eu não consigo parar de rir, me desculpe...");
					Thread.sleep(3000);
					System.out.println(
							nomeInimigo + ": A ultima pessoa que fez isso não está mais aqui para contar a história.");
					Thread.sleep(3000);
					System.out.println(nomeUsuario + ": Você levou ele voando embora daqui? Hahahahaha");
					Thread.sleep(2000);
					System.out.println(nomeInimigo + ": Muito engraçadinho, vou lhe ensinar uma lição!");
					Thread.sleep(2000);
					System.out.println("Se prepare, a batalha final está prestes a começar... Pegue suas armas!!\n");
					int vidaDragao = 100;
					int danoDragao = 25;

					vidaDragao = batalha(vidaDragao, danoDragao);

					if (vidaDragao <= 0) {
						inimigoMorto[3] = 1;
					}
				} else if (inimigoMorto[3] == 1) {
					Thread.sleep(1000);
					System.out.println("----------------------------------------------");
					System.out.println(
							"Dragão com Asas de Mosca, algo estranho que me deu muito trabalho. Hahaha mas ainda não consigo parar de rir.");
					System.out.println("----------------------------------------------");
					Thread.sleep(3000);
				}
			}
			/* FIM DRAGÃO COM ASAS DE MOSCA */

			/* INÍCIO ESCADA */
			if (m[linha][coluna].equals("E")) {
				Thread.sleep(1000);
				System.out.println("----------------------------------------------");
				System.out.println("Você encontrou a escada para sair da Dungeon!");
				Thread.sleep(1000);
				System.out.println("Utilize o comando Subir para sair da Dungeon");
				System.out.println("----------------------------------------------");

			}
			/* FIM ESCADA */

			/* INÍCIO LOBISOMEM E SUAS CADELAS */
			if (m[linha][coluna].equals("F")) {

				nomeInimigo = "Lobisomem e suas Cadelas";

				if (inimigoMorto[4] == 0) {
					System.out.println(nomeUsuario + ": Olha só, tem um grupo de cachorros ali no canto.");
					Thread.sleep(2000);
					System.out.println("Lobisomem: Grrr, grrr.. auuu");
					Thread.sleep(4000);
					System.out.println(nomeUsuario + ": Perai, ta rolando umas sacanagens ali");
					Thread.sleep(2000);
					System.out.println("Lobisomem: Parem meus amores, tem alguém nos espiando.");
					Thread.sleep(2000);
					System.out.println("Cadelas: O que? Chama para participar também, meu bem.");
					Thread.sleep(2000);
					System.out.println(
							"   ----- Você está diante do Lobisomem e suas três cadelas do mato carniceiras no cio! -----");
					Thread.sleep(2000);
					System.out.println("Lobisomem: Ei! Vou te fuder também, carai!");
					Thread.sleep(2000);
					System.out.println(
							"   ----- Você atrapalhou as aventuras do Lobisomen! Livre vosso anus dessa aventura. -----");
					Thread.sleep(2000);
					System.out.println("Se prepare, o seu está na reta!... Se livre da Zoofilia!!\n");
					int vidaLobisomem = 75;
					int danoLobisomem = 18;

					vidaLobisomem = batalha(vidaLobisomem, danoLobisomem);

					if (vidaLobisomem <= 0) {
						inimigoMorto[4] = 1;
					}
				} else if (inimigoMorto[4] == 1) {
					Thread.sleep(1000);
					System.out.println("----------------------------------------------");
					System.out.println(
							"Pensando por um lado... Até que teria sido uma experiência interessante ter participado daquela sacanagem com o Lobisomem e suas Cadelas.");
					System.out.println("----------------------------------------------");
					Thread.sleep(5000);
				}
			}
			/* FIM LOBISOMEM E SUAS CADELAS */

			/* INÍCIO CORREDOR ESCURO */
			if (m[linha][coluna].equals("G")) {
				Thread.sleep(1000);
				System.out.println("----------------------------------------------");
				System.out.println("Você está diante de um corredor escuro.");
				Thread.sleep(1000);
				System.out.println("O medo está te consumindo.");
				System.out.println("----------------------------------------------");
				Thread.sleep(3000);
			}
			/* FIM CORREDOR ESCURO */

			/* INÍCIO PORTA BOSS */
			if (m[linha][coluna].equals("H")) {
				int test = 0;
				do {
					Thread.sleep(1000);
					System.out.println("----------------------------------------------");
					System.out.println("Você está diante de uma porta.");
					Thread.sleep(1000);
					System.out.println("Ela está fechada. Você consegue abrir?");
					System.out.println("----------------------------------------------");
					Thread.sleep(3000);
					System.out.print("Comando: ");
					decisaoString = sc.nextLine();
					decisaoString = decisaoString.toUpperCase();

					if (decisaoString.contentEquals("ABRIR")) {
						Thread.sleep(2000);
						System.out.println("Você abre a pesada porta.");
						Thread.sleep(2000);
						test = 1;
					} else {
						Thread.sleep(2000);
						System.out.println("Digite um comando válido.");
						Thread.sleep(2000);
						test = 0;
					}
				} while (test == 0);

				Thread.sleep(3000);
				System.out.println(nomeUsuario + ": Ufa!");
				Thread.sleep(3000);
				System.out.println("A porta volta a se fechar atrás de você.");
				Thread.sleep(3000);

			}
			/* FIM PORTA BOSS */

			/* INÍCIO ORC */
			if (m[linha][coluna].equals("O")) {

				nomeInimigo = "Orc";

				if (inimigoMorto[5] == 0) {
					System.out.println(nomeUsuario + ": MODEOS! O que diabos é você? Que coisa horrorosa!");
					Thread.sleep(2000);
					System.out.println(
							nomeInimigo + ": Finalmente chegou o meu jantar! Não aguento mais comer morcegos.");
					Thread.sleep(2000);
					System.out.println(nomeUsuario + ": Que? Não, calma, vamos ver isso aí!");
					Thread.sleep(3000);
					System.out.println(nomeUsuario
							+ ": Aqui perto tem altas vendinhas. Sério, te dou dinheiro para você comprar coisa melhor.");
					Thread.sleep(3000);
					System.out.println(nomeInimigo + ": Hm... Carne de cavalo realmente seria melhor.");
					Thread.sleep(3000);
					if (ouro > 0) {
						do {
							Thread.sleep(3000);
							System.out.println("Deseja subornar o " + nomeInimigo + "? (S ou N)");
							System.out.print("Resposta: ");
							Thread.sleep(3000);
							decisaoString = sc.nextLine();
							decisaoString = decisaoString.toUpperCase();

							if (decisaoString.contentEquals("S")) {
								System.out.println(
										nomeUsuario + ": Por favor! Eu pago para você comprar a sua carne de cavalo!");
								Thread.sleep(3000);
								System.out.println(nomeInimigo + ": Eu querer 30 moedas de ouro!");
								Thread.sleep(3000);
								suborno: while (true) {
									System.out.println("Digite quantas moedas de ouro você quer dar para o Orc:");
									System.out.print("Quantidade: ");
									decisaoInt = sc.nextInt();

									if ((decisaoInt < 30 && decisaoInt > 0) && decisaoInt <= ouro) {
										Thread.sleep(2000);
										System.out.println(nomeInimigo + ": Há! Isso não ser o suficiente!");
										Thread.sleep(2000);
										ouro = decisaoInt - ouro;
										break;
									}
									if (decisaoInt > ouro) {
										Thread.sleep(2000);
										System.out.println(nomeInimigo + ": Você não ter esse ouro!");
										Thread.sleep(2000);
										ouro = decisaoInt - ouro;
										break;
									}
									if (decisaoInt <= 0) {
										System.out.println(nomeUsuario + ": Eu não vou te dar BOLHUFAS!");
										break;
									}
									if (decisaoInt >= 30 && ouro >= decisaoInt) {
										Thread.sleep(2000);
										System.out.println(nomeInimigo + ": Eu ficar feliz por você ser generoso!");
										Thread.sleep(2000);
										System.out.println(nomeInimigo
												+ ": Se bem que eu vou pegar o restante de seu moeda depois de te matar!");
										Thread.sleep(2000);
										System.out.println(nomeUsuario + ": Mas que filha da puta!");
										Thread.sleep(2000);
										ouro = decisaoInt - ouro;
										break;
									} else {
										System.out.println("Digite um valor válido.");
										continue suborno;
									}
								}
							} else if (decisaoString.contentEquals("N")) {
								System.out.println(nomeUsuario + ": Eu não vou te dar BOLHUFAS!");
								break;
							} else {
								System.out.println("Digite um comando válido. \n");
							}
							break;
						} while (decisaoString != "S" || decisaoString != "N");
					}
					System.out.println("Você está em combate!\n");
					Thread.sleep(3000);
					int vidaOrc = 85;
					int danoOrc = 35;

					vidaOrc = batalha(vidaOrc, danoOrc);

					if (vidaOrc <= 0) {
						inimigoMorto[5] = 1;
					}
				} else if (inimigoMorto[5] == 1) {
					Thread.sleep(1000);
					System.out.println("----------------------------------------------");
					System.out.println("Ver esse Orc de novo lhe causa arrepios.");
					System.out.println("----------------------------------------------");
					Thread.sleep(3000);
				}
			}
			/* FIM ORC */

			/* INÍCIO PORTA FECHADA */
			if (m[linha][coluna].equals("P")) {
				Thread.sleep(1000);
				System.out.println("----------------------------------------------");
				System.out.println("Você está diante de uma porta.");
				Thread.sleep(1000);
				System.out.println("Ela está trancada e você não pode passar.");
				System.out.println("----------------------------------------------");
				Thread.sleep(3000);
			}
			/* FIM PORTA FECHADA */

			/* INÍCIO MENSAGEM ENTRADA SALÃO */
			if (m[linha][coluna].equals("Q")) {

				Thread.sleep(1000);
				System.out.println("----------------------------------------------");
				System.out.println("Você entra em um grande salão.");
				Thread.sleep(3000);
				System.out.println(
						"As histórias e os boatos contam que existem grandes perigos e tesouros escondidos nele.");
				System.out.println("----------------------------------------------");
				Thread.sleep(4000);

				m[linha][coluna] = "0";

			}
			/* FIM MENSAGEM ENTRADA SALÃO */

			/* INÍCIO TESOURO */
			if (m[linha][coluna].contentEquals("T")) {
				/* T1 */
				if (localizacao[linha][coluna] == localizacao[10][5] && tesouro1 == 1) {
					Thread.sleep(1000);
					System.out.println("----------------------------------------------");
					Thread.sleep(1000);
					System.out.println("Você finalmente está diante daquilo que todos se aventuram para buscar.");
					Thread.sleep(2000);
					System.out.println(
							"Muitos dariam a vida para poder ter o prazer de ser o primeiro a abrir esse milenar baú.");
					Thread.sleep(2000);
					System.out.println("----------------------------------------------");
					Thread.sleep(2000);
				} else if (localizacao[linha][coluna] == localizacao[10][5] && tesouro1 == 2) {
					Thread.sleep(1000);
					System.out.println("----------------------------------------------");
					Thread.sleep(2000);
					System.out.println(nomeUsuario + ": Aqui está o glorioso baú que eu já desbravei.");
					Thread.sleep(2000);
					System.out.println("----------------------------------------------");
					Thread.sleep(2000);
				}

				/* T2 */
				if (localizacao[linha][coluna] == localizacao[18][16] && tesouro2 == 1) {
					Thread.sleep(1000);
					System.out.println("----------------------------------------------");
					Thread.sleep(1000);
					System.out.println("Você finalmente está diante daquilo que todos se aventuram para buscar.");
					Thread.sleep(2000);
					System.out.println(
							"Muitos dariam a vida para poder ter o prazer de ser o primeiro a abrir esse milenar baú.");
					Thread.sleep(2000);
					System.out.println("----------------------------------------------");
					Thread.sleep(2000);
				} else if (localizacao[linha][coluna] == localizacao[18][16] && tesouro2 == 2) {
					Thread.sleep(1000);
					System.out.println("----------------------------------------------");
					Thread.sleep(1000);
					System.out.println("Você finalmente está diante daquilo que todos se aventuram para buscar.");
					Thread.sleep(2000);
					System.out.println(
							"Muitos dariam a vida para poder ter o prazer de ser o primeiro a abrir esse milenar baú.");
					Thread.sleep(2000);
					System.out.println("----------------------------------------------");
					Thread.sleep(2000);
				}

				/* T3 */
				if (localizacao[linha][coluna] == localizacao[8][12] && tesouro3 == 1) {
					Thread.sleep(1000);
					System.out.println("----------------------------------------------");
					Thread.sleep(1000);
					System.out.println("Você finalmente está diante daquilo que todos se aventuram para buscar.");
					Thread.sleep(2000);
					System.out.println(
							"Muitos dariam a vida para poder ter o prazer de ser o primeiro a abrir esse milenar baú.");
					Thread.sleep(2000);
					System.out.println("----------------------------------------------");
					Thread.sleep(2000);
				} else if (localizacao[linha][coluna] == localizacao[8][12] && tesouro3 == 2) {
					Thread.sleep(1000);
					System.out.println("----------------------------------------------");
					Thread.sleep(1000);
					System.out.println("Você finalmente está diante daquilo que todos se aventuram para buscar.");
					Thread.sleep(2000);
					System.out.println(
							"Muitos dariam a vida para poder ter o prazer de ser o primeiro a abrir esse milenar baú.");
					Thread.sleep(2000);
					System.out.println("----------------------------------------------");
					Thread.sleep(2000);
				}

				/* T4 */
				if (localizacao[linha][coluna] == localizacao[18][6] && tesouro4 == 1) {
					Thread.sleep(1000);
					System.out.println("----------------------------------------------");
					Thread.sleep(1000);
					System.out.println("Você finalmente está diante daquilo que todos se aventuram para buscar.");
					Thread.sleep(2000);
					System.out.println(
							"Muitos dariam a vida para poder ter o prazer de ser o primeiro a abrir esse milenar baú.");
					Thread.sleep(2000);
					System.out.println("----------------------------------------------");
					Thread.sleep(2000);
				} else if (localizacao[linha][coluna] == localizacao[18][6] && tesouro4 == 2) {
					Thread.sleep(1000);
					System.out.println("----------------------------------------------");
					Thread.sleep(1000);
					System.out.println("Você finalmente está diante daquilo que todos se aventuram para buscar.");
					Thread.sleep(2000);
					System.out.println(
							"Muitos dariam a vida para poder ter o prazer de ser o primeiro a abrir esse milenar baú.");
					Thread.sleep(2000);
					System.out.println("----------------------------------------------");
					Thread.sleep(2000);
				}

			}
			/* FIM TESOURO */

			/* INÍCIO BURACO */
			if (m[linha][coluna].equals("U")) {
				Thread.sleep(1000);
				System.out.println("----------------------------------------------");
				System.out.println("Você encontrou um buraco!");
				Thread.sleep(1000);
				System.out.println("Ele está muito alto, infelizmente parece que você não consegue sair.");
				System.out.println("----------------------------------------------");
				Thread.sleep(3000);
			}
			/* FIM BURACO */

			/* INÍCIO VAMPIRO E DUAS SEREIAS */
			if (m[linha][coluna].equals("V")) {
				nomeInimigo = "O Vampiro";

				if (inimigoMorto[6] == 0) {
					System.out
							.println(nomeUsuario + ": Calma aí! Isso é um choque de realidade muito grande para mim!");
					Thread.sleep(2000);
					System.out.println(
							nomeUsuario + ": Então realmente existem sereias e vampiros! E vocês são um casal?");
					Thread.sleep(2000);
					System.out.println(nomeInimigo + ": Veja o que temos por aqui! Sangue fresco!");
					Thread.sleep(2000);
					System.out.println(nomeUsuario + ": Não estou vendo nada disso aqui não!");
					Thread.sleep(3000);
					System.out.println(nomeInimigo + ": Só me diga que você é O negativo.");
					Thread.sleep(2000);
					System.out.println("Sereia: Ah meoamor, pare com isso, deixa o pobre humano em paz...");
					Thread.sleep(2000);
					System.out.println(
							nomeInimigo + ": Nah! Não é todos os dias que se vê uma coisinha dessas andando por aqui");
					Thread.sleep(3000);
					System.out.println(nomeInimigo + ": Ei, psiu! Venha aqui pro papai!");
					Thread.sleep(3000);
					System.out.println("Você está em combate!\n");
					Thread.sleep(1000);
					int vidaVampiro = 90;
					int danoVampiro = 10;

					vidaVampiro = batalha(vidaVampiro, danoVampiro);

					if (vidaVampiro <= 0) {
						inimigoMorto[6] = 1;
					}
				} else if (inimigoMorto[6] == 1) {
					Thread.sleep(1000);
					System.out.println("----------------------------------------------");
					Thread.sleep(2000);
					System.out.println(
							"Quem diria que existiria amor entre essas criaturas. E pensar que um vampiro ainda pode amar, que absurdo.");
					Thread.sleep(2000);
					System.out.println("----------------------------------------------");
					Thread.sleep(2000);
				}
			}
			/* FIM VAMPIRO E DUAS SEREIAS */

			/* INÍCIO ENCRUZILHADA */
			if (m[linha][coluna].equals("X")) {
				Thread.sleep(1000);
				System.out.println("----------------------------------------------");
				System.out.println("Você está diante de uma encruzilhada.");
				Thread.sleep(1000);
				System.out.println("Barulhos estranhos vem de ambas as direções.");
				System.out.println("----------------------------------------------");
				Thread.sleep(3000);
			}
			/* FIM ENCRUZILHADA */

			/* INÍCIO HORA DE ZOMBIE */
			if (m[linha][coluna].equals("Z")) {
				nomeInimigo = "A Horda Zombie";

				if (inimigoMorto[7] == 0) {
					System.out.println("Zombie: CÉÉÉÉÉÉÉÉREBROOOOOOOOOOO!");
					Thread.sleep(2000);
					System.out.println(nomeUsuario + ": Isso é uma coisa que a minha mãe fala que eu não tenho!");
					Thread.sleep(2000);
					System.out.println("Zombie: CÉÉÉÉÉREEEEEEBROOOOOOOOOOOO!!!!!!!!!");
					Thread.sleep(2000);
					System.out.println(nomeUsuario + ": Outro?! De onde vocês estão surgindo?!");
					Thread.sleep(2000);
					System.out.println("Zombie: Ahhhhhhhhrrrrrrrrrrrrr");
					Thread.sleep(2000);
					System.out.println(nomeUsuario
							+ ": HÁ! Vocês três devem ser os infelizes que morreram tentando a sorte por aqui!");
					Thread.sleep(3000);
					System.out.println("Zombie: HHHHHHHuuuuurrrrrrrrrrrrrrrrr");
					Thread.sleep(2000);
					System.out.println(nomeUsuario + ": Tá! Caralho! São 15 Zombies?!?!!");
					Thread.sleep(2000);
					System.out.println("Você está em combate!\n");
					Thread.sleep(2000);

					int vidaZombies = 50;
					int danoZombies = 10;

					vidaZombies = batalha(vidaZombies, danoZombies);

					if (vidaZombies <= 0) {
						inimigoMorto[7] = 1;
					}
				} else if (inimigoMorto[7] == 1) {
					Thread.sleep(1000);
					System.out.println("----------------------------------------------");
					Thread.sleep(2000);
					System.out.println("Eca! Será se eles ainda conseguem ressucitar pela segunda vez?");
					Thread.sleep(2000);
					System.out.println("E se eu morrer? Eu também viro um deles?");
					Thread.sleep(2000);
					System.out.println("----------------------------------------------");
					Thread.sleep(3000);
				}
			}
			/* FIM VAMPIRO E DUAS SEREIAS */

			System.out.println("");
		}
	}
	/* FIM FUNÇÃO QUE DETERMINA OS MONSTROS */

	/* INÍCIO FUNÇÃO DA BATALHA */
	public static int batalha(int vidaInimigo, int danoInimigo) throws InterruptedException {

		Thread.sleep(2000);
		System.out.println("----- Seus Status -----");
		System.out.println("Sua vida: " + vidaUsuario);
		System.out.println("Seu bônus de armadura: " + armaduraUsuario);
		System.out.println("Seu dano: " + danoUsuario);

		System.out.println("----- Seus Itens -----");
		System.out.println("Mão Esquerda: " + maoEsquerda);
		System.out.println("Mão Direita: " + maoDireita);
		System.out.println("Armadura: " + armadura);
		System.out.println("\n--------------------------------");
		System.out.println("----- Status " + nomeInimigo + " -----");
		System.out.println("Vida: " + vidaInimigo);
		System.out.println("Dano: " + danoInimigo);
		System.out.println("--------------------------------\n\n");
		Thread.sleep(2000);
		danoInimigo = danoInimigo - armaduraUsuario;

		do {
			tentativaUsuario: while (true) {

				if (vidaInimigo > 0 && vidaUsuario > 0) {
					System.out.println("\n----- SEU TURNO! -----");
					int dados = dadosUsuario();
					if (dados >= 6 && dados <= 9) {
						vidaInimigo = vidaInimigo - danoUsuario;
						System.out.println("Atacar!!!\n");
						System.out.println(nomeInimigo + " perdeu " + danoUsuario + " de HP.");
						Thread.sleep(2000);
						if (vidaInimigo <= 0) {
							vidaInimigo = 0;
						} else {
							System.out.println(nomeInimigo + " ainda tem " + vidaInimigo + " de vida.");
						}
					} else if (dados == 10) {
						System.out.println("----- Acerto crítico! -----");
						System.out.println(nomeInimigo + " morreu com apenas um ataque!");
						System.out.println("---------------------------\n");
						Thread.sleep(2000);
						vidaInimigo = 0;
						drop();
						break;
					}

				}
				if (vidaInimigo > 0 && vidaUsuario > 0) {
					Thread.sleep(2000);
					System.out.println("\n----- TURNO DO OPONENTE! -----");
					Thread.sleep(2000);
					int dados = dadosOponente();
					if (dados >= 6 && dados <= 9) {
						vidaUsuario = vidaUsuario - danoInimigo;
						System.out.println("Dano total do " + nomeInimigo + ": " + (danoInimigo + armaduraUsuario));
						System.out.println("\nSua armadura bloqueou " + armaduraUsuario + " de dano.");
						System.out.println("Você perdeu " + danoInimigo + " de HP.");
						Thread.sleep(2000);
						if (vidaUsuario <= 0) {
							vidaUsuario = 0;
							break;
						} else {
							System.out.println("Seu HP atual: " + vidaUsuario);
						}
					} else if (dados == 10) {
						System.out.println("----- Acerto crítico! -----");
						System.out.println("Você morreu com apenas um ataque!");
						Thread.sleep(2000);
						vidaUsuario = 0;
						break;
						// continue dungeon;
					} else {
						System.out.println(nomeInimigo + " errou o ataque!!\n");
						Thread.sleep(2000);
						continue tentativaUsuario;
					}

				}
				if (vidaInimigo <= 0) {
					System.out.println(nomeInimigo + " morreu!");
					Thread.sleep(2000);
					drop();
					break;
				}
			}
		} while (vidaInimigo > 0 && vidaUsuario > 0);
		if (vidaUsuario > 0) {
			System.out.println("----- FIM DA BATALHA! -----\n");
			Thread.sleep(2000);
		} else if (vidaUsuario <= 0) {
			morrer();
		}
		return vidaInimigo;
	}
	/* FIM FUNÇÃO DA BATALHA */

	/* INÍCIO FUNÇÃO QUE JOGA OS DADOS DO USUARIO */
	static int dadosUsuario() {

		String decisaoString;
		Scanner sc = new Scanner(System.in);

		int test = 0;
		int dados = 0;

		do {
			System.out.print("Role os dados!\nDigite R: ");
			decisaoString = sc.nextLine();
			decisaoString = decisaoString.toUpperCase();

			Random gerador = new Random();

			if (decisaoString.startsWith("R")) {

				dados = gerador.nextInt(10);
				dados = dados + 1;
				test = 1;

				System.out.println("Rolagem de dados: " + dados);
				if (dados <= 5) {
					System.out.println("Você errou.\n");
				} else {
					System.out.println("Você acertou!");
				}
			} else {
				System.out.println("Digite um comando válido.");
				test = 0;
			}
		} while (test == 0);
		return dados;
	}
	/* FIM FUNÇÃO QUE JOGA OS DADOS DO USUARIO */

	/* INÍCIO FUNÇÃO QUE JOGA OS DADOS DO OPONENTE */
	static int dadosOponente() {

		Random gerador = new Random();
		int dados;

		dados = gerador.nextInt(10);
		dados = dados + 1;

		System.out.println("Rolagem de dados: " + dados);

		return dados;
	}
	/* FIM FUNÇÃO QUE JOGA OS DADOS DO OPONENTE */

	/* INÍCIO DROP */
	public static void drop() {

		Scanner sc = new Scanner(System.in);
		int opcao = 0;

		/* INÍCIO DROP ARANHA GIGANTE */
		if (nomeInimigo == "Aranha Gigante") {
			System.out.println("Você encontra " + moedas() + " moedas de ouro no ninho da Aranha Gigante.");
			menu: while (true) {
				System.out.println("Além disso, você também encontra o seguinte item: ");
				System.out.println("Item Defensivo: Escudo Anti-Chama Draconiana [+5 Def]");
				System.out.println("Você deseja pegar o item? (S ou N)");
				System.out.print("Resposta: ");
				decisaoString = sc.next();
				decisaoString = decisaoString.toUpperCase();
				System.out.println("\n");

				if (decisaoString.startsWith("S")) {

					System.out.println("Deseja equipar ou guardar o item no inventário?");

					System.out.println("Mão Esquerda: " + maoEsquerda);
					System.out.println("Mão Direita: " + maoDireita);

					System.out.println("Digite a opção: ");
					System.out.println("1 - Mão Esquerda");
					System.out.println("2 - Mão Direita");
					System.out.println("3 - Colocar no Inventário");
					System.out.println("4 - Sair do Menu");
					System.out.print("Resposta: ");
					opcao = sc.nextInt();

					switch (opcao) {
					case 1:
						if (maoEsquerda == "Graveto") {
							maoEsquerda = "Escudo Anti-Chama Draconiana [+5 Def]";
							break;
						} else if (maoEsquerda != "Graveto") {
							System.out
									.println("Atualmente você está equipado com o seguinte intem na sua mão esquerda: "
											+ maoEsquerda);
							System.out.println("Deseja dropar esse item? (S ou N)");
							System.out.print("Resposta: ");
							decisaoString = sc.next();
							decisaoString = decisaoString.toUpperCase();

							if (decisaoString.startsWith("S")) {
								System.out.println("Você dropou: " + maoEsquerda);
								maoEsquerda = "Escudo Anti-Chama Draconiana [+5 Def]";
								System.out.println("Você substituiu por: " + maoEsquerda);
								break;
							} else {
								continue menu;
							}

						}
					case 2:
						if (maoDireita == "Graveto") {
							maoDireita = "Escudo Anti-Chama Draconiana [+5 Def]";
							break;
						} else {
							System.out
									.println("Atualmente você está equipado com o seguinte intem na sua mão esquerda: "
											+ maoDireita);
							System.out.println("Deseja dropar esse item? (S ou N)");
							decisaoString = sc.next();
							decisaoString = decisaoString.toUpperCase();

							if (decisaoString.startsWith("S")) {
								System.out.println("Você dropou: " + maoDireita);
								maoDireita = "Escudo Anti-Chama Draconiana [+5 Def]";
								System.out.println("Você substituiu por: " + maoDireita);
								break;
							} else {
								continue menu;
							}

						}
					case 3:
						/* INÍCIO CASO O USUÁRIO ESCOLHA O INVENTAŔIO. */

						String item = "Escudo Anti-Chama Draconiana [+5 Def]";

						testeInventario(inventario, item);

						/* FIM CASO O USUÁRIO ESCOLHA O INVENTÁRIO */
					case 1231321313:
						break;
					case 4:
						System.out.println("Deseja sair do menu? (S ou N)");
						System.out.print("Resposta: ");
						decisaoString = sc.next();
						decisaoString = decisaoString.toUpperCase();
						if (decisaoString.startsWith("S")) {
							break;
						} else if (decisaoString.startsWith("N")) {
							continue menu;
						}
					default:
						System.out.println("Por favor, digite um comando válido.");
						continue menu;

					}
				} else if (decisaoString.startsWith("N")) {
					System.out.println("Você jogou o Escudo Anti-Chama Draconiana [+5 Def] fora.");
				}else {
					System.out.println("Digite um comando válido.");
					continue menu;
				}
				break;
			}
		} /* FIM DROP ARANHA GIGANTE */

		/* INÍCIO DROP ORC */
		if (nomeInimigo == "Orc") {
			System.out.println("Você encontra com o Orc uma bolsa com " + moedas() + " moedas de ouro.");
			menu: while (true) {
			System.out.println("O " + nomeInimigo + " dropou o seguinte item: ");
			System.out.println("Item Defensivo: Escudo Élfico [+7 Def]");
			System.out.println("Você deseja pegar o item? (S ou N)");
			System.out.print("Resposta: ");
			decisaoString = sc.next();
			decisaoString = decisaoString.toUpperCase();
				if (decisaoString.startsWith("S")) {

					System.out.println("Deseja equipar ou guardar o item no inventário?");

					System.out.println("Mão Esquerda: " + maoEsquerda);
					System.out.println("Mão Direita: " + maoDireita);

					System.out.println("Digite a opção: ");
					System.out.println("1 - Mão Esquerda");
					System.out.println("2 - Mão Direita");
					System.out.println("3 - Colocar no Inventário");
					System.out.println("4 - Sair do Menu");
					System.out.print("Opção: ");
					opcao = sc.nextInt();

					switch (opcao) {
					case 1:
						if (maoEsquerda == "Graveto") {
							maoEsquerda = "Escudo Élfico [+7 Def]";
							break;
						} else {
							System.out
									.println("Atualmente você está equipado com o seguinte intem na sua mão esquerda: "
											+ maoEsquerda);
							System.out.println("Deseja dropar esse item? (S ou N)");
							System.out.print("Resposta: ");
							decisaoString = sc.next();
							decisaoString = decisaoString.toUpperCase();

							if (decisaoString.startsWith("S")) {
								System.out.println("Você dropou: " + maoEsquerda);
								maoEsquerda = "Escudo Élfico [+7 Def]";
								System.out.println("Você substituiu por: " + maoEsquerda);
								break;
							} else {
								continue menu;
							}

						}
					case 2:
						if (maoDireita == "Graveto") {
							maoDireita = "Escudo Élfico [+7 Def]";
							break;
						} else {
							System.out
									.println("Atualmente você está equipado com o seguinte intem na sua mão esquerda: "
											+ maoDireita);
							System.out.println("Deseja dropar esse item? (S ou N)");
							System.out.print("Resposta: ");
							decisaoString = sc.next();
							decisaoString = decisaoString.toUpperCase();

							if (decisaoString.startsWith("S")) {
								System.out.println("Você dropou: " + maoDireita);
								maoDireita = "Escudo Élfico [+7 Def]";
								System.out.println("Você substituiu por: " + maoDireita);
								break;
							} else {
								continue menu;
							}

						}
					case 3:
						/* INÍCIO CASO O USUÁRIO ESCOLHA O INVENTAŔIO. */
						String item = "Escudo Élfico [+7 Def]";

						testeInventario(inventario, item);

						/* FIM CASO O USUÁRIO ESCOLHA O INVENTÁRIO */
					case 1231321313:
						break;
					case 4:
						System.out.println("Deseja sair do menu? (S ou N)");
						System.out.print("Resposta: ");
						decisaoString = sc.next();
						decisaoString = decisaoString.toUpperCase();
						if (decisaoString.startsWith("S")) {
							break;
						} else if (decisaoString.startsWith("N")) {
							continue menu;
						}
					default:
						System.out.println("Por favor, digite um comando válido.");
						continue menu;

					}
				} else if (decisaoString.startsWith("N")){
					System.out.println("Você jogou o Escudo Élfico [+7 Def] fora.");	
				}else{
					System.out.println("Digite um comando válido.");
					continue menu;
				}
				break;
			}
		}
		/* FIM DROP ORC */

		/* INÍCIO TESOURO */
		if (nomeInimigo == "Tesouro") {
			/* INÍCIO TESOURO T1 */
			if (localizacao[linha][coluna] == localizacao[10][5])
				if (tesouro1 == 0) {
					System.out.println("Dentro do baú você encontra: " + moedas() + " moedas de ouro.");
					System.out.println("E uma poção de vida, que pode ser usada fora de batalha.");
					potion = potion + 1;
					menu: while (true) {
						System.out.println("Em baixo de toda a moeda você encontra:");
						System.out.println("Item Defensivo: Armadura Dura de Casca de Cinamomo [+5 Def]");
						System.out.println("Deseja equipar esse item? (S ou N)");
						System.out.print("Resposta: ");
						decisaoString = sc.next();
						decisaoString = decisaoString.toUpperCase();
						System.out.println("\n");

						if (decisaoString.contentEquals("S")) {
							if (armadura == "Pijama") {
								armadura = "Armadura Dura de Casca de Cinamomo [+5 Def]";
								System.out.println("Você equipou " + armadura);
								break;
							}
							if (armadura != "Pijama") {
								menu2: while (true) {
									System.out.println("Atualmente você está equipado com: " + armadura);
									System.out.println("Deseja dropar " + armadura
											+ " e equipar Armadura Dura de Casca de Cinamomo [+5 Def]? (S ou N)");
									System.out.print("Resposta: ");
									decisaoString = sc.next();
									decisaoString = decisaoString.toUpperCase();
									System.out.println("\n");

									if (decisaoString.contentEquals("S")) {
										System.out.println("Você dropou " + armadura);
										armadura = "Armadura Dura de Casca de Cinamomo [+5 Def]";
										System.out.println("Você equipou " + armadura);
										break;

									}
									if (decisaoString.contentEquals("N")) {
										System.out.println("Você dropou Armadura Dura de Casca de Cinamomo [+5 Def]");
										break;

									} else {
										System.out.println("Digite um comando válido.");
										continue menu2;
									}
								}
							}
							break;
						}
						if (decisaoString.contentEquals("N")) {
							System.out.println("Você dropou Armadura Dura de Casca de Cinamomo [+5 Def]");
							break;

						} else {
							System.out.println("Digite um comando válido.");
							continue menu;
						}
					}
					tesouro1 = 2;
				}
			/* FIM TESOURO T1 */

			/* INÍCIO TESOURO T2 */
			if (localizacao[linha][coluna] == localizacao[18][16]) {
				if (tesouro2 == 0) {
					System.out.println("Dentro do baú você encontra: " + moedas() + " moedas de ouro.");
					System.out.println("E uma poção de vida, que pode ser usada fora de batalha.");
					potion = potion + 1;
					menu: while (true) {
						System.out.println("Em baixo de toda a moeda você encontra:");
						System.out.println("Item Defensivo: Armadura Mágica de Arnica [+3 Def]");
						System.out.println("Deseja equipar esse item? (S ou N)");
						System.out.print("Resposta: ");
						decisaoString = sc.next();
						decisaoString = decisaoString.toUpperCase();
						System.out.println("\n");

						if (decisaoString.contentEquals("S")) {
							if (armadura == "Pijama") {
								armadura = "Armadura Mágica de Arnica [+3 Def]";
								System.out.println("Você equipou " + armadura);
								break;
							}
							if (armadura != "Pijama") {
								menu2: while (true) {
									System.out.println("Atualmente você está equipado com: " + armadura);
									System.out.println("Deseja dropar " + armadura
											+ " e equipar Armadura Mágica de Arnica [+3 Def]? (S ou N)");
									System.out.print("Resposta: ");
									decisaoString = sc.next();
									decisaoString = decisaoString.toUpperCase();
									System.out.println("\n");

									if (decisaoString.contentEquals("S")) {
										System.out.println("Você dropou " + armadura);
										armadura = "Armadura Mágica de Arnica [+3 Def]";
										System.out.println("Você equipou " + armadura);
										break;

									}
									if (decisaoString.contentEquals("N")) {
										System.out.println("Você dropou Armadura Mágica de Arnica [+3 Def]");
										break;

									} else {
										System.out.println("Digite um comando válido.");
										continue menu2;
									}
								}
							}
							break;
						}
						if (decisaoString.contentEquals("N")) {
							System.out.println("Você dropou Armadura Mágica de Arnica [+3 Def]");
							break;

						} else {
							System.out.println("Digite um comando válido.");
							continue menu;
						}
					}
					tesouro2 = 2;
				}
			}
			/* FIM TESOURO T2 */

			/* INÍCIO TESOURO T3 */
			if (localizacao[linha][coluna] == localizacao[8][12]) {
				if (tesouro3 == 0) {
					System.out.println("Dentro do baú você encontra: " + moedas() + " moedas de ouro.");
					System.out.println("E uma poção de vida, que pode ser usada fora de batalha.");
					potion = potion + 1;
					menu: while (true) {
						System.out.println("Em baixo de toda a moeda você encontra:");
						System.out.println("Item Ofensivo: Espada da Lei da Pedra Grande [+3 Atk]");
						System.out.println("\n");
						System.out.println("-------- Seus Itens --------");
						System.out.println("Mão Esquerda: " + maoEsquerda);
						System.out.println("Mão Direita: " + maoDireita);
						System.out.println("-------- Seu Inventário --------");
						System.out.println("Slot 1: " + inventario[0]);
						System.out.println("Slot 2: " + inventario[1]);
						System.out.println("Slot 3: " + inventario[2]);
						System.out.println("\n");
						System.out.println("Deseja equipar esse item ou guardar no Inventário? (S ou N)");
						System.out.print("Resposta: ");
						decisaoString = sc.next();
						decisaoString = decisaoString.toUpperCase();
						System.out.println("\n");

						if (decisaoString.contentEquals("S")) {
							while (true) {
								System.out.println("Digite a opção desejada: ");
								System.out.println("1 - Equipar na Mão Esquerda");
								System.out.println("2 - Equipar na Mão Direita");
								System.out.println("3 - Guardar no Inventário");
								System.out.println("4 - Sair do Menu");
								System.out.print("Opção: ");
								decisaoInt = sc.nextInt();
								System.out.println("\n");

								if (decisaoInt >= 1 && decisaoInt <= 3) {
									if (decisaoInt == 1) {
										if (maoEsquerda == "Graveto") {
											maoEsquerda = "Espada da Lei da Pedra Grande [+3 Atk]";
											System.out.println("Você equipou " + maoEsquerda + " em sua Mão Esquerda");
											break;
										} else if (maoEsquerda != "Graveto") {
											System.out.println(
													"Atualmente você possui " + maoEsquerda + " em sua Mão Esquerda.");
											System.out.println(
													"Deseja guardar " + maoEsquerda + " no Inventário? (S ou N)");
											System.out.print("Resposta: ");
											decisaoString = sc.next();
											decisaoString = decisaoString.toUpperCase();
											System.out.println("\n");

											if (decisaoString.contentEquals("S")) {

												String item = "Espada da Lei da Pedra Grande [+3 Atk]";

												testeInventario(inventario, item);
												break;
											}
											break;
										}
									} else if (decisaoInt == 2) {
										if (maoDireita == "Graveto") {
											maoDireita = "Espada da Lei da Pedra Grande [+3 Atk]";
											System.out.println("Você equipou " + maoDireita + " em sua Mão Esquerda");
											break;
										} else if (maoDireita != "Graveto") {
											System.out.println(
													"Atualmente você possui " + maoDireita + " em sua Mão Esquerda.");
											System.out.println(
													"Deseja guardar " + maoDireita + " no Inventário? (S ou N)");
											System.out.print("Resposta: ");
											decisaoString = sc.next();
											decisaoString = decisaoString.toUpperCase();

											if (decisaoString.contentEquals("S")) {

												String item = "Espada da Lei da Pedra Grande [+3 Atk]";

												testeInventario(inventario, item);
												break;
											}
											break;
										}
									} else if (decisaoInt == 3) {
										String item = "Espada da Lei da Pedra Grande [+3 Atk]";

										testeInventario(inventario, item);
										break;
									}
									break;
								}
								if (decisaoInt == 4) {
									System.out.println("Você saiu do menu");
									break;
								}
								break;
							}
						}
						if (decisaoString.contentEquals("N")) {
							System.out.println("Você dropou Espada da Lei da Pedra Grande [+3 Atk]");
							break;

						} else if (decisaoInt > 4 || decisaoInt < 0) {
							System.out.println("Digite um comando válido.");
							continue menu;
						}
						break;
					}
					tesouro3 = 2;
				}
			}
			/* FIM TESOURO T3 */

			/* INÍCIO TESOURO T4 */
			if (localizacao[linha][coluna] == localizacao[18][6]) {
				if (tesouro4 == 0) {
					System.out.println("Dentro do baú você encontra: " + moedas() + " moedas de ouro.");
					System.out.println("E uma poção de vida, que pode ser usada fora de batalha.");
					potion = potion + 1;
					menu: while (true) {
						System.out.println("Em baixo de toda a moeda você encontra:");
						System.out.println("Item Ofensivo: Espada do Rei Caído [+2 Atk]");
						System.out.println("\n");
						System.out.println("-------- Seus Itens --------");
						System.out.println("Mão Esquerda: " + maoEsquerda);
						System.out.println("Mão Direita: " + maoDireita);
						System.out.println("-------- Seu Inventário --------");
						System.out.println("Slot 1: " + inventario[0]);
						System.out.println("Slot 2: " + inventario[1]);
						System.out.println("Slot 3: " + inventario[2]);
						System.out.println("\n");
						System.out.println("Deseja equipar esse item ou guardar no Inventário? (S ou N)");
						System.out.print("Resposta: ");
						decisaoString = sc.next();
						decisaoString = decisaoString.toUpperCase();
						System.out.println("\n");

						if (decisaoString.contentEquals("S")) {
							while (true) {
								System.out.println("Digite a opção desejada: ");
								System.out.println("1 - Equipar na Mão Esquerda");
								System.out.println("2 - Equipar na Mão Direita");
								System.out.println("3 - Guardar no Inventário");
								System.out.println("4 - Sair do Menu");
								System.out.print("Opção: ");
								decisaoInt = sc.nextInt();
								System.out.println("\n");

								if (decisaoInt >= 1 && decisaoInt <= 3) {
									if (decisaoInt == 1) {
										if (maoEsquerda == "Graveto") {
											maoEsquerda = "Espada do Rei Caído [+2 Atk]";
											System.out.println("Você equipou " + maoEsquerda + " em sua Mão Esquerda");
											break;
										} else if (maoEsquerda != "Graveto") {
											System.out.println(
													"Atualmente você possui " + maoEsquerda + " em sua Mão Esquerda.");
											System.out.println(
													"Deseja guardar " + maoEsquerda + " no Inventário? (S ou N)");
											System.out.print("Resposta: ");
											decisaoString = sc.next();
											decisaoString = decisaoString.toUpperCase();
											System.out.println("\n");

											if (decisaoString.contentEquals("S")) {

												String item = "Espada do Rei Caído [+2 Atk]";

												testeInventario(inventario, item);
												break;
											}
											break;
										}
									} else if (decisaoInt == 2) {
										if (maoDireita == "Graveto") {
											maoDireita = "Espada do Rei Caído [+2 Atk]";
											System.out.println("Você equipou " + maoDireita + " em sua Mão Esquerda");
											break;
										} else if (maoDireita != "Graveto") {
											System.out.println(
													"Atualmente você possui " + maoDireita + " em sua Mão Esquerda.");
											System.out.println(
													"Deseja guardar " + maoDireita + " no Inventário? (S ou N)");
											System.out.print("Resposta: ");
											decisaoString = sc.next();
											decisaoString = decisaoString.toUpperCase();

											if (decisaoString.contentEquals("S")) {

												String item = "Espada do Rei Caído [+2 Atk]";

												testeInventario(inventario, item);
												break;
											}
											break;
										}
									} else if (decisaoInt == 3) {
										String item = "Espada do Rei Caído [+2 Atk]";

										testeInventario(inventario, item);
										break;
									}
									break;
								}
								if (decisaoInt == 4) {
									System.out.println("Você saiu do menu");
									break;
								}
								break;
							}
						}
						if (decisaoString.contentEquals("N")) {
							System.out.println("Você dropou Espada do Rei Caído [+2 Atk]");
							break;

						} else if (decisaoInt > 4 || decisaoInt < 0) {
							System.out.println("Digite um comando válido.");
							continue menu;
						}
						break;
					}
					tesouro4 = 2;
				}
			}
			/* FIM TESOURO T4 */
		}
		/* FIM TESOURO */

		/* INÍCIO DROP VAMPIRO */
		if (nomeInimigo == "O Vampiro") {
			System.out.println("Você encontra com o Vampiro e a Sereia uma bolsa com " + moedas() + " moedas de ouro.");
			menu: while (true) {
				System.out.println(nomeInimigo + " dropou o seguinte item: ");
				System.out.println("Item Defensivo: Armadura de Felas [+2 Def]");
				System.out.println("Você deseja equipar esse item? (S ou N)");
				System.out.print("Resposta: ");
				decisaoString = sc.next();
				decisaoString = decisaoString.toUpperCase();

				if (decisaoString.contentEquals("S")) {
					if (armadura == "Pijama") {
						armadura = "Armadura de Felas [+2 Def]";
						System.out.println("Você equipou " + armadura);
						break;
					}
					if (armadura != "Pijama") {
						menu2: while (true) {
							System.out.println("Atualmente você está equipado com: " + armadura);
							System.out.println(
									"Deseja dropar " + armadura + " e equipar Armadura de Felas [+2 Def]? (S ou N)");
							System.out.print("Resposta: ");
							decisaoString = sc.next();
							decisaoString = decisaoString.toUpperCase();

							if (decisaoString.contentEquals("S")) {
								System.out.println("Você dropou " + armadura);
								armadura = "Armadura de Felas [+2 Def]";
								System.out.println("Você equipou " + armadura);
								break;

							}
							if (decisaoString.contentEquals("N")) {
								System.out.println("Você dropou Armadura de Felas [+2 Def]");
								break;

							} else {
								System.out.println("Digite um comando válido.");
								continue menu2;
							}
						}
					}
					break;
				}
				if (decisaoString.contentEquals("N")) {
					System.out.println("Você dropou Armadura de Felas [+2 Def]");
					break;

				} else {
					System.out.println("Digite um comando válido.");
					continue menu;
				}
			}
		} /* FIM DROP VAMPIRO */

		/* INÍCIO DROP ZOMBIE */
		if (nomeInimigo == "A Horda Zombie") {
			System.out.println("Você encontra com os Zombies uma bolsa com " + moedas() + " moedas de ouro.");
			menu: while (true) {
			System.out.println(nomeInimigo + " dropou o seguinte item: ");
			System.out.println("Item Defensivo: Escudo Tenatoriano de Temeria [+3 Def]");
			System.out.println("Você deseja pegar o item? (S ou N)");
			System.out.print("Resposta: ");
			decisaoString = sc.next();
			decisaoString = decisaoString.toUpperCase();
			System.out.println("\n");
			
				if (decisaoString.startsWith("S")) {

					System.out.println("Deseja equipar ou guardar o item no inventário?");

					System.out.println("Mão Esquerda: " + maoEsquerda);
					System.out.println("Mão Direita: " + maoDireita);

					System.out.println("Digite a opção: ");
					System.out.println("1 - Mão Esquerda");
					System.out.println("2 - Mão Direita");
					System.out.println("3 - Colocar no Inventário");
					System.out.println("4 - Sair do Menu");
					System.out.print("Opção: ");
					decisaoInt = sc.nextInt();
					System.out.println("\n");

					switch (decisaoInt) {
					case 1:
						if (maoEsquerda == "Graveto") {
							maoEsquerda = "Escudo Tenatoriano de Temeria [+3 Def]";
							break;
						} else {
							System.out
									.println("Atualmente você está equipado com o seguinte intem na sua mão esquerda: "
											+ maoEsquerda);
							System.out.println("Deseja dropar esse item? (S ou N)");
							System.out.print("Resposta: ");
							decisaoString = sc.next();
							decisaoString = decisaoString.toUpperCase();

							if (decisaoString.startsWith("S")) {
								System.out.println("Você dropou: " + maoEsquerda);
								maoEsquerda = "Escudo Tenatoriano de Temeria [+3 Def]";
								System.out.println("Você substituiu por: " + maoEsquerda);
								break;
							} else {
								continue menu;
							}

						}
					case 2:
						if (maoDireita == "Graveto") {
							maoDireita = "Escudo Tenatoriano de Temeria [+3 Def]";
							break;
						} else {
							System.out
									.println("Atualmente você está equipado com o seguinte intem na sua mão esquerda: "
											+ maoDireita);
							System.out.println("Deseja dropar esse item? (S ou N)");
							System.out.print("Resposta: ");
							decisaoString = sc.next();
							decisaoString = decisaoString.toUpperCase();

							if (decisaoString.startsWith("S")) {
								System.out.println("Você dropou: " + maoDireita);
								maoDireita = "Escudo Tenatoriano de Temeria [+3 Def]";
								System.out.println("Você substituiu por: " + maoDireita);
								break;
							} else {
								continue menu;
							}

						}
					case 3:
						/* INÍCIO CASO O USUÁRIO ESCOLHA O INVENTAŔIO. */
						String item = "Escudo Tenatoriano de Temeria [+3 Def]";

						testeInventario(inventario, item);

						/* FIM CASO O USUÁRIO ESCOLHA O INVENTÁRIO */
					case 1231321313:
						break;
					case 4:
						System.out.println("Deseja sair do menu? (S ou N)");
						System.out.print("Resposta: ");
						decisaoString = sc.next();
						decisaoString = decisaoString.toUpperCase();
						if (decisaoString.startsWith("S")) {
							break;
						} else if (decisaoString.startsWith("N")) {
							continue menu;
						}
					default:
						System.out.println("Por favor, digite um comando válido.");
						continue menu;

					}
				} else if (decisaoString.startsWith("N")){
					System.out.println("Você jogou o Escudo Tenatoriano de Temeria [+3 Def] fora.");	
				} else {
					System.out.println("Digite um comando válido.");
					continue menu;
				}
				break;
			}
		} /* FIM DROP ZOMBIE */

		/* INÍCIO DROP GIGANTE COM BOLAS DE OURO */
		if (nomeInimigo == "Gigantes com Bolas de Ouro") {
			System.out.println(
					"Você encontra com o Gigantes com Bolas de Ouro uma bolsa com " + moedas() + " moedas de ouro.");
			System.out.println(
					"Parece que seria uma boa ideia arrancar as bolas dele para vender. Pena que são muito pesadas.");
		}
		/* FIM DROP GIGANTE COM BOLAS DE OURO */

		/* INÍCIO DROP TROLL */
		if (nomeInimigo == "Troll") {
			System.out.println("Você encontra com o Troll alguns pedaços de carne podre.");
			System.out.println("Não seria uma boa ideia guardar isso.");
		}
		/* FIM DROP TROLL */

		/* INÍCIO DROP DRAGÃO COM ASAS DE MOSCA */
		if (nomeInimigo == "Dragão com Asas de Mosca") {
			System.out.println("Você encontra com o Dragão com Asas de Mosca uma chave.");
			System.out.println("Agora a chave está pendurada em seu pescoço, ela pode ser útil em algum momento.");
		}
		/* FIM DROP DRAGÃO COM ASAS DE MOSCA */

		/* INÍCIO DROP LOBISOMEM E SUAS CADELAS */
		if (nomeInimigo == "Lobisomem e suas Cadelas") {
			System.out.println("Bom, parece que o Lobisomem não tem nada que possa ser reaproveitado.");
		}
		/* FIM DROP LOBISOMEM E SUAS CADELAS */

		statusDano();
		statusVida();

		return;
	}
	/* FIM DROP */

	/* INÍCIO FUNÇÃO TESTE INVENTÁRIO */
	public static void testeInventario(String[] string, String item) {

		Scanner sc = new Scanner(System.in);

		testeInventario: while (true) {
			System.out.println("-------- Seu Inventário --------");
			System.out.println("1 - Slot 1: " + inventario[0]);
			System.out.println("2 - Slot 2: " + inventario[1]);
			System.out.println("3 - Slot 3: " + inventario[2]);
			System.out.println("4 - Sair do Menu");
			System.out.println("Deseja colocar em qual Slot?");
			System.out.print("Opção: ");
			decisaoInt = sc.nextInt();
			System.out.println("\n");

			if (decisaoInt == 1) {
				if (inventario[0] == "Vazio") {
					inventario[0] = item;
					System.out.println("Você guardou " + inventario[0] + " no Slot 1");
					break;
				} else if (inventario[0] != "Vazio" && inventario[1] == "Vazio" || inventario[2] == "Vazio") {
					System.out.println("Atualmente o seu Slot 1 possui " + inventario[0]);
					System.out.println("Deseja realocar esse Item em outro Slot vazio? (S ou N)");
					System.out.print("Resposta: ");
					decisaoString = sc.next();
					decisaoString = decisaoString.toUpperCase();

					if (decisaoString.contains("S")) {
						if (inventario[1] == "Vazio") {
							inventario[1] = inventario[0];
							inventario[0] = item;
							System.out.println("Você realocou " + inventario[1] + " no Slot 2");
							System.out.println("Você guardou " + inventario[0] + " no Slot 1");
							break;
						} else if (inventario[2] == "Vazio") {
							inventario[2] = inventario[0];
							inventario[0] = item;
							System.out.println("Você realocou " + inventario[2] + " no Slot 3");
							System.out.println("Você guardou " + inventario[0] + " no Slot 1");
							break;
						}
					}
					if (decisaoString.contentEquals("N")) {
						System.out.println("Você dropou " + inventario[0]);
						inventario[0] = item;
						System.out.println("Você guardou " + inventario[0] + " no Slot 1");
					}
					break;
				}
				break;
			}
			if (decisaoInt == 2) {
				if (inventario[1] == "Vazio") {
					inventario[1] = item;
					System.out.println("Você guardou " + inventario[1] + " no Slot 2");
					break;
				} else if (inventario[1] != "Vazio" && inventario[0] == "Vazio" || inventario[2] == "Vazio") {
					System.out.println("Atualmente o seu Slot 2 possui " + inventario[1]);
					System.out.println("Deseja realocar esse Item em outro Slot vazio?");
					System.out.print("Resposta: ");
					decisaoString = sc.next();
					decisaoString = decisaoString.toUpperCase();

					if (decisaoString.contains("S")) {
						if (inventario[0] == "Vazio") {
							inventario[0] = inventario[1];
							inventario[0] = item;
							System.out.println("Você realocou " + inventario[0] + " no Slot 1");
							System.out.println("Você guardou " + inventario[1] + " no Slot 2");
							break;
						} else if (inventario[2] == "Vazio") {
							inventario[2] = inventario[1];
							inventario[1] = item;
							System.out.println("Você realocou " + inventario[2] + " no Slot 3");
							System.out.println("Você guardou " + inventario[1] + " no Slot 2");
							break;
						}
					}
					if (decisaoString.contentEquals("N")) {
						System.out.println("Você dropou " + inventario[1]);
						inventario[1] = item;
						System.out.println("Você guardou " + inventario[1] + " no Slot 1");
					}
					break;
				}
				break;
			}
			if (decisaoInt == 3) {
				if (inventario[2] == "Vazio") {
					inventario[2] = item;
					System.out.println("Você guardou " + inventario[2] + " no Slot 3");
					break;
				} else if (inventario[2] != "Vazio" && inventario[0] == "Vazio" || inventario[1] == "Vazio") {
					System.out.println("Atualmente o seu Slot 2 possui " + inventario[1]);
					System.out.println("Deseja realocar esse Item em outro Slot vazio? (S ou N)");
					System.out.print("Resposta: ");
					decisaoString = sc.next();
					decisaoString = decisaoString.toUpperCase();

					if (decisaoString.contentEquals("S")) {
						if (inventario[0] == "Vazio") {
							inventario[0] = inventario[2];
							inventario[0] = item;
							System.out.println("Você realocou " + inventario[0] + " no Slot 1");
							System.out.println("Você guardou " + inventario[2] + " no Slot 3");
							break;
						} else if (inventario[1] == "Vazio") {
							inventario[1] = inventario[2];
							inventario[2] = item;
							System.out.println("Você realocou " + inventario[1] + " no Slot 2");
							System.out.println("Você guardou " + inventario[2] + " no Slot 3");
							break;
						}
						break;
					}
					if (decisaoString.contentEquals("N")) {
						System.out.println("Você dropou " + inventario[0]);
						inventario[0] = item;
						System.out.println("Você guardou " + inventario[0] + " no Slot 1");
					}
					break;
				}
				break;
			}
			if (decisaoInt == 4) {
				System.out.println("Você saiu do menu");
				break;
			} else {
				System.out.println("Digite um comando válido");
				continue testeInventario;
			}
		}
		statusVida();
		statusDano();
	}
	/* FIM FUNÇÃO TESTE INVENTÁRIO */

	/* INÍCIO FUNÇÃO INVENTÁRIO */
	private static void inventario(String[] string) {

		Scanner sc = new Scanner(System.in);
		menu: while (true) {

			System.out.println("O seu inventário atual possui os seguintes itens: ");
			System.out.println("Slot 1 - " + inventario[0]);
			System.out.println("Slot 2 - " + inventario[1]);
			System.out.println("Slot 3 - " + inventario[2]);
			System.out.println("Voce quer acessar um destes Slots? (S ou N)");
			System.out.print("Comando: ");
			decisaoString = sc.nextLine();
			decisaoString = decisaoString.toUpperCase();
			System.out.println("\n");

			if (decisaoString.contentEquals("S")) {
				System.out.println("Escolha o Slot que você deseja acessar:");
				System.out.println("1 - Slot 1 - " + inventario[0]);
				System.out.println("2 - Slot 2 - " + inventario[1]);
				System.out.println("3 - Slot 3 - " + inventario[2]);
				System.out.println("4 - Sair do menu.");
				System.out.print("Opção: ");
				decisaoInt = sc.nextInt();
				System.out.println("\n");

			} else if (decisaoString.contentEquals("N")) {
				System.out.println("Você saiu do Inventário.");
				break;
			} else {
				System.out.println("Digite um comando valido! ");
				continue menu;
			}

			switch (decisaoInt) {
			case 1:
				if (inventario[0] == "Vazio") {
					System.out.println("O Slot 1 está vazio.");
					continue menu;
				}
				do {
					if (inventario[0] != "Vazio") {
						System.out.println("Você deseja dropa ou equipar o item do Slot 1 (Dropar / Equipar)");
						System.out.print("Comando: ");
						decisaoString = sc.nextLine();
						decisaoString = decisaoString.toUpperCase();
						System.out.println("\n");

						if (decisaoString.contentEquals("DROPAR")) {
							System.out.println("Você dropou " + inventario[0]);
							inventario[0] = "Vazio";
							continue menu;
						} else if (decisaoString.contentEquals("EQUIPAR")) {
							System.out.println(
									"Deseja equipar o item na Mão Esquerda ou na Mão Direita? (Esquerda / Direita)");
							System.out.println("Mão Esquerda: " + maoEsquerda);
							System.out.println("Mão Direita: " + maoDireita);
							System.out.print("Comando: ");
							decisaoString = sc.nextLine();
							decisaoString = decisaoString.toUpperCase();
							System.out.println("\n");

							if (decisaoString.contentEquals("ESQUERDA")) {
								System.out.println("Você substituiu " + inventario[0] + " pelo " + maoEsquerda);
								auxiliarString = maoEsquerda;
								maoEsquerda = inventario[0];
								inventario[0] = auxiliarString;
								continue menu;
							}
							if (decisaoString.contentEquals("DIREITA")) {
								System.out.println("Você substituiu " + inventario[0] + " pelo " + maoDireita);
								auxiliarString = maoDireita;
								maoDireita = inventario[0];
								inventario[0] = auxiliarString;
								continue menu;
							}
						} else
							System.out.println("Digite um comando válido.");
					}

				} while (decisaoString != "DROPAR" || decisaoString != "EQUIPAR");

			case 2:
				if (inventario[1] == "Vazio") {
					System.out.println("O Slot 2 está vazio.");
					continue menu;
				}
				do {
					if (inventario[1] != "Vazio") {
						System.out.println("Você deseja dropa ou equipar o item do Slot 2 (Dropar / Equipar)");
						System.out.print("Comando: ");
						decisaoString = sc.nextLine();
						decisaoString = decisaoString.toUpperCase();
						System.out.println("\n");

						if (decisaoString.contentEquals("DROPAR")) {
							System.out.println("Você dropou " + inventario[1]);
							inventario[1] = "Vazio";
							continue menu;
						} else if (decisaoString.contentEquals("EQUIPAR")) {
							System.out.println(
									"Deseja equipar o item na Mão Esquerda ou na Mão Direita? (Esquerda / Direita)");
							System.out.println("Mão Esquerda: " + maoEsquerda);
							System.out.println("Mão Direita: " + maoDireita);
							System.out.print("Comando: ");
							decisaoString = sc.nextLine();
							decisaoString = decisaoString.toUpperCase();
							System.out.println("\n");

							if (decisaoString.contentEquals("ESQUERDA")) {
								System.out.println("Você substituiu " + inventario[1] + " pelo " + maoEsquerda);
								auxiliarString = maoEsquerda;
								maoEsquerda = inventario[1];
								inventario[1] = auxiliarString;
								continue menu;
							}
							if (decisaoString.contentEquals("DIREITA")) {
								System.out.println("Você substituiu " + inventario[1] + " pelo " + maoDireita);
								auxiliarString = maoDireita;
								maoDireita = inventario[1];
								inventario[1] = auxiliarString;
								continue menu;
							}
						} else
							System.out.println("Digite um comando válido.");
					}

				} while (decisaoString != "DROPAR" || decisaoString != "EQUIPAR");

			case 3:
				if (inventario[2] == "Vazio") {
					System.out.println("O Slot 3 está vazio.");
					continue menu;
				}
				do {
					if (inventario[2] != "Vazio") {
						System.out.println("Você deseja dropa ou equipar o item do Slot 3 (Dropar / Equipar)");
						System.out.print("Comando: ");
						decisaoString = sc.nextLine();
						decisaoString = decisaoString.toUpperCase();
						System.out.println("\n");

						if (decisaoString.contentEquals("DROPAR")) {
							System.out.println("Você dropou " + inventario[2]);
							inventario[2] = "Vazio";
							continue menu;
						} else if (decisaoString.contentEquals("EQUIPAR")) {
							System.out.println(
									"Deseja equipar o item na Mão Esquerda ou na Mão Direita? (Esquerda / Direita)");
							System.out.println("Mão Esquerda: " + maoEsquerda);
							System.out.println("Mão Direita: " + maoDireita);
							System.out.print("Comando: ");
							decisaoString = sc.nextLine();
							decisaoString = decisaoString.toUpperCase();
							System.out.println("\n");

							if (decisaoString.contentEquals("ESQUERDA")) {
								System.out.println("Você substituiu " + inventario[2] + " pelo " + maoEsquerda);
								auxiliarString = maoEsquerda;
								maoEsquerda = inventario[2];
								inventario[2] = auxiliarString;
								continue menu;
							}
							if (decisaoString.contentEquals("DIREITA")) {
								System.out.println("Você substituiu " + inventario[2] + " pelo " + maoDireita);
								auxiliarString = maoDireita;
								maoDireita = inventario[2];
								inventario[2] = auxiliarString;
								continue menu;
							}
						} else
							System.out.println("Digite um comando válido.");
					}

				} while (decisaoString != "DROPAR" || decisaoString != "EQUIPAR");

			}
			break;
		}
		statusVida();
		statusDano();
		return;
	}
	/* FIM FUNÇÃO INVENTÁRIO */

	/* INÍCIO DANO USUÁRIO */
	public static void statusDano() {

		/* INÍCIO ESPADA DA BENÇÃO DA PRINCESA */
		danoUsuario = 20;

		if (maoEsquerda == "Espada da Benção da Princesa [+10 Atk]"
				|| maoDireita == "Espada da Benção da Princesa [+10 Atk]") {
			danoUsuario = danoUsuario + 10;
		}
		/* FIM ESPADA DA BENÇÃO DA PRINCESA */

		/* INÍCIO ESPADA DA LEI DA PEDRA GRANDE */
		if (maoEsquerda == "Espada da Lei da Pedra Grande [+3 Atk]"
				|| maoDireita == "Espada da Lei da Pedra Grande [+3 Atk]") {
			danoUsuario = danoUsuario + 3;
		}
		/* FIM ESPADA DA LEI DA PEDRA GRANDE */

		/* INÍCIO ESPADA DO REI CAÍDO */
		if (maoEsquerda == "Espada do Rei Caído [+2 Atk]" || maoDireita == "Espada do Rei Caído [+2 Atk]") {
			danoUsuario = danoUsuario + 2;
		}
		/* FIM ESPADA DO REI CAÍDO */

	}
	/* FIM DANO USUÁRIO */

	/* INÍCIO FUNÇÃO VIDA USUÁRIO */
	public static void statusVida() {

		/* INÍCIO ARMADURAS */

		armaduraUsuario = 0;

		if (armadura == "Armadura de Felas [+2 Def]") {
			armaduraUsuario = armaduraUsuario + 2;
		}

		if (armadura == "Armadura Mágica de Arnica [+3 Def]") {
			armaduraUsuario = armaduraUsuario + 3;
		}

		if (armadura == "Armadura Dura de Casca de Cinamomo [+5 Def]") {
			armaduraUsuario = armaduraUsuario + 5;
		}
		/* FIM ARMADURAS */

		/* INÍCIO ESCUDOS */
		if (maoEsquerda == "Escudo Anti-Chama Draconiana [+5 Def]"
				|| maoDireita == "Escudo Anti-Chama Draconiana [+5 Def]") {
			armaduraUsuario = armaduraUsuario + 5;
		}

		if (maoEsquerda == "Escudo Élfico [+7 Def]" || maoDireita == "Escudo Élfico [+7 Def]") {
			armaduraUsuario = armaduraUsuario + 7;
		}

		if (maoEsquerda == "Escudo Tenatoriano de Temeria [+3 Def]"
				|| maoDireita == "Escudo Tenatoriano de Temeria [+3 Def]") {
			armaduraUsuario = armaduraUsuario + 3;
		}
		/* FIM ESCUDO */

		return;

	}
	/* FIM FUNÇÃO VIDA USUÁRIO */

	/* INICIO DA FUNCAO STATUS */
	public static void status() {
		System.out.println("Sua vida é: " + vidaUsuario);
		System.out.println("Seu dano é: " + danoUsuario);
		System.out.println("Seu bonus de armadura é: " + armaduraUsuario);
		System.out.println("Você possui: " + potion + " poções.");
		System.out.println("Você possui " + ouro + " moedas de ouro.\n");
		System.out.println("---------------- | Itens | ----------------");
		System.out.println("Armadura: " + armadura);
		System.out.println("Mão Esquerda: " + maoEsquerda);
		System.out.println("Mão Direita: " + maoDireita);
		System.out.println("-------------------------------------------");

	}
	/* FIM DA FUNCA STATUS */

	/* INICIO DA FUNÇÃO MAPA */
	public static void mapa() {
		// ---------------IMPRIME O MAPA-------------------------
		int i = 0, j = 0;
		System.out.println();
		System.out.println("\t\t  MAPA");
		for (i = 0; i < 20; i++) {
			System.out.print("__");
		}
		System.out.println();
		for (i = 0; i < 20; i++) {
			System.out.print("|");
			for (j = 0; j < 20; j++) {
				System.out.print(localizacao[i][j] + " ");
			}
			System.out.println("|");
		}
		for (i = 0; i < 20; i++) {
			System.out.print("__");
		}
		System.out.println();
		// -----------------------------------------------------
	}
	/* FIM DA FUNÇÃO MAPA */

	/* INICIO DA FUNÇÃO PERCEPÇÃO */
	public static void percepcao(String[][] m, int linha, int coluna) throws InterruptedException {

		System.out.println("\n\n|-------------------|");
		System.out.println("         N           ");
		System.out.println("         .           ");
		System.out.println("        ...          ");
		System.out.println("      .......        ");
		System.out.println(" O ............. L   ");
		System.out.println("      .......        ");
		System.out.println("        ...          ");
		System.out.println("         .           ");
		System.out.println("         S           ");
		System.out.println("|-------------------|");

		/* INÍCIO CAMINHO LIVRE */
		if (m[linha][coluna + 1] == "0") {
			System.out.println("LESTE - O caminho está livre.");
		}
		if (m[linha][coluna - 1] == "0") {
			System.out.println("OESTE - O caminho está livre");
		}
		if (m[linha - 1][coluna] == "0") {
			System.out.println("NORTE - O caminho está livre.");
		}
		if (m[linha + 1][coluna] == "0") {
			System.out.println("SUL - O caminho está livre");
		}
		/* FIM CAMINHO LIVRE */

		/* INÍCIO PAREDE */
		if (m[linha][coluna + 1] == "1") {
			System.out.println("LESTE - Tem uma parede.");
		}
		if (m[linha][coluna - 1] == "1") {
			System.out.println("OESTE - Tem uma parede.");
		}
		if (m[linha - 1][coluna] == "1") {
			System.out.println("NORTE - Tem uma parede.");
		}
		if (m[linha + 1][coluna] == "1") {
			System.out.println("SUL - Tem uma parede.");
		}
		/* FIM PAREDE */

		/* INÍCIO ARANHA */
		if (m[linha][coluna + 1] == "A") {
			if (inimigoMorto[0] == 0) {
				System.out.println("LESTE - Cuidado!!! Você avista uma Aranha Gigante.");
			} else {
				System.out.println("LESTE - Aqui está a fodenda aranha que você matou.");
			}
		}
		if (m[linha][coluna - 1] == "A") {
			if (inimigoMorto[0] == 0) {
				System.out.println("OESTE - Cuidado!!! Você avista uma Aranha Gigante.");
			} else {
				System.out.println("OESTE - Aqui está a fodenda aranha que você matou.");
			}
		}
		if (m[linha - 1][coluna] == "A") {
			if (inimigoMorto[0] == 0) {
				System.out.println("NORTE - Cuidado!!! Você avista uma Aranha Gigante.");
			} else {
				System.out.println("NORTE - Está a fodenda aranha que você matou.");
			}
		}
		if (m[linha + 1][coluna] == "A") {
			if (inimigoMorto[0] == 0) {
				System.out.println("SUL - Cuidado!!! Você avista uma Aranha Gigante.");
			} else {
				System.out.println("SUL - Aqui está a fodenda aranha que você matou.");
			}
		}
		/* FIM ARANHA */

		/* INÍCIO TROLL */
		if (m[linha][coluna + 1] == "B") {
			if (inimigoMorto[1] == 0) {
				System.out.println(
						"LESTE - Wow! Os trolls são uma das criaturas mais perigosas que existem! Tenha cuidado.");

			} else {
				System.out.println("LESTE - Aqui está aquele maldito troll que você matou!.");
			}
		}
		if (m[linha][coluna - 1] == "B") {
			if (inimigoMorto[1] == 0) {
				System.out.println(
						"OESTE - Wow! Os trolls são uma das criaturas mais perigosas que existem! Tenha cuidado.");

			} else {
				System.out.println("OESTE - Aqui está aquele maldito troll que você matou!.");
			}
		}
		if (m[linha - 1][coluna] == "B") {
			if (inimigoMorto[1] == 0) {
				System.out.println(
						"NORTE - Wow! Os trolls são uma das criaturas mais perigosas que existem! Tenha cuidado.");
			} else {
				System.out.println("NORTE - Está aquele maldito troll que você matou!.");
			}
		}
		if (m[linha + 1][coluna] == "B") {
			if (inimigoMorto[1] == 0) {
				System.out.println(
						"SUL - Wow! Os trolls são uma das criaturas mais perigosas que existem! Tenha cuidado.");
			} else {
				System.out.println("SUL - Aqui está aquele maldito troll que você matou!.");
			}
		}
		/* FIM TROLL */

		/* INÍCIO GIGANTE COM BOLAS DE OURO */
		if (m[linha][coluna + 1] == "C") {
			if (inimigoMorto[2] == 0) {
				System.out.println("LESTE - Tem um barulho estranho de metais batendo! Tenha cuidado.");

			} else {
				System.out.println("LESTE - Hahahaha, aqui está aquele gigante com as bolas de ouro.");
			}
		}
		if (m[linha][coluna - 1] == "C") {
			if (inimigoMorto[2] == 0) {
				System.out.println("OESTE - Tem um barulho estranho de metais batendo! Tenha cuidado.");

			} else {
				System.out.println("OESTE - Hahahaha, aqui está aquele gigante com as bolas de ouro.");
			}
		}
		if (m[linha - 1][coluna] == "C") {
			if (inimigoMorto[2] == 0) {
				System.out.println("NORTE - Tem um barulho estranho de metais batendo! Tenha cuidado.");
			} else {
				System.out.println("NORTE Hahahaha, aqui está aquele gigante com as bolas de ouro.");
			}
		}
		if (m[linha + 1][coluna] == "C") {
			if (inimigoMorto[2] == 0) {
				System.out.println("SUL - Tem um barulho estranho de metais batendo! Tenha cuidado.");
			} else {
				System.out.println("SUL - Hahahaha, aqui está aquele gigante com as bolas de ouro.");
			}
		}
		/* FIM GIGANTE COM BOLAS DE OURO */

		/* INÍCIO DRAGÃO COM ASAS DE MOSCA */
		if (m[linha][coluna + 1] == "D") {
			if (inimigoMorto[3] == 0) {
				System.out.println("LESTE - Uma gigantesca criatura está nessa direção! Será um Dragão?!");

			} else {
				System.out.println("LESTE - Hahahaha, as pequenas asas de mosca estão nessa direção.");
			}
		}
		if (m[linha][coluna - 1] == "D") {
			if (inimigoMorto[3] == 0) {
				System.out.println("OESTE - Uma gigantesca criatura está nessa direção! Será um Dragão?!?!");

			} else {
				System.out.println("OESTE - Hahahaha, as pequenas asas de mosca estão nessa direção.");
			}
		}
		if (m[linha - 1][coluna] == "D") {
			if (inimigoMorto[3] == 0) {
				System.out.println("NORTE - Uma gigantesca criatura está nessa direção! Será um Dragão?!");
			} else {
				System.out.println("NORTE - Hahahaha, as pequenas asas de mosca estão nessa direção.");
			}
		}
		if (m[linha + 1][coluna] == "D") {
			if (inimigoMorto[3] == 0) {
				System.out.println("SUL - Uma gigantesca criatura está nessa direção! Será um Dragão?!");
			} else {
				System.out.println("SUL - Hahahaha, as pequenas asas de mosca estão nessa direção.");
			}
		}
		/* FIM DRAGÃO COM ASAS DE MOSCA */

		/* INÍCIO ESCADA */
		if (m[linha][coluna + 1] == "E") {
			System.out.println("LESTE - É possível ver uma escada nessa direção.");
		}
		if (m[linha][coluna - 1] == "E") {
			System.out.println("OESTE - É possível ver uma escada nessa direção.");
		}
		if (m[linha - 1][coluna] == "E") {
			System.out.println("NORTE - É possível ver uma escada nessa direção.");
		}
		if (m[linha + 1][coluna] == "E") {
			System.out.println("SUL - É possível ver uma escada nessa direção.");
		}
		/* INÍCIO ESCADA */

		/* INÍCIO LOBISOMEM E SUAS CADELAS */
		if (m[linha][coluna + 1] == "F") {
			if (inimigoMorto[4] == 0) {
				System.out.println("LESTE - Aquilo são Cachorros... Se divertindo?!");

			} else {
				System.out.println("LESTE - E pensaque quase fui comigo. Em todos os sentidos por esses cachorros.");
			}
		}
		if (m[linha][coluna - 1] == "F") {
			if (inimigoMorto[4] == 0) {
				System.out.println("OESTE - Aquilo são Cachorros... Se divertindo?!");

			} else {
				System.out.println("OESTE - E pensaque quase fui comigo. Em todos os sentidos por esses cachorros.");
			}
		}
		if (m[linha - 1][coluna] == "F") {
			if (inimigoMorto[4] == 0) {
				System.out.println("NORTE - Aquilo são Cachorros... Se divertindo?!");
			} else {
				System.out.println("NORTE - E pensaque quase fui comigo. Em todos os sentidos por esses cachorros.");
			}
		}
		if (m[linha + 1][coluna] == "F") {
			if (inimigoMorto[4] == 0) {
				System.out.println("SUL - Aquilo são Cachorros... Se divertindo?!");
			} else {
				System.out.println("SUL - E pensaque quase fui comigo. Em todos os sentidos por esses cachorros.");
			}
		}
		/* FIM LOBISOMEM E SUAS CADELAS */

		/* INÍCIO CORREDOR ESCURO */
		if (m[linha][coluna + 1] == "G") {
			System.out.println("LESTE - Não é possível enxergar mais nada nessa direção.");
		}
		if (m[linha][coluna - 1] == "G") {
			System.out.println("OESTE - Não é possível enxergar mais nada nessa direção.");
		}
		if (m[linha - 1][coluna] == "G") {
			System.out.println("NORTE - Não é possível enxergar mais nada nessa direção.");
		}
		if (m[linha + 1][coluna] == "G") {
			System.out.println("SUL - Não é possível enxergar mais nada nessa direção.");
		}
		/* FIM CORREDOR ESCURO */

		/* INÍCIO PORTA */
		if (m[linha][coluna + 1] == "H") {
			System.out.println("LESTE - Existe uma porta. Será se eu consigo abrir?");
		}
		if (m[linha][coluna - 1] == "H") {
			System.out.println("OESTE - Existe uma porta. Será se eu consigo abrir?");
		}
		if (m[linha - 1][coluna] == "H") {
			System.out.println("NORTE - Existe uma porta. Será se eu consigo abrir?");
		}
		if (m[linha + 1][coluna] == "H") {
			System.out.println("SUL - Existe uma porta. Será se eu consigo abrir?");
		}
		/* FIM PORTA */

		/* INÍCIO ORC */
		if (m[linha][coluna + 1] == "O") {
			if (inimigoMorto[5] == 0) {
				System.out.println("LESTE - Aquilo é um Orc? Espero que não seja um Uruk-Hai");

			} else {
				System.out.println("LESTE - Tive sorte daquele Orc não ser um Uruk-Hai.");
			}
		}
		if (m[linha][coluna - 1] == "O") {
			if (inimigoMorto[5] == 0) {
				System.out.println("OESTE - Aquilo é um Orc? Espero que não seja um Uruk-Hai");

			} else {
				System.out.println("OESTE - Tive sorte daquele Orc não ser um Uruk-Hai.");
			}
		}
		if (m[linha - 1][coluna] == "O") {
			if (inimigoMorto[5] == 0) {
				System.out.println("NORTE - Aquilo é um Orc? Espero que não seja um Uruk-Hai");
			} else {
				System.out.println("NORTE - Tive sorte daquele Orc não ser um Uruk-Hai.");
			}
		}
		if (m[linha + 1][coluna] == "O") {
			if (inimigoMorto[5] == 0) {
				System.out.println("SUL - Aquilo é um Orc? Espero que não seja um Uruk-Hai");
			} else {
				System.out.println("SUL - Tive sorte daquele Orc não ser um Uruk-Hai.");
			}
		}
		/* FIM ORC */

		/* INÍCIO PORTAL - ONDE O USUÁRIO ENTROU */
		if (m[linha][coluna + 1] == "P") {
			System.out.println("LESTE - Esta porta está trancada pelo lado de fora.");
		}
		if (m[linha][coluna - 1] == "P") {
			System.out.println("OESTE - Esta porta está trancada pelo lado de fora.");
		}
		if (m[linha - 1][coluna] == "P") {
			System.out.println("NORTE - Esta porta está trancada pelo lado de fora.");
		}
		if (m[linha + 1][coluna] == "P") {
			System.out.println("SUL - Esta porta está trancada pelo lado de fora.");
		}
		/* FIM PORTAL - ONDE O USUÁRIO ENTROU */

		/* FIM BURACO - ONDE O USUÁRIO ENTROU */
		if (m[linha][coluna + 1] == "U") {
			System.out.println("LESTE - Que pena que o aquele Buraco está muito alto, não vou conseguir subir.");
		}
		if (m[linha][coluna - 1] == "U") {
			System.out.println("OESTE - Que pena que o aquele Buraco está muito alto, não vou conseguir subir.");
		}
		if (m[linha - 1][coluna] == "U") {
			System.out.println("NORTE - Que pena que o aquele Buraco está muito alto, não vou conseguir subir.");
		}
		if (m[linha + 1][coluna] == "U") {
			System.out.println("SUL - Que pena que o aquele Buraco está muito alto, não vou conseguir subir.");
		}
		/* FIM BURACO - ONDE O USUÁRIO ENTROU */

		/* FIM BURACO - ENTRADA PARA UM GRANDE SALÃO */
		if (m[linha][coluna + 1] == "Q") {
			System.out.println("LESTE - Você avista uma entrada para um grande salão.");
		}
		if (m[linha][coluna - 1] == "Q") {
			System.out.println("OESTE - Você avista uma entrada para um grande salão.");
		}
		if (m[linha - 1][coluna] == "Q") {
			System.out.println("NORTE - Você avista uma entrada para um grande salão.");
		}
		if (m[linha + 1][coluna] == "Q") {
			System.out.println("SUL - Você avista uma entrada para um grande salão.");
		}
		/* FIM BURACO - ENTRADA PARA UM GRANDE SALÃO */

		/* INÍCIO VAMPIRO E SEREIA */
		if (m[linha][coluna + 1] == "V") {
			if (inimigoMorto[6] == 0) {
				System.out.println("LESTE - Eu estou bêbado ou aquilo é uma Sereia e um Vampiro... Namorando?");

			} else {
				System.out.println("LESTE - Só faltou esse Vampiro me chamar de Bolsa de Sangue.");
			}
		}
		if (m[linha][coluna - 1] == "V") {
			if (inimigoMorto[6] == 0) {
				System.out.println("OESTE - Eu estou bêbado ou aquilo é uma Sereia e um Vampiro... Namorando?");

			} else {
				System.out.println("OESTE - Só faltou esse Vampiro me chamar de Bolsa de Sangue.");
			}
		}
		if (m[linha - 1][coluna] == "V") {
			if (inimigoMorto[6] == 0) {
				System.out.println("NORTE - Eu estou bêbado ou aquilo é uma Sereia e um Vampiro... Namorando?");
			} else {
				System.out.println("NORTE - Só faltou esse Vampiro me chamar de Bolsa de Sangue.");
			}
		}
		if (m[linha + 1][coluna] == "V") {
			if (inimigoMorto[6] == 0) {
				System.out.println("SUL - Eu estou bêbado ou aquilo é uma Sereia e um Vampiro... Namorando?");
			} else {
				System.out.println("SUL - Só faltou esse Vampiro me chamar de Bolsa de Sangue.");
			}
		}
		/* FIM VAMPIRO E SEREIA */

		/* INÍCIO ZOMBIES */
		if (m[linha][coluna + 1] == "Z") {
			if (inimigoMorto[7] == 0) {
				System.out.println("LESTE - Cérebros? Será se aquela galera são estudiosos?");

			} else {
				System.out.println("LESTE - É, parece que eu fiz uma pilha de corpos de Zombies.");
			}
		}
		if (m[linha][coluna - 1] == "Z") {
			if (inimigoMorto[7] == 0) {
				System.out.println("OESTE - Cérebros? Será se aquela galera são estudiosos?");

			} else {
				System.out.println("OESTE - É, parece que eu fiz uma pilha de corpos de Zombies.");
			}
		}
		if (m[linha - 1][coluna] == "Z") {
			if (inimigoMorto[7] == 0) {
				System.out.println("NORTE - Cérebros? Será se aquela galera são estudiosos?");
			} else {
				System.out.println("NORTE - É, parece que eu fiz uma pilha de corpos de Zombies.");
			}
		}
		if (m[linha + 1][coluna] == "Z") {
			if (inimigoMorto[7] == 0) {
				System.out.println("SUL - Cérebros? Será se aquela galera são estudiosos?");
			} else {
				System.out.println("SUL - É, parece que eu fiz uma pilha de corpos de Zombies.");
			}
		}
		/* INÍCIO ZOMBIES */

		/* INÍCIO ENCRUZILHADA */
		if (m[linha][coluna + 1] == "X") {
			System.out.println("LESTE - Nesta direção parece ter uma encruzilhada.");
		}
		if (m[linha][coluna - 1] == "X") {
			System.out.println("OESTE - Nesta direção parece ter uma encruzilhada.");
		}
		if (m[linha - 1][coluna] == "X") {
			System.out.println("NORTE - Nesta direção parece ter uma encruzilhada.");
		}
		if (m[linha + 1][coluna] == "X") {
			System.out.println("SUL - Nesta direção parece ter uma encruzilhada.");
		}
		/* FIM ENCRUZILHADA */

		/* INÍCIO TESOURO */
		if (m[linha][coluna + 1] == "T") {

			while (true) {

				/* INÍCIO TESOURO LESTE */
				if (tesouro1 == 1 && localizacao[linha][coluna - 1] == localizacao[10][5 - 1]) {
					System.out.println(
							"LESTE - Você avista um grande baú nesta direção. O que será que tem dentro dele?");
					break;
				} else if (tesouro1 != 0 && localizacao[linha][coluna - 1] == localizacao[10][5 - 1]) {
					System.out.println(
							"LESTE - Ah, ao Leste está o belo baú que você abriu. Que bom seria se surgisse mais coisas dentro dele :(");
					break;
				}

				if (tesouro2 == 1 && localizacao[linha][coluna - 1] == localizacao[18][15 - 1]) {
					System.out.println(
							"LESTE - Você avista um grande baú nesta direção. O que será que tem dentro dele?");

					break;
				} else if (tesouro2 != 1 && localizacao[linha][coluna - 1] == localizacao[18][15 - 1]) {
					System.out.println(
							"LESTE - Ah, ao Leste está o belo baú que você abriu. Que bom seria se surgisse mais coisas dentro dele :(");
					break;
				}

				if (tesouro3 == 1 && localizacao[linha][coluna - 1] == localizacao[8][12 - 1]) {
					System.out.println(
							"LESTE - Você avista um grande baú nesta direção. O que será que tem dentro dele?");
					break;
				} else if (tesouro3 != 1 && localizacao[linha][coluna - 1] == localizacao[8][12 - 1]) {
					System.out.println(
							"LESTE - Ah, ao Leste está o belo baú que você abriu. Que bom seria se surgisse mais coisas dentro dele :(");
					break;
				}

				if (tesouro4 == 1 && localizacao[linha][coluna - 1] == localizacao[18][6 - 1]) {
					System.out.println(
							"LESTE - Você avista um grande baú nesta direção. O que será que tem dentro dele?");
					break;
				} else if (tesouro4 != 1 && localizacao[linha][coluna - 1] == localizacao[18][6 - 1]) {
					System.out.println(
							"LESTE - Ah, ao Leste está o belo baú que você abriu. Que bom seria se surgisse mais coisas dentro dele :(");
					break;
				}
				/* FIM TESOURO LESTE */
			}

		}
		if (m[linha][coluna - 1] == "T") {

			while (true) {

				/* INÍCIO TESOURO OESTE */
				if (tesouro1 == 1 && localizacao[linha][coluna] == localizacao[10][5 + 1]) {
					System.out.println(
							"OESTE - Você avista um grande baú nesta direção. O que será que tem dentro dele?");
					break;
				} else if (tesouro1 != 1 && localizacao[linha][coluna] == localizacao[10][5 + 1]) {
					System.out.println(
							"OESTE - Ah, ao Leste está o belo baú que você abriu. Que bom seria se surgisse mais coisas dentro dele :(");
					break;
				}

				if (tesouro2 == 1 && localizacao[linha][coluna] == localizacao[18][16 + 1]) {
					System.out.println(
							"OESTE - Você avista um grande baú nesta direção. O que será que tem dentro dele?");
					break;
				} else if (tesouro2 != 1 && localizacao[linha][coluna] == localizacao[18][16 + 1]) {
					System.out.println(
							"OESTE - Ah, ao Leste está o belo baú que você abriu. Que bom seria se surgisse mais coisas dentro dele :(");
					break;
				}

				if (tesouro3 == 1 && localizacao[linha][coluna] == localizacao[8][12 + 1]) {
					System.out.println(
							"OESTE - Você avista um grande baú nesta direção. O que será que tem dentro dele?");
					break;
				} else if (tesouro3 != 1 && localizacao[linha][coluna] == localizacao[8][12 + 1]) {
					System.out.println(
							"OESTE - Ah, ao Leste está o belo baú que você abriu. Que bom seria se surgisse mais coisas dentro dele :(");
					break;
				}

				if (tesouro4 == 1 && localizacao[linha][coluna] == localizacao[18][6 + 1]) {
					System.out.println(
							"OESTE - Você avista um grande baú nesta direção. O que será que tem dentro dele?");
					break;
				} else if (tesouro4 != 1 && localizacao[linha][coluna] == localizacao[18][6 + 1]) {
					System.out.println(
							"OESTE - Ah, ao Leste está o belo baú que você abriu. Que bom seria se surgisse mais coisas dentro dele :(");
					break;
				}
				/* FIM TESOURO OESTE */

			}

		}
		if (m[linha - 1][coluna] == "T") {

			while (true) {

				/* INÍCIO TESOURO NORTE */
				if (tesouro1 == 1 && localizacao[linha][coluna] == localizacao[10 + 1][5]) {
					System.out.println(
							"NORTE - Você avista um grande baú nesta direção. O que será que tem dentro dele?");
					break;
				} else if (tesouro1 != 1 && localizacao[linha][coluna] == localizacao[10 + 1][5]) {
					System.out.println(
							"NORTE - Ah, ao Leste está o belo baú que você abriu. Que bom seria se surgisse mais coisas dentro dele :(");
					break;
				}

				if (tesouro2 == 1 && localizacao[linha][coluna] == localizacao[18 + 1][16]) {
					System.out.println(
							"NORTE - Você avista um grande baú nesta direção. O que será que tem dentro dele?");
					break;
				} else if (tesouro2 != 1 && localizacao[linha][coluna] == localizacao[18 + 1][16]) {
					System.out.println(
							"NORTE - Ah, ao Leste está o belo baú que você abriu. Que bom seria se surgisse mais coisas dentro dele :(");
					break;
				}

				if (tesouro3 == 1 && localizacao[linha][coluna] == localizacao[8 + 1][12]) {
					System.out.println(
							"NORTE - Você avista um grande baú nesta direção. O que será que tem dentro dele?");
					break;
				} else if (tesouro3 != 1 && localizacao[linha][coluna] == localizacao[8 + 1][12]) {
					System.out.println(
							"NORTE - Ah, ao Leste está o belo baú que você abriu. Que bom seria se surgisse mais coisas dentro dele :(");
					break;
				}

				if (tesouro4 == 1 && localizacao[linha][coluna] == localizacao[18 + 1][6]) {
					System.out.println(
							"NORTE - Você avista um grande baú nesta direção. O que será que tem dentro dele?");
					break;
				} else if (tesouro4 != 1 && localizacao[linha][coluna] == localizacao[18 + 1][6]) {
					System.out.println(
							"NORTE - Ah, ao Leste está o belo baú que você abriu. Que bom seria se surgisse mais coisas dentro dele :(");
					break;
				}
				/* FIM TESOURO NORTE */

			}
		}
		if (m[linha + 1][coluna] == "T") {

			while (true) {

				/* INÍCIO TESOURO SUL */
				if (tesouro1 == 1 && localizacao[linha][coluna] == localizacao[10 - 1][5]) {
					System.out
							.println("SUL - Você avista um grande baú nesta direção. O que será que tem dentro dele?");
					break;
				} else if (tesouro1 != 1 && localizacao[linha][coluna] == localizacao[10 - 1][5]) {
					System.out.println(
							"SUL - Ah, ao Leste está o belo baú que você abriu. Que bom seria se surgisse mais coisas dentro dele :(");
					break;
				}

				if (tesouro2 == 1 && localizacao[linha][coluna] == localizacao[18 - 1][16]) {
					System.out
							.println("SUL - Você avista um grande baú nesta direção. O que será que tem dentro dele?");
					break;
				} else if (tesouro2 != 1 && localizacao[linha][coluna] == localizacao[18 - 1][16]) {
					System.out.println(
							"SUL - Ah, ao Leste está o belo baú que você abriu. Que bom seria se surgisse mais coisas dentro dele :(");
					break;
				}

				if (tesouro3 == 1 && localizacao[linha][coluna] == localizacao[8 - 1][12]) {
					System.out
							.println("SUL - Você avista um grande baú nesta direção. O que será que tem dentro dele?");
					break;
				} else if (tesouro3 != 1 && localizacao[linha][coluna] == localizacao[8 - 1][12]) {
					System.out.println(
							"SUL - Ah, ao Leste está o belo baú que você abriu. Que bom seria se surgisse mais coisas dentro dele :(");
					break;
				}

				if (tesouro4 == 1 && localizacao[linha][coluna] == localizacao[18 - 1][6]) {
					System.out
							.println("SUL - Você avista um grande baú nesta direção. O que será que tem dentro dele?");
					break;
				} else if (tesouro4 != 1 && localizacao[linha][coluna] == localizacao[18 - 1][6]) {
					System.out.println(
							"SUL - Ah, ao Leste está o belo baú que você abriu. Que bom seria se surgisse mais coisas dentro dele :(");
					break;
				}
				/* FIM TESOURO SUL */

			}
		}
		/* FIM TESOURO */

		System.out.println("\n\n");
		Thread.sleep(3000);
	}
	/* FIM DA FUNÇÃO PERCEPÇÃO */

	/* INICIO DA FUNÇÃO SAIR DUNGEON */
	public static void sair() {
		System.out.println("Enquanto você sobe as longas escadas, você vai se lembrando de sua trajetória");
		System.out.println("De como um simples dia comum no condado pode ter mudado a sua vida para sempre");
		System.out.println("Quem diria que VOCÊ estaria em uma aventura, não é verdade?");
		System.out.println(nomeUsuario + ": Mas afinal... O que diabos tem de tão especial nisso tudo?");
		System.out.println(nomeUsuario + ": E eu já rodei todo esse maldito calabouço. Cadê esse Adolfo?");
		System.out.println(nomeUsuario + ": E o pior: Cadê todas as coisas que prometeram?");
		System.out.println("Continua...");

		gameOver();

	}
	/* FIM DA FUNÇÃO SAIR DUNGEON */

	/* INÍCIO FUNÇÃO MOEDAS */
	static int moedas() {

		Random gerador = new Random();
		int moedas;

		moedas = gerador.nextInt(50);
		moedas = moedas + 1;

		ouro = ouro + moedas;

		return moedas;
	}
	/* FIM FUNÇÃO MOEDAS */

	/* INÍCIO FUNÇÃO TESTES TESOURO */
	public static void testeTesouro() throws InterruptedException {

		while (true) {
			/* INÍCIO ABRIR O T1 */
			if(linha == 10 && coluna == 5){
				if(tesouro1 == 1){
					tesouro1 = 0;
					nomeInimigo = "Tesouro";
					drop();
					break;
				} else if (tesouro1 == 2){
					Thread.sleep(2000);
					System.out.println("Você já abriu esse baú.");
					Thread.sleep(2000);
					System.out.println("Tente outro comando.");
					Thread.sleep(2000);
					break;
				}
			}
			/* FIM ABRIR O T1 */

			/* INÍCIO ABRIR O T2 */
			if(linha == 18 && coluna == 16){
				if(tesouro2 == 1){
					tesouro2 = 0;
					nomeInimigo = "Tesouro";
					drop();
					break;
				} else if (tesouro2 == 2){
					Thread.sleep(2000);
					System.out.println("Você já abriu esse baú.");
					Thread.sleep(2000);
					System.out.println("Tente outro comando.");
					Thread.sleep(2000);
					break;
				}
			}
			/* FIM ABRIR O T2 */

			/* INÍCIO ABRIR O T3 */
			if(linha == 8 && coluna == 12){
				if(tesouro3 == 1){
					tesouro3 = 0;
					nomeInimigo = "Tesouro";
					drop();
					break;
				} else if (tesouro3 == 2){
					Thread.sleep(2000);
					System.out.println("Você já abriu esse baú.");
					Thread.sleep(2000);
					System.out.println("Tente outro comando.");
					Thread.sleep(2000);
					break;
				}
			}
			/* FIM ABRIR O T3 */

			/* INÍCIO ABRIR O T4 */
			if(linha == 18 && coluna == 6){
				if(tesouro4 == 1){
					tesouro4 = 0;
					nomeInimigo = "Tesouro";
					drop();
					break;
				} else if (tesouro4 == 2){
					Thread.sleep(2000);
					System.out.println("Você já abriu esse baú.");
					Thread.sleep(2000);
					System.out.println("Tente outro comando.");
					Thread.sleep(2000);
					break;
				}
			}
			/* FIM ABRIR O T4 */
		}
	}
	/* FIM FUNÇÃO TESTES TESOURO */

	/* INÍCIO FUNÇÃO ESPADA BENÇÃO DA PRINCESA */
	public static void espadaPrincesa() {
		/* INÍCIO ESPADA BENÇÃO DA PRINCESA */
		Scanner sc = new Scanner(System.in);

		System.out.println("------- Espada da Benção da Princesa [+10 Atk] -------");
		String item = "Espada da Benção da Princesa [+10 Atk]";
		System.out.println("Equipe ou guarde em seu Inventário");
		System.out.println("Mão Esquerda: " + maoEsquerda);
		System.out.println("Mão Direita: " + maoDireita);
		System.out.println("- Inventário -");
		System.out.println("Slot 1: " + inventario[0]);
		System.out.println("Slot 2: " + inventario[1]);
		System.out.println("Slot 3: " + inventario[2]);
		System.out.println("Selecione uma das opções: ");
		System.out.println("1 - Equipar na Mão Esquerda");
		System.out.println("2 - Equipar na Mão Direita");
		System.out.println("3 - Guardar no Inventário");
		System.out.print("Opção: ");
		decisaoInt = sc.nextInt();
		System.out.println("\n");

		if (decisaoInt == 1) {
			maoEsquerda = "Espada da Benção da Princesa [+10 Atk]";
		} else if (decisaoInt == 2) {
			maoDireita = "Espada da Benção da Princesa [+10 Atk]";
		} else {
			testeInventario(inventario, item);
		}

		/* FIM ESPADA BENÇÃO DA PRINCESA */
	}
	/* FIM FUNÇÃO ESPADA BENÇÃO DA PRINCESA */

	/* INÍCIO FUNÇÃO AJUDA */
	public static void ajuda() {

		Scanner sc = new Scanner(System.in);

		menu: while (true) {
			System.out.println("Opções de ajuda:");
			System.out.println("COMBATE | MOVIMENTAÇÃO | DROP | POÇÃO | SAIR");
			System.out.print("Comando: ");
			decisaoString = sc.nextLine();
			decisaoString = decisaoString.toUpperCase();
			System.out.println("\n");

				if (decisaoString.contentEquals("COMBATE")) {
				System.out.println(
						"O sistema de combate é baseado em RPG de mesa, onde os seus e o de seus inimigos são separados em: Armadura e Dano.");
				System.out.println("O dado utilizado para o combate é o D10, possuindo 10 lados.");
				System.out.println("D10: 6 para cima = Sucesso.");
				System.out.println("D10: 5 para baixo = Erro.");
				System.out.println("D10: 10 = Acerto crítico.");
				System.out.println("\n");
				System.out.println("Dano:");
				System.out.println(
						"O seu dano é baseado nos seus equipamentos. Além disso, você possui um Dano Base, que é de 20.");
				System.out.println(
						"Então se você não estiver portando nenhuma espada, o seu Dano será apenas o de base.");
				System.out.println("Atualmente, o único equipamento que bonifica o Dano são as Espadas.");
				System.out.println("É possível estar portando duas espadas no combate, sendo uma em cada mão.");
				System.out.println("\n");
				System.out.println("Armadura:");
				System.out.println("A Armadura não aumenta o seu HP. Ela desconta o Dano que o oponente.");
				System.out.println(
						"Atualmente existem dois tipos de equipamentos que bonificam a armadura: Os Escudos e As Armaduras");
				System.out.println(
						"É possível portar dois escudos, sendo um em cada mão. E apenas é possível portar uma única armadura.");
				System.out.println("\n");
				System.out.println(
						"Dessa forma, vence o combate quem deixar o HP do oponente zerado primeiro, seja com diversos ataques ou com apenas um único acerto (Tirando 10 no D10).");
			} else if (decisaoString.contentEquals("MOVIMENTAÇÃO") || decisaoString.contentEquals("MOVIMENTACAO")) {
				System.out.println("As únicas direções possíveis do jogo são: NORTE, SUL, LESTE, OESTE.");
				System.out.println("Não é possível se mover nas diagonais.");
				System.out.println("Para se mover, basta digitar 'norte', 'sul', 'leste' ou 'oeste'");
			} else if (decisaoString.contentEquals("DROP")) {
				System.out.println(
						"Cada criatura que você derrotar dentro do Calabouço irá dropar algum tipo de item e ouro.");
				System.out.println("A taxa de Drop de ouro varia, sendo gerada aleatoriamente de 1 moeda até 50.");
				System.out.println("\n");
				System.out.println("Cuide do seu ouro. É a única forma de subornar o barqueiro.");
			} else if (decisaoString.contentEquals("SAIR")) {
				System.out.println("Você saiu do menu de Ajuda.");
				break;
			} else if (decisaoString.contentEquals("POÇÃO") || decisaoString.contentEquals("POCAO")) {
				System.out.println("As poções são itens raros feitos por exímios boticários.");
				System.out.println(
						"Há boatos de que uma poção feita por um mestre boticário é capaz de prolongar a sua vida.");
				System.out.println(
						"Por conta disso muitos acreditam que o Rei Elvis é imortal e governa o reino a mais de");
				System.out.println("400 anos devido a sua semelhança com os seus antepassados.");
			} else {
				System.out.println("Digite um comando válido.");
				continue menu;
			}
		}
	}
	/* FIM FUNÇÃO AJUDA */

	/* INÍCIO FUNÇÃO POTION */
	public static void potion() throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		System.out.println("\n");

		if (potion == 0) {
			System.out.println("Você não possui nenhuma poção.");
		} else if (potion > 0) {

			if (potion == 1) {
				System.out.println("Você possui " + potion + " poção");
			} else if (potion > 1) {
				System.out.println("Você possui " + potion + " poções");
			}
			if (vidaUsuario >= 100) {
				System.out.println("Seus pontos de vida já estão cheios.");
			}
			if (vidaUsuario < 100) {
				menuPotion: while (true) {
					System.out.println("Você possui " + vidaUsuario + " pontos de vida.");
					System.out.println("Deseja utilizar uma poção? ( S ou N )");
					System.out.print("Resposta: ");
					decisaoString = sc.next();
					decisaoString = decisaoString.toUpperCase();
					
					if (decisaoString.startsWith("S")) {
						if (vidaUsuario >= 80) {
							int calculoCura = 0;

							calculoCura = 100 - vidaUsuario;

							vidaUsuario = 100;

							System.out.println("Você recuperou " + calculoCura + " pontos de vida.");
							System.out.println("Sua vida atual: " + vidaUsuario);
							potion = potion - 1;
							break;
						} else if (vidaUsuario < 80) {

							vidaUsuario = vidaUsuario + 20;

							System.out.println("Você recuperou 20 pontos de vida.");
							System.out.println("Sua vida atual: " + vidaUsuario);

							potion = potion - 1;
							break;
						}
					} else if (decisaoString.startsWith("N")) {
						System.out.println("Você saiu do menu.");
						Thread.sleep(2000);
						break;
					} else {
						System.out.println("Digite um comando válido.");
						continue menuPotion;
					}
					break;
				}
			}

		}

	}
	/* FIM FUNÇÃO POTION */

	/* INÍCIO FUNÇÃO MORRER */
	public static void morrer() throws InterruptedException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Você morreu.");
		Thread.sleep(3000);
		System.out.println("O Barqueiro está pronto para te levar até o paraíso.");
		Thread.sleep(2000);

		menu: while (true) {
			System.out.println("Barqueiro: Ei, defunto! Gostaria de viver novamente? (S ou N)");
			System.out.print("Resposta: ");
			decisaoString = sc.nextLine();
			decisaoString = decisaoString.toUpperCase();

			if (decisaoString.contentEquals("S")) {
				System.out.println("Barqueiro: Ótimo! Bom, para rir tem que me fazer rir.");
				Thread.sleep(2000);
				System.out.println(
						"Barqueiro: Bom, posso te levar de volta e fingir que nada aconteceu... Você apenas tem que me dar 25 moedas de ouro.");
				Thread.sleep(6000);
				if (ouro < 25) {
					System.out.println(nomeUsuario + ": Mas eu não tenho 25 moedas de ouro.");
					Thread.sleep(2000);
					System.out
							.println("Barqueiro: Bom, então acredito que vou poder continuar te chamando de DEFUNTO.");
					Thread.sleep(3000);
					gameOver();
					break;
				} else {
					System.out.println(
							"Barqueiro: E então, acho que você nunca pensou que a sua vida valesse... Tão pouco, né?");
					Thread.sleep(2000);
					System.out.println(nomeUsuario + ": Bom... Eu tenho " + ouro + " moedas de ouro");
					Thread.sleep(2000);
					System.out.println("Barqueiro: Então... Acordo fechado? (S ou N)");
					System.out.print("Resposta: ");
					decisaoString = sc.nextLine();
					decisaoString = decisaoString.toUpperCase();

					if (decisaoString.contentEquals("S")) {
						System.out.println("Barqueiro: Ótimo! Vê se aproveita a vida dessa vez!");
						Thread.sleep(2000);
						System.out.println("Barqueiro: Aproveitando ou não, eu estarei te esperando!");
						Thread.sleep(2000);
						ouro = ouro - 25;
						vidaUsuario = 100;
						break;
					}
				}
			} else if (decisaoString.contentEquals("N")) {
				System.out.println("Barqueiro: Bom, então acredito que vou poder continuar te chamando de DEFUNTO.");
				Thread.sleep(2000);
				gameOver();
				break;
			} else {
				System.out.println("Digite um comando válido.");
				Thread.sleep(2000);
				continue menu;
			}
			break;
		}
	}
	/* FIM FUNÇÃO MORRER */

	/* INÍCIO FUNÇÃO GAME OVER */
	public static void gameOver() {
		System.out.println("\n\n\nMuito obrigado por jogar o RPG da Loba Enterprise!");
		System.out.println("Orgulhosamente desenvolvido por:");
		System.out.println("Gustavo Lohmann");
		System.out.println("Kaue P. Silva");
		System.out.println("Lucas do Nascimento");
		System.out.println("\n\nPara maiores informações, acesse: www.lobaenterprise.com.br\n\n");

		System.out.println("░░░░░▄█▌▀▄▓▓▄▄▄▄▀▀▀▄▓▓▓▓▓▌█");
		System.out.println("░░░▄█▀▀▄▓█▓▓▓▓▓▓▓▓▓▓▓▓▀░▓▌█");
		System.out.println("░░█▀▄▓▓▓███▓▓▓███▓▓▓▄░░▄▓▐█▌");
		System.out.println("░█▌▓▓▓▀▀▓▓▓▓███▓▓▓▓▓▓▓▄▀▓▓▐█");
		System.out.println("▐█▐██▐░▄▓▓▓▓▓▀▄░▀▓▓▓▓▓▓▓▓▓▌█▌");
		System.out.println("█▌███▓▓▓▓▓▓▓▓▐░░▄▓▓███▓▓▓▄▀▐█");
		System.out.println("█▐█▓▀░░▀▓▓▓▓▓▓▓▓▓██████▓▓▓▓▐█");
		System.out.println("▌▓▄▌▀░▀░▐▀█▄▓▓██████████▓▓▓▌█▌");
		System.out.println("▌▓▓▓▄▄▀▀▓▓▓▀▓▓▓▓▓▓▓▓█▓█▓█▓▓▌█▌");
		System.out.println("█▐▓▓▓▓▓▓▄▄▄▓▓▓▓▓▓█▓█▓█▓█▓▓▓▐█");

		gameOver = 1;
	}
	/* FIM FUNÇÃO GAME OVER */
	
}
