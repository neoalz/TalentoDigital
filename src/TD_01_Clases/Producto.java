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
public class Producto {
    
    String titulo;
    String marca;
    String descripcion;
    String tipoDeMaterial;
    String color;
    float altura;
    float ancho;
    float largo;
    float peso;
    int precio;
    short stock;

    public Producto(String titulo, String marca, String descripcion, String tipoDeMaterial, float peso, float altura, float ancho, float largo, String color, int precio, short stock) {
        this.titulo = titulo;
        this.marca = marca;
        this.descripcion = descripcion;
        this.tipoDeMaterial = tipoDeMaterial;
        this.peso = peso;
        this.altura = altura;
        this.ancho = ancho;
        this.largo = largo;
        this.color = color;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + 
                "\ntitulo=" + titulo + 
                ",\nmarca=" + marca + 
                ",\ndescripcion=" + descripcion + 
                ",\ntipoDeMaterial=" + tipoDeMaterial + 
                ",\ncolor=" + color + 
                ",\naltura=" + altura + 
                ",\nancho=" + ancho + 
                ",\nlargo=" + largo + 
                ",\npeso=" + peso + 
                ",\nprecio=" + precio + 
                ",\nstock=" + stock + '}';
    }
    
    
    
    
    
    
}
