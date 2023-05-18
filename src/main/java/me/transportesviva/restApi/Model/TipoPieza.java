package me.transportesviva.restApi.Model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tipopieza")
@ToString @EqualsAndHashCode
public class TipoPieza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "idpieza")
    private int id;


    @Getter @Setter @Column(name = "vnombrepieza")
    private String nombre;

    @Getter @Setter @Column(name = "imoto")
    private int marcaMoto;

    @Getter @Setter @Column(name = "iproveedor")
    private int proveedor;
}
