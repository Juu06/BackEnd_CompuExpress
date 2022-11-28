package com.example.compuExpress.repositories;

import com.example.compuExpress.entities.ProductoDescripcion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoDescripcionRepository extends BaseRepository<ProductoDescripcion, Long>{

    /* --- Search con Filtros --- */

    @Query(value = "SELECT p FROM ProductoDescripcion p WHERE p.codigoProductoDescripcion = cast(:filtro as int) OR p.descripcionPD LIKE %:filtro%")
    List<ProductoDescripcion> search(@Param("filtro") String filtro);

    @Query(value = "SELECT p FROM ProductoDescripcion p WHERE p.codigoProductoDescripcion = cast(:filtro as int) OR p.descripcionPD LIKE %:filtro%")
    Page<ProductoDescripcion> search(@Param("filtro") String filtro, Pageable pageable);



}
