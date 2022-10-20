package paquetes;

import java.io.*;
import java.util.Scanner;

public class FileLocalReader {

    public void readBinariFile() {

        Scanner sc = new Scanner(System.in);
        String direArchivo = "";
        String contenidoLinea = "";
        System.out.println("Por favor, introduzca la ruta del archivo");
        direArchivo = sc.nextLine();
        File f = new File(direArchivo);
        Binarios bn = new Binarios();

        if (f.exists()) {
            //Lectura del archivo con FileReader

            try {

                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);


                while (contenidoLinea != null) {
                    contenidoLinea = br.readLine();

                    if (contenidoLinea != null) {
                        System.out.println(bn.binaryToText(contenidoLinea));
                    }


                }
                br.close();
                fr.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {

            System.out.println("El archivo requerido no existe");
        }

    }


    public void readFile() {

        Scanner sc = new Scanner(System.in);
        String ruta = "";
        String contenidoLinea = "";
        System.out.println("Por favor, introduzca la ruta del archivo");
        ruta = sc.nextLine();
        File f = new File(ruta);

        if (f.exists()) {


            try {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);

                while (contenidoLinea != null) {
                    contenidoLinea = br.readLine();


                    if (contenidoLinea != null) {
                        System.out.println(contenidoLinea);
                    }
                }



                br.close();
                fr.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {

            System.out.println("El archivo requerido no existe");
        }

    }


}
