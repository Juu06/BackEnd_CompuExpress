package com.example.compuExpress.services;

import com.example.compuExpress.entities.Cliente;
import com.example.compuExpress.repositories.BaseRepository;
import com.example.compuExpress.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl extends BaseServiceImpl<Cliente, Long> implements ClienteService{

    @Autowired
    private ClienteRepository ClienteRepository;

    public ClienteServiceImpl(BaseRepository<Cliente, Long> baseRepository) { super (baseRepository); }



}
