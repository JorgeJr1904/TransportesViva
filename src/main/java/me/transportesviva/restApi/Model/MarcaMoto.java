package me.transportesviva.restApi.Model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "marca_moto")
@ToString @EqualsAndHashCode
public class MarcaMoto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private int id;


    @Getter @Setter @Column(name = "valias")
    private String alias;

    @Getter @Setter @Column(name = "vmarca")
    private String marca;

    @Getter @Setter @Column(name = "vlinea")
    private String linea;

    @Getter @Setter @Column(name = "ianio")
    private int anio;

    @Getter @Setter @Column(name = "icc")
    private int cc;

}
