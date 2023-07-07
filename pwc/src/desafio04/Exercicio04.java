package desafio04;

public class Exercicio04 {
    public static void main(String[] args) {
        String frase = "hello, how are you? i'm fine, thank you.";
        StringBuilder sb = new StringBuilder();
        boolean letra = true;

        for (char i : frase.toCharArray()) {
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
