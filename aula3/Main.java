// Saída de dados
package aula3;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int y = 37;
        double x = 10.35784;

        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f\n", x); // Formatando com duas casas decimais

        Locale.setDefault(Locale.FRANCE); // Mudando o separador, de . para ,
        System.out.printf("%.2f\n", x);

        System.out.println("Resultado: " + x + " metros");
        System.out.printf("Resultado: %.2f metros \n", x);

        // %f = ponto flutuante (float, double)
        System.out.printf("Número decimal: %.2f\n", 1234.56);

        // %d = número inteiro (int, long, short, byte)
        System.out.printf("Número inteiro: %d\n", 42);

        // %s = string (texto)
        System.out.printf("Texto: %s\n", "Olá, mundo!");

        // %c = caractere único (char)
        System.out.printf("Caractere: %c\n", 'A');

        // %b = valor booleano (true/false)
        System.out.printf("Booleano: %b\n", true);

        // %n = quebra de linha (equivalente a \n)
        System.out.printf("Primeira linha%nSegunda linha%n");

        // \n = quebra de linha manual
        System.out.println("Linha 1\nLinha 2");

        // \t = tabulação (espaço extra para alinhamento)
        System.out.println("Nome:\tJoão");
        System.out.println("Idade:\t25");

        // \\ = barra invertida (escape para caracteres especiais)
        System.out.println("Caminho do arquivo: C:\\Users\\Joao\\Documentos");

        // \" = aspas duplas dentro de uma string
        System.out.println("Ele disse: \"Olá, mundo!\"");

        // \' = aspas simples dentro de uma string
        System.out.println("Caractere especial: \'A\'");

        // %e = notação científica
        System.out.printf("Notação científica: %e\n", 12345.6789);

        // %x = número hexadecimal
        System.out.printf("Número hexadecimal: %x\n", 255);

        // %o = número octal
        System.out.printf("Número octal: %o\n", 255);

        String nome = "Peppa";
        int idade = 25;
        double renda = 4000.0;

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais \n", nome, idade, renda);
        System.out.println("----------------------------------------------------------------");

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n", product2, price2);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
        System.out.println();
        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);

    }
}
