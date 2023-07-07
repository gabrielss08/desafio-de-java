package desafio03;

import java.util.Scanner;

public class Exercicio03ComScanner {
    public static void main(String[] args) {
    	System.out.println("digite uma palavra para achar a substring palindroma mais longa");
    	try (Scanner scanner = new Scanner(System.in)) {
			String entrada = scanner.nextLine();
			String palindromo = encontrarPalindromo(entrada);
			System.out.println("a substring palindroma mais longa e: " + palindromo);
		}
    } 
    public static String encontrarPalindromo(String entrada) {
    	int tamanhoMax = 1;
        int comeco = 0;
        int tam = entrada.length();

        boolean[][] pld = new boolean[tam][tam];
        for (int i = 0; i < tam; i++){
        	pld[i][i] = true;
        }
        for (int i = 0; i < tam - 1; i++) {
            if(entrada.charAt(i) == entrada.charAt(i + 1)){
            	pld[i][i + 1] = true;
                comeco = i;
                tamanhoMax = 2;
            }
        }
        for (int j = 3; j <= tam; j++) {
            for (int i = 0; i < tam - j + 1; i++) {
                int k = i + j - 1;
                if(entrada.charAt(i) == entrada.charAt(k) && pld[i + 1][k - 1]){
                	pld[i][j] = true;
                    comeco = i;
                    tamanhoMax = j;
                }
            }
        }
        return entrada.substring(comeco,comeco+tamanhoMax);
    }
}
