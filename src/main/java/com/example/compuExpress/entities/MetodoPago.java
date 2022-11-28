package com.example.compuExpress.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "metodoPago")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class MetodoPago extends Base{

    /* --- Atributos --- */

    @Column(name = "codigoMP")
    private int codigoMP;

    @Column(name = "nombreMP")
    private String nombreMP;

    @Column(name = "porcentajeMP")
    private double porcentajeMP;

}
