import java.util.Random;
import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		/*DECLARACAO DE VARIAVEIS E INICIO DO PROGRAMA*/
		int advinhar, chances = 3;
		Scanner sc = new Scanner(System.in);
		Random gerar = new Random();
		int numero = gerar.nextInt(10);
		numero = numero + 1;
		
		System.out.println("Adivinhe que número entre 1 a 10 eu sorteei!");
		
		/*ESTE E O DO QUE RODA O JOGO*/
		tente: do {
			
			/*AQUI MOSTRA QUANTAS CLHANCE O USUARIO TEM*/
			System.out.println("Você tem " + chances + " chances");
			System.out.print("Número: ");
			/*AQUI O PROGRAMA RECEBE O QUE USUARIO DIGITAR*/
			advinhar = sc.nextInt();
			
			/*AQUI TESTAMOS SE O USUARIO DIGITOU MENOR QUE 1 OU MAIOR QUE 10 E PEDIMOS PARA ELE TENTAR NOVAMENTE*/
			while (advinhar > 10 || advinhar < 1) {
				System.out.println("Tente novamente");
				advinhar = sc.nextInt();
			}
			
			/*AQUI SAO OS TESTE PARA VER SE O NUMERO QUE O USUARIO DIGITOU E O CERTO E AI ENCERRA O JOGO*/
			if (advinhar == numero) {
				System.out.println("Parabéns! Você acertou ");
				break tente;
			}
			
			/*AQUI E O TESTE PARA VER SE O NUMERO DIGITADO E MENOR QUE O SORTEADO E DIMINUI UMA CHANCE*/
			else if (advinhar < numero) {
				System.out.println("O número é maior do que o que você escolheu!");
				chances = chances - 1;
				
				/*AQUI E PARA TESTAR SE O USUARIO PERDEU APOS A ULTIMA TENTATIVA E ENCERRA O JOGO*/
				if (chances == 0) {
					System.out.println("VOCÊ PERDEU!");
					break tente;
				}
				
				/*SE O USUARIO POSSUI MAIS UMA CHANCE RETORNA PARA O INICIO */
				continue tente;
			}
			
			/*AQUI TESTAMOS SE O USUARIO DIGITOU UM NUMERO MAIOR QUE O SORTEADO E DIMINUI UMA CHANCE*/
			else if (advinhar > numero) {
				System.out.println("O número e menor do que o que você escolheu!");
				chances = chances - 1;
				
				/*AQUI E PARA TESTAR SE O USUARIO PERDEU APOS A ULTIMA TENTATIVA E ENCERRA O JOGO*/
				if (chances == 0) {
					System.out.println("VOCÊ PERDEU!");
					break tente;
				}
				
				/*SE O USUARIO POSSUI MAIS UMA CHANCE RETORNA PARA O INICIO */
				continue tente;
			}
		} while (chances != 0);/*FIM DO DO JOGO*/
	}
}
