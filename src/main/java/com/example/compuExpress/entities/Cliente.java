package com.example.compuExpress.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited

public class Cliente extends Base{

    /* --- Atributos --- */

    @Column(name = "codigoCliente")
    private int codigoCliente;

    @Column(name = "contrasenia")
    private String contrasenia;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

}
