package ejerciciocondicionales;

    public class ejercicio6 {
        //Leer un número entero de dos dígitos
        // determinar si es primo
        // además si es negativo.

        public static Boolean primoNegarivo(int numero) {
            if (numero >= 10 && numero <= 99) {
                System.out.println("El número no tiene dos dígitos.");
                return false;
            }


            var negativo = numero < 0;

            var esPrimo =  numero % 2 == 0 && numero % 3 == 0 && numero % 5 == 0 && numero % 7 == 0;

            if (esPrimo) {
                System.out.println("El número " + numero + " es primo.");
            } else {
                System.out.println("El número " + numero + " no es primo.");
            }

            if (negativo) {
                System.out.println("Además, es negativo.");
            } else {
                System.out.println("No es negativo.");
            }

            return esPrimo && negativo;
        }
    }
