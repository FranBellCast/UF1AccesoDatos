import paquetes.FileLocalReader;
import paquetes.SearchFor;
import objetos.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean menuOn = true;
        String inputMenu = "";

        while (true) {

            System.out.println("*******Bienvenido a*******");
            System.out.println("***registro de personas***");
            System.out.println();
            System.out.println("1. (E)scribir");
            System.out.println("2. (L)eer");
            System.out.println("3. Escribir (B)inario");
            System.out.println("4. Leer binario (V)");
            System.out.println("5. (S)alir");
            System.out.println();
            System.out.println("Pulse la letra en paréntesis para seleccionar una opción");

            inputMenu = sc.nextLine();

            if (!inputMenu.equalsIgnoreCase("E") && !inputMenu.equalsIgnoreCase("L") && !inputMenu.equalsIgnoreCase("B") && !inputMenu.equalsIgnoreCase("S") && !inputMenu.equalsIgnoreCase("v")) {

                System.out.println("Valor no permitido. Introduzca uno de los valores solicitados");
                continue;
            }

            //Opción de escritura

            if (inputMenu.equalsIgnoreCase("E")) {

                //Se crea Persona1

                Persona persona1 = new Persona();
                System.out.println("******Persona1******");
                System.out.println();

                //Se piden los datos y se crea un setter
                persona1.create();

                //Se imprimen los datos en consola
                System.out.println("Datos de Persona1");
                persona1.print();

                //Se guarda el fichero

                persona1.save();

                //Se crea Persona2
                Persona persona2 = new Persona();
                System.out.println("******Persona2******");
                System.out.println();

                //Se piden los datos y se crea un setter
                persona2.create();

                System.out.println("Datos de Persona2");

                //Se imprimen los datos en consola
                persona2.print();

                //Se guarda el fichero
                persona2.save();

                //Se crea Persona3
                Persona persona3 = new Persona();
                System.out.println("******Persona3******");
                System.out.println();

                //Se piden los datos y se crea un setter
                persona3.create();

                System.out.println("Datos de Persona3");

                //Se imprimen los datos en consola
                persona3.print();

                //Se guarda el ficher
                persona3.save();
            }

            //Opción de lectura

            if (inputMenu.equalsIgnoreCase("L")) {
                while (menuOn) {
                    menuOn = true;

                    System.out.println("*****Lectura de datos en archivo*****");
                    System.out.println();
                    System.out.println("Leer todo el (A)rchivo");
                    System.out.println("(B)uscar una persona concreta");
                    System.out.println("(V)olver al menú principal");
                    System.out.println("(S)alir");
                    System.out.println();
                    System.out.println("Pulse la letra en paréntesis para seleccionar una opción");

                    inputMenu = sc.nextLine();
                    if (!inputMenu.equalsIgnoreCase("A") && !inputMenu.equalsIgnoreCase("B") && !inputMenu.equalsIgnoreCase("v") && !inputMenu.equalsIgnoreCase("S")) {

                        System.out.println("Valor no permitido. Introduzca uno de los valores solicitados");
                        continue;
                    }

                    if (inputMenu.equalsIgnoreCase("A")) {
                        FileLocalReader flr = new FileLocalReader();

                        flr.readFile();
                    }
                    if (inputMenu.equalsIgnoreCase("B")) {
                        SearchFor sf = new SearchFor();

                        System.out.println("Escribe el nombre a buscar:");
                        inputMenu = sc.nextLine();

                        sf.searchFor(inputMenu);
                    }
                    if (inputMenu.equalsIgnoreCase("v")) {

                        menuOn = false;
                    }
                    if (inputMenu.equalsIgnoreCase("s")) {

                        break;
                    }
                }
            }
            //Opción escritura en binario

            if (inputMenu.equalsIgnoreCase("b")) {

                boolean resultado = false;

                while (!resultado) {
                    System.out.println("Introduzca un número de personas a registrar entre 1 y 3");
                    inputMenu = sc.nextLine();
                    try {
                        numero = Integer.parseInt(inputMenu);
                        if (numero > 0 && numero < 4) {
                            resultado = true;
                        } else {
                            System.out.println("Por favor, introduzca un número de personas a registrar entre 1 y 3");
                        }

                    } catch (NumberFormatException excepcion) {
                        System.out.println("Debe introducir un número entre 1 y 3");
                        resultado = false;
                    }

                }

                if (numero == 1) {
                    Persona persona1 = new Persona();
                    System.out.println("******Persona1******");
                    System.out.println();
                    persona1.create();
                    persona1.saveBinari();

                } else if (numero == 2) {
                    Persona persona1 = new Persona();
                    System.out.println("******Persona1******");
                    System.out.println();
                    persona1.create();
                    persona1.saveBinari();

                    Persona persona2 = new Persona();
                    System.out.println("******Persona2******");
                    System.out.println();
                    persona2.create();
                    persona2.saveBinari();

                } else if (numero == 3) {
                    Persona persona1 = new Persona();
                    System.out.println("******Persona1******");
                    System.out.println();
                    persona1.create();
                    persona1.saveBinari();

                    Persona persona2 = new Persona();
                    System.out.println("******Persona2******");
                    System.out.println();
                    persona2.create();
                    persona2.saveBinari();

                    Persona persona3 = new Persona();
                    System.out.println("******Persona3******");
                    System.out.println();
                    persona3.create();
                    persona3.saveBinari();
                }

            }
            //Opción lectura de binario

            if (inputMenu.equalsIgnoreCase("v")) {

                while (menuOn) {
                    menuOn = true;

                    System.out.println("*****Lectura de binario*****");
                    System.out.println();
                    System.out.println("Leer todo el (A)rchivo");
                    System.out.println("(B))uscar una persona concreta");
                    System.out.println("(V)olver al menú principal");
                    System.out.println("(S)alir");
                    System.out.println();
                    System.out.println("Pulse la letra en paréntesis para seleccionar una opción");

                    inputMenu = sc.nextLine();
                    if (!inputMenu.equalsIgnoreCase("A") && !inputMenu.equalsIgnoreCase("B") && !inputMenu.equalsIgnoreCase("v") && !inputMenu.equalsIgnoreCase("S")) {

                        System.out.println("Valor no permitido. Introduzca uno de los valores solicitados");
                        continue;
                    }

                    if (inputMenu.equalsIgnoreCase("A")) {
                        FileLocalReader flr = new FileLocalReader();

                        flr.readBinariFile();
                    }
                    if (inputMenu.equalsIgnoreCase("B")) {
                        SearchFor sf = new SearchFor();

                        System.out.println("Escriba a continuación el nombre a buscar en el archivo");
                        inputMenu = sc.nextLine();

                        sf.searchForBinary(inputMenu);


                    }
                    if (inputMenu.equalsIgnoreCase("v")) {

                        menuOn = false;
                    }
                    if (inputMenu.equalsIgnoreCase("s")) {

                        break;
                    }
                }



            }
            //----------------OPCION 5-------------------

            if (inputMenu.equalsIgnoreCase("s")) {

                System.out.println("El programa se ha cerrado correctamente");
                break;

            }
        }
    }
}