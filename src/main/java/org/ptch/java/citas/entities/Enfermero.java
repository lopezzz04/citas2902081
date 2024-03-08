package org.ptch.java.citas.entities;

import org.ptch.java.citas.entities.enums.TipoDocumento;

import java.util.ArrayList;
import java.util.List;

public class Enfermero extends Usuario{

    private List<String> procedimientos;

    

    @Override
    public String toString() {
        return "Enfermero [procedimientos=" + procedimientos + super.id + super.nombres + super.apellidos + "]";
    }

    public Enfermero(int id, String nombres, String apellidos, TipoDocumento tipoIdentificacion,
            Long numeroIdentificacion) {
                //llamar al constructor de la super clase
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
        this.procedimientos = new ArrayList<String>();
    }

    public void addProcedure(String procedure){
        //añadir le procedimeinto a la lista de procedimientos

        this.procedimientos.add(procedure);
    }

    //getter and setters

    public List<String> getProcedimientos() {
        return procedimientos;
    }

    

    





}
