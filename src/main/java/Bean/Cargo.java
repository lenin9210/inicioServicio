
package Bean;



public class Cargo {
    
    
    
    private String descripcion;
    private String codigo;
    private String logmessage="";
    private String usuario;
    
    public Cargo(){
    
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
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
