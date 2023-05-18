package me.transportesviva.restApi.Controller;


import me.transportesviva.restApi.Dao.ProductoDao;
import me.transportesviva.restApi.Model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private ProductoDao productoDao;


    @RequestMapping(value = "api/producto", method = RequestMethod.GET)
    public List<Producto> get(){

        return productoDao.getProducto();
    }

    @RequestMapping(value = "api/producto", method = RequestMethod.POST)
    public boolean asignar(@RequestBody Producto producto){
        return productoDao.asignar(producto);
    }

    @RequestMapping(value = "api/producto/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable String id){
        productoDao.eliminarProducto(id);
    }

    @RequestMapping(value = "api/producto", method = RequestMethod.PUT)
    public void actualizar(@RequestBody Producto producto){
        productoDao.updateProducto(producto);
    }
}
