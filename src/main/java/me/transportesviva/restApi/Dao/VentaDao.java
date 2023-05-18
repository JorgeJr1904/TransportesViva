package me.transportesviva.restApi.Dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import me.transportesviva.restApi.Model.Cliente;
import me.transportesviva.restApi.Model.Venta;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Transactional
@Repository
public class VentaDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Venta> getVenta(){
        String query = "FROM Venta";
        return entityManager.createQuery(query).getResultList();
    }

    public boolean asignar(Venta venta){
        if (venta.getCliente() == null){
            venta.setCliente("1");

        }
            entityManager.merge(venta);
            return true;
    }

    public void eliminar(int id){
        Venta venta = entityManager.find(Venta.class, id);
        entityManager.remove(venta);
    }

    public void update(Venta venta){
        Venta ventaBd = entityManager.find(Venta.class, venta.getId());
        ventaBd.setCodigo(venta.getCodigo());
        ventaBd.setPrecioVenta(venta.getPrecioVenta());
        ventaBd.setFechaVenta(venta.getFechaVenta());
        ventaBd.setUnidades(venta.getUnidades());
        ventaBd.setCliente(venta.getCliente());
    }
}
