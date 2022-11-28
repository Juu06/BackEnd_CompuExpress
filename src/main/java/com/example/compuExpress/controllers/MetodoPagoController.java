package com.example.compuExpress.controllers;

import com.example.compuExpress.entities.MetodoPago;
import com.example.compuExpress.services.MetodoPagoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/metodopagos")
public class MetodoPagoController extends BaseControllerImpl<MetodoPago, MetodoPagoServiceImpl> {


}
