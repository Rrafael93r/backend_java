package com.pharmaser.bitacora.repository;

import com.pharmaser.bitacora.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FarmaciaRepository extends JpaRepository<Farmacia, Long> {

    List<Farmacia> findByCiudad(String ciudad);
}
