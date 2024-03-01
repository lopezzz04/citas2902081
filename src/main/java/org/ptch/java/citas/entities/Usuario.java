package org.ptch.java.citas.entities;

import org.ptch.java.citas.entities.enums.TipoDocumento;

//clase junior tu papa
//super clase
//clase maestra
//clase base

public  abstract class Usuario {
    
    //atributos a heredarse deben ser protected

    protected int id;
    protected String nombres;
    protected String apellidos;
    protected TipoDocumento tipoIdentificacion;
    protected Long numeroIdentificacion;

    public Usuario(int id, String nombres, String apellidos, TipoDocumento tipoIdentificacion,
            Long numeroIdentificacion) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public TipoDocumento getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(TipoDocumento tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public Long getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(Long numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    

    
}
