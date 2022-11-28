package com.example.compuExpress.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "categoria")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Categoria extends Base {

    /* --- Atributos --- */

    @Column (name = "codigoCategoria")
    private int codigoCategoria;

    @Column (name = "nombreCategoria")
    private String nombreCategoria;

    /* --- Relaciones --- */

    @ManyToMany (cascade = CascadeType.REFRESH)
    private List<Producto> productos;

}
