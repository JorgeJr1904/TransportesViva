package me.transportesviva.restApi.Controller;

import me.transportesviva.restApi.Dao.InventarioDao;
import me.transportesviva.restApi.Model.Inventario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InventarioController {

    @Autowired
    private InventarioDao inventarioDao;

    @RequestMapping(value = "api/inventario", method = RequestMethod.GET)
    public List<Inventario> getInventario(){
        return inventarioDao.get();
    }
}
