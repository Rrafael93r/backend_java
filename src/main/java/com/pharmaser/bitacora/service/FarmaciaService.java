package com.pharmaser.bitacora.service;

import com.pharmaser.bitacora.model.Farmacia;
import com.pharmaser.bitacora.repository.FarmaciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmaciaService {

    @Autowired
    private FarmaciaRepository farmaciaRepository;

    public Farmacia crearFarmacia(Farmacia farmacia) {
        return farmaciaRepository.save(farmacia);
    }

    public List<Farmacia> obtenerTodasLasFarmacias() {
        return farmaciaRepository.findAll();
    }

    public Farmacia obtenerFarmaciaPorId(Long id) {
        return farmaciaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Farmacia no encontrada"));
    }

    public Farmacia actualizarFarmacia(Long id, Farmacia farmacia) {
        farmacia.setId(id);
        return farmaciaRepository.save(farmacia);
    }

    public void eliminarFarmacia(Long id) {
        farmaciaRepository.deleteById(id);
    }

    public List<Farmacia> obtenerFarmaciasPorCiudad(String ciudad) {
        return farmaciaRepository.findByCiudad(ciudad);
    }
}
