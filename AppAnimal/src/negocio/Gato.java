package negocio;

public class Gato extends Animal{
	
		private boolean castrado;	
		
		
		
		public void exibe() {
			
			super.exibe();			
			System.out.printf("O gato %s castrado. \n \n",castrado ? "é" : "não é");
				
			
		}

		public boolean isCastrado() {
			return castrado;
		}


		public void setCastrado(boolean castrado) {
			this.castrado = castrado;
		}


}
