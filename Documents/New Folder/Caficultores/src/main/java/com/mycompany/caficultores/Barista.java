
package com.mycompany.caficultores;
public class Barista implements Observer {
    private String nombre;
    private String identificacion;

    public Barista(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() { return nombre; }
    public String getIdentificacion() { return identificacion; }

    @Override
    public void actualizar(LoteCafe lote) {
        System.out.println("\n[Notificación para Barista: " + nombre + " (ID: " + identificacion + ")]");
        System.out.println(lote.toString());
    }

    @Override
    public String toString() {
        return "Barista{nombre='" + nombre + "', id='" + identificacion + "'}";
    }
}