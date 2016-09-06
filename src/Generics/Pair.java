/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

/**
 *
 * @author Israel
 */
public class Pair <K, V> {
    private K Key;
    private V value;

    public Pair(K Key, V value) {
        this.Key = Key;
        this.value = value;
    }

    private Pair() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

    /**
     * @return the Key
     */
    public K getKey() {
        return Key;
    }

    /**
     * @param Key the Key to set
     */
    public void setKey(K Key) {
        this.Key = Key;
    }

    /**
     * @return the value
     */
    public V getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(V value) {
        this.value = value;
    }
    public static void main(String[] args) {
        Pair<Integer, String> par1 = new Pair(1, "Juan");
        Pair<Integer, String> par2 = new Pair(1, "Brenda");
        Pair<Integer, String> par3 = new Pair(1, "Mario");
        Pair<Integer, String> par4 = new Pair(1, "Jorge");
        
        Pair<String, Double> par5 = new Pair("hola", 216.4);
        
        System.out.print("Key: " + par5.getKey() + "  value: " + par5.getValue());
    }
}
