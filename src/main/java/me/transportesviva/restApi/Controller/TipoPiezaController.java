package me.transportesviva.restApi.Controller;


import me.transportesviva.restApi.Dao.ProveedorDao;
import me.transportesviva.restApi.Dao.TipoPiezaDao;
import me.transportesviva.restApi.Model.Proveedor;
import me.transportesviva.restApi.Model.TipoPieza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TipoPiezaController {

    @Autowired
    private TipoPiezaDao tipoPiezaDao;


    @RequestMapping(value = "api/tipopieza", method = RequestMethod.GET)
    public List<TipoPieza> getTipoPieza(){

        return tipoPiezaDao.getTipoPieza();
    }

    @RequestMapping(value = "api/tipopieza", method = RequestMethod.POST)
    public String asignar(@RequestBody TipoPieza tipoPieza){
        return tipoPiezaDao.asignar(tipoPieza);
    }

    @RequestMapping(value = "api/tipopieza/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable int id){
        tipoPiezaDao.eliminarTipoPieza(id);
    }

    @RequestMapping(value = "api/tipopieza", method = RequestMethod.PUT)
    public void actualizar(@RequestBody TipoPieza tipoPieza){
        tipoPiezaDao.updateTipoPieza(tipoPieza);
    }
}
