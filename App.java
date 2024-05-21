import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
Exemplos:
Entrada: Saída:
5
6
7 ou -7
8
DIFERENCA = -26 */
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite 4 valores inteiros");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int diferenca = (a * b) - (c * d);
    System.out.println("DIFERENÇA: " + diferenca);
    }
}
