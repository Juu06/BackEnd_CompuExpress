package com.example.compuExpress.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "factura")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Factura extends Base{

    /* --- Atributos --- */

    @Column(name = "codigoFactura")
    private int codigoFactura;

    @Column(name = "fechaAltaFactura")
    private Date fechaAltaFactura;

    /* --- Relaciones --- */

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "factura_facturaDetalle",
            joinColumns = @JoinColumn(name = "factura_id"),
            inverseJoinColumns = @JoinColumn(name = "facturaDetalle_id")
    )
    private List<FacturaDetalle> facturaDetalles = new ArrayList<>();

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_cliente")
    private Cliente cliente;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_metodoPago")
    private MetodoPago metodoPago;

}
