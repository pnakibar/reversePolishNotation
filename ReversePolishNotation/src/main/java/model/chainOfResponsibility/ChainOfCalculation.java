/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.chainOfResponsibility;

/**
 *
 * @author 20121bsi0341
 */
public class ChainOfCalculation {
    public Operator pipeline;
    public ChainOfCalculation(){
        pipeline = new Somar();
        Operator m = new Multiplicar();
        Operator s = new Subtrair();
        Operator d = new Dividir();
        pipeline.setProximo(m);
        m.setProximo(s);
        s.setProximo(d);
    }
    
    public int dropInPipeline(int a, int b, char operacao){
        return pipeline.make(a, b, operacao);
    }
}
