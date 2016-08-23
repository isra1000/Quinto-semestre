/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorAviones;

import Builder.Avion;
import Builder.BoeingBuilder;
import Builder.Director;
import Iterator.ConcreteAggregate;
import Iterator.Iterator;

/**
 *
 * @author Israel
 */
public class Test {
    public static void main(String[] args) {
        ListaDeAviones lista = new ListaDeAviones();
         Director d = new Director();
        d.setBuilder(new BoeingBuilder());
        d.buidAvion();
        Avion miAvionBoeing = d.getAvion();
        
        lista.add(miAvionBoeing);
        lista.add(miAvionBoeing);
        lista.add(miAvionBoeing);
        lista.add(miAvionBoeing);
        
        
        //forma 1 de acceder al iterador
        for(Iterator i = lista.createIterator(); i.isDone(); )
        {
            Avion a = (Avion)i.next();
            System.out.println("Avion" + a.getMarca());
        }
    }
}
