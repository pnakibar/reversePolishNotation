/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import model.Interpreter;

/**
 *
 * @author 20121bsi0341
 */
public class Main {
    public static void main(String[] args){
        Interpreter i = new Interpreter();
        i.solve("123 123+");
        i.imprimirMonte();

    }
}
