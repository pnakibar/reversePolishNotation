/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.chainOfResponsibility;

/**
 *
 * @author 20121bsi0341
 */
public abstract class AbsOperator implements Operator {
    private Operator proximo = null;
    public char meuOperador;
    
    public AbsOperator(char Operador){
        this.meuOperador = Operador;
    }
    
    
    public Operator getProximo(){
       return proximo;
    }
    

    public void setProximo(Operator o) {
        this.proximo = o;
    }

    
}
