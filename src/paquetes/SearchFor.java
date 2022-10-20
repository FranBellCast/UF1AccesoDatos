package paquetes;

import java.io.FileReader;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchFor {

    public void searchFor(String nameKey) {
        Scanner sc = new Scanner(System.in);
        String ruta = "";

        System.out.println("Por favor, introduzca la ruta del archivo");
        ruta = sc.nextLine();
        File f = new File(ruta);


        if (f.exists()) {
            //Lectura del archivo con FileReader

            try {
                java.io.FileReader fr = new java.io.FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String contenidoLinea = "";
                Pattern pattern = Pattern.compile("([a-z]*): ([a-z]*)", Pattern.CASE_INSENSITIVE);
                Boolean salir = true;
                contenidoLinea = br.readLine();

                while (contenidoLinea != null && salir) {

                    Matcher matcher = pattern.matcher(contenidoLinea);
                    matcher.find();

                    String clave = matcher.group(2);

                    if (nameKey.equals(clave)) {
                        System.out.println("La persona ha sido encontrada");
                        System.out.println(contenidoLinea);
                        contenidoLinea = br.readLine();
                        System.out.println(contenidoLinea);
                        contenidoLinea = br.readLine();
                        System.out.println(contenidoLinea);
                        contenidoLinea = br.readLine();
                        System.out.println(contenidoLinea);
                        contenidoLinea = br.readLine();
                        System.out.println(contenidoLinea);
                        contenidoLinea = br.readLine();
                        System.out.println("****************************");
                        System.out.println("");
                        salir = false;
                    }
                    contenidoLinea = br.readLine();
                }
                    if(salir){
                        System.out.println("**********************");
                        System.out.println("Persona no encontrada");
                        System.out.println("**********************");
                        System.out.println("");
                    }

                br.close();
                fr.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("Archivo no encontrado");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Archivo no encontrado");
            }
        } else {

            System.out.println("El archivo requerido no existe");
        }


    }
    public void searchForBinary(String nameKey) {
        Scanner sc = new Scanner(System.in);
        String ruta = "";

        System.out.println("Introduce la ruta: ");
        ruta = sc.nextLine();
        File f = new File(ruta);


        if (f.exists()) {
            // LECTURA DEL ARCHIVO

            try {
                java.io.FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                Binarios bn = new Binarios();
                String contenidoLinea = "";
                Pattern pattern = Pattern.compile("([a-z]*): ([a-z]*)", Pattern.CASE_INSENSITIVE);
                Boolean salir = true;
                contenidoLinea = bn.binaryToText(br.readLine());

                while (contenidoLinea != null && salir) {


                    Matcher matcher = pattern.matcher(contenidoLinea);
                    matcher.find();

                    String clave = matcher.group(2);

                    if (nameKey.equals(clave)) {
                        System.out.println("La persona ha sido encontrada");
                        System.out.println(contenidoLinea);
                        contenidoLinea = bn.binaryToText(br.readLine());
                        System.out.println(contenidoLinea);
                        contenidoLinea = bn.binaryToText(br.readLine());
                        System.out.println(contenidoLinea);
                        contenidoLinea =bn.binaryToText(br.readLine());
                        System.out.println(contenidoLinea);
                        contenidoLinea = bn.binaryToText(br.readLine());
                        System.out.println(contenidoLinea);
                        contenidoLinea = bn.binaryToText(br.readLine());
                        System.out.println("*****************************");
                        System.out.println("");
                        salir = false;
                    }
                    contenidoLinea = bn.binaryToText(br.readLine());
                }


                if(salir){
                    System.out.println("*********************");
                    System.out.println("Persona no encontrada");
                    System.out.println("*********************");
                    System.out.println("");
                }



                br.close();
                fr.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("El archivo requerido no se ha encontrado");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("El archivo requerido no se ha encontrado");
            }
        } else {

            System.out.println("El archivo requerido no existe");
        }


    }

}
