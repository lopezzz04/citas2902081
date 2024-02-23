package org.ptch.java.citas;

import java.sql.Date;
import java.time.LocalDateTime;

import org.ptch.java.citas.entities.Cita;
import org.ptch.java.citas.entities.Consultorio;
import org.ptch.java.citas.entities.Especialidad;
import org.ptch.java.citas.entities.EstadoCita;
import org.ptch.java.citas.entities.Medico;
import org.ptch.java.citas.entities.Paciente;
import org.ptch.java.citas.entities.TipoDocumento;
import org.ptch.java.citas.entities.TipoSangre;

public class Main {
    public static void main(String[] args) {
        
        //Crer un objeto medico
        //Instanciar u medico
        //Una manea de dar valor a atributos privados a en una clase es a traves del constructor parametrico
        Medico m = new Medico(1, "Jeorge", "Curioso", TipoDocumento.PPT, 1031809248L, 3242224242L, Especialidad.Otorrinolaringologia);
        
        //instanciar otro medico
        Medico m2 = new Medico();

        // se debe utilizar primero el setter del atributo a asiganr

        m2.setNombres("Yasuri");
        m2.setApellidos("Yamile");
        m2.setNumeroIdentificacion(123456576L);
        System.out.println(m2.getNombres());

        System.out.println("----------------------------");

        Paciente p = new Paciente();
        p.setNombres("Pepe");
        p.setApellidos("Loro");
        p.setNumeroIdentificacion(12345L);
        p.setCelular(1234L);
        p.setTipoSangre(TipoSangre.A);
        System.out.println("Nombre Del Paciente: " + p.getNombres() + "|" + " Apellido Del Paciente: " + p.getApellidos() + "|" + " Identificacion Del Paciente: " + p.getNumeroIdentificacion() + "|" + " Celular Del Paciente: " + p.getCelular() + "|" + " Tipo De Sangre Del Paciente: " + p.getTipoSangre());

        System.out.println("----------------------------");

        Cita c = new Cita();
        c.setEstado(EstadoCita.REALIZADA);
        c.setFecha(LocalDateTime.now());
        System.out.println("Estado De La Cita: " + c.getEstado() + "|" + " Fecha Cita: " + c.getFecha());

        System.out.println("----------------------------");

        Consultorio x = new Consultorio();
        x.setNumero(2);
        System.out.println("Numero Del Consultorio: " + x.getNumero());




    }
}