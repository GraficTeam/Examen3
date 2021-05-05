import java.util.*;
import java.text.Collator;

public class test {
    static int n;

    public static String[] palabras(String cad) {
        int i;
        StringTokenizer tokens = new StringTokenizer(cad); //cracion de StringTokenizer
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
        return palabras;
    }

    /*Comparacion de dos palabras
        retorna: 1 si frase1 es mayor a frase2
                -1 si frase1 es menor a frase2
                 0 si ambas frases son iguales
         */
    public static int comparacion(String cad1, String cad2) {
        Collator compara = Collator.getInstance();
        compara.setStrength(Collator.PRIMARY);
        if (compara.compare(cad1, cad2) == 0)
            return 0;
        else if (compara.compare(cad1, cad2) < 0)
            return -1;
        else if (compara.compare(cad1, cad2) > 0)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArbolABB arbol = new ArbolABB();
        String frase;
        String[] aux;
        int resul, i;

        System.out.println("Ingrese texto");
        frase = teclado.nextLine();
        aux = palabras(frase);
        for (i = 0; i < n; i++){

            arbol.insertar(aux[i]);

        }
            arbol.recorridoEnOrden(arbol.root);

    }
}
