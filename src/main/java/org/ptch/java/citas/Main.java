package org.ptch.java.citas;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.ptch.java.citas.entities.Cita;
import org.ptch.java.citas.entities.CitaEnfermero;
import org.ptch.java.citas.entities.CitaMedico;
import org.ptch.java.citas.entities.Consultorio;
import org.ptch.java.citas.entities.Enfermero;
import org.ptch.java.citas.entities.Medico;
import org.ptch.java.citas.entities.Paciente;
import org.ptch.java.citas.entities.enums.Especialidad;
import org.ptch.java.citas.entities.enums.Estado;
import org.ptch.java.citas.entities.enums.EstadoCita;
import org.ptch.java.citas.entities.enums.TipoDocumento;
import org.ptch.java.citas.entities.enums.TipoSangre;

public class Main {
    public static void main(String[] args) {
        
        //Crear Medico

        Medico m1 = new Medico(1, "Santiago", "Lopez", TipoDocumento.CC, 12345L, 12345L, Especialidad.Cardiologia);
        Medico m2 = new Medico(2, "Michael", "Cuta", TipoDocumento.TI, 54321L, 54321L, Especialidad.Dermatologo);

        System.out.println("id del medico: " + m1.getId() + " Nombre del medico: " + m1.getNombres() + " Apellidois del medico: " + m1.getApellidos() + " Especialidad medico: " + m1.getEspecialidad());
        System.out.println("id del medico: " + m2.getId() + " Nombre del medico: " + m2.getNombres() + " Apellidois del medico: " + m2.getApellidos() + " Especialidad medico: " + m2.getEspecialidad());

        System.out.println("-----------------------------");

        //Creando al enfermo este

        Enfermero e1 = new Enfermero(1, "Cuta", "Tuta", TipoDocumento.TI, 345678L);
        Enfermero e2 = new Enfermero(2, "Julio", "Jaramillo", TipoDocumento.CC, 12345L);
        Enfermero e3 = new Enfermero(3, "Pedro", "Pablo", TipoDocumento.CM, 98653L);

        System.out.println("Id del enfermero: " + e1.getId() + " Nombre del enfermero: " + e1.getNombres() + " Apellido del enfermero: " + e1.getApellidos());
        System.out.println("Id del enfermero: " + e2.getId() + " Nombre del enfermero: " + e2.getNombres() + " Apellido del enfermero: " + e2.getApellidos());
        System.out.println("Id del enfermero: " + e3.getId() + " Nombre del enfermero: " + e3.getNombres() + " Apellido del enfermero: " + e3.getApellidos());

        System.out.println("-----------------------------");

        //Crear paciente

        Paciente p1 = new Paciente(1, "Juan", "Estivenson", TipoDocumento.CC, 234567L, "xx4578@gmail.com", 32145675L, LocalDate.now(), 1.78, 70.5, TipoSangre.O, '+');
        Paciente p2 = new Paciente(2, "Manuel", "Pedro", TipoDocumento.CC, 234563L, "sl@gmail.com", 32148678L, LocalDate.now(), 1.70, 80.5, TipoSangre.A, '+');
        Paciente p3 = new Paciente(3, "Karlos", "Karkiko", TipoDocumento.CC, 234562L, "4578@gmail.com", 32125678L, LocalDate.now(), 1.69, 50.5, TipoSangre.B, '-');
        Paciente p4 = new Paciente(4, "Santiago", "Chacalito", TipoDocumento.CC, 234569L, "l4578@gmail.com", 32105678L, LocalDate.now(), 1.90, 100.5, TipoSangre.AB, '+');
        Paciente p5 = new Paciente(5, "Luis", "Garavito", TipoDocumento.CC, 234560L, "p4578@gmail.com", 32145978L, LocalDate.now(), 2.10, 20.5, TipoSangre.O, '-');
        
        System.out.println("Id del paciente: " + p1.getId() + " Nombre del paciente: " + p1.getNombres() + " Apellidos del paciente: " + p1.getApellidos());
        System.out.println("Id del paciente: " + p2.getId() + " Nombre del paciente: " + p2.getNombres() + " Apellidos del paciente: " + p2.getApellidos());
        System.out.println("Id del paciente: " + p3.getId() + " Nombre del paciente: " + p3.getNombres() + " Apellidos del paciente: " + p3.getApellidos());
        System.out.println("Id del paciente: " + p4.getId() + " Nombre del paciente: " + p4.getNombres() + " Apellidos del paciente: " + p4.getApellidos());
        System.out.println("Id del paciente: " + p5.getId() + " Nombre del paciente: " + p5.getNombres() + " Apellidos del paciente: " + p5.getApellidos());

        System.out.println("-----------------------------");

        //Crear Consultorio

        Consultorio c1 = new Consultorio(1, "calle 5 # 87-69", 23);
        Consultorio c2 = new Consultorio(2, "calle 79 # 7-6", 73);

        //Registrar 2 citas xd

        CitaMedico mm1 = new CitaMedico(1, LocalDateTime.now(), c1, p1, m1, EstadoCita.AGENDADA, "Gripe");
        CitaMedico mm2 = new CitaMedico(2, LocalDateTime.now(), c2, p2, m2, EstadoCita.AGENDADA, "Escopolamina");

        System.out.println("Fecha: " + mm1.getFecha() + " Consultorio: " + mm1.getConsultorio() + " Nombre del medico: " + m1.getNombres() + " Apellido del medico: " + m1.getApellidos());

        System.out.println("-----------------------------");

        //Registrar 3 citas enfermero

        CitaEnfermero ee1 = new CitaEnfermero(1, LocalDateTime.now(), c2, p2, e1, "Vacuna", Estado.CANCELADA);
        CitaEnfermero ee2 = new CitaEnfermero(2, LocalDateTime.now(), c1, p3, e2, "Lavado De Oidos", Estado.CANCELADA);

        System.out.println("Fecha: " + ee1.getFecha() + " Consultorio: " + ee1.getConsultorio() + " Nombre del enfermero: " + e1.getNombres() + " Apellidos del enfermero: " + e1.getApellidos());

        //Cancelar cita

        mm1.cancelarCita();
        System.out.println("Estado de la cita: " + ee1.getEstado().CANCELADA);

        /* 
        //añadir 2 procedimientos/

        e1.addProcedure("Aplicar covid");
        e1.addProcedure("Aplicar rabia");

        //recorrer los procedimientos de e1

        for( String p : e1.getProcedimientos()){

            System.out.println("Procedimiento: " + p);

        }
        */

    }
}