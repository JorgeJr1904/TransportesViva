package me.transportesviva.restApi.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name = "inventariototal")
@Immutable
@ToString @EqualsAndHashCode
public class Inventario {

    @Getter @Setter @Column(name = "vcodigo")
    private String codigo;

    @Getter @Setter @Column(name = "vnombreproducto")
    private String NombreProducto;

    @Getter @Setter @Column(name = "vdescripcion")
    private String descripcion;

    @Getter @Setter @Column(name = "vnombrepieza")
    private String nombrePieza;

    @Getter @Setter @Column(name = "vnombrerepuesto")
    private String nombreRepuesto;

    @Getter @Setter @Column(name = "valias")
    private String alias;

    @Getter @Setter @Column(name = "vmarca")
    private String marcaMoto;

    @Getter @Setter @Column(name = "vlinea")
    private String lineaMoto;

    @Getter @Setter @Column(name = "ianio")
    private int anioMoto;

    @Getter @Setter @Column(name = "vcc")
    private int cc;

    @Getter @Setter @Column(name = "vnombreproveedor")
    private String nombreProveedor;

    @Getter @Setter @Column(name = "vtel")
    private String telProveedor;

    @Getter @Setter @Column(name = "vdireccion")
    private String direccionProveedor;

    @Getter @Setter @Column(name = "compras")
    private int comprasTotales;

    @Getter @Setter @Column(name = "ventas")
    private int ventasTotales;

    @Getter @Setter @Column(name = "existencias")
    private int existencias;

}
