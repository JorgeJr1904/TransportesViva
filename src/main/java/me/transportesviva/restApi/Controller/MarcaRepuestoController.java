package me.transportesviva.restApi.Controller;


import me.transportesviva.restApi.Dao.MarcaRepuestoDao;
import me.transportesviva.restApi.Model.MarcaMoto;
import me.transportesviva.restApi.Model.MarcaRepuesto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MarcaRepuestoController {

    @Autowired
    private MarcaRepuestoDao marcaRepuestoDao;


    @RequestMapping(value = "api/marca_repuesto", method = RequestMethod.GET)
    public List<MarcaRepuesto> getAtMarcaRepuesto(){
        return marcaRepuestoDao.getMarcaRepuesto();
    }

    @RequestMapping(value = "api/marca_repuesto", method = RequestMethod.POST)
    public String asignar(@RequestBody MarcaRepuesto marcaRepuesto){
        return marcaRepuestoDao.asignar(marcaRepuesto);
    }

    @RequestMapping(value = "api/marca_repuesto/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable int id){
        marcaRepuestoDao.deleteMarcaRepuesto(id);
    }

    @RequestMapping(value = "api/marca_repuesto", method = RequestMethod.PUT)
    public void actualizar(@RequestBody MarcaRepuesto marcaRepuesto){
        marcaRepuestoDao.updateMarcaRepuesto(marcaRepuesto);
    }
}
