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
public class AppBuilder extends Builder {

    @Override
    void buildJuegos() {
        Juegos juegos =  new Juegos();
        juegos.setNombre("Juego1");
        juegos.setVersion(4.1);
        juegos.setTipo("hola");
        app.setJuegos(juegos);
    }

    @Override
    void buildFitness() {
        Fitness fitness = new Fitness();
        fitness.setNombre("app1");
        fitness.setVersion(3.0);
        fitness.setTipo("app");
        app.setFitness(fitness);
        
    }

    @Override
    void BuildIdiomas() {
        Idiomas idiomas = new Idiomas();
        idiomas.setNombre("app3");
        idiomas.setVersion(4.0);
        idiomas.setTipo("idiomas");
        app.setIdiomas(idiomas);
    }

    @Override
    void BuildMusica() {
        Musica musica = new Musica();
        musica.setNombre("app4");
        musica.setVersion(1.0);
        musica.setTipo("musica");
        app.setMusica(musica);
        
    }
    
}
