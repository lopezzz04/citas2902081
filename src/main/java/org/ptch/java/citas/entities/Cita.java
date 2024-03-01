package org.ptch.java.citas.entities;
import java.time.LocalDateTime;

import org.ptch.java.citas.entities.enums.EstadoCita;;

public class Cita {

    private int id;
    private LocalDateTime fecha;
    private Medico medico;
    private Paciente paciente;
    private Consultorio consultorio;
    private EstadoCita estado;

    public Cita() {
    }

    public Cita(int id, LocalDateTime fecha, Medico medico, Paciente paciente, Consultorio consultorio,
            EstadoCita estado) {
        this.id = id;
        this.fecha = fecha;
        this.medico = medico;
        this.paciente = paciente;
        this.consultorio = consultorio;
        this.estado = estado;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public EstadoCita getEstado() {
        return estado;
    }

    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }

    

    

}


