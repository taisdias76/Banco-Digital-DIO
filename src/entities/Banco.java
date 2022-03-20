package entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nome;
	private List<Conta> contas = new ArrayList<Conta>(); 
	private Integer numContas = 0;

	public String getNome() {
		return nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}
	
	public void inserirConta(Conta conta) {
		contas.add(conta);
		numContas++;
	}

}
