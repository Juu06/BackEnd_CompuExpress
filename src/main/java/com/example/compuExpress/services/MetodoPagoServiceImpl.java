package com.example.compuExpress.services;

import com.example.compuExpress.entities.MetodoPago;
import com.example.compuExpress.repositories.BaseRepository;
import com.example.compuExpress.repositories.MetodoPagoRepository;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetodoPagoServiceImpl extends BaseServiceImpl<MetodoPago, Long> implements MetodoPagoService {

    @Autowired
    private MetodoPagoRepository MetodoPagoRepository;

    public MetodoPagoServiceImpl(BaseRepository<MetodoPago, Long> baseRepository) { super (baseRepository); }


    /* --- Search con Filtros --- */

    @Override
    public List<MetodoPago> search(String filtro) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Not implemented yet");
    }

    @Override
    public Page<MetodoPago> search(String filtro, Pageable pageable) throws ExecutionControl.NotImplementedException  {
        throw new ExecutionControl.NotImplementedException("Not implemented yet");
    }
}
