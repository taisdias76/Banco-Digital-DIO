package entities;

import services.IConta;

public abstract class Conta implements IConta {
	
	protected static final Integer AGENCIA_PADRAO = 1;
	private static Integer SEQUENCIAL = 1;
	
	protected Integer numeroConta;
	protected Integer agenciaConta;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agenciaConta = AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor); 
		contaDestino.depositar(valor);
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public Integer getAgenciaConta() {
		return agenciaConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agenciaConta));
		System.out.println(String.format("Número Conta: %d", this.numeroConta));
		System.out.printf(String.format("Saldo: %.2f", this.saldo));
	}

}
