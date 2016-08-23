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
public class Piloto extends Persona{
    private int  numEmpleado;
    private int horasVuelo;

    /**
     * @return the numEmpleado
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }

    /**
     * @param numEmpleado the numEmpleado to set
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    /**
     * @return the horasVuelo
     */
    public int getHorasVuelo() {
        return horasVuelo;
    }

    /**
     * @param horasVuelo the horasVuelo to set
     */
    public void setHorasVuelo(int horasVuelo) {
        this.horasVuelo = horasVuelo;
    }
}
