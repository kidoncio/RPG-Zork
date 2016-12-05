/*O jogo da forca é um jogo em que o jogador tem que acertar qual é a heroi proposta, tendo como dica o número de letras e o tema ligado à heroi. A cada letra errada, é desenhada uma parte do corpo do enforcado. O jogo termina ou com o acerto da heroi ou com o término do preenchimento das partes corpóreas do enforcado. Você deve digitar no teclado letras que acredita que a heroi escondida possui. Caso a letra não exista nessa heroi, desenha-se uma parte do corpo (iniciando pela cabeça, tronco, braços e pernas). Mas cuidado! Você só tem 6 chances de errar. No desenvolvimento deste jogo, é trivial a utilização de matrizes para guardar os valores. No entanto, aqui neste exercício, será utilizado o método charAt(int index) para obter o valor de uma posição da heroi (não será implementado utilizando matrizes), e o método length() para saber o tamanho da heroi, sendo que ambos são métodos da classe String(mais detalhes sobre os métodos da classe String pode ser vistos em http://goo.gl/OdBKSo). Para facilitar um pouco, vamos definir um único tema, nome de heróis da Marvel.
 *O nome de cada personagem deverá ser atribuído à um número, onde também deverá ser utilizado a Classe Random para realizar um sorteio aleatório da heroi (nome do personagem) para inicializar a jogada. Lembre-se que é necessário também apresentar para o jogador as letras por ele utilizado.*/

import java.util.Scanner;
import java.util.Random;

