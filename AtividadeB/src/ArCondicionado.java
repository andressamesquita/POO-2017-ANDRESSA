import javax.swing.JOptionPane;

public class ArCondicionado {
	
	public String modo;
	public int velocidade;
	public int temperatura;
		
	public void Ligar(){
		System.out.println("Ligado");
	}
	
	public int AlcancarTemp(int novaTemp){
		
		novaTemp = Integer.valueOf(JOptionPane.showInputDialog("Temperatura alvo: "));
		return novaTemp;
	}
	
	public int EscolherVelocidade(int novaVelocidade){
		
		novaVelocidade = Integer.valueOf(JOptionPane.showInputDialog("Velocidade alvo: "));
		velocidade = novaVelocidade;
		return velocidade;
		
	}
	
	public void EscolherModo(String modo){
		
		if(modo == "ventilador"){
			System.out.println("Modo ventilador acionado");
		} else{
			System.out.println("Modo frio acionado");
		}
	}
}
