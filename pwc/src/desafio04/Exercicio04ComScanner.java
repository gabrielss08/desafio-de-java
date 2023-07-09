package desafio04;

import java.util.Scanner;

public class Exercicio04ComScanner {
	public static void main(String[] args) {
		System.out.println("Digite uma frase para colocar em maiusculo a primeira letra de cada palavra");
		try (Scanner scanner = new Scanner(System.in)) {
			String entrada = scanner.nextLine();
			StringBuilder sb = new StringBuilder();
			boolean letra = true;

			for (char i : entrada.toCharArray()) {
			    if (Character.isWhitespace(i)) {
			        letra = true;
			    } else if (letra) {
			        i = Character.toUpperCase(i);
			        letra = false;
			    }			    
			    sb.append(i);
			}
			System.out.println(sb.toString());
		}
    }  
}
