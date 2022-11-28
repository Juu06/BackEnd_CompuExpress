package com.example.compuExpress.repositories;

import com.example.compuExpress.entities.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {

    /* --- Search con Filtros --- */

    List<E> search(@Param("filtro") String filtro);

    Page<E> search(@Param("filtro") String filtro, Pageable pageable);


}
