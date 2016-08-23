/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author Israel
 */
public class TestBuilder {
    public static void main(String[] args) {
        Director d = new Director();
        d.setBuilder(new BoeingBuilder());
        d.buidAvion();
        Avion miAvionBoeing = d.getAvion();
        System.out.println("la marca de mi avion" + miAvionBoeing.getNumSerie());
        
        d.setBuilder(new AirbusBuilder());
        d.buidAvion();
        Avion  miAirbus = d.getAvion();
        System.out.println("mi nuevo avion es un" + miAirbus.getMarca());
        
       
    }
}
