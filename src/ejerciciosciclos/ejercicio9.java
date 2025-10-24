package ejerciciosciclos;

public class ejercicio9 {
    public boolean mostrarNumeros3() {
        for (int i = 25; i <= 205; i++) {
            if (i % 10 == 6) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        return true;
    }
}
