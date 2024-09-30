package com.pharmaser.bitacora.service;

import com.pharmaser.bitacora.model.Proveedor;
import com.pharmaser.bitacora.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;
}
