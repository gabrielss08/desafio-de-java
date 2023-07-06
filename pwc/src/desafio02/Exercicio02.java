package desafio02;

import java.util.LinkedHashSet;

public class Exercicio02 {
	public static void main(String[] args) {
	String palavra = "Hello, World!";
	
	LinkedHashSet<Character> letras = new LinkedHashSet<>();
	
	for ( int i = 0; i < palavra.length(); i++) {
		letras.add(palavra.charAt(i));
	}
	
	StringBuilder sb = new StringBuilder();
	for (Character c : letras) {
		sb.append(c);
	}
	System.out.println(sb.toString());
	}
}
