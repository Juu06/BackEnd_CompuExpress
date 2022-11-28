package com.example.compuExpress.controllers;

import com.example.compuExpress.entities.Marca;
import com.example.compuExpress.services.MarcaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/marcas")
public class MarcaController extends BaseControllerImpl<Marca, MarcaServiceImpl> {


}
