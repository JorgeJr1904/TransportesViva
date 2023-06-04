package me.transportesviva.restApi.Model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@NamedStoredProcedureQuery(name = "log_compra", procedureName = "buscarLogCompra",
                            parameters = {
                                    @StoredProcedureParameter(mode = ParameterMode.IN, name = "fechaI", type = String.class),
                                    @StoredProcedureParameter(mode = ParameterMode.IN, name = "fechaF", type = String.class)
                                        })
@Table(name = "log_compra")
@ToString
@EqualsAndHashCode
public class LogCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "id")
    private int id;

    @Getter @Setter @Column(name = "vlog")
    private String log;

    @Getter @Setter @Column(name = "voldcodigo")
    private String oldCodigo;

    @Getter @Setter @Column(name = "vnewcodigo")
    private String newCodigo;

    @Getter @Setter @Column(name = "ioldpreciocompra")
    private int oldPrecio;

    @Getter @Setter @Column(name = "inewpreciocompra")
    private int newPrecio;

    @Getter @Setter @Column(name = "doldfechacompra")
    private Date oldFecha;

    @Getter @Setter @Column(name = "dnewfechacompra")
    private Date newFecha;

    @Getter @Setter @Column(name = "ioldunidades")
    private int oldUnidades;

    @Getter @Setter @Column(name = "inewunidades")
    private int newUnidades;
}
