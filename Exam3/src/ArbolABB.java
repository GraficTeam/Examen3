class ArbolABB {

    class Node
    {
        String dato;
        Node left, right;

        public Node(String elemento)
        {
            dato = elemento;
            left = right = null;
        }
    }

    Node root;

    ArbolABB(){
        root = null;
    }

    // Metodo que llama a la funcion insertar
    void insertar(String dato){

        root = insertarRec(root, dato);
    }

    //Metodo recursivo para insertar un nodo al arbol
    Node insertarRec(Node root, String key)
    {

        if (root == null){

            root = new Node(key);
            return root;
        }


        if (test.comparacion(key,root.dato)== -1)
            root.left = insertarRec(root.left, key);

        else if (test.comparacion(key,root.dato)== 1)
            root.right = insertarRec(root.right, key);

        return root;
    }

    //Metodo recursivo encargado de recorrer el arbol
    void recorridoEnOrden(Node root)
    {
        if (root != null) {

            recorridoEnOrden(root.left);
            System.out.println("-->"+root.dato);
            recorridoEnOrden(root.right);
        }
    }

}