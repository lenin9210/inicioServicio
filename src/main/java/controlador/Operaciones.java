


package controlador;

import Bean.Cargo;
import java.util.concurrent.atomic.AtomicLong;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
/**
 *
 * @author lcastilv
 */

@RestController
public class Operaciones {
    
     @RequestMapping("/listaobjetos")
    public Cargo listaobjetos(@RequestParam(value="name", defaultValue="World") String name) {
        Cargo sa = new Cargo();
        sa.setCodigo("1");
        sa.setDescripcion("Descripcion inicial");
        
        int km = 1600;
        return sa;
    }
    
    
    @RequestMapping(value="/registrarpersonal",method = RequestMethod.POST)
    public @ResponseBody Cargo   registrarpersonal(@Valid @RequestBody Cargo d) {
        
        Cargo sa = new Cargo();
        sa.setCodigo("1");
        sa.setDescripcion("descripcion desde POST");
        sa.setLogmessage(d.getLogmessage());
        
       return  sa;
   
    }
    
    
    
     @RequestMapping("/actualizarpersonal")
    public  Cargo actualizarpersonal(@RequestParam(value="name", defaultValue="World") String name) {
        
        return null;
    }
    
    
}
