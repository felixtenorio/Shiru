package br.univel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class URLReader {

	private static final String URL = "http://www.master10.com.py/lista-txt";
	
	public List<String> lerUrl() {
		List<String> lista = new ArrayList<String>();

		try {
			URL url = new URL(URL);
			try (BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()))) {
				String inputLine = null;
				while ((inputLine = in.readLine()) != null)

					lista.add(inputLine);
			}

		} catch (IOException e) {
			throw new RuntimeException("Deu ruim!", e);
		}

		return lista;
	}

//	public static void main(String[] args) throws Exception {
//
//		
//		URLReader reader = new URLReader();
//		List<String> lista = reader.lerUrl();
//		
//		lista.forEach(e -> System.out.println(e));//  Função Lambida
//		
//		lista.forEach(e ->{
//			System.out.println(e);
//			
//		});
//		
//		lista.forEach(System.out::println);// Passsagem de metodo por referência
//		
//
//	}

}
