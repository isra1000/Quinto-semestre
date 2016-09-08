/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author Israel
 */
public class RThread implements Runnable {
private  int  id;
    public RThread(int id) {
        this.id = id;
    }
    
    @Override
    public void run() {
        System.out.println("Soy el hilo: " + id);
       
    }
    public static void main(String[] args) {
        RThread t1 =  new RThread(1); //Crear una accion a realizar
        RThread t2 =  new RThread(2); //Crear una accion a realizar
        RThread t3 =  new RThread(3); //Crear una accion a realizar
        RThread t4 =  new RThread(4); //Crear una accion a realizar

        
        Thread h1 = new Thread(t1); //Creacion cada hilo
        Thread h2 = new Thread(t2);
        Thread h3 = new Thread(t3);
        Thread h4 = new Thread(t4);
        
     

        h1.start();  //Ejecucion de cada hilo
        h2.start();
        h3.start();
        h4.start();

    }
    
}
