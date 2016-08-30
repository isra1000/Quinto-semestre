/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenParcial;

import Builder.Avion;
import Iterator.Iterator;

/**
 *
 * @author Israel
 */
public class TestApp {
    public static void main(String[] args) {
        ListaApp lista = new ListaApp();
        Director d = Director.getInstance();
        ConcreteFactory cf = new ConcreteFactory();
        d.setBuilder(new AppBuilder());
        d.buildApp();
        App  miApp = d.getApp();
        System.out.println("mi app" + miApp.getFitness().getNombre());
        Idiomas id = (Idiomas) cf.createApp("idiomas");
        Fitness f = (Fitness) cf.createApp("fitness");
        Juegos j = (Juegos) cf.createApp("juegos");
        Musica m = (Musica) cf.createApp("Musica");
        
        lista.add(miApp);
       
       for(Iterator i = lista.createIterator(); i.isDone(); )
        {
            App a = (App)i.next();
            System.out.println("App" + a.getJuegos().getNombre());
        } 
    }
}
