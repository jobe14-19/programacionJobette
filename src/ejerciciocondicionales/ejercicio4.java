package ejerciciocondicionales;

public class ejercicio4 {
    //leer un numero de dos digitos
    //determinar la suma de sus digitos
    //que la suma sea par

    public static Boolean dosDigitosPares(int numero) {
        if (numero >= 10 && numero <= 99) {
            return false;
        } else {

            int decena = numero / 10;
            int unidad = numero % 10;
            int suma = decena + unidad;

            System.out.println("La suma de los dígitos es: " + suma);

            return decena % 2 == 0 && unidad % 2 == 0;
        }
    }
}
