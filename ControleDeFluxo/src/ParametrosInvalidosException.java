
public class ParametrosInvalidosException extends Exception {
	
	private int parametroUm, parametroDois;
	

	public ParametrosInvalidosException(int parametroUm, int parametroDois) {
		super();
		this.parametroUm = parametroUm;
		this.parametroDois = parametroDois;
	}


	@Override
	public String toString() {
		return "Tente novamente, primeiro numero não pode ser maior que o segundo: "+parametroDois+ " é menor que "+parametroUm;
	}
	
	public void mostrarErro() {
		
		System.out.println(toString());
	}

}
