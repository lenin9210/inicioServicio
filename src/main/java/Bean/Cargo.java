/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author lcastilv
 */
public class Cargo {
    
    
    private String descripcion;
    private String codigo;
    private String logmessage;

    public String getLogmessage() {
        return logmessage;
    }

    
    public void setLogmessage(String logmessage) {
        this.logmessage = logmessage;
    }
    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
