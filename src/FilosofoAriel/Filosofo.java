/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilosofoAriel;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Israel
 */
public class Filosofo extends Thread {
    Semaphore cuchillo;
    Semaphore tenedor;
    Semaphore mesa;
    int id;

    public Filosofo(Semaphore mesa, Semaphore cuchillo, Semaphore tenedor, int id) {
        this.mesa =  mesa;
        this.cuchillo = cuchillo;
        this.tenedor = tenedor;
        this.id = id;
    }

    @Override
    public void run() {
       while(true)
       {
           try{
           mesa.acquire();
           System.out.println("Soy el filosofo " + id +"y estoy sentado en la mesa");
           cuchillo.acquire();
           System.out.println("Soy el filosofo " + id +"Obtuve cuchillo");
           tenedor.acquire();
           System.out.println("Soy el filosofo " + id +"Obtuve tenedor");           
           comer();
           tenedor.release();
           cuchillo.release();
           mesa.release();
       }catch(InterruptedException ex){
           System.out.println("La excepcion " + ex.toString());    
        }
    }
    }
    
    private void comer() {
       
        try {
            System.out.println("Soy filosofo " + id + "y estoy comiendo");
            sleep((long) (Math.random()%15000 + 15000));
            System.out.println("Soy filosofo " + id + "y termine de comer");
        
        
    }catch (InterruptedException ex)  {
    
    }
    }
}


    
    
    

