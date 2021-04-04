package br.com.devinhouse.semaforo.model;

public enum Semaforo {

	VERMELHO(5), AMARELO(2), VERDE(3);

	private double duracaoDaLuzEmMinutos;

	Semaforo(double duracaoDaLuzEmMinutos) {
		this.duracaoDaLuzEmMinutos = duracaoDaLuzEmMinutos;
	}

	public double getDuracaoDaLuzEmMinutos() {
		return this.duracaoDaLuzEmMinutos;
	}
}
