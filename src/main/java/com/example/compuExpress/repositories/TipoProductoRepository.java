package com.example.compuExpress.repositories;

import com.example.compuExpress.entities.TipoProducto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoProductoRepository extends BaseRepository<TipoProducto, Long>{

    /* --- Search con Filtros --- */

    @Query(value = "SELECT p FROM TipoProducto p WHERE p.codigoTipoProducto = cast(:filtro as int) OR p.nombreTipoProducto LIKE %:filtro%")
    List<TipoProducto> search(@Param("filtro") String filtro);

    @Query(value = "SELECT p FROM TipoProducto p WHERE p.codigoTipoProducto = cast(:filtro as int) OR p.nombreTipoProducto LIKE %:filtro%")
    Page<TipoProducto> search(@Param("filtro") String filtro, Pageable pageable);


}
