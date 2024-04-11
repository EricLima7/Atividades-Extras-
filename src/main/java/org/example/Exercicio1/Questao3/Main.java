package org.example.Exercicio1.Questao3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada;
        System.out.println("Digite o número que deseja realizar a contagem:");
        entrada= sc.nextInt();

        int i = 0;
        int j = 0;
        System.out.print("for: ");
        for(i = 0; i < entrada; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\nwhile: ");
        while(j < entrada) {
            System.out.print(j + " ");
            j++;
        }
        i = 0;
        System.out.print("\ndo-while: ");
        do {
            System.out.print(i + " ");
            i++;
        } while(i < entrada);
    }
}