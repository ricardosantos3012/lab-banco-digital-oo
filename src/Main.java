
public class Main {

	public static void main(String[] args) {
		PessoaFisica venilton = new PessoaFisica();
		venilton.setNome("Venilton");
		venilton.setCpf("524.965.965-98");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
