package model;

public class Data {
	
	public int dia;
	public int mes;
	public int ano;
	
	public Data(int dia,int mes,int ano){
		setAno(ano);
		setMes(mes);
		setDia(dia);
		
		
	}
	
	public void setDia(int dia) {
		if(dia>0 && dia<32){
			if(mes!=2){
				this.dia = dia;
			}else{
				if(dia<28){
					this.dia = dia;
				}else{
				}
			}
	}
	
	
	
	}
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if(ano>0){
			this.ano = ano;
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if(mes>0 && mes<13){
			this.mes = mes;
		}
	}

	
	
	
	public void formatada(){
		System.out.println("Data de Admissão: " + this.dia +"/"+this.mes +"/"+ this.ano);
	}
	
}
