
package com.mycompany.caficultores;

public interface Subject {
    void suscribir(Observer observer);
    void eliminarSuscripcion(Observer observer);
    void notificar();
}
