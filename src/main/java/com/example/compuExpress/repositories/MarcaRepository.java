package com.example.compuExpress.repositories;

import com.example.compuExpress.entities.Marca;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarcaRepository extends BaseRepository<Marca, Long>{

    /* --- Search con Filtros --- */

    @Query(value = "SELECT p FROM Marca p WHERE p.codigoMarca = cast(:filtro as int) OR p.nombreMarca LIKE %:filtro%")
    List<Marca> search(@Param("filtro") String filtro);

    @Query(value = "SELECT p FROM Marca p WHERE p.codigoMarca = cast(:filtro as int) OR p.nombreMarca LIKE %:filtro%")
    Page<Marca> search(@Param("filtro") String filtro, Pageable pageable);



}
