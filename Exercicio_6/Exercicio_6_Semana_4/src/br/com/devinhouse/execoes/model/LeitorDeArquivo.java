package br.com.devinhouse.execoes.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeitorDeArquivo {

	public static String lerArquivo(String localDoArquivo) throws IOException {
		FileInputStream stream = new FileInputStream(localDoArquivo);
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(reader);
		String linha = br.readLine();
		String texto = "";
		while (linha != null) {
			linha = br.readLine();
			texto += linha;
		}
		return texto;
	}

}
