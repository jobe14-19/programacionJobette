package ejerciciocondicionales;

public class ejercicio3 {
    //leer un numero de dos digitos
    //determinar la suma de sus digitos

    public static Boolean sumaDigito(int numero) {
        System.out.println("Inserte un numero");

        if (numero >= 10 && numero <= 99) {
            System.out.println("El número debe tener dos dígitos.");
            return false;
        } else {
            int decena = numero / 10;   // obtiene el primer dígito
            int unidad = numero % 10;   // obtiene el segundo dígito
            int suma = decena + unidad;

            System.out.println("La suma de los dígitos es: " + suma);
            return true;
        }
    }
}