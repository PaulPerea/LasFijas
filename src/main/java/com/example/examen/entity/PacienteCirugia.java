package com.example.examen.entity;

import java.sql.Date;
import java.time.LocalDate;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@IdClass(PacienteCirugiaPK.class)
@Table(name = "pacientescirugias")
public class PacienteCirugia {
     
  @Id
  @ManyToOne
  @JoinColumn(name = "paciente_id")
  @Getter @Setter
  private List<Paciente> paciente;
  
  @Id
  @OneToMany
  @JoinColumn(name = "cirugia_id")
  @Getter @Setter
  private Cirugia cirugia;
  
  @Id
  @Temporal(TemporalType.DATE)
  @Getter @Setter
  private Date fecha;

   
}
