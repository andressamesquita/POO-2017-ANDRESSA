package quest01TEORICA;

public class Hotel {
	
	public int quantReservas;
	
	public void adicionarReserva(){
		quantReservas++;
	}
	
		
	/*
	 * Não apresentará erro de compilação, pois trata-se de uma classe modelo (ela ainda receberá o valor da variavel "quantReservas" 
	 * quando for instanciada.
	 *
	 */
	
	//pra confirmar
	int reservas(){         
		return quantReservas;
	}
}
