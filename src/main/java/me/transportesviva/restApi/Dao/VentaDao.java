package me.transportesviva.restApi.Dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
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

    public String asignar(Venta venta){
        String query = "SELECT v.existencias FROM Inventario v WHERE v.codigo = :codigo";
        TypedQuery<Integer> typedQuery = entityManager.createQuery(query, Integer.class);
        typedQuery.setParameter("codigo", venta.getCodigo());

        Integer existencias = typedQuery.getSingleResult();

        if (venta.getUnidades() <= 0){
            return "numero Negativo no valido";
        }
        else if (existencias != null && venta.getUnidades() <= existencias) {
            if (venta.getCliente() == null) {
                venta.setCliente("1");
            }

            entityManager.merge(venta);
            return "True";
        } else {
            return "Existencias Insuficientes";
        }

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
