package ejerciciosciclos;

public class ejercicio6 {
    public boolean mostrarNumeros(int numero) {
        if (numero < 100 || numero > 999) {
            System.out.println("El número no tiene tres dígitos.");
            return false;
        }

        int centenas = numero / 100;
        int decenas = (numero / 10) % 10;
        int unidades = numero % 10;

        System.out.println("Números entre 1 y el primer dígito (" + centenas + "):");
        for (int i = 1; i <= centenas; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Números entre 1 y el segundo dígito (" + decenas + "):");
        for (int i = 1; i <= decenas; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Números entre 1 y el tercer dígito (" + unidades + "):");
        for (int i = 1; i <= unidades; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        return true;
    }
}
