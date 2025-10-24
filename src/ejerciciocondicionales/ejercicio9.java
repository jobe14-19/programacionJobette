package ejerciciocondicionales;

public class ejercicio9 {
    // Leer un número entero de dos dígitos y determinar si los dos dígitos son iguales

    public static boolean digitosIguales(int numero) {
        // Validar que tenga dos dígitos
        if (numero < 10 || numero > 99) {
            System.out.println("El número no tiene dos dígitos.");
            return false;
        }

        int decena = numero / 10;
        int unidad = numero % 10;

        if (decena == unidad) {
            System.out.println("Los dos dígitos son iguales.");
            return true;
        } else {
            System.out.println("Los dos dígitos no son iguales.");
            return false;
        }
    }
}
