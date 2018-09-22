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
        boolean cond = true;
        while(cond == true){
            int n;
            System.out.println("Libreria Ruiz. Seleccione la acción que desea realizar.");
            System.out.println("1. Añadir libro");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Filtrar por titulo");
            System.out.println("4. Filtrar por autor");
            System.out.println("5. Filtrar por editorial");
            System.out.println("6. Filtrar por genero");
            System.out.println("7. Filtrar por tipo");
            n = lectura.nextInt();

            switch(n){
                case 1:
                    crearLibro();
                    break;
                case 2:
                    listarLibros();
                    break;
                case 3:
                    filtrarLibroTitulo();
                    break;
                case 4:
                    filtrarLibroAutor();
                    break;
                case 5:
                    filtrarLibroEditorial();
                    break;
                case 6:
                    filtrarLibroGenero();
                    break;
                case 7:
                    filtrarLibroTipo();
                    break;
            }
            
            System.out.print("Desea realizar alguna otra accion?(si/no) ");
            String respuesta = lectura.next();
            
            if(respuesta.equals("si")) cond = true;
            else cond = false;
        }
        
        System.out.println("Gracias. Hasta luego");
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
         * Se ingresan los valores de los parametros del libro que se va a crear
         * y se añade un nuevo libro al ArrayList con los tales parametros
         */
        System.out.println("Por favor ingrese los datos en minuscula y separados por (_). Ej: cien_anios_de_soledad");
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
    /**
     * Le pregunta al usuario si desea comprar y elimina del ArrayList el libro
     * que el usuario seleccione
     */
    public static void venderLibro(){
        System.out.print("Desea comprar algun libro?(si/no): ");
        String respuesta = lectura.next();
        if(respuesta.equals("si")){
            System.out.print("Escriba el numero del libro que desea comprar: ");
            int numero = lectura.nextInt();
            libros.remove(numero-1);
            System.out.println("Que lo disfrute.");
        }
    }
    /**
     * Muestra todo el inventario de la libreria
     */
    public static void listarLibros(){
        int indice;
        if(libros.size() == 0){
            System.out.println("No hay libros");
        }else{
            for(int i = 0; i < libros.size(); i++){
                indice = i+1;
                System.out.println("Libro " + (i+1) + ": ");
                System.out.println(" ");
                System.out.println("Titulo: " + libros.get(i).getTitulo());
                System.out.println("Editorial: " + libros.get(i).getEditorial());
                System.out.println("Autor: " + libros.get(i).getAutor());
                System.out.println("Tipo: " + libros.get(i).getTipo());
                System.out.println("Genero: " + libros.get(i).getGenero());
                System.out.println("Precio: " + libros.get(i).getPrecio());
                System.out.println(" ");
            }
        }
    }
    /**
     * Muestra los libros que tienen determinado autor. Si no hay, se imprime el
     * mensaje en pantalla
     */
    public static void filtrarLibroAutor(){
        System.out.print("Ingrese el autor: ");
        String autor = lectura.next();
        boolean cond1 = false;
        for(int j = 0; j < libros.size(); j++){
            if(libros.get(j).getAutor().equals(autor)){
                cond1 = cond1 || true;
            }
        }
        if(cond1 == false){
            System.out.println("No hay libros de este autor.");
        }else{
            int indice;
            for(int i = 0; i < libros.size(); i++){
                indice = i+1;
                if(libros.get(i).getAutor().equals(autor)){
                    System.out.println("Libro " + indice + ": ");
                    System.out.println(" ");
                    System.out.println("Titulo: " + libros.get(i).getTitulo());
                    System.out.println("Editorial: " + libros.get(i).getEditorial());
                    System.out.println("Autor: " + libros.get(i).getAutor());
                    System.out.println("Tipo: " + libros.get(i).getTipo());
                    System.out.println("Genero: " + libros.get(i).getGenero());
                    System.out.println("Precio: " + libros.get(i).getPrecio());
                    System.out.println(" ");
                }
            }
            venderLibro();
        }
    }
    /**
     * Muestra los libros que tienen determinado titulo. Si no hay, se imprime
     * el mensaje en pantalla
     */
    public static void filtrarLibroTitulo(){
        System.out.print("Ingrese el titulo: ");
        String titulo = lectura.next();
        boolean cond1 = false;
        for(int j = 0; j < libros.size(); j++){
            if(libros.get(j).getTitulo().equals(titulo)){
                cond1 = cond1 || true;
            }
        }
        if(cond1 == false){
            System.out.println("No hay libros con este titulo.");
        }else{
            int indice;
            for(int i = 0; i < libros.size(); i++){
                indice = i+1;
                if(libros.get(i).getTitulo().equals(titulo)){
                    System.out.println("Libro " + indice + ": ");
                    System.out.println(" ");
                    System.out.println("Titulo: " + libros.get(i).getTitulo());
                    System.out.println("Editorial: " + libros.get(i).getEditorial());
                    System.out.println("Autor: " + libros.get(i).getAutor());
                    System.out.println("Tipo: " + libros.get(i).getTipo());
                    System.out.println("Genero: " + libros.get(i).getGenero());
                    System.out.println("Precio: " + libros.get(i).getPrecio());
                    System.out.println(" ");
                }
            }
            venderLibro();
        }
    }
    /**
     * Muestra los libros que comparten determinada editorial. Si no hay, se 
     * muestra el mensaje en pantalla
     */
    public static void filtrarLibroEditorial(){
        System.out.print("Ingrese la editorial: ");
        String editorial = lectura.next();
        boolean cond1 = false;
        for(int j = 0; j < libros.size(); j++){
            if(libros.get(j).getEditorial().equals(editorial)){
                cond1 = cond1 || true;
            }
        }
        if(cond1 == false){
            System.out.println("No hay libros de esta editorial.");
        }else{
            int indice;
            for(int i = 0; i < libros.size(); i++){
                indice = i+1;
                if(libros.get(i).getEditorial().equals(editorial)){
                    System.out.println("Libro " + indice + ": ");
                    System.out.println(" ");
                    System.out.println("Titulo: " + libros.get(i).getTitulo());
                    System.out.println("Editorial: " + libros.get(i).getEditorial());
                    System.out.println("Autor: " + libros.get(i).getAutor());
                    System.out.println("Tipo: " + libros.get(i).getTipo());
                    System.out.println("Genero: " + libros.get(i).getGenero());
                    System.out.println("Precio: " + libros.get(i).getPrecio());
                    System.out.println(" ");
                }
            }
            venderLibro();
        }
    }
    /**
     * Muestra los libros que son de un determinado tipo. Si no hay, se muestra
     * el mensaje en pantalla
     */
    public static void filtrarLibroTipo(){
        System.out.print("Ingrese el tipo (Nuevo o usado): ");
        String tipo = lectura.next();
        boolean cond1 = false;
        for(int j = 0; j < libros.size(); j++){
            if(libros.get(j).getTipo().equals(tipo)){
                cond1 = cond1 || true;
            }
        }
        if(cond1 == false){
            System.out.println("No hay libros de este tipo.");
        }else{
            int indice;
            for(int i = 0; i < libros.size(); i++){
                indice = i+1;
                if(libros.get(i).getTipo().equals(tipo)){
                    System.out.println("Libro " + indice + ": ");
                    System.out.println(" ");
                    System.out.println("Titulo: " + libros.get(i).getTitulo());
                    System.out.println("Editorial: " + libros.get(i).getEditorial());
                    System.out.println("Autor: " + libros.get(i).getAutor());
                    System.out.println("Tipo: " + libros.get(i).getTipo());
                    System.out.println("Genero: " + libros.get(i).getGenero());
                    System.out.println("Precio: " + libros.get(i).getPrecio());
                    System.out.println(" ");
                }
            }
            venderLibro();
        }
    }
    /**
     * Muestra los libros de un mismo genero. Si no hay, se imprime el mensaje
     * en pantalla
     */
    public static void filtrarLibroGenero(){
        System.out.print("Ingrese el genero: ");
        String genero = lectura.next();
        boolean cond1 = false;
        for(int j = 0; j < libros.size(); j++){
            if(libros.get(j).getGenero().equals(genero)){
                cond1 = cond1 || true;
            }
        }
        if(cond1 == false){
            System.out.println("No hay libros de este genero.");
        }else{
            int indice;
            for(int i = 0; i < libros.size(); i++){
                indice = i+1;
                if(libros.get(i).getGenero().equals(genero)){
                    System.out.println("Libro " + indice + ": ");
                    System.out.println(" ");
                    System.out.println("Titulo: " + libros.get(i).getTitulo());
                    System.out.println("Editorial: " + libros.get(i).getEditorial());
                    System.out.println("Autor: " + libros.get(i).getAutor());
                    System.out.println("Tipo: " + libros.get(i).getTipo());
                    System.out.println("Genero: " + libros.get(i).getGenero());
                    System.out.println("Precio: " + libros.get(i).getPrecio());
                    System.out.println(" ");
                }
            }
            venderLibro();
        }
    }
}
