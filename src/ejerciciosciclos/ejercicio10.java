package ejerciciosciclos;

public class ejercicio10 {
        public boolean sumarHasta(int numero) {
            if (numero < 1) {
                System.out.println("El número debe ser mayor o igual a 1.");
                return false;
            }

            int suma = 0;
            for (int i = 1; i <= numero; i++) {
                suma += i;
            }

            System.out.println("La suma de los enteros entre 1 y " + numero + " es: " + suma);
            return true;
        }
    }
