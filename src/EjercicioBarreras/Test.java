/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioBarreras;

import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author Israel
 */
public class Test {
    public static void main(String[] args) {
        int[]arregloResultados;
        arregloResultados = new int[4];
        Accion a = new Accion(arregloResultados);
        CyclicBarrier c = new CyclicBarrier(4, a);
        
        
    }

    private static class Accion implements Runnable{
        int[]arreglo;

        public Accion(int[] arreglo) {
            this.arreglo = arreglo;
        }

        @Override
        public void run() {
            System.out.println("el numero primo maximo menos  a10,000 "+ arreglo[0]);
            System.out.println("el numero natural perfecto maximo que es meno a 100,000"+ arreglo[1]);
            System.out.println("la suma de pares  entre 1 y 10,000 3w "+ arreglo[2]);
            System.out.println("El numero aleatorio entre 100,000 y 1,000,000 es  " + arreglo[3] );
        }
        
        
    }
}
