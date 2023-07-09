package desafio5;

import java.util.HashMap;

public class Exercicio5 {
	public static void main(String[] args) {
        String entrada = "babad";
        boolean anagrama = encontrarPalindromo(entrada);
        if (anagrama) {
		    System.out.println("algum anagrama de " + entrada + " é um palíndromo.");
		} else {
		    System.out.println("Nenhum anagrama de " + entrada + " é um palíndromo.");
        }
    }

    public static boolean encontrarPalindromo(String entrada) {
        String formatar = entrada.replaceAll("\\s", "").toLowerCase();
        
        if (palindromo(formatar)) {
            return true;
        }

        HashMap<Character, Integer> contagem = new HashMap<>();
        
        for (char c : formatar.toCharArray()) {
        	contagem.put(c, contagem.getOrDefault(c, 0) + 1);
        }
        
        int j = 0;
        for (int i : contagem.values()) {//verificar se algum anagrama é palindromo
            if (i % 2 != 0) {
                j++;
            }
        }
        return j <= 1;
    }

    public static boolean palindromo(String entrada) {
    	String inverter = new StringBuffer(entrada).reverse().toString();

        if(entrada.equals(inverter)) {
        	return true;
        }else {
        	return false;
        }
    }
}
