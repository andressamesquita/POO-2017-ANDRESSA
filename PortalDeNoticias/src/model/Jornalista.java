package model;

public class Jornalista extends Usuario {

	public Jornalista(String n, String e, String s) {
		super(n, e, s);
		
	}
	public void criarNoticia(Noticia n){
		n.setEstado("criada");
	}
	
}
