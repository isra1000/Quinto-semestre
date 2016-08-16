/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author Israel
 */
public class Test {
    public static void main(String[] args) {
      ConcreteFactory cf = new ConcreteFactory();
    Laptop l = (Laptop) cf.createCompu("laptop");
    Desktop d = (Desktop)cf.createCompu("desktop");
    Netbook n = (Netbook) cf.createCompu("netbook");  
    }
    
}
