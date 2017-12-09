package modelQuest07;

public class Jogador {
	
	public int forca;
	public int nivel;
	public int pontosAtuais;
	
	public Jogador(int forca, int nivel, int pontos){
		this.forca = forca;
		this.nivel = nivel;
		this.pontosAtuais = pontos;
	}
	
	public void pontosAtaque(){
		pontosAtuais += forca * nivel;
	}
	
	public int atacar(Jogador y, int pontos){
		return pontos - this.pontosAtuais;
	}
	
	public int pontos(){
		return pontosAtuais;
	}
	
}
