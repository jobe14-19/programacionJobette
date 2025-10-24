package ejerciciocondicionales;

public class ejercicio5 {
    //leer un numero de dos digitos
    //que sea menor a 20
    //   que sea primo

    public static Boolean dosDigitoMenor20(int numero) {
        if (numero >= 10 && numero <= 99) {
            System.out.println("El número no tiene dos dígitos.");
            return false;
        }

        if (numero >= 20) {
            System.out.println("El número no es menor a 20.");
            return false;
        }

        if (numero % 2 == 0 && numero % 3 == 0 && numero % 5 == 0 && numero % 7 == 0) {
            System.out.println("El número " + numero + " no es primo.");
            return false;
        }else {
            System.out.println("El número " + numero + "  es primo.");
            return true;
        }
    }
}
