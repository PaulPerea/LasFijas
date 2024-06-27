package com.example.examen.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.examen.entity.PacienteCirugia;
import com.example.examen.entity.PacienteCirugiaPK;

public interface PacienteCirugiaRepository extends JpaRepository<PacienteCirugia, PacienteCirugiaPK> {

    List<PacienteCirugia> obtenerTodasLasPacienteCirugias();
}
