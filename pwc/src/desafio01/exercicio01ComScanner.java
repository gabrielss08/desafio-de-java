package desafio01;

import java.util.Scanner;

public class exercicio01ComScanner {
	public static void main(String[] args) {
    	System.out.println("Escreva uma frase para reverter a ordem das palavras");
	    try (Scanner scanner = new Scanner(System.in)) {
			String entrada = scanner.nextLine();
	        String[] separar = entrada.split(" ");
	        for (int i = separar.length - 1; i >= 0; i--) {
	        	System.out.print(separar[i] + " ");
			}
		}
    }
}
