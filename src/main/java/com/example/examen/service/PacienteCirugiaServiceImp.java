package com.example.examen.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.entity.PacienteCirugia;
import com.example.examen.repository.PacienteCirugiaRepository;

@Service
public class PacienteCirugiaServiceImp implements PacienteCirugiaService {

    @Autowired
    private PacienteCirugiaRepository pacienteCirugiaRepository;

    @Override
    public List<PacienteCirugia> obtenerTodasLasPacienteCirugias() {
        return pacienteCirugiaRepository.obtenerTodasLasPacienteCirugias();
    }

    @Override
    public PacienteCirugia createPacienteCirugia(PacienteCirugia pacienteCirugia) {
        return pacienteCirugiaRepository.save(pacienteCirugia);
    }

    @Override
    public PacienteCirugia updatePacienteCirugia(PacienteCirugia pacienteCirugia) {
        return pacienteCirugiaRepository.saveAndFlush(pacienteCirugia);
    }

    @Override
    public void deletePacienteCirugia(PacienteCirugia pacienteCirugia) {
        pacienteCirugiaRepository.delete(pacienteCirugia);
    }
  
}
