/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barreras;

import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author Israel
 */
public class Test {
    public static void main(String[] args) {
        CyclicBarrier barrera1;
        CyclicBarrier barrera2;
        
        Runnable accionArealizar = new Runnable() {
            @Override
            public void run() {
                System.out.println("La barrera uno fue completada con exito");
            }
        };
        Runnable accionArealizar2 = new Runnable(){
            @Override
            public void run() {
                System.out.println("La barrera dos fue completada con exito");
            }
            
        };
        barrera1 = new CyclicBarrier(3, accionArealizar);
        barrera2 = new CyclicBarrier(3, accionArealizar2);
        
        Barrera h1 = new Barrera(1, barrera1, barrera2); 
        Barrera h2 = new Barrera(2, barrera1, barrera2);
        Barrera h3 = new Barrera(3, barrera1, barrera2);
        
        new Thread(h1).start();
        new Thread(h2).start();
        new Thread(h3).start();
 


    }
}
