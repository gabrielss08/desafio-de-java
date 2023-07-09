package desafio02;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Exercicio02ComScanner {
	public static void main(String[] args) {
		System.out.println("Digite uma frase para remover os caracteres repetidos");
		try (Scanner scanner = new Scanner(System.in)) {
			String entrada = scanner.nextLine();
			
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
}
