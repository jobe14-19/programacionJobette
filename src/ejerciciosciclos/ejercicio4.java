package ejerciciosciclos;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();

        int inicio = Math.min(a, b);
        int fin = Math.max(a, b);

        for (int i = inicio; i <= fin; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
