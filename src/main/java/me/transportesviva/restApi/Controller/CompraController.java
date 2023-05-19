package me.transportesviva.restApi.Controller;


import me.transportesviva.restApi.Dao.CompraDao;
import me.transportesviva.restApi.Model.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompraController {

    @Autowired
    private CompraDao compraDao;


    @RequestMapping(value = "api/compra", method = RequestMethod.GET)
    public List<Compra> get(){
        return compraDao.get();
    }

    @RequestMapping(value = "api/compra", method = RequestMethod.POST)
    public boolean asignar(@RequestBody Compra compra){

        return compraDao.asignar(compra);
    }

    @RequestMapping(value = "api/compra/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable int id){
        compraDao.eliminar(id);
    }

    @RequestMapping(value = "api/compra", method = RequestMethod.PUT)
    public void actualizar(@RequestBody Compra compra){
        compraDao.update(compra);
    }
}
