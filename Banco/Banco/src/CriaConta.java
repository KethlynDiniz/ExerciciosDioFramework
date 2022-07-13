
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Saldo primeira conta: " + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("Soma do saldo da primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 150;
		System.out.println("Saldo segunda conta: " + segundaConta.saldo);
		}	
}
