import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Random sorteio = new Random();
		
		int escolhaJogador, escolhaPC;
		
		System.out.println("J O K E N P O");
		System.out.println();
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println();
		System.out.print("Escolha uma opção: ");
		
		escolhaJogador = leitor.nextInt();
		escolhaPC = sorteio.nextInt(3) + 1;
		
		String nomeEscolhaJogador, nomeEscolhaPc;
		
		if (escolhaJogador == 1) {
			nomeEscolhaJogador = "Pedra";
		} else if (escolhaJogador == 2) {
			nomeEscolhaJogador = "Papel";
		} else {
			nomeEscolhaJogador = "Tesoura";
		}
		
		if (escolhaPC == 1) {
			nomeEscolhaPc = "Pedra";
		} else if (escolhaPC == 2) {
			nomeEscolhaPc = "Papel";
		} else {
			nomeEscolhaPc = "Tesoura";
		}
		
		
		System.out.println("Jogador escolheu " + nomeEscolhaJogador);
		System.out.println("PC escolheu " + nomeEscolhaPc);
		System.out.println();
		
		if (escolhaJogador == 1) {
			if (escolhaPC == 1) {
				System.out.println("E M P A T E ! !");
			} else if (escolhaPC == 2) {
				System.out.println("PC VENCEU!!");
			} else {
				System.out.println("JOGADOR VENCEU!!");
			}
		} else if (escolhaJogador == 2) {
			if (escolhaPC == 2) {
				System.out.println("E M P A T E ! !");
			} else if (escolhaPC == 1) {
				System.out.println("JOGADOR VENCEU!!");
			} else {
				System.out.println("PC VENCEU");
			}
		} else {
			if (escolhaPC == 3) {
				System.out.println("E M P A T E ! !");
			} else if (escolhaPC == 1) {
				System.out.println("PC VENCEU!!");
			} else {
				System.out.println("JOGADOR VENCEU!!");
			}
		}

	}

}
