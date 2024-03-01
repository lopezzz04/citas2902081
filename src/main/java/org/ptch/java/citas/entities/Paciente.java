package org.ptch.java.citas.entities;

import java.time.LocalDate;

import org.ptch.java.citas.entities.enums.TipoDocumento;
import org.ptch.java.citas.entities.enums.TipoSangre;

public class Paciente extends Usuario{

    private String correo;
    private Long celular;
    private LocalDate fechaNacimiento;
    private Double altura;
    private Double peso;
    private TipoSangre tipoSangre;
    private char factorRH;

    public Paciente(int id, String nombres, String apellidos, TipoDocumento tipoIdentificacion,
            Long numeroIdentificacion, String correo, Long celular, LocalDate fechaNacimiento, Double altura,
            Double peso, TipoSangre tipoSangre, char factorRH) {
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
        this.correo = correo;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
    }

    public Paciente(int id, String nombres, String apellidos, TipoDocumento tipoIdentificacion,
            Long numeroIdentificacion) {
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
    }

    //geter and seters

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public char getFactorRH() {
        return factorRH;
    }

    public void setFactorRH(char factorRH) {
        this.factorRH = factorRH;
    }

}
