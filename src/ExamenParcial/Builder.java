/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenParcial;

/**
 *
 * @author Israel
 */
public abstract class Builder {
    protected App app;

    /**
     * @return the app
     */
    public App getApp() {
        return app;
    }

   public void createApp(){
       app = new App();
   }
   
   abstract void buildJuegos();
   abstract void buildFitness();
   abstract void BuildIdiomas();
   abstract void BuildMusica();
}
