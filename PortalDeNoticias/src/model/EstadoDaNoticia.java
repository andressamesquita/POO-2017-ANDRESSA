package model;

public class EstadoDaNoticia {
	
	private String estado;
	private String data;
	private String hora;
	private Usuario usuario;
	
	public EstadoDaNoticia(String estado, String d, String h, Usuario u){
		this.setEstado(estado);
		this.setData(d);
		this.setHora(h);
		this.setUsuario(u);
		
	}

	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		if(data =="00/00/0000"){
			throw new IllegalArgumentException("Data invalida!");
		}
		this.data = data;
	}

	public String getHora() {		
		return hora;
	}

	public void setHora(String hora) {
		if(hora =="24:00"){
			throw new IllegalArgumentException("Hora aceita somente até 23:59");
		}
		this.hora = hora;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}	
	
}
