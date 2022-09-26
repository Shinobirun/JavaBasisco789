package ejercicioFinal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        String texto="";

        if (args.length == 1){
            texto = args[0];
        }

        if (texto.equals("")){
            Scanner lectTeclado= new Scanner(System.in);
            System.out.print("Ingrese una cadena de texto y pulse Enter");
            texto = lectTeclado.nextLine();
        }

        if (!texto.isEmpty()){
            System.out.print("El texto  \""+texto+"\" invertido es: "+ Reverse(texto));
        } else {
            System.out.println("No ha introducido texto");
        }

        //Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

        String[] arrayuni ={"Maria", "Juan", "Diego", "Soledad"};

        mostrarArray(arrayuni);

        //Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en
        // ambas dimensiones.

        Integer [] []  matriz = new Integer[3][2];
        matriz = new Integer[][]{{1, 2}, {3, 4}, {5, 6}};

        mostrarMatriz(matriz);

        //Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento
        // y muestra el resultado final.

        Vector vector=new Vector();

        vector.addElement(2);
        vector.addElement(22);
        vector.addElement(32);
        vector.addElement(21);
        vector.addElement(62);

        vector.remove(1);
        vector.remove(2);

        System.out.println(vector);

        //Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si
        // tuviésemos 1000 elementos para ser añadidos al mismo.
        // Lo que pasaría que es que se crearía un vector de 1920 espacios.


        //Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
        // Recorre ambos mostrando únicamente el valor de cada elemento.

        ArrayList<String> list = new ArrayList<String>();
        list.add("Banana");
        list.add("anana");
        list.add("Manzana");
        list.add("Frutilla");

        LinkedList<String> linkList = new LinkedList<String>();
        

    }

    public static String Reverse(String texto) {

        String textoInvertido="";
        for (int x=texto.length() - 1; x >= 0;x-- )
            textoInvertido= textoInvertido+texto.charAt(x);
        return textoInvertido;

    }

    public static String mostrarArray(String lista[]){
        for (int i=0;i<lista.length;i++){
            System.out.println("En el indice " +i+ " esta el valor: "+lista[i]);
        }
        return null;
    }

    public static Integer mostrarMatriz(Integer matr[][]){
        for (int i=0;i<matr.length;i++){
            for (int j=0;j<matr[0].length;j++){
                System.out.println("En el indice " +i+" "+j+ " esta el valor: "+matr[i][j]);
            }
        }
        return null;
    }
}