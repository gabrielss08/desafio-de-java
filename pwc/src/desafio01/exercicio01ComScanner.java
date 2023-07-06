package desafio01;

import java.util.Scanner;

public class exercicio01ComScanner {
    public static void main(String[] args) {
    	System.out.println("Escreva uma frase para reverter a ordem das palavras");
	        try (Scanner scanner = new Scanner(System.in)) {
				String inverter = scanner.nextLine();
				String[] frase = inverter.split(" ");
				for (int i = frase.length - 1; i >= 0; i--) {
					System.out.print(frase[i] + " ");
				}
			}
    }
}
