package appQuest07;
import modelQuest07.*;

public class TesteJogadores {

	public static void main(String[] args) {
		
		Jogador jogador1 = new Jogador(4, 6, 27);
		Jogador jogador2 = new Jogador(4, 6, 12);
		
		jogador1.pontosAtaque();
		jogador2.pontosAtaque();
		
		jogador1.atacar(jogador2, 7);
		jogador2.atacar(jogador1, 12);
		
		System.out.println("Pontos do jogador1: " + jogador1.pontos());
		System.out.println("Pontos do jogador2: " + jogador2.pontos());
		
	}

}
