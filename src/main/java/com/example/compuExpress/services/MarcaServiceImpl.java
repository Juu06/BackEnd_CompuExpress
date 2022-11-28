package com.example.compuExpress.services;

import com.example.compuExpress.entities.Marca;
import com.example.compuExpress.repositories.BaseRepository;
import com.example.compuExpress.repositories.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaServiceImpl extends BaseServiceImpl<Marca, Long> implements MarcaService {

    @Autowired
    private MarcaRepository MarcaRepository;

    public MarcaServiceImpl(BaseRepository<Marca, Long> baseRepository) { super (baseRepository); }


}
