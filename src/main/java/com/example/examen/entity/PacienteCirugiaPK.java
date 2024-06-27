package com.example.examen.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class PacienteCirugiaPK implements Serializable{
      
  @Getter @Setter
  private Long pacienteId;
  
  @Getter @Setter
  private Long cirugiaId;
  
  @Getter @Setter
  private LocalDate fecha;
  
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass()!= o.getClass()) return false;
    PacienteCirugiaPK that = (PacienteCirugiaPK) o;
    return Objects.equals(pacienteId, that.pacienteId) &&
        Objects.equals(cirugiaId, that.cirugiaId) &&
        Objects.equals(fecha, that.fecha);
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(pacienteId, cirugiaId, fecha);
  }
}
