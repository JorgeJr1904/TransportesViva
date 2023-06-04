package me.transportesviva.restApi.Dao;

import jakarta.persistence.*;
import me.transportesviva.restApi.Model.Cliente;
import me.transportesviva.restApi.Model.MarcaMoto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Repository
@Transactional
public class MarcaMotoDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<MarcaMoto> getMarcaMoto(){
        String query = "FROM MarcaMoto";
        return entityManager.createQuery(query).getResultList();
    }

    public String asignar(MarcaMoto marcaMoto){
        String alias = marcaMoto.getAlias();
        String aliasExistente = "FROM MarcaMoto WHERE alias = '"+alias+"'";

        if (entityManager.createQuery(aliasExistente).getResultList().isEmpty()){
            entityManager.merge(marcaMoto);
            return "ok";
        }else {
            return "error";
        }
    }

    public void deleteMarcaMoto(int id){
        MarcaMoto marcaMoto = entityManager.find(MarcaMoto.class, id);
        entityManager.remove(marcaMoto);
    }

    public void updateMarcaMoto(MarcaMoto marcaMoto){
        MarcaMoto marcaMotoBd = entityManager.find(MarcaMoto.class, marcaMoto.getId());
        marcaMotoBd.setAlias(marcaMoto.getAlias());
        marcaMotoBd.setMarca(marcaMoto.getMarca());
        marcaMotoBd.setLinea(marcaMoto.getLinea());
        marcaMotoBd.setAnio(marcaMoto.getAnio());
        marcaMotoBd.setCc(marcaMoto.getCc());
    }

}
