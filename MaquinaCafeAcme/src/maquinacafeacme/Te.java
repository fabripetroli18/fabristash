
package maquinacafeacme;

import maquinacafeacme.Bebidas;

public abstract class Te extends Bebidas{
    
    @Override
    public String getTipo(){
        return "Té";
    }
}