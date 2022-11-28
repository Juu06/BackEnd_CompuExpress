package com.example.compuExpress.repositories;

import com.example.compuExpress.entities.FacturaDetalle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacturaDetalleRepository extends BaseRepository<FacturaDetalle, Long>{

    /* --- Search con Filtros --- */
    /* --- En este caso no se implementan filtros --- */

    @Query(value = "SELECT TOP 0 NULL", nativeQuery = true)
    List<FacturaDetalle> search(String filtro);

    @Query(value = "SELECT TOP 0 NULL", nativeQuery = true)
    Page<FacturaDetalle> search(String filtro, Pageable pageable);


}
