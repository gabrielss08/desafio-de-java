package desafio02;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Exercicio02ComScanner {
	public static void main(String[] args) {
		System.out.println("Digite uma frase para remover os caracteres repetidos");
		try (Scanner scanner = new Scanner(System.in)) {
			String palavra = scanner.nextLine();
			
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
}
