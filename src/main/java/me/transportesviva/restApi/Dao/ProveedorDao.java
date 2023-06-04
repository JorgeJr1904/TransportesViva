package me.transportesviva.restApi.Dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import me.transportesviva.restApi.Model.MarcaRepuesto;
import me.transportesviva.restApi.Model.Proveedor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public class ProveedorDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Proveedor> getProveedor(){
        String query = "FROM Proveedor";
        return entityManager.createQuery(query).getResultList();
    }

    public String asignar(Proveedor proveedor){
        String nombre = proveedor.getNombre();
        String aliasExistente = "FROM Proveedor WHERE nombre = '"+nombre+"'";

        if (entityManager.createQuery(aliasExistente).getResultList().isEmpty()){
            entityManager.merge(proveedor);
            return "ok";
        }else {
            return "error";
        }
    }

    public void deleteProveedor(int id){
        Proveedor proveedor = entityManager.find(Proveedor.class, id);
        entityManager.remove(proveedor);
    }

    public void updateProveedor(Proveedor proveedor){
        Proveedor proveedorBd = entityManager.find(Proveedor.class, proveedor.getId());
        proveedorBd.setNombre(proveedor.getNombre());
        proveedorBd.setTelefono(proveedor.getTelefono());
        proveedorBd.setDireccion(proveedor.getDireccion());

    }
}
