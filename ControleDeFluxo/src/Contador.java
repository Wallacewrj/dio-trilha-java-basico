import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		int parametroUm, parametroDois;
		
		Scanner terminal = new Scanner(System.in);
		
		parametroUm = terminal.nextInt();
		parametroDois = terminal.nextInt();
		
		try {
			if(parametroDois < parametroUm) {
				
				throw new ParametrosInvalidosException(parametroUm,parametroDois);
			}
			contar(parametroUm,parametroDois);
			
		}catch(ParametrosInvalidosException e){
			
			e.mostrarErro();
			
		}
		
	}
	
	public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		
		int contagem = parametroDois - parametroUm;
		
		for(int cont = 1; cont <= contagem; cont++) {
			System.out.println("imprimindo o numemo: "+cont);
		}
		
	}

}
