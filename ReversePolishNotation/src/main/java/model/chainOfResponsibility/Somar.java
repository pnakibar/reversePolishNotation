/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.chainOfResponsibility;

/**
 *
 * @author 20121bsi0341
 */
public class Somar extends AbsOperator{
    
    public Somar(){
        super('+');
    }

    public int make(int a, int b, char operador) {
        if (operador == meuOperador) return (a+b);
        else return getProximo().make(a, b, operador);
    }   
}
