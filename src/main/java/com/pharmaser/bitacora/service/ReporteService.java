package com.pharmaser.bitacora.service;

import com.pharmaser.bitacora.model.*;
import com.pharmaser.bitacora.model.Farmacia;
import com.pharmaser.bitacora.repository.ReporteRepository;
import com.pharmaser.bitacora.repository.FarmaciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReporteService {

    @Autowired
    private ReporteRepository reporteRepository;

    @Autowired
    private FarmaciaRepository farmaciaRepository;

    public Reporte crearReporte(Long farmaciaId, Reporte reporte) {
        Farmacia farmacia = farmaciaRepository.findById(farmaciaId)
                .orElseThrow(() -> new RuntimeException("Farmacia no encontrada"));

        // Asociar el proveedor actual de la farmacia al reporte
        reporte.setFarmacia(farmacia);
        reporte.setProveedor(farmacia.getProveedorActual());

        return reporteRepository.save(reporte);
    }

    public List<Reporte> obtenerTodosLosReportes() {
        return reporteRepository.findAll();
    }

    public Reporte obtenerReportePorId(Long id) {
        return reporteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reporte no encontrado"));
    }

    public Reporte actualizarReporte(Long id, Reporte reporte) {
        reporte.setId(id);
        return reporteRepository.save(reporte);
    }

    public void eliminarReporte(Long id) {
        reporteRepository.deleteById(id);
    }

    public List<Reporte> obtenerReportesPorFarmacia(Farmacia farmacia) {
        return reporteRepository.findByFarmacia(farmacia);
    }

    public List<Reporte> obtenerReportesPorProveedor(Proveedor proveedor) {
        return reporteRepository.findByProveedor(proveedor);
    }
}
