
package com.mycompany.caficultores;
import java.util.ArrayList;
import java.util.List;

public class CooperativaCafes implements Subject {
    private List<Observer> suscriptores;
    private LoteCafe ultimoLote;

    public CooperativaCafes() {
        this.suscriptores = new ArrayList<>();
    }

    @Override
    public void suscribir(Observer observer) {
        if (!suscriptores.contains(observer)) {
            suscriptores.add(observer);
            System.out.println("✔ Suscripción registrada: " + observer);
        } else {
            System.out.println("⚠ El barista ya está suscrito.");
        }
    }

    @Override
    public void eliminarSuscripcion(Observer observer) {
        if (suscriptores.remove(observer)) {
            System.out.println("✔ Suscripción eliminada: " + observer);
        } else {
            System.out.println("⚠ El barista no estaba suscrito.");
        }
    }

    @Override
    public void notificar() {
        if (ultimoLote == null) {
            System.out.println("⚠ No hay lote registrado para notificar.");
            return;
        }
        System.out.println("\n>>> Notificando a " + suscriptores.size() + " barista(s)...");
        for (Observer obs : suscriptores) {
            obs.actualizar(ultimoLote);
        }
    }

    public void registrarNuevoLote(String varietal, String notasCata, String lugarOrigen,
                                   double alturaCultivo, String nombreProductor, double cantidadLibras) {
        this.ultimoLote = new LoteCafe(varietal, notasCata, lugarOrigen,
                                       alturaCultivo, nombreProductor, cantidadLibras);
        System.out.println("\n[Cooperativa] Nuevo lote registrado: " + varietal + " de " + nombreProductor);
        notificar();
    }

    public List<Observer> getSuscriptores() {
        return suscriptores;
    }
}
