package com.example.examen.controller;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.entity.Pais;
import com.example.examen.service.PaisService;

@RestController
@RequestMapping("/rest/pais")
public class PaisController {

    @Autowired
    private PaisService service;

    @GetMapping("/todosPais")
	@ResponseBody
	public List<Pais> lista() {
		return service.all();
	}
    @PostMapping("/registraPais")
	@ResponseBody
	public ResponseEntity<?> inserta(@RequestBody Pais obj) {
		Map<String, Object> salida = new HashMap<String, Object>();
		try {
            Pais objSalida = service.agregarActualizar(obj);
			if (objSalida == null) {
				salida.put("mensaje", "Error al registrar");
			} else {
				salida.put("mensaje", "Registro exitoso de ID >> " + objSalida.get_id() ); ;
			}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error al registrar");
		}
		return ResponseEntity.ok(salida);
	}
    @PutMapping("/actualizarPais/{id}")
	@ResponseBody
	public ResponseEntity<?> actualiza(@PathVariable("id") String id, @RequestBody Pais objPais) {
		Map<String, Object> salida = new HashMap<String, Object>();
        try {
            ObjectId objId = new ObjectId(id);
            objPais.set_id(objId);
			Pais objSalida = service.agregarActualizar(objPais);
			if (objSalida == null) {
				salida.put("mensaje", "Error al actualizar");
			} else {
				salida.put("mensaje", "Actualización exitosa de ID >> " + objSalida.get_id() ); ;
			}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error al actualizar");
		}
		return ResponseEntity.ok(salida);
	}
    @DeleteMapping("/eliminaPais/{id}")
	@ResponseBody
    public ResponseEntity<Map<String, Object>> eliminaEjemplo(@PathVariable("id") String id) {
        Map<String, Object> salida = new HashMap<>();
        try {
            ObjectId objId = new ObjectId(id);
            Pais objBusqueda = service.buscarPorPk(objId);
            if (objBusqueda == null) {
                salida.put("mensaje", "ID no encontrado");
                return ResponseEntity.ok(salida);
            } else {
                service.eliminarPais(objId);
                salida.put("mensaje", "Eliminación exitosa . Pais de ID ==> " + id + ".");
            }
        } catch (Exception e) {
            e.printStackTrace();
            salida.put("mensaje", "Error al eliminar");
        }
        return ResponseEntity.ok(salida);
    }




    @GetMapping("/listaLibroPorName/{var}")
	@ResponseBody
    public List<Pais> listaPorName(@PathVariable("var") String titulo) {
        return service.listaPorname(titulo);
    }

    
    @GetMapping("/listaLibroPoraltSpellings")
	@ResponseBody
	public List<Pais> lista(@RequestParam("altSpellings") List<String> altSpellings) {
		return service.listaPoraltSpellings(altSpellings);
	}

    @GetMapping("/listaCursoPoralpha2Code/{var}")
	@ResponseBody
	public List<Pais> listaCursoXNombre(@PathVariable("var") String nombre) {
		return service.listaPoralpha2Code(nombre);
	}
}
