/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloqytetet;

import java.util.ArrayList;

/**
 *
 * @author javie
 */
public class PruebaQytetet {

    private static final ArrayList<Sorpresa> mazo = new ArrayList<>();
    
    
    
    
/*****************************************************************************/
    
    private static void inicializarSorpresa(){
        
        mazo.add(new Sorpresa("Te hemos pillado con chanclas y calcetines lo sentimos, ¡debes ir a la carcel", 
                              9, 
                              TipoSorpresa.IRACASILLA));
        
        mazo.add(new Sorpresa("Te", 
                              -8, 
                              TipoSorpresa.IRACASILLA));
        
        mazo.add(new Sorpresa("Un fan anónimo ha pagado tu fianza. Sales de la cárcel", 
                              0, 
                              TipoSorpresa.SALIRCARCEL));
        
        mazo.add(new Sorpresa("Te has encontrado un bolso y ganas 200", 
                              200, 
                              TipoSorpresa.PAGARCOBRAR));
        
    }

/*****************************************************************************/

    
    private static void valorMayorCero(){
        
        for(Sorpresa sor : mazo){
            if(sor.valor > 0){
                System.out.println(sor.toString());
            }
        }
    }
    
    
/*****************************************************************************/

    
    private static void casillaTipoIRACASILLA(){
        
        for(Sorpresa sor : mazo){
            
            if(TipoSorpresa.IRACASILLA == sor.getTipo()){
                
                System.out.println(sor.toString());
            }
            
        }
                 
    }


/*****************************************************************************/
    
    
    public static void main(String[] args) {
        // TODO code application logic here
       
        inicializarSorpresa();
        System.out.println(mazo.toString());  
        
        System.out.println("-----------------------------------------");
        
        System.out.println("---SORPRESAS CON VALOR MAYOR QUE CERO---");
        valorMayorCero();
        
        System.out.println("-----------------------------------------");
        
        System.out.println("---SORPRESAS CON DE TIPO 'IR A CASILLA' ---");
        casillaTipoIRACASILLA();
    
    }
        
        
        
        
        
            
        
        
        
    
    
}
