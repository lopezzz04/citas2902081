package org.ptch.java.citas.entities;
import java.time.LocalDateTime;

import org.ptch.java.citas.entities.enums.EstadoCita;;

public class Cita {

    int id;
    LocalDateTime fecha;
    Consultorio consultorio;
    Paciente paciente;

    

    public Cita(int id, LocalDateTime fecha, Consultorio consultorio , Paciente paciente) {
        this.id = id;
        this.fecha = fecha;
        this.consultorio = consultorio;
        this.paciente = paciente;
    }





    public int getId() {
        return id;
    }





    public void setId(int id) {
        this.id = id;
    }





    public Consultorio getConsultorio() {
        return consultorio;
    }





    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }





    public Paciente getPaciente() {
        return paciente;
    }





    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }





    public LocalDateTime getFecha() {
        return fecha;
    }





    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }



    





    

}


