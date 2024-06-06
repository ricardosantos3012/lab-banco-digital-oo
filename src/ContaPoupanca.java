
public class ContaPoupanca extends Conta {

	public ContaPoupanca(PessoaFisica pessoaf) {
		super(pessoaf);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
}
