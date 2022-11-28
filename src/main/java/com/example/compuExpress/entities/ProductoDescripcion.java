package com.example.compuExpress.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "productoDescripcion")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class ProductoDescripcion extends Base{

    /* --- Atributos --- */

    @Column(name = "codigoProductoDescripcion")
    private int codigoProductoDescripcion;

    @Column(name = "descripcionPD")
    private String descripcionPD;

}
