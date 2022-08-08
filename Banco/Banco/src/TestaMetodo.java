
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDaKe = new Conta();
		contaDaKe.saldo = 50;
		contaDaKe.deposita(50);
		System.out.println(contaDaKe.saldo);
		
		boolean retirar = contaDaKe.saca(20);
		System.out.println(contaDaKe.saldo);
		System.out.println(retirar);
		
		Conta contaDeDeposito = new Conta();
		contaDeDeposito.deposita(1000);
		
		contaDeDeposito.transfere(300, contaDaKe);
		System.out.println(contaDeDeposito.saldo);
		System.out.println(contaDaKe.saldo);
	}
}

