package br.com.devinhouse.execoes.model;

import br.com.devinhouse.execoes.exception.ExceptionA;
import br.com.devinhouse.execoes.exception.ExceptionB;

public class Pessoa {

	private String nome;
	private int idade;

	public Pessoa(String nome, int idade) throws ExceptionA, ExceptionB{
		if (validarNome(nome) && validarIdade(idade)) {
			this.nome = nome;
			this.idade = idade;
		}
	}

	private boolean validarNome(String nome) throws ExceptionA, NullPointerException {
		if (nome.isBlank()) {
			throw new NullPointerException();
		}
		for (int i = 0; i < nome.length(); i++) {
			String letra = "" + nome.charAt(i);
			for (int e = 0; e < 10; e++) {
				if (letra.equals("" + e)) {
					throw new ExceptionA("O nome não pode conter números.");
				}
			}
		}
		return true;
	}

	private boolean validarIdade(int idade) throws ExceptionB {
		if (idade > 130) {
			throw new ExceptionB("Idade acima da permitida.");
		}
		return true;
	}

}
