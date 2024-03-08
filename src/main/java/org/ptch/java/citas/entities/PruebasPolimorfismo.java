package org.ptch.java.citas.entities;

import java.time.LocalDate;

import org.ptch.java.citas.entities.enums.Especialidad;
import org.ptch.java.citas.entities.enums.TipoDocumento;
import org.ptch.java.citas.entities.enums.TipoSangre;

public class PruebasPolimorfismo {

    public static void main(String[] args) {
        //insatanciar un usuario
        Usuario u = new Usuario(1,"paco", "duarte", TipoDocumento.CE , 1576367L);

        System.out.println(u.toString());

        Medico m = new Medico(2, "pedro", "Perez", TipoDocumento.CC, 125676L , 1231563775L , Especialidad.Cardiologia);

        System.out.println(m.toString());

        Paciente p = new Paciente(3, "mario", "Grande", TipoDocumento.CE, 12156646L , "Marios@gmail.com" , 3121566L , LocalDate.of(2024, 11, 02) , 1.70 , 60.5 , TipoSangre.A,  '+' );

        System.out.println(p.toString());

        Enfermero e = new Enfermero(4, "Andres", "duarte", TipoDocumento.CC, 12415367L);

        System.out.println(e.toString());

    

    }

}
