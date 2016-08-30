/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenParcial;

import SingleTon.Singleton;



/**
 *
 * @author Israel
 */
public class Director {
    private Builder builder;
    
      App getApp() {
        return builder.getApp();
    }

    
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    
    public void buildApp()
    {
        builder.createApp();
        builder.buildJuegos();
        builder.buildFitness();
        builder.BuildIdiomas();
        builder.BuildMusica();
    }
   static Director getInstance()
    {
        if(singleton== null)
        {
            singleton=new Director();
        }
        
            return singleton;
        
    }
    private static Director singleton;
    
  
}
