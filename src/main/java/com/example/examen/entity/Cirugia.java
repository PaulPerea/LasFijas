package com.example.examen.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "cirugias")
public class Cirugia {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "cirugia_id")
        private Long cirugiaId;
        
        @Column(length = 100)
        private String nombre;
        
        @Column(columnDefinition = "TEXT")
        private String descripcion;
        
        @Column(precision = 10, scale = 2)
        private BigDecimal costo;
}
