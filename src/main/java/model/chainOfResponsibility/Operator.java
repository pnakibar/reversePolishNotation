/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.chainOfResponsibility;

/**
 *
 * @author 20121bsi0341
 */
public interface Operator {
    public int make(int a, int b, char operador);
    
    public void setProximo(Operator o);
    public Operator getProximo();
    
}
