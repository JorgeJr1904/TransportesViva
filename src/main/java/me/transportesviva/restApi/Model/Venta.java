package me.transportesviva.restApi.Model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@Table(name = "venta")
@ToString @EqualsAndHashCode
public class Venta {

    @Id
    @Getter @Setter @Column(name = "idventa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter @Setter @Column(name = "vcodigo")
    private String codigo;

    @Getter @Setter @Column(name = "iprecioventa")
    private double PrecioVenta;

    @Getter @Setter @Column(name = "dfechaventa")
    private Date fechaVenta;

    @Getter @Setter @Column(name = "iunidades")
    private int unidades;

    @Getter @Setter @Column(name = "vcliente")
    private String cliente;
}
