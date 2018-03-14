package model;

public class Editor extends Usuario{
	
	private String area;
	
	public Editor(String n, String e, String s, String area) {
		super(n, e, s);
		this.setArea(area);
		
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	//editor
	public String revisarNoticia(Noticia n, Editor e){
		
		if (e.getArea() == n.getArea()){
			
			if(n.getTitulo() != null && n.getResumo() != null && n.getCorpo() != null && n.getEstado() != null
					&& n.getAutor() != null && n.getArea() != null){
				return "Noticia revisada ---> status: COMPLETA";
			}
			return "Noticia revisada ---> status: INCOMPLETA";	
		}
		return "Editor sem permissao para revisar noticias dessa area.";
		
	}
	
	public String autorizarNoticia(String revisao, Editor e, Noticia n){
		
		if (e.getArea() == n.getArea()){
			if(revisao == "Noticia revisada ---> status: COMPLETA"){
				return "Permissao para publicar noticia: ACEITA";
			}
			
			return "Permissao para publicar noticia: NEGADA";
		}
		return "Editor sem permissao para autorizar noticias dessa area.";
		
		
	}

}
