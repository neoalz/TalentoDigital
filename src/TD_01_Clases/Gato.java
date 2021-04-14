/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD_01_Clases;

/**
 *
 * @author Nel
 */
public class Gato {
    
    String nombreMascota;
    String raza;
    float edad;
    String sexo;
    boolean chip;
    String nombreDuenio;
    String direccion;
    String telefonoDuenio;


    public Gato(String nombreMascota, String raza, float edad, String sexo, boolean chip, String nombreDuenio, String direccion, String telefonoDuenio) {
        this.nombreMascota = nombreMascota;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
        this.chip = chip;
        this.nombreDuenio = nombreDuenio;
        this.direccion = direccion;
        this.telefonoDuenio = telefonoDuenio;
    }

    @Override
    public String toString() {
        return "Gato{" + 
                "\nnombreMascota=" + nombreMascota + 
                ",\nraza=" + raza + 
                ",\nedad=" + edad + 
                ",\nsexo=" + sexo + 
                ",\nchip=" + chip + 
                ",\nnombreDuenio=" + nombreDuenio + 
                ",\ndireccion=" + direccion + 
                ",\ntelefonoDuenio=" + telefonoDuenio + '}';
    }
    
    
    
}