public class Questao1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random gerador = new Random();

		int random, vida = 6, cont = 0;
		char caracteres[], caracterAcertado[], tentativa, menu;
		String heroi = "";
		String palavraFormada = "";
		boolean jogo = true, jogada = true;

		/* OPÇÕES DOS NOMES DOS PERSONAGENS DA MARVEL. */
		System.out.println("Bem vindo ao jogo da forca!");
		System.out
				.println("Todos os nomes são de heróis da Marvel." + "\nCaso você seja um nerd virjão, boas notícias!");

		String array[] = { "GAMBIT", "GROOT", "HULK", "CHARLESXAVIER", "HOMEM-ARANHA", "HOMEMDEFERRO", "WOLVERINE",
				"DEADPOOL", "CAPITAOAMERICA", "HOMEM-FORMIGA", "CICLOPE", "DAREDEVIL", "DOUTORESTRANHO", "LUKECAGE",
				"GAMORA", "GUARDIAO", "FALCAODEAÇO", "CAPITAOUNIVERSO", "COISA", "MULHERINVISIVEL" };

		/*
		 * EXISTE ESSE DO PARA QUE O JOGO APENAS TERMINE QUANDO O USUÁRIO
		 * QUISER.
		 */
		do {

			/* GERADOR DO NÚMERO RANDOM ENTRE 0 ATÉ 19 */
			random = gerador.nextInt(20);

			/*
			 * STRING QUE SORTEIA O ÍNDICE DO ARRAY, PARA SABER QUAL É O
			 * ESCOLHIDO.
			 */
			heroi = array[random];

			/*
			 * VARIAVEL QUE CALCULA O TAMANHO DO heroi SORTEADO PARA O USUÁRIO E
			 * COLOCA NO ARRAY tamanhoCaracteres.
			 */
			int tamanhoCaracteres = heroi.length();

			System.out.println("Dica: o(a) heroi contém " + tamanhoCaracteres + " caracteres.");
			System.out.println("\n");

			/*
			 * CRIA UMA ARRAY CHAMADA caracteres COM O MESMO TAMANHO DO
			 * tamanhoCaracteres.
			 */
			caracteres = new char[tamanhoCaracteres];

			/*
			 * FAZ COM QUE O caracteres OBTENHA EXATAMENTE CADA CARACTER DO
			 * heroi.
			 */
			for (int i = 0; i < tamanhoCaracteres; i++) {
				caracteres[i] = heroi.charAt(i);
				System.out.print(" _ ");
			}

			/*
			 * CRIA UMA ARRAY CHAMADO caracterAcertado COM O MESMO TAMANHO DO
			 * tamanhoCaracteres.
			 */
			caracterAcertado = new char[tamanhoCaracteres];

			/*
			 * VARIÁVEL PARA ARMAZENAR OS VALORES ACERTADOS PELO JOGADOR. ESSA
			 * VARIÁVEL COMPARA A tentativa COM O ARRAY caracteres, QUE É ONDE
			 * SE TEM CADA CARACTER DO heroi. O WHILE JOGADA EXISTE PARA
			 * DETERMINAR CADA PARTIDA.
			 */
			vida = 6;
			while (jogada) {
				if (vida <= 6 || vida >= 0) {

					System.out.print("\nFaça a sua tentativa: ");
					tentativa = sc.next().charAt(0);

					for (int i = 0; i < tamanhoCaracteres; i++) {
						if (tentativa == caracteres[i]) {
							caracterAcertado[i] = tentativa;
						}
						/*
						 * SE A TENTATIVA DO USUÁRIO NÃO FOR CORRETA, É
						 * ACRESCENTADO O CONTADOR.
						 */
						if (tentativa != caracteres[i]) {
							cont++;
						}
						/*
						 * AQUI ELE VAI ACRESCENTAR AO STRING "palavraFormada"
						 * OS CARACTERES QUE O USUÁRIO FOR ACERTANDO.
						 */
						if (caracterAcertado[i] == caracteres[i]) {
							palavraFormada += caracterAcertado[i];
							System.out.print(" " + caracterAcertado[i] + " ");
						}
						/*
						 * AQUI ELE VAI MANTER O UNDERLINE CASO O USUÁRIO NÃO
						 * ACERTE.
						 */
						else {
							System.out.print(" _ ");
						}
					}
					/*
					 * VERIFICAÇÃO PARA VER SE O USUÁRIO JÁ ACERTOU TODA A
					 * FRASE.
					 */
					if (palavraFormada.contentEquals(heroi)) {
						System.out.println("\n\nGGWP JOVEM GAFANHOTO!");
						System.out.println("VOCÊ PROVOU AS SUAS HABILIDADES NESSE BELO GAMINHO!\n\n");
						jogada = false;
					}
					/*
					 * DEPOIS DO FOR, SE FOR VARRIDO TODOS OS CARACTERES E NÃO
					 * FOR ENCONTRADO A MESMA LETRA QUE O USUÁRIO COLOCOU, O
					 * CONT TERÁ O MESMO VALOR QUE O tamanhoCaracteres. DESSA
					 * FORMA, O USUÁRIO É INFORMADO QUE NÃO EXISTE ESSA LETRA E
					 * ELE PERDE UMA VIDA.
					 */
					if (cont >= tamanhoCaracteres) {
						System.out.println("\nERROWWWWWW!");
						vida--;
						System.out.println("Você agora tem " + vida + " vida(s)");
						System.out.println("Tente outra letra.");
					}
					/*
					 * É NECESSÁRIO ZERAR O CONTADOR PARA QUE ELE POSSA
					 * VERIFICAR NOVAMENTE TODOS OS CARACTERES DE ACORDO COM A
					 * NOVA TENTATIVA DO USUÁRIO.
					 */
					cont = 0;
					/*
					 * É NECESSÁRIO ZERAR A palavraFormada DA MESMA FORMA QUE O
					 * CONTADOR PARA QUE SEJA FEITA UMA NOVA VERIFICAÇÃO.
					 */
					palavraFormada = "";
				} /* FIM IF VIDA > 0 */

				if (vida <= 0) {
					System.out.println("\n\nSuas chances acabaram!");
					System.out.println("O nome do herói é: " + heroi);
					System.out.println("\n GAME OVER! :(");
					jogada = false;
				}
			} /* FIM DA WHILE JOGADA */

			/* INICIO MENU */
			System.out.println("Deseja jogar novamente? (S ou N)");
			menu = sc.next().charAt(0);
			if (menu == 'S' || menu == 's') {
				jogo = true;
				jogada = true;
				System.out.println("\n\nÓtima escolha!");
				System.out.println("Vamos novamente jogar o formidável Jogo da Forca da Loba Enterprise!\n\n");

			} else {
				jogo = false;
				System.out.println("Saindo...");
			}
			/* FIM MENU */
		} while (jogo);
	}
}
