/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monitors;

import java.util.Random;

/**
 *
 * @author Israel
 */
public class Producer extends Thread {
    protected Store store;
    
    public Producer(Store store){
        this.store = store;
}
    @Override
    public void run() {
        try
        {
        while(true)
        {
            store.produce();
            Random r = new Random();
            sleep(r.nextInt()%10000+1000);
        }
        }catch(InterruptedException e)
        {
            System.out.println(e.toString());
        }
    }
    
}
