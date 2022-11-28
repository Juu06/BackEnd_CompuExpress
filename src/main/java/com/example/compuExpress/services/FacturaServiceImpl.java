package com.example.compuExpress.services;

import com.example.compuExpress.entities.Factura;
import com.example.compuExpress.repositories.BaseRepository;
import com.example.compuExpress.repositories.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaServiceImpl extends BaseServiceImpl<Factura, Long> implements FacturaService {

    @Autowired
    private FacturaRepository FacturaRepository;

    public FacturaServiceImpl(BaseRepository<Factura, Long> baseRepository) { super (baseRepository); }


}