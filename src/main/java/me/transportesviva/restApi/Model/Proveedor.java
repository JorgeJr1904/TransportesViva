package me.transportesviva.restApi.Model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "proveedor")
@ToString @EqualsAndHashCode
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "idproveedor")
    private int id;


    @Getter @Setter @Column(name = "vnombreproveedor")
    private String nombre;

    @Getter @Setter @Column(name = "vtel")
    private String telefono;

    @Getter @Setter @Column(name = "vdireccion")
    private String direccion;


}
