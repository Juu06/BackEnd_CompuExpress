package com.example.compuExpress.controllers;

import com.example.compuExpress.entities.TipoProducto;
import com.example.compuExpress.services.TipoProductoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/tipoproductos")
public class TipoProductoController extends BaseControllerImpl<TipoProducto, TipoProductoServiceImpl> {


}
