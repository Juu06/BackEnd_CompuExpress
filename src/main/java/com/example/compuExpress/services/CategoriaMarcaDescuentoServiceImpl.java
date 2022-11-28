package com.example.compuExpress.services;

import com.example.compuExpress.entities.CategoriaMarcaDescuento;
import com.example.compuExpress.repositories.BaseRepository;
import com.example.compuExpress.repositories.CategoriaMarcaDescuentoRepository;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaMarcaDescuentoServiceImpl extends BaseServiceImpl<CategoriaMarcaDescuento, Long> implements CategoriaMarcaDescuentoService{

    @Autowired
    private CategoriaMarcaDescuentoRepository CategoriaMarcaDescuentoRepository;

    public CategoriaMarcaDescuentoServiceImpl(BaseRepository<CategoriaMarcaDescuento, Long> baseRepository) { super (baseRepository); }


    /* --- Search con Filtros --- */

    @Override
    public List<CategoriaMarcaDescuento> search(String filtro) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Not implemented yet");
    }

    @Override
    public Page<CategoriaMarcaDescuento> search(String filtro, Pageable pageable) throws ExecutionControl.NotImplementedException  {
        throw new ExecutionControl.NotImplementedException("Not implemented yet");
    }
}
