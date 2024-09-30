package com.pharmaser.bitacora.controller;

import com.pharmaser.bitacora.model.Reporte;
import com.pharmaser.bitacora.service.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pharmaser.bitacora.service.*;

import java.util.List;

@RestController
@RequestMapping("/api/reportes")
public class ReporteController {

    @Autowired
    private ReporteService reporteService;

    @PostMapping("/farmacia/{farmaciaId}")
    public Reporte crearReporte(@PathVariable Long farmaciaId, @RequestBody Reporte reporte) {
        return reporteService.crearReporte(farmaciaId, reporte);
    }

    @GetMapping
    public List<Reporte> obtenerTodosLosReportes() {
        return reporteService.obtenerTodosLosReportes();
    }

    @GetMapping("/{id}")
    public Reporte obtenerReporte(@PathVariable Long id) {
        return reporteService.obtenerReportePorId(id);
    }

    @PutMapping("/{id}")
    public Reporte actualizarReporte(@PathVariable Long id, @RequestBody Reporte reporte) {
        return reporteService.actualizarReporte(id, reporte);
    }

    @DeleteMapping("/{id}")
    public void eliminarReporte(@PathVariable Long id) {
        reporteService.eliminarReporte(id);
    }
}
