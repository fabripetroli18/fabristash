
package maquinacafeacme;

import maquinacafeacme.Cafe;
import maquinacafeacme.Te;
import maquinacafeacme.Expresso;
import maquinacafeacme.Ristretto;
import maquinacafeacme.Normal;
import maquinacafeacme.Negro;
import maquinacafeacme.Verde;
import maquinacafeacme.Rojo;


public abstract class Bebidas {
    
    private String tipo;
    
    private int cantidadAzucar=0;
    private int cantidadLeche=0;
    
    private double precio;
    
    private String descripcion;
    
    private double total=0.0;
    
    
    
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
