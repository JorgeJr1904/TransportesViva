package me.transportesviva.restApi.Model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "producto")
@ToString @EqualsAndHashCode
public class Producto {

    @Id
    @Getter @Setter @Column(name = "vcodigo")
    private String id;

    @Getter @Setter @Column(name = "vnombreproducto")
    private String nombre;

    @Getter @Setter @Column(name = "ipieza")
    private int pieza;

    @Getter @Setter @Column(name = "imarcarepuesto")
    private int marcaRepuesto;

    @Getter @Setter @Column(name = "vdescripcion")
    private String descripcion;
}
