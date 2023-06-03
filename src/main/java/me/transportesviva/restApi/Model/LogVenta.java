package me.transportesviva.restApi.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "log_venta")
@ToString @EqualsAndHashCode
public class LogVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private int id;

    @Getter @Setter @Column(name = "vlog")
    private String log;

    @Getter @Setter @Column(name = "voldcodigo")
    private String oldCodigo;

    @Getter @Setter @Column(name = "vnewcodigo")
    private String newCodigo;

    @Getter @Setter @Column(name = "ioldprecioventa")
    private int oldPrecio;

    @Getter @Setter @Column(name = "inewprecioventa")
    private int newPrecio;

    @Getter @Setter @Column(name = "doldfechaventa")
    private Date oldFecha;

    @Getter @Setter @Column(name = "dnewfechaventa")
    private Date newFecha;

    @Getter @Setter @Column(name = "ioldunidades")
    private int oldUnidades;

    @Getter @Setter @Column(name = "inewunidades")
    private int newUnidades;

}
