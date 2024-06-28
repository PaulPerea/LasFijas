package com.example.examen.entity;

import java.time.LocalDate;

import java.util.Date;

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
@Table(name = "pacientescirugias")
public class PacienteCirugia {

  @EmbeddedId
	private PacienteCirugiaPK pacienteCirugiaPK;
     
  @ManyToOne
  @JoinColumn(name = "paciente_id", nullable = false, insertable = false, updatable = false)
  private Paciente paciente;
  
  @ManyToOne
  @JoinColumn(name = "cirugia_id", nullable = false, insertable = false, updatable = false)
  @Getter @Setter
  private Cirugia cirugia;
  
  @Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  @Column(name = "fecha", insertable = false, updatable = false)
	private Date fecha;
}
