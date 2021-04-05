package br.com.devinhouse.execoes.main;

import java.io.IOException;

import br.com.devinhouse.execoes.exception.ExceptionA;
import br.com.devinhouse.execoes.exception.ExceptionB;
import br.com.devinhouse.execoes.model.LeitorDeArquivo;
import br.com.devinhouse.execoes.model.Pessoa;

public class Main {

	public static void main(String[] args) {

		try {
			Pessoa p1 = new Pessoa("Pedro1°", 23);
		} catch (ExceptionB eb) {
			System.err.println(eb.getMessage());
		} catch (ExceptionA ea) {
			System.err.println(ea.getMessage());
		}

		try {
			Pessoa p2 = new Pessoa("Pedro", 150);
		} catch (ExceptionB eb) {
			System.err.println(eb.getMessage());
		} catch (ExceptionA ea) {
			System.err.println(ea.getMessage());
		}

		try {
			Pessoa p3 = new Pessoa("", 23);
		} catch (ExceptionB eb) {
			System.err.println(eb.getMessage());
		} catch (ExceptionA ea) {
			System.err.println(ea.getMessage());
		} catch (NullPointerException npe) {
			System.err.println("O nome não pode ser nulo.");
		}

		try {
			LeitorDeArquivo.lerArquivo("C:\\Users\\mathiastsimon\\Documents\\teste.");
		} catch (IOException ioe) {
			System.err.println("Não é possível ler o arquivo.\nVerifique o local.");
		}
	}

}
