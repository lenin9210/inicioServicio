/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Bean.Cargo;
import java.util.concurrent.atomic.AtomicLong;
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
        
        return null;
        
        
    }
    
    
    @RequestMapping(value="/registrarpersonal",method = RequestMethod.POST)
    public ResponseEntity   registrarpersonal() {
        
        Cargo sa = null;
        sa.setCodigo("1");
       return  new ResponseEntity(sa, HttpStatus.OK);
   
    }
    
    
    
     @RequestMapping("/actualizarpersonal")
    public  Cargo actualizarpersonal(@RequestParam(value="name", defaultValue="World") String name) {
        
        return null;
    }
    
    
}
