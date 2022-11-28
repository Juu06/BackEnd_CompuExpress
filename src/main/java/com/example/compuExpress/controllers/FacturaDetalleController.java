package com.example.compuExpress.controllers;

import com.example.compuExpress.entities.FacturaDetalle;
import com.example.compuExpress.services.FacturaDetalleServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/facturadetalles")
public class FacturaDetalleController extends BaseControllerImpl<FacturaDetalle, FacturaDetalleServiceImpl> {


}
