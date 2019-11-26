package maquinacafeacme;

import java.util.Scanner;


public class MaquinaCafeAcme {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Bebidas[] pedido = new Bebidas[100];
        
        boolean otroPedido = true;
        
        int orden = scanner.nextInt();
        
        if(orden == 1){
            System.out.println("" + "1-Expresso\n" + "2-Ristretto\n" + "3-Normal\n");
            Scanner queCafe = new Scanner(System.in);
            int tipoCafe = queCafe.nextInt();
            switch(tipoCafe) {
                case 1:
                    pedido[siguiente] = new Expresso();
                    break;
                case 2:
                    pedido[siguiente] = new Ristretto();
                    break;
                case 3:
                    pedido[siguiente] = new Normal();
                    break;
            }
        }    
        if(orden == 2){
            System.out.println("" + "1-Verde\n" + "2-Negro\n" + "3-Rojo\n");
            Scanner queTe = new Scanner(System.in);
            int tipoTe = queTe.nextInt();
            switch(tipoTe) {
                case 1:
                    pedido[siguiente] = new Verde();
                    break;
                case 2:
                    pedido[siguiente] = new Negro();
                    break;
                case 3:
                    pedido[siguiente] = new Rojo();
                    break;
            }    
        }
    
    }
}
