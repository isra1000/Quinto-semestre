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
public abstract class Builder {
    protected Computadora computadora;

    /**
     * @return the avion
     */
    public Computadora getComputadora() {
        return computadora;
    }
    
    public void createComputadora(){
        computadora = new Computadora();
    }
    
    abstract void buildDisco();
    abstract void buildMemoria();
    abstract void buildMonitor();
    abstract void buildProcesador();
    abstract void buildteclado();
}
