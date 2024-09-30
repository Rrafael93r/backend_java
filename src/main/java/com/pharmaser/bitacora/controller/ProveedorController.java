package com.pharmaser.bitacora.controller;

import com.pharmaser.bitacora.model.Proveedor;
import com.pharmaser.bitacora.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;

    @PostMapping
    public Proveedor crearProveedor(@RequestBody Proveedor proveedor) {
        return proveedorService.crearProveedor(proveedor);
    }

    @GetMapping
    public List<Proveedor> obtenerTodosLosProveedores() {
        return proveedorService.obtenerTodosLosProveedores();
    }

    @GetMapping("/{nit}")
    public Proveedor obtenerProveedor(@PathVariable String nit) {
        return proveedorService.obtenerProveedorPorNit(nit);
    }

    @PutMapping("/{nit}")
    public Proveedor actualizarProveedor(@PathVariable String nit, @RequestBody Proveedor proveedor) {
        return proveedorService.actualizarProveedor(nit, proveedor);
    }

    @DeleteMapping("/{nit}")
    public void eliminarProveedor(@PathVariable String nit) {
        proveedorService.eliminarProveedor(nit);
    }

    @GetMapping("/estado/{estado}")
    public List<Proveedor> obtenerProveedoresPorEstado(@PathVariable Boolean estado) {
        return proveedorService.obtenerProveedoresPorEstado(estado);
    }
}
