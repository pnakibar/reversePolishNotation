/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.chainOfResponsibility;

/**
 *
 * @author 20121bsi0341
 */
public class Multiplicar extends AbsOperator{
    
    public Multiplicar(){
        super('*');
    }

    public int make(int a, int b, char operador) {
        if (operador == meuOperador) return (a*b);
        else return getProximo().make(a, b, operador);
    }   
}
