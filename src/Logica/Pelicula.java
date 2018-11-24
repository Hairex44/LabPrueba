/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Usuario
 */
public class Pelicula {
    private int Id;
    private String titulo;
    private String genero;
    private int duraccion;
    private String idioma;
    private String clasif;
    private String tipo;
    private String imagen;
    
     public Pelicula(int Id, String titulo, String genero, int duraccion, String idioma, String clasif, String tipo, String imagen) {
        this.Id = Id;
        this.titulo = titulo;
        this.genero = genero;
        this.duraccion = duraccion;
        this.idioma = idioma;
        this.clasif = clasif;
        this.tipo = tipo;
        this.imagen = imagen;
    }
    public Pelicula() {
        this.Id = 0;
        this.titulo = "";
        this.genero = "";
        this.duraccion = 0;
        this.idioma = "";
        this.clasif = "";
        this.tipo = "";
        this.imagen = "";
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuraccion() {
        return duraccion;
    }

    public void setDuraccion(int duraccion) {
        this.duraccion = duraccion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getClasif() {
        return clasif;
    }

    public void setClasif(String clasif) {
        this.clasif = clasif;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
   

}
