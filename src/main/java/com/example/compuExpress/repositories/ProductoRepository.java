package com.example.compuExpress.repositories;

import com.example.compuExpress.entities.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends BaseRepository<Producto, Long>{

    /* --- Search con Filtros --- */

    @Query(value = "SELECT p FROM Producto p WHERE p.codigoProducto = cast(:filtro as int) OR p.nombreProducto LIKE %:filtro% OR p.precioProducto = cast(:filtro as double)")
    List<Producto> search(@Param("filtro") String filtro);

    @Query(value = "SELECT p FROM Producto p WHERE p.codigoProducto = cast(:filtro as int) OR p.nombreProducto LIKE %:filtro% OR p.precioProducto = cast(:filtro as double)")
    Page<Producto> search(@Param("filtro") String filtro, Pageable pageable);


}
