package me.transportesviva.restApi.Model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "cliente")
@ToString @EqualsAndHashCode
public class Cliente {

    @Id
    @Getter @Setter @Column(name = "vnit")
    private String nit;

    @Getter @Setter @Column(name = "vnombre")
    private String nombre;

    @Getter @Setter @Column(name = "vpais")
    private String pais;

    @Getter @Setter @Column(name = "vciudad")
    private String ciudad;
}
