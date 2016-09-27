/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semaforos;

import static java.lang.Thread.sleep;
import java.util.Random;

/**
 *
 * @author Israel
 */
public class Cajero {
    void depositar(int cantidad) throws InterruptedException
    {
        
        System.out.println("El unico cajero esta depositando" + cantidad);
        sleep((long) (Math.random()%10000));
        System.out.println("Termine la operacoon depositar");
    }
    void retirar(int cantidad) throws InterruptedException
    {
        System.out.println("El unico cajero esta retirando" + cantidad);
        sleep((long) (Math.random()%10000));
        System.out.println("Termine la operacoon retirar");
    }        
    void getsaldo(int cuenta) throws InterruptedException
    {
        Random r = new Random();
        System.out.println("El saldo de la cuenta: " + cuenta + " es: " + r.nextInt()%10000 +1);    
        sleep((long) (Math.random()%10000));
        System.out.println("Termine la operacoon obtener saldo");
    }
    void pagar(int cuenta, int cantidad) throws InterruptedException
    {
        System.out.println("Abonando" + cantidad + " a la cuenta "  + cuenta );
        sleep((long) (Math.random()%10000));
        System.out.println("Termine la operacoon pagar");
        
    }
}
