package quest01TEORICA;

public class Hotel {
	
	public int quantReservas;
	
	public void adicionarReserva(){
		quantReservas++;
	}
	
		
	/*
	 * N�o apresentar� erro de compila��o, pois trata-se de uma classe modelo (ela ainda receber� o valor da variavel "quantReservas" 
	 * quando for instanciada.
	 *
	 */
	
	//pra confirmar
	int reservas(){         
		return quantReservas;
	}
}
