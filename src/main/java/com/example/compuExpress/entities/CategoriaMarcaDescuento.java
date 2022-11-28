package com.example.compuExpress.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "categoriaMarcaDescuento")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited

public class CategoriaMarcaDescuento extends Base{

    /* --- Atributos --- */

    @Column(name = "fechaHoraAltaCMD")
    private Date fechaHoraAltaCMD;

    @Column(name = "fechaHoraBajaCMD")
    private Date fechaHoraBajaCMD;

    @Column(name = "porcentajeCMD")
    private double porcentajeCMD;

    /* --- Relaciones --- */

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_categoria")
    private Categoria categoria;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_marca")
    private Marca marca;

}
