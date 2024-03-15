package org.ptch.java.citas.entities;

import java.time.LocalDateTime;

import org.ptch.java.citas.entities.enums.EstadoCita;
import org.ptch.java.citas.interfaces.IAgendable;

public class CitaMedico extends Cita implements IAgendable {

    Medico medico;
    EstadoCita estado;
    private String Motivo;

    
    public CitaMedico(int id, LocalDateTime fecha, Consultorio consultorio, Paciente paciente, Medico medico,
            EstadoCita estado, String motivo) {
        super(id, fecha, consultorio, paciente);
        this.medico = medico;
        this.estado = estado;
        Motivo = motivo;
    }


    public Medico getMedico() {
        return medico;
    }




    public void setMedico(Medico medico) {
        this.medico = medico;
    }




    public EstadoCita getEstado() {
        return estado;
    }




    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }




    public String getMotivo() {
        return Motivo;
    }




    public void setMotivo(String motivo) {
        Motivo = motivo;
    }




    @Override
    public boolean agendarCita(LocalDateTime fecha, Consultorio c) {
        this.setFecha(fecha);
        this.setConsultorio(c);
        return true;
    }


    @Override
    public boolean reaAgendarCita(LocalDateTime nuevaFecha, Consultorio nuevoc) {
        this.setFecha(nuevaFecha);
        this.setConsultorio(nuevoc);
        return true;
    }


    @Override
    public boolean cancelarCita() {
        this.estado = EstadoCita.CANCELADA;
        return true;
    }

    




}
