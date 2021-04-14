
package TD_01_Clases;

public class Persona {
    
    String nombre;
    String apellido;
    byte edad;
    String rut;
    String direccion;
    String telefono;
    String email;
    String genero;
    String estadoCivil;
    String nacionalidad;

    public Persona(String nombre, String apellido, byte edad, String rut, String direccion, String telefono, String email, String genero, String estadoCivil, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.rut = rut;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Persona{" + 
                "\nnombre=" + nombre + 
                ",\napellido=" + apellido + 
                ",\nedad=" + edad + 
                ",\nrut=" + rut + 
                ",\ndireccion=" + direccion + 
                ",\ntelefono=" + telefono + 
                ",\nemail=" + email + 
                ",\ngenero=" + genero + 
                ",\nestadoCivil=" + estadoCivil + 
                ",\nnacionalidad=" + nacionalidad + '}';
    }
    
    
    
    
    
}
