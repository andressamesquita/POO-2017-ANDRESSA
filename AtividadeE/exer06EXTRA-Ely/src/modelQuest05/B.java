package modelQuest05;

public class B extends A {
	
		private double altura;
		
		public B(String nome, int anoNascimento, double altura){
			super(nome, anoNascimento);
			this.altura = altura;
		}

		public double getAltura() {
			return altura;
		}
		
		@Override
		public int metodo1(){
			return this.getAnoNascimento();
		}

		
}
