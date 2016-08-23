/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderComputadora;

/**
 *
 * @author Israel
 */
public class TestBuilder {
    public static void main(String[] args) {
        Director d = new Director();
        d.setBuilder(new ComputadoraBuilder());
        d.buildComputadora();
        Computadora miComputadora = d.getComputadora();
       System.out.println("mi compu" + miComputadora.getMonitor());
    }
}
