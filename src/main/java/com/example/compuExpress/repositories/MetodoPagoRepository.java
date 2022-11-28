package com.example.compuExpress.repositories;

import com.example.compuExpress.entities.MetodoPago;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MetodoPagoRepository extends BaseRepository<MetodoPago, Long>{

    /* --- Search con Filtros --- */
    /* --- En este caso no se implementan filtros --- */

    @Query(value = "SELECT TOP 0 NULL", nativeQuery = true)
    List<MetodoPago> search(String filtro);

    @Query(value = "SELECT TOP 0 NULL", nativeQuery = true)
    Page<MetodoPago> search(String filtro, Pageable pageable);


}
