/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import model.chainOfResponsibility.ChainOfCalculation;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author 20121bsi0341
 */
public class Interpreter {
    private LinkedList<Integer> monte = new LinkedList<Integer>();
    private ChainOfCalculation pipeline = new ChainOfCalculation();
    private String operators = "+-/*";

    
    public void imprimirMonte(){
        for (int i=0; i<monte.size(); i++) System.out.println(monte.get(i));
    }
    
    public boolean isOperator(char c){
        for (int i=0; i<operators.length(); i++){
            if (operators.charAt(i) == c) return true;
        }
        return false;
    }
    
    
    public int solve(String f){
        String buffer = "";
        for (int i=0; i<f.length(); i++){
            
            if (isOperator(f.charAt(i))){
                monte.add(pipeline.dropInPipeline(monte.removeFirst(), monte.removeFirst(), f.charAt(i)));                
            }
            
            else if (f.charAt(i) == ' '){
                monte.add(Integer.parseInt(buffer));
                buffer = "";
            }
            
            else buffer+=f.charAt(i);
        }
        
        return 0;
    }
    
}
