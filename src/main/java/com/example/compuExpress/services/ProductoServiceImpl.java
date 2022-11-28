package com.example.compuExpress.services;

import com.example.compuExpress.entities.Producto;
import com.example.compuExpress.repositories.BaseRepository;
import com.example.compuExpress.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl extends BaseServiceImpl <Producto, Long> implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public ProductoServiceImpl (BaseRepository<Producto, Long> baseRepository) {super(baseRepository);}


}
