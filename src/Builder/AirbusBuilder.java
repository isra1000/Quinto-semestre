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
public class AirbusBuilder extends Builder {

    @Override
    void buildAlas() {
        Alas a = new Alas ();
        a.setHiper(2);
        a.setMarca("WindsArmy");
        a.setNumSerie(3222323);
        a.setSpoiler(10);
        avion.setAlas(a);
    }

    @Override
    void buildMotor() {
        Motor m = new Motor();
        m.setNumserie(23233223);
        m.setPotencia(32232323);
        avion.setMotor(m);
    }

    @Override
    void buildMarca() {
        avion.setMarca("Airbus");
    }

    @Override
    void buildNumSerie() {
       avion.setNumSerie(88282);
    }

    @Override
    void buildModelo() {
        avion.setModelo("a380");
    }
    
}
