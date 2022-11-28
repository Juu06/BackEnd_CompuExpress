package com.example.compuExpress.repositories;

import com.example.compuExpress.entities.Factura;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacturaRepository extends BaseRepository<Factura, Long>{

    /* --- Search con Filtros --- */

    @Query(value = "SELECT p FROM Factura p WHERE p.codigoFactura = cast(:filtro as int)")
    List<Factura> search(@Param("filtro") String filtro);

    @Query(value = "SELECT p FROM Factura p WHERE p.codigoFactura = cast(:filtro as int)")
    Page<Factura> search(@Param("filtro") String filtro, Pageable pageable);


}
