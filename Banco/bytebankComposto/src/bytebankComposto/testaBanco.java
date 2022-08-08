package bytebankComposto;

public class testaBanco {
	public static void main(String[] args) {
		Cliente kethlyn = new Cliente();
		kethlyn.nome = "Kethlyn Diniz";
		kethlyn.cpf = "222.222.222-22";
		kethlyn.profissao = "dev";
		
		Conta contaDaKe = new Conta();
		contaDaKe.deposita(100);
		
		contaDaKe.titular = kethlyn;
		System.out.println(contaDaKe.titular.nome);
	}
}
