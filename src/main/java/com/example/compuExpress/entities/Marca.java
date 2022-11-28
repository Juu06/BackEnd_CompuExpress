package com.example.compuExpress.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "marca")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Marca extends Base{

    /* --- Atributos --- */

    @Column(name = "codigoMarca")
    private int codigoMarca;

    @Column(name = "nombreMarca")
    private String nombreMarca;

}
