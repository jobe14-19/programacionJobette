package ejerciciocondicionales;

public class ejercicio7 {
    //Leer un número entero de dos dígitos
    // determinar si sus dos dígitos son primos.

    public static Boolean dosDigitosPrimos(int numero) {
        if (numero >= 10 && numero <= 99) {
            return false;
        } else {

            int decena = numero / 10;
            int unidad = numero % 10;
        }

        int decena = numero / 10;
        int unidad = numero % 10;

        boolean decenaPrimo = decena == 2 || decena == 3 || decena == 5 || decena == 7;
        boolean unidadPrimo = unidad == 2 || unidad == 3 || unidad == 5 || unidad == 7;

        if (decenaPrimo && unidadPrimo) {
            System.out.println("Ambos dígitos son primos.");
            return true;
        } else {
            System.out.println("No ambos dígitos son primos.");
            return false;
        }
    }
}
