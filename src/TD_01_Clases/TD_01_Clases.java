
package TD_01_Clases;

import java.util.Scanner;

public class TD_01_Clases {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Que lindo mishi, ¿Como se llama?");
        String nombreMascota = sc.nextLine();
        System.out.println("¿es misha o misho?");
        String sexo = sc.nextLine();
        System.out.println("¿Cuantos meses tiene?");
        float edad = sc.nextFloat();sc.nextLine();
        System.out.println("¿Que raza es?");
        String raza = sc.nextLine();
        System.out.println("¿tiene chip?");
        boolean chip = sc.nextBoolean();sc.nextLine();
        System.out.println("oye... ¿Me dai tu wsp?");
        String telefonoDuenio = sc.nextLine();
        System.out.println("¿Como te llamas?... para guardar tu numero");
        String nombreDuenio = sc.nextLine();
        System.out.println("¿te voy a dejar a tu casa?¿Donde vives?");
        String direccion = sc.nextLine();
        
        Gato mishi = new Gato(nombreMascota, raza, edad, sexo, chip, nombreDuenio, direccion, telefonoDuenio);
        //System.out.println(mishi);
        
        System.out.println("¿Cual es tu nombre?");
        String nombre = sc.nextLine();
        System.out.println("¿Cual es tu apellido?");
        String apellido = sc.nextLine();
        System.out.println("¿Cuantos años tienes?");
        byte edadHumano = sc.nextByte(); sc.nextLine();
        System.out.println("¿Cual es tu rut?");
        String rut = sc.nextLine();
        System.out.println("¿Cual es tu dirección?");
        String direccionHumano = sc.nextLine();
        System.out.println("¿Cual es tu telefono?");
        String telefono = sc.nextLine();
        System.out.println("¿Cual es tu correo?");
        String email = sc.nextLine();
        System.out.println("¿Cual es tu sexualidad?");
        String genero = sc.nextLine();
        System.out.println("¿Cual es tu estado civil?");
        String estadoCivil = sc.nextLine();
        System.out.println("¿Cual es tu nacionalidad?");
        String nacionalidad = sc.nextLine();
        
        Persona persone = new Persona(nombre, apellido, edadHumano, rut, direccionHumano, telefono, email, genero, estadoCivil, nacionalidad);
        System.out.println(persone);
        
        System.out.println("¿Que es eso?");
        String titulo= sc.nextLine();
        System.out.println("¿Cual es su marca?");
        String marca = sc.nextLine();
        System.out.println("¿Cual es su descripción?");
        String descripcion = sc.nextLine();
        System.out.println("¿De que está hecho?");
        String tipoDeMaterial = sc.nextLine();
        System.out.println("¿Que color es?");
        String color = sc.nextLine();
        System.out.println("¿Cual es su altura en mts?");
        float altura = sc.nextFloat();
        System.out.println("¿Cual es su ancho en mts?");
        float ancho = sc.nextFloat();
        System.out.println("¿Cual es su largo en mts?");
        float largo = sc.nextFloat();
        System.out.println("¿Cuanto pesa en kilos enteros?");
        float peso = sc.nextFloat();
        System.out.println("¿Cuantos hay?");
        short precio = sc.nextShort();
        System.out.println("¿Cuanto cuesta?");
        int stock = sc.nextInt();
                
        Producto producto = new Producto(titulo, marca, descripcion, tipoDeMaterial, peso, altura, ancho, largo, color, stock, precio);
        
        System.out.println(producto);
                
        
    }
    
}
