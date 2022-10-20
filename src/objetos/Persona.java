package objetos;

import paquetes.Binarios;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Persona {
    //atributos requeridos
    public String nombre;
    public String apellidos;
    public String ciudad;
    public String nacionalidad;
    public int edad;

    //constructor
    public Persona() {

    }
    //getters y setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void print() {

        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellido: " + this.getApellidos());
        System.out.println("Ciudad: " + this.getCiudad());
        System.out.println("Nacionalidad: " + this.getNacionalidad());
        System.out.println("Edad: " + this.getEdad());
    }


    public void create() {
        Scanner sc = new Scanner(System.in);
        String atributos = "";

        System.out.println("Introduzca nombre:");
        atributos = sc.nextLine();
        this.setNombre(atributos);
        System.out.println("Introduzca apellido:");
        atributos = sc.nextLine();
        this.setApellidos(atributos);
        System.out.println("Introduzca ciudad:");
        atributos = sc.nextLine();
        this.setCiudad(atributos);
        System.out.println("Introduzca nacionalidad:");
        atributos = sc.nextLine();
        this.setNacionalidad(atributos);
        System.out.println("Introduzca edad:");
        edad = sc.nextInt();
        this.setEdad(edad);
    }

    public void save() {

        Scanner sc = new Scanner(System.in);
        String ruta = "";

        System.out.println("Por favor, introduzca la ruta del archivo");
        ruta = sc.nextLine();
        File f = new File(ruta);

        if (f.exists()) {
            try {
                System.out.println("El archivo ha sido encontrado");
                FileWriter fw = new FileWriter(f, true);
                PrintWriter pw = new PrintWriter(fw);

                pw.println("Nombre: " + this.getNombre());
                pw.println("Apellido: " + this.getApellidos());
                pw.println("Ciudad: " + this.getCiudad());
                pw.println("Nacionalidad: " + this.getNacionalidad());
                pw.println("Edad: " + this.getEdad());


                pw.close();
                fw.close();

                System.out.println("Los datos se han guardado correctamente");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                FileWriter fw = new FileWriter(f, true);
                PrintWriter pw = new PrintWriter(fw);
                pw.println("Nombre: " + this.getNombre());
                pw.println("Apellido: " + this.getApellidos());
                pw.println("Ciudad: " + this.getCiudad());
                pw.println("Nacionalidad: " + this.getNacionalidad());
                pw.println("Edad: " + this.getEdad());


                pw.close();
                fw.close();

                System.out.println("El fichero se ha creado correctamente");
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }


    public void saveBinari() {

        Scanner sc = new Scanner(System.in);
        String ruta = "";

        System.out.println("Por favor, introduzca la ruta del archivo");
        ruta = sc.nextLine();
        File f = new File(ruta);

        if (f.exists()) {
            try {

                FileWriter fw = new FileWriter(f, true);
                PrintWriter pw = new PrintWriter(fw);
                Binarios bn = new Binarios();

                pw.println(bn.textToBinary("Nombre: " + this.getNombre()));
                pw.println(bn.textToBinary("Apellido: " + this.getApellidos()));
                pw.println(bn.textToBinary("Ciudad: " + this.getCiudad()));
                pw.println(bn.textToBinary("Nacionalidad: " + this.getNacionalidad()));
                pw.println(bn.textToBinary("Edad: " + this.getEdad()));


                pw.close();
                fw.close();
                System.out.println("Los datos se han guardado correctamente");
            } catch (IOException e) {
                e.printStackTrace();
            }


        } else {
            try {
                FileWriter fw = new FileWriter(f, true);
                PrintWriter pw = new PrintWriter(fw);

                String nombre = this.nombre;
                String apellidos = this.apellidos;
                String ciudad = this.ciudad;
                String nacionalidad = this.nacionalidad;
                String edad = Integer.toString (this.edad);
                Binarios bn = new Binarios();

                pw.println(bn.textToBinary(nombre));
                pw.println(bn.textToBinary(apellidos));
                pw.println(bn.textToBinary(ciudad));
                pw.println(bn.textToBinary(nacionalidad));
                pw.println(bn.textToBinary(edad));


                pw.close();
                fw.close();
                System.out.println("Los datos se han guardado correctamente");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}








