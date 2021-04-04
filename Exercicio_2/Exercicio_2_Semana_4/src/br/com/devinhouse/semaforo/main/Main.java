package br.com.devinhouse.semaforo.main;

import br.com.devinhouse.semaforo.model.Semaforo;

public class Main {

	public static void main(String[] args) {

		Semaforo vermelho = Semaforo.VERMELHO;
		Semaforo amarelo = Semaforo.AMARELO;
		Semaforo verde = Semaforo.VERDE;

		System.out.println(
				"Cor: " + vermelho.name() + "\nDura��o: " + vermelho.getDuracaoDaLuzEmMinutos() + " minutos.\n");
		System.out
				.println("Cor: " + amarelo.name() + "\nDura��o: " + amarelo.getDuracaoDaLuzEmMinutos() + " minutos.\n");
		System.out.println("Cor: " + verde.name() + "\nDura��o: " + verde.getDuracaoDaLuzEmMinutos() + " minutos.\n");

	}

}
