package me.transportesviva.restApi.Dao;


import jakarta.persistence.PersistenceContext;
import me.transportesviva.restApi.Model.Inventario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import java.util.List;

@Repository
@Transactional
public class InventarioDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Inventario> get(){
        String query = "FROM Inventario";
        return entityManager.createQuery(query).getResultList();
    }


}
