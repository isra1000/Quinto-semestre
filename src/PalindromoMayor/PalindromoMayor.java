/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PalindromoMayor;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Israel
 */
public class PalindromoMayor extends Thread{
    int limInferior, limSuperior;
    int mayor;
    
    public PalindromoMayor(int limInferior, int limSuperior, int mayor)
    {
        this.limInferior = limInferior;
        this.limSuperior = limSuperior;
        this.mayor = mayor;
    }
    boolean isPalindrome(Integer num)
    {
        
        String reversa = new String();
        String n = num.toString();
        for(int i =n.length()-1; i>=0; i--){
            reversa = reversa + n.charAt(i);
        }
        if(reversa.equals(n))
            
        return true;
      return false;  
      
    }
      /**
     * @return the mayor
     */
    public int getMayor() {
        return mayor;
    }

    /**
     * @param mayor the mayor to set
     */
    public void setMayor(int mayor) {
        this.mayor = mayor;
    }

    @Override
    public void run() {
        for(int i = limInferior; i<limSuperior; i++){
            for (int j = 100; j < 1000; j++) {
                int temp= i*j;
                if(isPalindrome(temp))
                {
                    if(temp> getMayor())
                    {
                        setMayor(temp);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int mayor = 0;
         PalindromoMayor [] t = new PalindromoMayor[9];
        for (int i = 0; i < 9; i++) {
           t[i] = new PalindromoMayor((i+i)*100,(i+i)*199, mayor);
           t[i].start();
            try {
                t[i].join();
            } catch (InterruptedException ex) {
               
            }
        }
        for (int i = 0; i < 9; i++) {
            if(t[i].getMayor() > mayor)
            {
                mayor = t[i].getMayor();
            }
        }
        System.out.println("El mayor palindromo fue: " + mayor);
        
        PalindromoMayor t1= new PalindromoMayor(100, 199, mayor);
    }
}
