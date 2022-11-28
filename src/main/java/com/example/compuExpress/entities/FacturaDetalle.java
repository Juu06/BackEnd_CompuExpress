package com.example.compuExpress.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "facturaDetalle")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class FacturaDetalle extends Base{

    /* --- Atributos --- */

    @Column(name = "cantidadFD")
    private int cantidadFD;

    @Column(name = "descuentoFD")
    private double descuentoFD;

    @Column(name = "precioFD")
    private double precioFD;

    @Column(name = "subtotalFD")
    private double subtotalFD;

    /* --- Relaciones --- */

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_categoriaMarcaDescuento")
    private CategoriaMarcaDescuento categoriaMarcaDescuento;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_producto")
    private Producto producto;

}
