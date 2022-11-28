package com.example.compuExpress.services;

import com.example.compuExpress.entities.FacturaDetalle;
import com.example.compuExpress.repositories.BaseRepository;
import com.example.compuExpress.repositories.FacturaDetalleRepository;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaDetalleServiceImpl extends BaseServiceImpl<FacturaDetalle, Long> implements FacturaDetalleService  {

    @Autowired
    private FacturaDetalleRepository FacturaDetalleRepository;

    public FacturaDetalleServiceImpl(BaseRepository<FacturaDetalle, Long> baseRepository) { super (baseRepository); }


    /* --- Search con Filtros --- */

    @Override
    public List<FacturaDetalle> search(String filtro) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Not implemented yet");
    }

    @Override
    public Page<FacturaDetalle> search(String filtro, Pageable pageable) throws ExecutionControl.NotImplementedException  {
        throw new ExecutionControl.NotImplementedException("Not implemented yet");
    }
}
