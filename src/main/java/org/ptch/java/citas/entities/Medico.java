package org.ptch.java.citas.entities;

public class Medico {
    //POR REGAL GENERAL:
    //los atributos de una clase deben ser private
    private int id;
    private String nombres;
    private String apellidos;
    private TipoDocumento tipoIdentificacion;
    private Long numeroIdentificacion;
    private Long registroMedico;
    private Especialidad especialidad;


    //Constructor por defecto
   //Siempre debe ser public  
    public Medico (){

    }



    public Medico(int id, String nombres, String apellidos, TipoDocumento tipoIdentificacion, Long numeroIdentificacion,
            Long registroMedico, Especialidad especialidad) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    //getters and setters deben ser publicos
    //firma de un getter:
    //Tipo de dato de retorno
    //es el t.d del aributo
    //Nombre del metodo:
    //Get seguido del nombre del atributo
    //retorna: el valor del atributo


    public String getNombres() {
        //return sirve para
        //retornar  el valor
        //al invocante
        return this.nombres;
    }


    //Sirve para asignar un valor a un atributo privado
    //firma de un setter:
    // - Tipo de dato de retorno: void
    // - Nombre del setter: set seguido del nombre del atributo
    // - Parametros: 1, input del valor a asignar al aributo
    // - Retorna: nada
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