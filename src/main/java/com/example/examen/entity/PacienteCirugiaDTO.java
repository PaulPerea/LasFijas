package com.example.examen.entity;


import io.micrometer.common.lang.NonNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PacienteCirugiaDTO {
    @NonNull
    private int pacienteId;

    @NonNull
    private int cirugiaId;

    private String fecha;

    public PacienteCirugiaDTO() {
        // Constructor sin argumentos
    }

    public PacienteCirugiaDTO(int pacienteId, int cirugiaId) {
        this.pacienteId = pacienteId;
        this.cirugiaId = cirugiaId;
    }
}
