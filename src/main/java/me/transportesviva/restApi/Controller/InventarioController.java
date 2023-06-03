package me.transportesviva.restApi.Controller;

import me.transportesviva.restApi.Dao.InventarioDao;
import me.transportesviva.restApi.Model.Inventario;
import me.transportesviva.restApi.Model.MarcaMoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventarioController {

    @Autowired
    private InventarioDao inventarioDao;

    @RequestMapping(value = "api/inventario", method = RequestMethod.GET)
    public List<Inventario> getInventario(){
        return inventarioDao.get();
    }

    @RequestMapping(value = "api/busqueda/{keyword}", method = RequestMethod.GET)
    public List<Inventario> getBusqueda(@PathVariable String keyword){
        return inventarioDao.buscar(keyword);
    }
}
