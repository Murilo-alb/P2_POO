package exe1banco;

public class Contas {
	private int numeroConta;
	private double saldo;
	private String nome;
	private String cpf;

	public Contas(int numeroConta, String nome, String cpf) {
		this.numeroConta = numeroConta;
		this.saldo = 0.0;
		this.nome = nome;
		this.cpf = cpf;
	}

	public void sacar(double num) {
		if (num <= this.saldo) {
			System.out.println("Realizado!\n");
			saldo -= num;
		} else
			System.out.println("Saldo insuficiente! Pobre.");
		System.out.println("\n");

	}

	public void depositar(double num) {
		if (num > 0) {
			saldo += num;
		} else
			System.out.println("valor incorreto!");
	}

	public void verificarSaldo() {
		System.out.println("Numero Conta: " +numeroConta);
		System.out.println("Nome: "+nome);
		System.out.println("Cpf: "+cpf);
		System.out.println("Saldo: " + saldo);
		System.out.println("\n");
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
