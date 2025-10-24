package ejerciciocondicionales;

public class Numeros {
    public static Boolean primo(int numero){
        var contador=0;

        for(int i=1; i<=numero; i++){
            if(numero % i == 0){
                contador++;
            }
        }
        System.out.println("Cantidad Divisores exactos son: " + contador);
        if(contador == 2){
            return true;
        } else {
            return false;
        }
    }

    public static boolean perfecto(int numero){
        var acumular=0;

        for(int i=1; i<=numero; i++){
            if(numero % i == 0) {
                acumular =+i;
            }
        }
        System.out.println("cantidad divisores exactos son: " + acumular);
        if( acumular == numero){
            return true;
        } else{
        return false;
        }
    }

    public static boolean perfect2(int numero){
       for (int i = 1; true; i++){
        var acumular=0;

        for(int i2=1; i<=numero; i++){
            if(numero % i == 0) {
                acumular =+i;
            }
        }
        System.out.println("cantidad divisores exactos son: " + acumular);
        if( acumular == numero){
            return true;
        } else{
            return false;
        }

        }
    }


}
