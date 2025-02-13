package com.example.examen.service;


import java.util.List;

import com.example.examen.entity.PacienteCirugia;

public interface PacienteCirugiaService {
     // Método para listar todos los registros de PacienteCirugia
     public List<PacienteCirugia> obtenerTodasLasPacienteCirugias();

     // Método para crear una nueva instancia de PacienteCirugia
     PacienteCirugia createActualizarPacienteCirugia(PacienteCirugia pacienteCirugia);
 
     // Método para eliminar una instancia de PacienteCirugia
     public  void deletePacienteCirugia(PacienteCirugia pacienteCirugia);
}
