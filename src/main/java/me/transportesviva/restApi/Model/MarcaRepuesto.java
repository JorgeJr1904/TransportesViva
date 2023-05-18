package me.transportesviva.restApi.Model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString @EqualsAndHashCode
@Table(name = "marca_repuesto")
public class MarcaRepuesto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    @Column(name = "idmarcarepuesto")
    private int id;

    @Getter @Setter
    @Column(name = "vnombre")
    private String nombre;
}
