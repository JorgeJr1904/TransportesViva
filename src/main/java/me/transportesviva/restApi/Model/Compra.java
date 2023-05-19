package me.transportesviva.restApi.Model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@Table(name = "compra")
@ToString @EqualsAndHashCode
public class Compra {

    @Id
    @Getter @Setter @Column(name = "idcompra")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter @Setter @Column(name = "vcodigo")
    private String codigo;

    @Getter @Setter @Column(name = "ipreciocompra")
    private int precioCompra;

    @Getter @Setter @Column(name = "dfechacompra")
    private Date fechaCompra;

    @Getter @Setter @Column(name = "iunidades")
    private int unidades;
}
