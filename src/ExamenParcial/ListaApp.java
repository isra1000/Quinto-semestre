/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenParcial;

import Iterator.Aggregate;
import Iterator.Iterator;

/**
 *
 * @author Israel
 */
public class ListaApp implements Aggregate {

    static Iterator ConcreteIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
private App[] app;
private int numApp;
private int size=10;

    public ListaApp() {
        app = new App[size];
    }
    
     public void add(App aplic)
        {
            app[numApp++] = aplic;
        }



    @Override
    public Iterator createIterator() {
       return new ConcreteIterator();
    }
    
    class ConcreteIterator implements Iterator
    {
        int index=0;
        @Override
        public Object first() {
           return app[0];
        }

        @Override
        public Object next() {
            if(isDone()){
                return app[index++];
            }
            return null;
        }

        @Override
        public boolean isDone() {
            if(index>=numApp){
                return false;
            }
            return true;
        }

        @Override
        public Object currentItem() {
           return app[index];
        }
        
    }
}
    

