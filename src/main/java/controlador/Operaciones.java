


package controlador;

import Bean.Cargo;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.CrossOrigin;


import javax.validation.Valid;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.PostMapping;



/**
 *
 * @author lcastilv
 */


@RestController
@Validated
@RequestMapping("/operaciones")
public class Operaciones {
    
     @RequestMapping("/listaobjetos")
    public Cargo listaobjetos(@RequestParam(value="name", defaultValue="World") String name) {
        Cargo sa = new Cargo();
        sa.setCodigo("1");
        sa.setDescripcion("Descripcion inicial");
        
        return sa;
    }
    
    
    
    
    @RequestMapping(value="/registrarpersonal",method = RequestMethod.POST)
    public Cargo registrarpersonal(@RequestBody Cargo d) {
        
        Cargo sa = new Cargo();
        sa.setCodigo("1");
        sa.setDescripcion("descripcion desde POST");
        sa.setLogmessage(d.getLogmessage());
        
       return  sa;
    }
    
    
    
    @RequestMapping(value="/actualizar",method = RequestMethod.POST)
    Cargo actualizar(@Valid  @RequestBody Cargo cargo) {
    Cargo sa = new Cargo();
        sa.setCodigo("1");
        sa.setDescripcion("descripcion desde POST");
       
        return sa;
    }
    
    
    
     @RequestMapping("/actualizarpersonal")
    public  Cargo actualizarpersonal(@RequestParam(value="name", defaultValue="World") String name) {
        
        return null;
    }
    
    
}
