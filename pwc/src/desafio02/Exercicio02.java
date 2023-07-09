package desafio02;

import java.util.LinkedHashSet;

public class Exercicio02 {
	public static void main(String[] args) {
	String entrada = "Hello, World!";
	
	LinkedHashSet<Character> inverter = new LinkedHashSet<>();
	
	for ( int i = 0; i < entrada.length(); i++) {
		inverter.add(entrada.charAt(i));
	}
	
	StringBuilder sb = new StringBuilder();
	for (Character c : inverter) {
		sb.append(c);
	}
	System.out.println(sb.toString());
	}
}
