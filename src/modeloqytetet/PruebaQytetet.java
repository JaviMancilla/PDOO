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

    private ArrayList mazo;
    
    
    
    private void inicializarSorpresa(){
        
        mazo.add(new Sorpresa("Te hemos pillado con chanclas y calcetines " + 
                              "lo sentimos, ¡debes ir a la carcel", 
                              9, 
                              TipoSorpresa.IRACASILLA));
        
        mazo.add(new Sorpresa("Un fan anónimo ha pagado tu fianza." +
                              "Sales de la cárcel", 
                              0, 
                              TipoSorpresa.IRACASILLA));
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
}
