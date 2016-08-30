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
public class Idiomas extends App2 {
     private String nombre;
    private double version;
    private String tipo;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the version
     */
    public double getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(double version) {
        this.version = version;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    protected void concepcion() {
        System.out.println("Concepcion app");
    }

    @Override
    protected void diseño() {
        System.out.println("diseño app");
    }

    @Override
    protected void planificacion() {
        System.out.println("planificacion app");
    }

    @Override
    protected void produccion() {
        System.out.println("produccion app");
    }

    @Override
    protected void pruebas() {
        System.out.println("pruebas app");
    }
}
