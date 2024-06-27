package com.example.examen.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pacientes")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paciente_id")
    @Getter @Setter
    private Long pacienteId;
    
    @Column(nullable = false, length = 100)
    @Getter @Setter
    private String nombre;
    
    @Column(nullable = false, length = 100)
    @Getter @Setter
    private String apellido;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "America/Lima")
    @Getter @Setter
    private Date fechaNacimiento;
    
    @Column(length = 255)
    @Getter @Setter
    private String direccion;
    
    @Column(length = 20)
    @Getter @Setter
    private String telefono;
    
    @Column(length = 100)
    @Getter @Setter
    private String email;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Lima")
    @Getter @Setter
    private Date fechaRegistro;

}
