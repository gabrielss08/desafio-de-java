package desafio03;

public class Exercicio03 {
    public static void main(String[] args) {
    	String entrada = "babad";
        String palindromo = encontrarPalindromo(entrada);
        System.out.println("a substring palindroma mais longa e: " + palindromo);
    }
    
    public static String encontrarPalindromo(String entrada) {
    	int tamanhoMax = 1;
        int comeco = 0;
        int tam = entrada.length();

        boolean[][] dp = new boolean[tam][tam];
        for (int i = 0; i < tam; i++){
            dp[i][i] = true;
        }
        for (int i = 0; i < tam - 1; i++) {
            if(entrada.charAt(i) == entrada.charAt(i + 1)){
                dp[i][i + 1] = true;
                comeco = i;
                tamanhoMax = 2;
            }
        }
        for (int j = 3; j <= tam; j++) {
            for (int i = 0; i < tam - j + 1; i++) {
                int k = i + j - 1;
                if(entrada.charAt(i) == entrada.charAt(k) && dp[i + 1][k - 1]){
                	dp[i][j] = true;
                    comeco = i;
                    tamanhoMax = j;
                }
            }
        }
        return entrada.substring(comeco,comeco+tamanhoMax);
    }
}
