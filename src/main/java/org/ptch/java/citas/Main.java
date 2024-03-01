package org.ptch.java.citas;

import java.sql.Date;
import java.time.LocalDateTime;

import org.ptch.java.citas.entities.Cita;
import org.ptch.java.citas.entities.Consultorio;
import org.ptch.java.citas.entities.Enfermero;
import org.ptch.java.citas.entities.Medico;
import org.ptch.java.citas.entities.Paciente;
import org.ptch.java.citas.entities.enums.Especialidad;
import org.ptch.java.citas.entities.enums.EstadoCita;
import org.ptch.java.citas.entities.enums.TipoDocumento;
import org.ptch.java.citas.entities.enums.TipoSangre;

public class Main {
    public static void main(String[] args) {
        
        //Crear Medico

        Medico m1 = new Medico(1, "Santiago", "Lopez", TipoDocumento.CC, 12345L, 12345L, Especialidad.Cardiologia);

        System.out.println("id del medico: " + m1.getId() + "|" + m1.getNombres() + "|" + m1.getApellidos() + "|");

        //Crando al enfermo este

        Enfermero e1 = new Enfermero(1, "Cuta", "Pablo", TipoDocumento.TI, 345678L);

        //añadir 2 procedimientos

        e1.addProcedure("Aplicar covid");
        e1.addProcedure("Aplicar rabia");

        //recorrer los procedimientos de e1

        for( String p : e1.getProcedimientos()){

            System.out.println("Procedimiento: " + p);

        }


    }
}