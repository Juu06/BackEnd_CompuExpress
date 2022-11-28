package com.example.compuExpress.services;

import com.example.compuExpress.entities.Categoria;
import com.example.compuExpress.repositories.BaseRepository;
import com.example.compuExpress.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl extends BaseServiceImpl<Categoria, Long> implements CategoriaService{

    @Autowired
    private CategoriaRepository CategoriaRepository;

    public CategoriaServiceImpl(BaseRepository<Categoria, Long> baseRepository) { super (baseRepository); }


}
