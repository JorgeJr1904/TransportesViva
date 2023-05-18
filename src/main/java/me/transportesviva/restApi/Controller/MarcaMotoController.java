package me.transportesviva.restApi.Controller;

import me.transportesviva.restApi.Dao.MarcaMotoDao;
import me.transportesviva.restApi.Model.MarcaMoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MarcaMotoController {

    @Autowired
    private MarcaMotoDao marcaMotoDao;


    @RequestMapping(value = "api/marca_moto", method = RequestMethod.GET)
    public List<MarcaMoto> getAtMarcaMoto(){
        return marcaMotoDao.getMarcaMoto();
    }

    @RequestMapping(value = "api/marca_moto", method = RequestMethod.POST)
    public void asignar(@RequestBody MarcaMoto marcaMoto){
        marcaMotoDao.asignar(marcaMoto);
    }

    @RequestMapping(value = "api/marca_moto/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable int id){
        marcaMotoDao.deleteMarcaMoto(id);
    }

    @RequestMapping(value = "api/marca_moto", method = RequestMethod.PUT)
    public void actualizar(@RequestBody MarcaMoto marcaMoto){
        marcaMotoDao.updateMarcaMoto(marcaMoto);
    }
}
