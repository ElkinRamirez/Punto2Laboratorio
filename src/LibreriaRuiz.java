 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ELKIN RAMIREZ
 */
import java.util.Scanner;
import java.util.ArrayList;
public class LibreriaRuiz {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
    }
    /**
     * libros: ArrayList de los libros de la libreria
     * lectura: Parametro para captura de datos
     */
    public static ArrayList<Libro> libros = new ArrayList<Libro>();
    public static Scanner lectura = new Scanner(System.in);
    /**
     * 
     * @return Retorna verdadero si se completo correctamente el proceso
     */
    public static boolean crearLibro(){
        /**
         * Se ingresan los valores de los parametros del libro que se va a crear y se añade un 
         * nuevo libro al ArrayList con los tales parametros
         */
        System.out.print("Titulo: ");
        String titulo = lectura.next();
        
        System.out.print("Editorial: ");
        String editorial = lectura.next();
        
        System.out.print("Autor: ");
        String autor = lectura.next();
        
        System.out.print("Tipo(usado o nuevo): ");
        String tipo = lectura.next();
        
        System.out.print("Genero: ");
        String genero = lectura.next();
        
        System.out.print("Precio: ");
        float precio = lectura.nextFloat();
        
        libros.add(new Libro(titulo,editorial,autor,tipo,genero,precio));
        return true;
        
    }
    
    
}
