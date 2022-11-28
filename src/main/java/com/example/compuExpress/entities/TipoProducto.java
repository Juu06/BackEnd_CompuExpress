package com.example.compuExpress.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tipoProducto")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class TipoProducto extends Base{

    /* --- Atributos --- */

    @Column(name = "codigoTipoProducto")
    private int codigoTipoProducto;

    @Column(name = "fechaHoraBajaTipoProducto")
    private Date fechaHoraBajaTipoProducto;

    @Column(name = "nombreTipoProducto")
    private String nombreTipoProducto;

}
