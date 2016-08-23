/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.util.Vector;

/**
 *
 * @author Israel
 */
public class Test {
    public static void main(String[] args) {
        ConcreteAggregate listaPalabras = new ConcreteAggregate();
        
        
        listaPalabras.add("libro");
        listaPalabras.add("revista");
        listaPalabras.add("Periodico");
        listaPalabras.add("comic");
        
        
        //forma 1 de acceder al iterador
        for(Iterator i = listaPalabras.createIterator(); i.isDone(); )
        {
            System.out.println("Palabra" + i.next());
        }
        
        //forma 2 de acceder
        Iterator ii = listaPalabras.createIterator();
        while(ii.isDone())
        {
            System.out.println("palabra;" + ii.next());
        }
        
        //con un vector de cosas
        
        Vector <String>miVectorDePalabras = new Vector();
        miVectorDePalabras.add("lista");
        miVectorDePalabras.add("cosas");
        
        for(java.util.Iterator<String> i = miVectorDePalabras.iterator(); i.hasNext();)
        {
            System.out.println("Vector: "+ i.next());
        }
        
    }
}
