package ejerciciocondicionales;

public class ejercicio8 {
    // Leer un número entero de dos dígitos
    // determinar si un dígito es múltiplo del otro

    public static boolean digitoMultiplo(int numero) {
        if (numero < 10 || numero > 99) {
            System.out.println("El número no tiene dos dígitos.");
            return false;
        }

        int decena = numero / 10;
        int unidad = numero % 10;

        if (decena != 0 && unidad % decena == 0) {
            System.out.println("El dígito de las unidades es múltiplo del de las decenas.");
            return true;
        } else if (unidad != 0 && decena % unidad == 0) {
            System.out.println("El dígito de las decenas es múltiplo del de las unidades.");
            return true;
        } else {
            System.out.println("Ningún dígito es múltiplo del otro.");
            return false;
        }
    }
}
