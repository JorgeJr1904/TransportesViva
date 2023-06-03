package me.transportesviva.restApi.Controller;

import me.transportesviva.restApi.Dao.LogsDao;
import me.transportesviva.restApi.Model.Compra;
import me.transportesviva.restApi.Model.LogCompra;
import me.transportesviva.restApi.Model.LogVenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LogsController {

    @Autowired
    private LogsDao logDao;


    @RequestMapping(value = "api/logCompra/{fechaI},{fechaF}", method = RequestMethod.GET)
    public List<LogCompra> getCompra(@PathVariable String fechaI, @PathVariable String fechaF){
        return logDao.buscarLogCompra(fechaI, fechaF);
    }

    @RequestMapping(value = "api/logVenta/{fechaI},{fechaF}", method = RequestMethod.GET)
    public List<LogVenta> getVenta(@PathVariable String fechaI, @PathVariable String fechaF){
        return logDao.buscarLogVenta(fechaI, fechaF);
    }

}
