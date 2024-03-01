package org.ptch.java.citas.entities;

import org.ptch.java.citas.entities.enums.Especialidad;
import org.ptch.java.citas.entities.enums.TipoDocumento;

//Clases que heredan
//lases hijas
//Subclases
//Clases detalle
//Clases Especificas

public class Medico extends Usuario {

    private Long registroMedico;
    private Especialidad especialidad;

    //Palabra reservada super:
    //hace referencia al estado(atributos) y comportamiento(metoos) de la clase padre
    //super llmada al constructor e la superclase
    //debe ser lo primero que aparezca en el
    //constructor de la clase hija

    public Medico(int id, String nombres, String apellidos, TipoDocumento tipoIdentificacion, Long numeroIdentificacion,
            Long registroMedico, Especialidad especialidad) {
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    //si quieres instanciar un medico
    //tambien puedes instanciar el usuario
    //super en el construcor invoca
    //al constructor de la clase padre

    //a continuacion inicializamos
    //atributos propios de la clase

    public Medico(int id, String nombres, String apellidos, TipoDocumento tipoIdentificacion,
            Long numeroIdentificacion) {
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
    }

    //geter and seters

    public Long getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(Long registroMedico) {
        this.registroMedico = registroMedico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

}