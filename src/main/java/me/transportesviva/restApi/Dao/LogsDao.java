package me.transportesviva.restApi.Dao;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import me.transportesviva.restApi.Model.LogCompra;
import me.transportesviva.restApi.Model.LogVenta;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class LogsDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<LogCompra> buscarLogCompra(String fechaI, String fechaF){
        StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("buscarLogCompra");

        storedProcedure.registerStoredProcedureParameter("fechaI", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("fechaF", String.class, ParameterMode.IN);

        storedProcedure.setParameter("fechaI", fechaI);
        storedProcedure.setParameter("fechaF", fechaF);

        return storedProcedure.getResultList();
    }

    public List<LogVenta> buscarLogVenta(String fechaI, String fechaF){
        StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("buscarLogVenta");

        storedProcedure.registerStoredProcedureParameter("fechaI", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("fechaF", String.class, ParameterMode.IN);

        storedProcedure.setParameter("fechaI", fechaI);
        storedProcedure.setParameter("fechaF", fechaF);

        // Asegúrate de que el nombre de la entidad y sus propiedades coincidan con tu modelo de datos
        storedProcedure.execute();

        return storedProcedure.getResultList();
    }

}
