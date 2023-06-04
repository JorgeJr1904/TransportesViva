package me.transportesviva.restApi.Controller;


import me.transportesviva.restApi.Dao.ClienteDao;
import me.transportesviva.restApi.Model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private ClienteDao clienteDao;


    @RequestMapping(value = "api/cliente", method = RequestMethod.GET)
    public List<Cliente> get(){
        return clienteDao.getCliente();
    }

    @RequestMapping(value = "api/cliente", method = RequestMethod.POST)
    public String asignar(@RequestBody Cliente cliente){
        return clienteDao.asignar(cliente);
    }

    @RequestMapping(value = "api/cliente/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable String id){
        clienteDao.eliminarCliente(id);
    }

    @RequestMapping(value = "api/cliente", method = RequestMethod.PUT)
    public void actualizar(@RequestBody Cliente cliente){
        clienteDao.updateCliente(cliente);
    }
}
