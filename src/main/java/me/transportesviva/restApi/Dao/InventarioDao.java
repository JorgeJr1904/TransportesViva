package me.transportesviva.restApi.Dao;


import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
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

    public List<Inventario> buscar(String palabra){

        String query = "FROM Inventario WHERE codigo like '%"+palabra+"%' " +
                "OR NombreProducto like '%"+palabra+"%'"+
                "OR descripcion like '%"+palabra+"%'"+
                "OR nombrePieza like '%"+palabra+"%'"+
                "OR nombreRepuesto like '%"+palabra+"%'"+
                "OR marcaMoto like '%"+palabra+"%'"+
                "OR lineaMoto like '%"+palabra+"%'"+
                "OR anioMoto like '%"+palabra+"%'"+
                "OR cc like '%"+palabra+"%'";
        Query qry = entityManager.createQuery(query);

        return qry.getResultList();
    }

}
