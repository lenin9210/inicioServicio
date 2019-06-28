/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Bean.Cargo;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

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
    
    
}
