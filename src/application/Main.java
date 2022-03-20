package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Cliente cliente = new Cliente();
		cliente.setNome("Tais");
		
		Conta cc = new ContaCorrente(cliente);
		Conta cp = new ContaPoupanca(cliente);
		cc.depositar(100.00);
		
		cc.imprimirExtrato();
		System.out.println("\n");
		cp.imprimirExtrato();
		
		
		System.out.print("\n\nInforme o valor para transferência: ");
		double valorTransf = sc.nextDouble();
		cc.transferir(valorTransf, cp);
		
		System.out.println("\nDados atualizados: \n");
		cc.imprimirExtrato();
		System.out.println("\n");
		cp.imprimirExtrato();
	}

}
