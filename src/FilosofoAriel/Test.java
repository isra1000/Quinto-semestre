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
public class Test {
    public static void main(String[] args) {
        Semaphore cuchillo;
        Semaphore tenedor;
        Semaphore mesa;
        cuchillo = new Semaphore(4);
        tenedor = new Semaphore(2);
        mesa = new Semaphore(15);
        
        Filosofo[] ps = new Filosofo[15];
        for (int i = 0; i < 15; i++) {
            ps[i] = new Filosofo(mesa, cuchillo, tenedor, i);
            ps[i].start();           
        }
    }
}
