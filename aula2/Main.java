// Variáveis e tipos básicos em Java

package aula2;

public class Main {
    public static void main(String[] args) {
        // Variável inteira (int)
        int idade = 25;
        // int é usado para armazenar números inteiros, como 0, 1, -1, 100, etc.

        // Variável de ponto flutuante (double)
        double salario = 3500.50;
        // double é usado para armazenar números de ponto flutuante (decimais), como
        // 3.14, 0.001, -50.75, etc.

        // Variável de caractere (char)
        char inicial = 'A';
        // char é usado para armazenar um único caractere, como uma letra, número ou
        // símbolo. No exemplo, 'A'.

        // Variável booleana (boolean)
        boolean isEstudante = true;
        // boolean é usado para armazenar valores booleanos, que podem ser true
        // (verdadeiro) ou false (falso).

        // Variável de cadeia de caracteres (String)
        String nome = "João";
        // String é usada para armazenar cadeias de caracteres (sequências de texto).

        // Variável de matriz de inteiros (int[])
        int[] numeros = { 1, 2, 3, 4, 5 };
        // int[] é uma matriz (array) que armazena múltiplos valores inteiros.

        // Variável de matriz de cadeias de caracteres (String[])
        String[] nomes = { "Ana", "Bruno", "Carlos" };
        // String[] é uma matriz (array) que armazena múltiplas cadeias de caracteres.

        // Variável constante (final)
        final int DIAS_NO_ANO = 365;
        // final é usado para definir constantes, ou seja, valores que não podem ser alterados depois de atribuídos.

        System.err.println(idade);
        System.err.println(salario);
        System.err.println(inicial);
        System.err.println(isEstudante);
        System.err.println(nome);
        System.err.println(numeros);
        System.err.println(nomes);
        System.err.println(DIAS_NO_ANO);

    }
}
