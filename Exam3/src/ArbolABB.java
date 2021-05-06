class ArbolABB {

	//Implementacion del nodo
    class Nodo
    {
        String dato;
        int frecuencia;
        Nodo left, right;

        public Nodo(String elemento)
        {
            dato = elemento;
            left = right = null;
            frecuencia=1;
        }
        //Metodo parar aumentar la frecuencia
        public void aumentaFrecuencia() {
        	frecuencia+=1;
        }
    }

    Nodo raiz;

    ArbolABB(){
        raiz = null;
    }

    // Metodo que llama a la funcion insertar
    void insertar(String dato){

        raiz = insertarRec(raiz, dato);
    }

    //Metodo recursivo para insertar un nodo al arbol
    Nodo insertarRec(Nodo raiz, String key)
    {
        if (raiz == null){
            raiz = new Nodo(key);
            return raiz;
        }

        //Compara las cadenas
        if (test.comparacion(key,raiz.dato)== -1)
            raiz.left = insertarRec(raiz.left, key); //Inserta a la izquierda
        else 
        	if (test.comparacion(key,raiz.dato)== 1)
            raiz.right = insertarRec(raiz.right, key); //Inserta a la derecha
        	else
        		raiz.aumentaFrecuencia(); //Aumena la frecuencia
        return raiz;
    }

    //Metodo recursivo encargado de recorrer el arbol
    void recorridoEnOrden(Nodo raiz)
    {
        if (raiz != null) {
            recorridoEnOrden(raiz.left);
            System.out.println(raiz.dato+"\t\t\t "+raiz.frecuencia);
            recorridoEnOrden(raiz.right);
        }
    }
}