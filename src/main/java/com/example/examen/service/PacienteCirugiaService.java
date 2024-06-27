package com.example.examen.service;


import java.util.List;

import com.example.examen.entity.PacienteCirugia;

public interface PacienteCirugiaService {
     // Método para listar todos los registros de PacienteCirugia
     List<PacienteCirugia> obtenerTodasLasPacienteCirugias();

     // Método para crear una nueva instancia de PacienteCirugia
     PacienteCirugia createPacienteCirugia(PacienteCirugia pacienteCirugia);
 
     // Método para actualizar una instancia de PacienteCirugia existente
     PacienteCirugia updatePacienteCirugia(PacienteCirugia pacienteCirugia);
 
     // Método para eliminar una instancia de PacienteCirugia
     void deletePacienteCirugia(PacienteCirugia pacienteCirugia);
}
