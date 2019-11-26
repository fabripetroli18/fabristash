
package maquinacafeacme;

import maquinacafeacme.Bebidas;

public abstract class Cafe extends Bebidas{
    
    @Override
    public String getTipo(){
        return "Cafe";
    }
}
