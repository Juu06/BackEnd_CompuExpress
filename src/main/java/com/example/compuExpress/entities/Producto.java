package com.example.compuExpress.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "producto")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited

public class Producto extends Base implements Serializable {

    /* --- Atributos --- */

    @Column(name = "nombreProducto")
    private String nombreProducto;

    @Column(name = "codigoProducto")
    private int codigoProducto;

    @Column(name = "precioProducto")
    private double precioProducto;

    /* --- Relaciones --- */

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_marca")
    private Marca marca;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_productoDescripcion")
    private ProductoDescripcion productoDescripcion;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_tipoProducto")
    private TipoProducto tipoProducto;

}
