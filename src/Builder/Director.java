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
public class Director {
    private Builder builder;
   

 
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    
    Avion getAvion()
    {
        return builder.getAvion();
    }
    
    public void buidAvion()
    {
        builder.createAvion();
        builder.buildAlas();
        builder.buildMotor();
        builder.buildMarca();
        builder.buildModelo();
        builder.buildNumSerie();
    }
}
