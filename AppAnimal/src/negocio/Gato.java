package negocio;

public class Gato extends Animal{
	
		private boolean castrado;	
		
		
		
		public void exibe() {
			
			super.exibe();			
			System.out.printf("O gato %s castrado. \n \n",castrado ? "�" : "n�o �");
				
			
		}

		public boolean isCastrado() {
			return castrado;
		}


		public void setCastrado(boolean castrado) {
			this.castrado = castrado;
		}


}
