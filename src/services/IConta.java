package services;

import entities.Conta;

public interface IConta {

	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta contaDestino);
	
	void imprimirExtrato();
	
}
