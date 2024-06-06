
public class ContaCorrente extends Conta {

	public ContaCorrente(PessoaFisica pessoaf) {
		super(pessoaf);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
