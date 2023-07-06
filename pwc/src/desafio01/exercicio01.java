package desafio01;

public class exercicio01 {
	public static void main(String[] args) {
		String separar = "Hello, world! OpenAI is amazing.";
        String[] frase = separar.split(" ");
        for (int i = frase.length - 1; i >= 0; i--) {
        	System.out.print(frase[i] + " ");
        }
	}
}
