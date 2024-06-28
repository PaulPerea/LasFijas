package com.example.examen.controller;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.entity.PacienteCirugia;
import com.example.examen.service.PacienteCirugiaService;
import com.example.examen.util.AppSettings;

@RestController
@RequestMapping("/url/PacienteCirugia")
public class PacienteCirugiaController {
    @Autowired
    private PacienteCirugiaService service;


    @GetMapping("/listarPacienteCirugiaTodos")
    public List<PacienteCirugia> listaTodos() {
        return service.obtenerTodasLasPacienteCirugias();
    }

    @PostMapping("/registraPacienteCirugia")
	@ResponseBody
	public ResponseEntity<?> inserta(@RequestBody PacienteCirugia obj) {
		Map<String, Object> salida = new HashMap<>();
		try {
			PacienteCirugia objSalida = service.createActualizarPacienteCirugia(obj);
			if (objSalida == null) {
				salida.put("mensaje", AppSettings.MENSAJE_REG_ERROR);
			} else {
				salida.put("mensaje", AppSettings.MENSAJE_REG_EXITOSO);
			}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", AppSettings.MENSAJE_REG_ERROR);
		}
		return ResponseEntity.ok(salida);
	}

	@PutMapping("/actualizaPacienteCirugia")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> actualizaEjemplo(@RequestBody PacienteCirugia obj) {
		Map<String, Object> salida = new HashMap<>();
        try {
            PacienteCirugia objSalida = service.createActualizarPacienteCirugia(obj);
            if (objSalida == null) {
                salida.put("mensaje", AppSettings.MENSAJE_ACT_ERROR);
            } else {
                salida.put("mensaje", AppSettings.MENSAJE_ACT_EXITOSO);
            }
        } catch (Exception e) {
            e.printStackTrace();
            salida.put("mensaje", AppSettings.MENSAJE_ACT_ERROR);
        }
        return ResponseEntity.ok(salida);
	}
	@DeleteMapping("/eliminaPacienteCliente")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> eliminaEjemplo(@RequestBody PacienteCirugia idEjemplo) {
		Map<String, Object> salida = new HashMap<>();
		try {
			service.deletePacienteCirugia(idEjemplo);
			salida.put("mensaje", AppSettings.MENSAJE_ELI_EXITOSO);
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", AppSettings.MENSAJE_ELI_ERROR);
		}
		return ResponseEntity.ok(salida);
	}

}
