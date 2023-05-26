package me.transportesviva.restApi.Dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import me.transportesviva.restApi.Model.Compra;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public class CompraDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Compra> get(){
        String query = "FROM Compra";
        return entityManager.createQuery(query).getResultList();
    }

    public boolean asignar(Compra compra){

            entityManager.merge(compra);
            return true;
    }

    public void eliminar(int id){
        Compra compra = entityManager.find(Compra.class, id);
        entityManager.remove(compra);
    }

    public void update(Compra compra){
        Compra compraBd = entityManager.find(Compra.class, compra.getId());
        compraBd.setCodigo(compra.getCodigo());
        compraBd.setPrecioCompra(compra.getPrecioCompra());
        compraBd.setFechaCompra(compra.getFechaCompra());
        compraBd.setUnidades(compra.getUnidades());
    }
}
