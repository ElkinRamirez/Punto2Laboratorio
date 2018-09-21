/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ELKIN RAMIREZ
 */
public class Libro {
    private String titulo;
    private String editorial;
    private String autor;
    private String tipo;
    private String genero;
    private float precio;
    private int numeroEjemplar;

    /**
     * La clase libro cuenta con los siguientes atributos quienes son las caracteristicas principales 
     * pertenecientes a cada libro de la libreria
     * @param titulo Nombre del ejemplar
     * @param editorial NOmbre de la editorial que lo imprimio
     * @param autor Nombre del autor que escribio el libro
     * @param tipo Si es de primera o segunda mano
     * @param genero A que genero pertenece. Ejemplo:ingenieria,medicina,literatura,entre otros
     * @param precio El precio del ejemplar
     * @param numeroEjemplar cantidad de ejemplares disponibles en la libreria
     */
    public Libro(String titulo, String editorial, String autor, String tipo, String genero, float precio, int numeroEjemplar) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.autor = autor;
        this.tipo = tipo;
        this.genero = genero;
        this.precio = precio;
        this.numeroEjemplar = numeroEjemplar;
    }

    /**
     * Con este metodo es poible obtener el titulo del ejemplar
     * @return
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     *Con este metodo es poible asignarle el titulo al ejemplar
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     *Con este metodo es poible obtener la editorial del ejemplar
     * @return
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     *Con este metodo es poible asignarle la editorial al ejemplar
     * @param editorial
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     *Con este metodo es poible obtener el autor del ejemplar
     * @return
     */
    public String getAutor() {
        return autor;
    }

    /**
     *Con este metodo es poible asignarle el autor al ejemplar
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     *Con este metodo es poible obtener el tipo del ejemplar
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     *Con este metodo es poible asignarle el tipo al ejemplar
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     *Con este metodo es poible obtener el genero del ejemplar
     * @return
     */
    public String getGenero() {
        return genero;
    }

    /**
     *Con este metodo es poible asignarle el genero al ejemplar
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     *Con este metodo es poible obtener el precio del ejemplar
     * @return
     */
    public float getPrecio() {
        return precio;
    }

    /**
     *Con este metodo es poible asignarle el precio al ejemplar
     * @param precio
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     *Con este metodo es poible obtener el numero de ejemplares disponibles
     * @return
     */
    public int getNumeroEjemplar() {
        return numeroEjemplar;
    }

    /**
     *Con este metodo es poible asignarle el numero de ejemplares disponibles
     * @param numeroEjemplar
     */
    public void setNumeroEjemplar(int numeroEjemplar) {
        this.numeroEjemplar = numeroEjemplar;
    }
    
 
}
