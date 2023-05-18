package me.transportesviva.restApi.Controller;


import me.transportesviva.restApi.Dao.VentaDao;
import me.transportesviva.restApi.Model.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class VentaController {

    @Autowired
    private VentaDao ventaDao;


    @RequestMapping(value = "api/venta", method = RequestMethod.GET)
    public List<Venta> get(){
        return ventaDao.getVenta();
    }

    @RequestMapping(value = "api/venta", method = RequestMethod.POST)
    public boolean asignar(@RequestBody Venta venta){

        return ventaDao.asignar(venta);
    }

    @RequestMapping(value = "api/venta/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable int id){
        ventaDao.eliminar(id);
    }

    @RequestMapping(value = "api/venta", method = RequestMethod.PUT)
    public void actualizar(@RequestBody Venta venta){
        ventaDao.update(venta);
    }
}
