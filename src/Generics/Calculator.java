/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Israel
 */
public class Calculator {
    
    public<T extends Number>  T sum(T a, T b)
    {
        if(a.getClass().equals(Integer.class))
     return (T) new Integer(a.intValue() + b.intValue());
        if(a.getClass().equals(Double.class))
            return (T) new Double(a.doubleValue() + b.doubleValue());
        if(a.getClass().equals(Float.class))
            return (T) new Float(a.floatValue() + b.floatValue());
        return null;
    }
    
     public<T extends Number>  T resta(T a, T b)
    {
        if(a.getClass().equals(Integer.class))
     return (T) new Integer(a.intValue() - b.intValue());
        if(a.getClass().equals(Double.class))
            return (T) new Double(a.doubleValue() - b.doubleValue());
        if(a.getClass().equals(Float.class))
            return (T) new Float(a.floatValue() - b.floatValue());
        return null;
    }
     public<T extends Number>  T multi(T a, T b)
    {
        if(a.getClass().equals(Integer.class))
     return (T) new Integer(a.intValue() * b.intValue());
        if(a.getClass().equals(Double.class))
            return (T) new Double(a.doubleValue() * b.doubleValue());
        if(a.getClass().equals(Float.class))
            return (T) new Float(a.floatValue() * b.floatValue());
        return null;
    }
    
    public static void main(String[] args) {
        Calculator c = new Calculator();
        
        System.out.println("La suma es: " + c.sum(1.5, 5.5).toString());
        System.out.println("La  resta es: " + c.resta(35, 10));
        System.out.println("La multiplicacion es:" + c.multi(5, 2));
    }
}
