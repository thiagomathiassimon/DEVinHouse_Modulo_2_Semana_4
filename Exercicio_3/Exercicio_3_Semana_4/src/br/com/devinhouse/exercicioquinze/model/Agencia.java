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

}
