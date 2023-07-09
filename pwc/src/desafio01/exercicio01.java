package desafio01;

public class exercicio01 {
	public static void main(String[] args) {
		String entrada = "Hello, world! OpenAI is amazing.";
        String[] separar = entrada.split(" ");
        for (int i = separar.length - 1; i >= 0; i--) {
        	System.out.print(separar[i] + " ");
        }
	}
}
