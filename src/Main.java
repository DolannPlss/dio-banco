import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Cliente c1 = new Cliente();
		c1.setNome("Marcos");
		Conta cc = new ContaCorrente(c1);
		Conta poupanca = new ContaPoupanca(c1);
		Scanner x;

		int key = 0;
		while (key != 6) {
			x = new Scanner(System.in);
			key = x.nextInt();
			switch (key) {
			case 1:
				System.out.println("escolha quanto sacar");
				cc.sacar(x.nextInt());
				break;
			case 2:
				System.out.println("escolha quanto depositar");
				cc.depositar(x.nextInt());
				break;
			case 3:
				System.out.println("escolha quanto transferir para poupança");
				cc.transferir(x.nextInt(), poupanca);
				break;
			case 4:
				cc.imprimirExtrato();
				break;
			case 5:
				poupanca.imprimirExtrato();
				break;

			default:
				break;
			}

		}

		;

	}
}
