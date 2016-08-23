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
public class ComputadoraBuilder extends Builder{

    @Override
    void buildDisco() {
        DiscoDuro discoduro = new DiscoDuro();
        discoduro.setMarca("setgate");
        discoduro.setMemoria(10000);
        discoduro.setNumSerie(1233455);
        computadora.setDiscoduro(discoduro);
    }

    @Override
    void buildMemoria() {
        MemoriaRam memoriaram = new MemoriaRam();
        memoriaram.setMemoria("16 GB");
        memoriaram.setNumSerie(3533636);
        computadora.setMemoriaram(memoriaram);
    }

    @Override
    void buildMonitor() {
        Monitor monitor = new Monitor();
        monitor.setMarca("ViewSonic");
        monitor.setCalidad(" 1080 p");
        monitor.setNumSerie(2324232);
        computadora.setMonitor(monitor);
    }

    @Override
    void buildProcesador() {
        Procesador procesador =  new Procesador();
        procesador.setMarca("Intel");
        procesador.setModelo("I7");
        procesador.setNumSerie(2345766);
        computadora.setProcesador(procesador);
    }

    @Override
    void buildteclado() {
        Teclado teclado = new Teclado();
        teclado.setMarca("Logitech");
        teclado.setNumSerie(3242342);
        computadora.setTeclado(teclado);
    }
    
}
