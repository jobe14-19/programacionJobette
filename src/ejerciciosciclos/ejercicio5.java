package ejerciciosciclos;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();

        int inicio = Math.min(a, b);
        int fin = Math.max(a, b);

        System.out.println("Números terminados en 4:");
        for (int i = inicio; i <= fin; i++) {
            if (i % 10 == 4 || i % 10 == -6) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}

