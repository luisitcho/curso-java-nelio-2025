// Entrada de dados em Java

package aula5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um inteiro: ");
        int inteiro = sc.nextInt();

        System.out.print("Digite um float: ");
        float numeroFloat = sc.nextFloat();

        System.out.print("Digite um double: ");
        double numeroDouble = sc.nextDouble();

        sc.nextLine(); // consumir a quebra de linha antes do nextLine()

        System.out.print("Digite uma linha: ");
        String linha = sc.nextLine();

        System.out.print("Digite uma palavra: ");
        String palavra = sc.next();

        System.out.print("Digite um caractere: ");
        char caractere = sc.next().charAt(0);

        System.out.println("Inteiro: " + inteiro);
        System.out.println("Float: " + numeroFloat);
        System.out.println("Double: " + numeroDouble);
        System.out.println("Linha: " + linha);
        System.out.println("Palavra: " + palavra);
        System.out.println("Caractere: " + caractere);

        sc.close();
    }
}
