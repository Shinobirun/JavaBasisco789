package ejercicioFinal;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        String texto = "";

        if (args.length == 1) {
            texto = args[0];
        }

        if (texto.equals("")) {
            Scanner lectTeclado = new Scanner(System.in);
            System.out.print("Ingrese una cadena de texto y pulse Enter");
            texto = lectTeclado.nextLine();
        }

        if (!texto.isEmpty()) {
            System.out.print("El texto  \"" + texto + "\" invertido es: " + Reverse(texto));
        } else {
            System.out.println("No ha introducido texto");
        }

        //Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

        String[] arrayuni = {"Maria", "Juan", "Diego", "Soledad"};

        mostrarArray(arrayuni);

        //Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en
        // ambas dimensiones.

        Integer[][] matriz = new Integer[3][2];
        matriz = new Integer[][]{{1, 2}, {3, 4}, {5, 6}};

        mostrarMatriz(matriz);

        //Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento
        // y muestra el resultado final.

        Vector vector = new Vector();

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

        linkList.addAll(list);

        list.forEach(System.out::println);
        linkList.forEach(System.out::println);

        //Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación,
        // con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra
        // el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el
        // primer "for" de relleno.

        ArrayList<Integer> list1 = new ArrayList<Integer>();

        for (int i = 1; 10 >= i; i++) {
            list1.add(i);
        }

        int i = 1;
        while (list1.size() > i) {

            Integer m = list1.get(i);
            i++;

            if (m % 2 == 0) {
                list1.remove(m);


            }

        }

        list1.forEach(System.out::println);

        //Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del
        // tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se
        // dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos
        // en cualquier caso: "Demo de código".

        try {
            dividePorCero(8, 0);
        } catch (Exception e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }


        //Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y
        // "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn"
        // al fichero dado en "fileOut".
         FicheroCopia("src/ejercicioFinal/fichero.txt","src/ejercicioFinal/fichero1.txt");
        //try {
         //   InputStream fichero = new FileInputStream("D:\\Adrian\\java\\JavaBasico789\\src\\ejercicioFinal\\fichero.txt");
           // byte[] datos = fichero.readAllBytes();
           // for (byte dato : datos) {
             //   System.out.println((char) dato);
           // }

          //} catch (FileNotFoundException e) {
            //System.out.println("El fichero no existe");
            //throw new RuntimeException(e);
        //} catch (IOException e) {
          //  System.out.println("no se puede leer el archivo: " + e.getMessage());
       // }

    }


    public static String Reverse(String texto) {

        String textoInvertido = "";
        for (int x = texto.length() - 1; x >= 0; x--)
            textoInvertido = textoInvertido + texto.charAt(x);
        return textoInvertido;

    }

    public static String mostrarArray(String lista[]) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("En el indice " + i + " esta el valor: " + lista[i]);
        }
        return null;
    }

    public static Integer mostrarMatriz(Integer matr[][]) {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[0].length; j++) {
                System.out.println("En el indice " + i + " " + j + " esta el valor: " + matr[i][j]);
            }
        }
        return null;
    }

    public static Object dividePorCero(double numeroA, double numeroB) throws ArithmeticException {


        double div;
        try {
            div = numeroA / numeroB;
            throw new ArithmeticException();
        } catch (Exception e) {
            System.out.println("Esto no se puede hacer");


        }
        return null;
    }

    public static void FicheroCopia(String fileIn, String fileOut) {
        try {
            InputStream fichero = new FileInputStream(fileIn);
            byte[] datos = fichero.readAllBytes();
            PrintStream out = new PrintStream(fileOut);
            for (byte dato : datos) {
                System.out.println((char) dato);
                out.write(datos);
                out.close();
            }

        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
            //throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("no se puede leer el archivo: " + e.getMessage());
        }
    }
}
