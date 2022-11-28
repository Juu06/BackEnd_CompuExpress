package com.example.compuExpress.controllers;

import com.example.compuExpress.entities.CategoriaMarcaDescuento;
import com.example.compuExpress.services.CategoriaMarcaDescuentoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/categoriamarcadescuentos")
public class CategoriaMarcaDescuentoController extends BaseControllerImpl<CategoriaMarcaDescuento, CategoriaMarcaDescuentoServiceImpl> {


}
