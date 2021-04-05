package br.com.devinhouse.exercicioquinze.model;

import java.util.ArrayList;

public class Agencia {

	private ArrayList<Conta> contas;

	public Agencia() {
		this.contas = new ArrayList<>();
	}

	public void adiciona(Conta c) {
		this.contas.add(c);
	}

	public int getQunatidadeDeContas() {
		return this.contas.size();
	}

	public String getConta(int indice) {
		return this.contas.get(indice).toString();
	}

	public Conta buscaPorTitular(String nome) {
		for (Conta c : this.contas) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				return c;
			}
		}
		Conta novaConta = new ContaCorrente();
		novaConta.setNome(nome);
		return novaConta;
	}

}
