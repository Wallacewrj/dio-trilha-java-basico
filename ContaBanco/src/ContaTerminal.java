import java.util.Scanner;
public class ContaTerminal {

	public static void main(String[] args) {
		
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Criar Conta Bancaria...");
		System.out.println("Por favor, digite o numero da agência");
		numero = Integer.parseInt(input.nextLine()); //transforma a string em inteiro.
		
		
		System.out.println("Por favor, digite a agência");
		agencia = input.nextLine();
		
		System.out.println("Por favor, digite o nome do cliente");
		nomeCliente = input.nextLine();
		
		System.out.println("Por favor, digite o saldo a depepositar");
		saldo = Double.parseDouble(input.nextLine());//transforma a string em double.
		
		System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo R$"+saldo+ " já está disponível para saque");

	}

}
