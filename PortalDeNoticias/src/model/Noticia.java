package model;



public class Noticia extends EstadoDaNoticia{
	
	private String titulo;
	private String corpo;
	private String resumo;
	private String area;
	private Usuario autor;

																//e tem o usuariio autor da noticia						
	public Noticia(String titulo, String corpo, String resumo, Usuario autor,String area,
			String estado,String data, String hora, Usuario usuario){
		
		super(estado,data,hora,usuario);//tem o usuario que modifica o estado da noticia
		
		this.setTitulo(titulo);
		this.setCorpo(corpo);
		this.setResumo(resumo);
		this.setAutor(autor);
		this.setArea(area);
		this.setEstado(estado);
		
	}
	
	public String corDaAreaDaNoticia() {
		
		if (area == "Economia" || area == "Politica"){
			return "vermelha";
		}else if(area == "Esportes"){
			return "verde";
		}else if(area == "Entretenimento"){
			return "laranja";
		}else {
			return "azul";
		}
			
	}


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCorpo() {
		return corpo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
		

	public Usuario getAutor() {
		return autor;
	}

	public void setAutor(Usuario autor) {
		this.autor = autor;
	}


}
