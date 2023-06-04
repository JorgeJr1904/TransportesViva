package me.transportesviva.restApi.Dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import me.transportesviva.restApi.Model.Proveedor;
import me.transportesviva.restApi.Model.TipoPieza;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public class TipoPiezaDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<TipoPieza> getTipoPieza(){
        String query = "FROM TipoPieza";
        return entityManager.createQuery(query).getResultList();
    }

    public String asignar(TipoPieza tipoPieza){
        String pieza = tipoPieza.getNombre();
        String aliasExistente = "FROM TipoPieza WHERE nombre = '"+pieza+"'";

        if (entityManager.createQuery(aliasExistente).getResultList().isEmpty()){
            entityManager.merge(tipoPieza);
            return "ok";
        }else {
            return "error";
        }
    }

    public void eliminarTipoPieza(int id){
        TipoPieza tipoPieza = entityManager.find(TipoPieza.class, id);
        entityManager.remove(tipoPieza);
    }

    public void updateTipoPieza(TipoPieza tipoPieza){
        TipoPieza tipoPiezaBd = entityManager.find(TipoPieza.class, tipoPieza.getId());
        tipoPiezaBd.setNombre(tipoPieza.getNombre());
        tipoPiezaBd.setProveedor(tipoPieza.getProveedor());
        tipoPiezaBd.setMarcaMoto(tipoPieza.getMarcaMoto());

    }
}
