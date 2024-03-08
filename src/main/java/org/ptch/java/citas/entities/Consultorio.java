package org.ptch.java.citas.entities;

public class Consultorio {

    private int id;
    private String direccion;
    private int numero;

    

    @Override
    public String toString() {
        return "Consultorio [id=" + id + ", direccion=" + direccion + ", numero=" + numero +  "]";
    }

    public Consultorio() {
    }

    public Consultorio(int id, String direccion, int numero) {
        this.id = id;
        this.direccion = direccion;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    

    
    
}
