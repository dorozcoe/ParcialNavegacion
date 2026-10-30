package com.example.parcialnavegacion;

public class Celular {
    private String nombre;
    private String descripcion;
    private String colores;
    private String precio;
    private String stock;
    private int imagenResId;

    public Celular(String nombre, String descripcion, String colores, String precio, String stock, int imagenResId) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.colores = colores;
        this.precio = precio;
        this.stock = stock;
        this.imagenResId = imagenResId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getColores() {
        return colores;
    }

    public String getPrecio() {
        return precio;
    }

    public String getStock() {
        return stock;
    }

    public int getImagenResId() {
        return imagenResId;
    }
}