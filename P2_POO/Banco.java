package exe1banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Contas> conta;

	public Banco() {
		this.conta = new ArrayList<Contas>();
	}

	public void criar(int numeroConta, String nome, String cpf) {
		Contas conta1 = new Contas(numeroConta, nome, cpf);
		this.conta.add(conta1);
	}

	public void realizarSaque(int numeroConta, double num) {
		for (Contas conta1 : conta) {

			if (conta1.getNumeroConta() == numeroConta) {
				conta1.sacar(num);
				break;
			}
		}
	}

	public void realizarDeposito(int numeroConta, double num) {
		for (Contas conta1 : conta) {

			if (conta1.getNumeroConta() == numeroConta) {
				conta1.depositar(num);
				break;
			}
		}

	}
	
	public void verificarSaldo(int numeroConta) {
		for (Contas conta1 : conta) {

			if (conta1.getNumeroConta() == numeroConta) {
				conta1.verificarSaldo();
				break;
			}
		}
	}
}
