
package maquinacafeacme;


public abstract class Bebidas {
    
    private String tipo;
    
    private int cantidadAzucar;
    private int cantidadLeche;
    
    private double precio;
    
    private String descripcion;
    
    
    
    public String getTipo() {
        return tipo;
    }

    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public int getCantidadAzucar() {
        return cantidadAzucar;
    }

    
    public void setCantidadAzucar(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }

    
    public int getCantidadLeche() {
        return cantidadLeche;
    }

    
    public void setCantidadLeche(int cantidadLeche) {
        this.cantidadLeche = cantidadLeche;
    }

    
    public double getPrecio() {
        return precio;
    }

    
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    public String getDescripcion() {
        return descripcion;
    }

    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
