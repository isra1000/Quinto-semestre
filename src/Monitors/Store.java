/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monitors;

import java.util.Random;
import java.util.Vector;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Israel
 */
public class Store {
    Lock lock;
    Condition isFull;
    Condition isEmpty;
    Vector<Integer> v;
    private int count;

    public Store() 
    {
        lock= new ReentrantLock();
        isFull = lock.newCondition();
        isEmpty = lock.newCondition();
        int count = (0);
        v = new Vector<Integer>();
        v.setSize(10);
    }
    
    public void produce()
    {
        lock.lock();
        //Este es el codigo que solo puede ejecturar un hilo bajo ciertas condiciones.
        try
        {
            
            while(count == 10)
        {
            isFull.await();
        }
            Random r = new Random();
            Integer temp = new Integer(r.nextInt());
            v.add(temp);
            System.out.println("Se produjo un: " + temp);
            count++;
            isEmpty.signal();
        }catch(InterruptedException e)
        {
            System.out.println(e.toString());
        }
        finally{
        
        
        lock.unlock();
        }
    }
    
    public Integer consume()
    {
        lock.lock();
                    Integer temp = 0;

        try
        {
            while(count == 0)
            {
                isEmpty.await();
                
            }
            temp = v.lastElement();
            System.out.println("consumidor consumio un: " + temp);
            v.remove(count);
            count --;
            isFull.signal();
        }catch(InterruptedException e)
        {
            System.out.println(e.toString());
        }
        finally
        {
            lock.unlock();
            return temp;
        }
    }
    
}
