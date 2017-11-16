package quest01;

import javax.swing.JOptionPane;

public class ArCondicionado {
	
	public boolean ligado;
	public String modo;
	public String velocidade;
	public int temperatura;
	public String velocidadeVentilador;
	
	public ArCondicionado(boolean ligado, String modo, int temperatura, String velocidade){
		this.ligado = ligado;
		this.modo = modo;
		this.temperatura = temperatura;
		this.velocidade = velocidade;
		
		
	}
	
	
	public String estado(){
		if (ligado){
			return "Sim";
		}else{
			return "Não";
		}
	}
	
	public void AlcancarTemp(){
		
		if(modo == "ventilador" || modo  == "VENTILADOR" || ligado == false){
			JOptionPane.showMessageDialog(null, "ATENCAO\nVentilador ligado ou Arcondicionado desligado, alteração não permitida");
			
		}else{
			int novaTemp = Integer.valueOf(JOptionPane.showInputDialog("Temperatura alvo: "));
			
			if (novaTemp < 15){
				temperatura = 15;
			}else if(novaTemp > 30){
					temperatura = 30;
			}else{
				temperatura = novaTemp;
			}
			
		}
	}
	
	public String EscolherVelocidade(){
		
		String novaVelocidade = JOptionPane.showInputDialog("Velocidade alvo: ");
		velocidade = novaVelocidade;
		return velocidade;
		
	}
	
	public void EscolherModo(){
		
		String val =JOptionPane.showInputDialog("MODO: ");
		if(val.equals("Ventilador")){
			JOptionPane.showMessageDialog(null, "Modo ventilador acionado");
		} else{
			JOptionPane.showMessageDialog(null, "Modo frio acionado");
			
		}
	}
	
	public void velocidadeVent(){
		
		String veloci =JOptionPane.showInputDialog("Velocidade: ");
		velocidade = veloci;
	}
	
	public void EstadoSplit(){
		int opcao = Integer.valueOf(JOptionPane.showInputDialog("-----------------------Split---------------------\n" + "Ligado: "+ estado() + "\nTemp: " + temperatura + "\nVentilador: " + modo + "\nVelocidade: " + velocidade + "\n\n1 - Liga/Desliga\n2 - Diminuir Temperatura\n3 - Aumentar Temperatura\n4 - Velocidade do Ventilador\n5 - Modo (Ventilador | frio)\n\nOPÇÃO:\n"));
		
		if (opcao == 1){
			String option = estado();
			if(option == "Sim"){
				ligado = false;
			}else{
				ligado = true;
			}
			EstadoSplit();
		
		}else if (opcao == 2){
			AlcancarTemp();
			EstadoSplit();
		
		}else if(opcao == 3){
			AlcancarTemp();
			EstadoSplit();
			
		}else if(opcao == 4){
			velocidadeVent();
			EstadoSplit();
			
		}else if(opcao == 5){
			EscolherModo();
			EstadoSplit(); 
		}	
		
	}

}
