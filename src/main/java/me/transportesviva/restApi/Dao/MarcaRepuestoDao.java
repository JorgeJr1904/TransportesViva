package me.transportesviva.restApi.Dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import me.transportesviva.restApi.Model.Cliente;
import me.transportesviva.restApi.Model.MarcaMoto;
import me.transportesviva.restApi.Model.MarcaRepuesto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public class MarcaRepuestoDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<MarcaRepuesto> getMarcaRepuesto(){
        String query = "FROM MarcaRepuesto";
        return entityManager.createQuery(query).getResultList();
    }

    public String asignar(MarcaRepuesto marcaRepuesto){
        String nombre = marcaRepuesto.getNombre();
        String aliasExistente = "FROM MarcaRepuesto WHERE nombre = '"+nombre+"'";

        if (entityManager.createQuery(aliasExistente).getResultList().isEmpty()){
            entityManager.merge(marcaRepuesto);
            return "ok";
        }else {
            return "error";
        }
    }

    public void deleteMarcaRepuesto(int id){
        MarcaRepuesto marcaRepuesto = entityManager.find(MarcaRepuesto.class, id);
        entityManager.remove(marcaRepuesto);
    }

    public void updateMarcaRepuesto(MarcaRepuesto marcaRepuesto){
        MarcaRepuesto marcaRepuestoBd = entityManager.find(MarcaRepuesto.class, marcaRepuesto.getId());
        marcaRepuestoBd.setNombre(marcaRepuesto.getNombre());

    }
}
