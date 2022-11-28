package com.example.compuExpress.services;

import com.example.compuExpress.entities.TipoProducto;
import com.example.compuExpress.repositories.BaseRepository;
import com.example.compuExpress.repositories.TipoProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoProductoServiceImpl extends BaseServiceImpl <TipoProducto, Long> implements TipoProductoService {

    @Autowired
    private TipoProductoRepository tipoProductoRepository;

    public TipoProductoServiceImpl (BaseRepository<TipoProducto, Long> baseRepository) {super(baseRepository);}


}
