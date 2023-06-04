package me.transportesviva.restApi.Dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import me.transportesviva.restApi.Model.Producto;
import me.transportesviva.restApi.Model.TipoPieza;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public class ProductoDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Producto> getProducto(){
        String query = "FROM Producto";
        return entityManager.createQuery(query).getResultList();
    }

    public String asignar(Producto producto){

        Producto productoList = entityManager.find(Producto.class, producto.getId());

        if (productoList == null){
            entityManager.merge(producto);
            return "ok";
        }else {
            return "error";
        }

    }

    public void eliminarProducto(String id){
        Producto producto = entityManager.find(Producto.class, id);
        entityManager.remove(producto);
    }

    public void updateProducto(Producto producto){

            Producto productoBd = entityManager.find(Producto.class, producto.getId());
            productoBd.setNombre(producto.getNombre());
            productoBd.setPieza(producto.getPieza());
            productoBd.setMarcaRepuesto(producto.getMarcaRepuesto());
            productoBd.setDescripcion(producto.getDescripcion());
    }
}
