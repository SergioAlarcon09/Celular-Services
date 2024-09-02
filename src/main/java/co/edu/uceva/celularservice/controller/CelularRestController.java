package co.edu.uceva.celularservice.controller;


import co.edu.uceva.celularservice.model.entities.Celular;
import co.edu.uceva.celularservice.model.service.CelularServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Se encarga de recibir las peticiones http y retornar sus respuestas http
 */
@RestController
@RequestMapping("/api/v1/celular-service")
public class CelularRestController {

    @Autowired
    private CelularServiceImpl celularService;  //Inyecro el servicio de la entidad celular para hacer las operaciones CRUD

    /**
     * Método para retornar lista de todos los celulares
     */
    @GetMapping("/celulares")
    public List<Celular> listarCelular() { return this.celularService.listarCelular(); }

    /**
     * Retornar celular por id y mapearlo con la url /api/celular-service/paises/{id}
     */
    @GetMapping("/celulares/{id}")
    public Celular buscarCelular(@PathVariable Long id) { return this.celularService.findById(id); }

    /**
     * Guardar celular y retornar objeto tipo celular ya guardado con su respectivo id
     */
    @PostMapping("/celular")
    public Celular guardarCelular(@RequestBody Celular celular) { return this.celularService.save(celular); }

    /**
     * Actualizar celular y retornar objeto tipo celular ya actualizado
     */
    @PutMapping("/celular")
        public Celular actualizarCelular(@RequestBody Celular celular) { return this.celularService.save(celular); }

    /**
     * Eliminar celular por id
     */
    @DeleteMapping("/celulares/{id}")
    public void eliminarCelular(@PathVariable Long id) {
        Celular celular = this.celularService.findById(id);  //Encontrar el pais por id
        this.celularService.delete(celular);
    }
}
