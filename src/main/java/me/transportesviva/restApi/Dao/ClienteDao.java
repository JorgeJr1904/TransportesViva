package me.transportesviva.restApi.Dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import me.transportesviva.restApi.Model.Cliente;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public class ClienteDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Cliente> getCliente(){
        String query = "FROM Cliente";
        return entityManager.createQuery(query).getResultList();
    }

    public boolean asignar(Cliente cliente){

        Cliente clienteList = entityManager.find(Cliente.class, cliente.getNit());

        if (clienteList == null){
            entityManager.merge(cliente);
            return true;
        }else {
            return false;
        }

    }

    public void eliminarCliente(String id){
        Cliente cliente = entityManager.find(Cliente.class, id);
        entityManager.remove(cliente);
    }

    public void updateCliente(Cliente cliente){
        Cliente clienteBd = entityManager.find(Cliente.class, cliente.getNit());
        clienteBd.setNit(cliente.getNit());
        clienteBd.setNombre(cliente.getNombre());
        clienteBd.setPais(cliente.getPais());
        clienteBd.setCiudad(cliente.getCiudad());
    }
}
