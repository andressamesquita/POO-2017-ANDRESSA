package app;
import model.*;

public class TestandoPortalDeNoticias {

	public static void main(String[] args) {
		
		Jornalista jornalista1 = new Jornalista("Andressa","aaa@gmail.com","111");
		Editor editor1 = new Editor("Thais","ttt@gmail.com","222","Esportes");
		Editor editor2 = new Editor("Debora","ddd@gmail.com","333","Tecnologia");
		
		
		
		Noticia noticia = new Noticia("Brasil","Hexa Campeao","A Seleção Brasileira de Futebol é gerido pela Confederação Brasileira de Futebol (CBF)...",
				jornalista1,"Esportes","criada","11/03/2018","15:09",jornalista1);
		
		noticia.setEstado("Pronta para revisao");
	
		
		//gerenciando noticia
		jornalista1.criarNoticia(noticia);
		
		String revisao1 = editor1.revisarNoticia(noticia,editor2);//editor de area diferente - peermissao negada
		System.out.println(revisao1);
		
		String autoriza1 = editor1.autorizarNoticia(revisao1,editor1,noticia);
		System.out.println(autoriza1);
		
		String revisao2 = editor1.revisarNoticia(noticia,editor1);//editor de area diferente - peermissao negada
		System.out.println("\n"+revisao2);
		
		String autoriza = editor1.autorizarNoticia(revisao2,editor1,noticia);
		System.out.println(autoriza);
		
		//testando exception
		noticia.setData("00/00/0000");
		System.out.println("\n"+noticia.getData());
		
		//testando exception
		noticia.setHora("24:00");
		System.out.println("\n" + noticia.getHora());
		
		
		System.out.println("\n"+noticia.getTitulo());
		System.out.println(noticia.getCorpo());
		System.out.println(noticia.getResumo());
		
		System.out.println("\nArea: "+noticia.getArea());
		System.out.println("Cor da area: "+noticia.corDaAreaDaNoticia());
		System.out.println("Jornalista: "+noticia.getAutor().getNome());
		System.out.println("Responsavel por alteracoes no estado da noticia: "+noticia.getUsuario().getNome());
		
		

	}

}
