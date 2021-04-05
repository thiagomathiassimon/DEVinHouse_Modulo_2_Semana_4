package br.com.devinhouse.exercicioquinze.model;

public class ContaPoupanca extends Conta {

	public void renderJurosDePoupanca() {
		super.depositar(super.verificaSaldo() + (super.verificaSaldo() * 0.001));
	}

	@Override
	public String getTipo() {
		return "Conta Poupan�a";
	}

}
