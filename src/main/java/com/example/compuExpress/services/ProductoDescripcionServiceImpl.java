package com.example.compuExpress.services;

import com.example.compuExpress.entities.ProductoDescripcion;
import com.example.compuExpress.repositories.BaseRepository;
import com.example.compuExpress.repositories.ProductoDescripcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoDescripcionServiceImpl extends BaseServiceImpl <ProductoDescripcion, Long> implements ProductoDescripcionService {

    @Autowired
    private ProductoDescripcionRepository productoDescripcionRepository;

    public ProductoDescripcionServiceImpl (BaseRepository<ProductoDescripcion, Long> baseRepository) {super(baseRepository);}


}