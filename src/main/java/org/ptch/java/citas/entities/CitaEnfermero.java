package org.ptch.java.citas.entities;

import java.time.LocalDateTime;

import org.ptch.java.citas.entities.enums.Estado;
import org.ptch.java.citas.interfaces.IAgendable;

public class CitaEnfermero extends Cita implements IAgendable  {

    Enfermero enfermero;
    private String procedimientoRealizar;
    Estado estado;

        
    public CitaEnfermero(int id, LocalDateTime fecha, Consultorio consultorio, Paciente paciente, Enfermero enfermero,
            String procedimientoRealizar, Estado estado) {
        super(id, fecha, consultorio, paciente);
        this.enfermero = enfermero;
        this.procedimientoRealizar = procedimientoRealizar;
        this.estado = estado;
    }


    public Enfermero getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }

    public String getProcedimientoRealizar() {
        return procedimientoRealizar;
    }

    public void setProcedimientoRealizar(String procedimientoRealizar) {
        this.procedimientoRealizar = procedimientoRealizar;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public boolean agendarCita(LocalDateTime fecha, Consultorio c) {

        throw new UnsupportedOperationException("Unimplemented method 'agendarCita'");
    }

    @Override
    public boolean reaAgendarCita(LocalDateTime nuevaFecha, Consultorio nuevoc) {

        throw new UnsupportedOperationException("Unimplemented method 'reaAgendarCita'");
    }

    @Override
    public boolean cancelarCita() {

        throw new UnsupportedOperationException("Unimplemented method 'cancelarCita'");
    }

    

}
