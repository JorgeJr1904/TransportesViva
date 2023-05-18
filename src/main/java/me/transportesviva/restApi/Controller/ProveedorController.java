package me.transportesviva.restApi.Controller;


import me.transportesviva.restApi.Dao.MarcaRepuestoDao;
import me.transportesviva.restApi.Dao.ProveedorDao;
import me.transportesviva.restApi.Model.MarcaRepuesto;
import me.transportesviva.restApi.Model.Proveedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProveedorController {

    @Autowired
    private ProveedorDao proveedorDao;


    @RequestMapping(value = "api/proveedor", method = RequestMethod.GET)
    public List<Proveedor> getProveedor(){
        return proveedorDao.getProveedor();
    }

    @RequestMapping(value = "api/proveedor", method = RequestMethod.POST)
    public void asignar(@RequestBody Proveedor proveedor){
        proveedorDao.asignar(proveedor);
    }

    @RequestMapping(value = "api/proveedor/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable int id){
        proveedorDao.deleteProveedor(id);
    }

    @RequestMapping(value = "api/proveedor", method = RequestMethod.PUT)
    public void actualizar(@RequestBody Proveedor proveedor){
        proveedorDao.updateProveedor(proveedor);
    }
}
