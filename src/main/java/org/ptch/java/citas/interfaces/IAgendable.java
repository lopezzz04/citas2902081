package org.ptch.java.citas.interfaces;

import java.time.LocalDateTime;

import org.ptch.java.citas.entities.Consultorio;


public interface IAgendable {

    //Proponer un metodo para agendar la cita
    public boolean agendarCita( LocalDateTime fecha, Consultorio c ) ;
    //Proponer un metodo para reagendar cita
    public boolean reaAgendarCita(LocalDateTime nuevaFecha, Consultorio nuevoc);
    //Cancelar una cita
    public boolean cancelarCita ();

}
