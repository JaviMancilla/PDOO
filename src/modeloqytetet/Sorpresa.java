/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloqytetet;

/**
 *
 * @author javie
 */
public class Sorpresa {
    
    /*************************************************************************/
    /* ATRIBUTOS DE LA CLASE */
    
    String texto;
    int valor;
    TipoSorpresa tipo;
    
    /*************************************************************************/
    /* CONTRUCTOR DE LA CLASE */

    public Sorpresa(String texto, int valor, TipoSorpresa tipo) {
        this.texto = texto;
        this.valor = valor;
        this.tipo = tipo;
    }
    
    /*************************************************************************/

    /* CONSULTORES */
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public TipoSorpresa getTipo() {
        return tipo;
    }

    public void setTipo(TipoSorpresa tipo) {
        this.tipo = tipo;
    }

    
    /*************************************************************************/
    /* METODO TOSTRING() */
    
    @Override
    public String toString() {
        return "Sorpresa{" + "texto=" + texto + 
                             ", valor=" + valor + 
                             ", tipo=" + tipo + '}' + '\n';
    }
    
    
    /*************************************************************************/
    
}
