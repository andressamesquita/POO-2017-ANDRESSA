package modelQuest05;

public class Hora {
	
	private int horas;
	private int minutos;
	private int segundos;
	
	public Hora(){
		
	}
	
	public Hora(int hora, int minuto, int segundo){
		this.setHoras(horas);
		this.setMinutos(minutos);
		this.setSegundos(segundos);
		
	}
	
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	public void setMinutos(int minuto) {
		this.minutos = minuto;
	}
	
	public void setSegundos(int segundo) {
		this.segundos = segundo;
	}
	
	public String getHorarioCompleto(){
		return horas + " : " + minutos + " : " + segundos; 
	}
	
	
}
