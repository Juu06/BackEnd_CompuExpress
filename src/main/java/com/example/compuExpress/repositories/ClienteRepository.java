package com.example.compuExpress.repositories;

import com.example.compuExpress.entities.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends BaseRepository<Cliente, Long>{

    /* --- Search con Filtros --- */

    @Query(value = "SELECT p FROM Cliente p WHERE p.codigoCliente = cast(:filtro as int) OR p.contrasenia LIKE %:filtro% OR p.usuario LIKE %:filtro% OR p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    List<Cliente> search(@Param("filtro") String filtro);

    @Query(value = "SELECT p FROM Cliente p WHERE p.codigoCliente = cast(:filtro as int) OR p.contrasenia LIKE %:filtro% OR p.usuario LIKE %:filtro% OR p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    Page<Cliente> search(@Param("filtro") String filtro, Pageable pageable);




}
