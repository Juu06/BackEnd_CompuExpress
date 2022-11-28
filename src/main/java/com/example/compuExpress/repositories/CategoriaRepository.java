package com.example.compuExpress.repositories;

import com.example.compuExpress.entities.Categoria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends BaseRepository<Categoria, Long>{

    /* --- Search con Filtros --- */

    @Query(value = "SELECT p FROM Categoria p WHERE p.codigoCategoria = cast(:filtro as int) OR p.nombreCategoria LIKE %:filtro%")
    List<Categoria> search(@Param("filtro") String filtro);

    @Query(value = "SELECT p FROM Categoria p WHERE p.codigoCategoria = cast(:filtro as int) OR p.nombreCategoria LIKE %:filtro%")
    Page<Categoria> search(@Param("filtro") String filtro, Pageable pageable);


}
