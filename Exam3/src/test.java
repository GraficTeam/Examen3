import java.util.*;
import java.text.Collator;

public class test {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Collator compara = Collator.getInstance();
        compara.setStrength(Collator.PRIMARY);
        String frase, frase1, frase2;
        int n, i;

        System.out.println("Ingrese texto");
        frase = teclado.nextLine();
        StringTokenizer tokens = new StringTokenizer(frase); //cracion de StringTokenizer
        n = tokens.countTokens();//numero de tokens del string
        String[] aux = new String[n];
        String[] palabras = new String[n];
        i = 0;
        //almacena los tokens en un vector auxiliar
        while (tokens.hasMoreTokens()) {
            aux[i] = tokens.nextToken();
            i++;
        }
        //elimina signos de puntuacion y pasa las palabras limpias a otro vector
        for (i = 0; i < n; i++)
            palabras[i] = aux[i].replaceAll("\\p{Punct}", "");

        //muestra lo elementos del vector en pantalla
        for (i = 0; i < n; i++)
            System.out.println(palabras[i]);

        if (compara.compare(frase1, frase2) == 0)
            //frase1 igual a frase2
        else if (compara.compare(frase1, frase2) < 0)
            //frase1 menor que frase2
        else if (compara.compare(frase1, frase2) > 0)
            //frase1 mayor que frase2
    }
}
