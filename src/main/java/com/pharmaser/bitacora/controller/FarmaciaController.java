package com.pharmaser.bitacora.controller;

import com.pharmaser.bitacora.model.Farmacia;
import com.pharmaser.bitacora.service.FarmaciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/farmacias")
public class FarmaciaController {

    @Autowired
    private FarmaciaService farmaciaService;

    @PostMapping
    public Farmacia crearFarmacia(@RequestBody Farmacia farmacia) {
        return farmaciaService.crearFarmacia(farmacia);
    }

    @GetMapping
    public List<Farmacia> obtenerTodasLasFarmacias() {
        return farmaciaService.obtenerTodasLasFarmacias();
    }

    @GetMapping("/{id}")
    public Farmacia obtenerFarmacia(@PathVariable Long id) {
        return farmaciaService.obtenerFarmaciaPorId(id);
    }

    @PutMapping("/{id}")
    public Farmacia actualizarFarmacia(@PathVariable Long id, @RequestBody Farmacia farmacia) {
        return farmaciaService.actualizarFarmacia(id, farmacia);
    }

    @DeleteMapping("/{id}")
    public void eliminarFarmacia(@PathVariable Long id) {
        farmaciaService.eliminarFarmacia(id);
    }

    @GetMapping("/ciudad/{ciudad}")
    public List<Farmacia> obtenerFarmaciasPorCiudad(@PathVariable String ciudad) {
        return farmaciaService.obtenerFarmaciasPorCiudad(ciudad);
    }
}
