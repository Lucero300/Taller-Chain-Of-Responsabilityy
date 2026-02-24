
package com.mycompany.caficultores;
public class Main {
    public static void main(String[] args) {

        CooperativaCafes cooperativa = new CooperativaCafes();

        Barista barista1 = new Barista("Carlos Ramírez", "B-001");
        Barista barista2 = new Barista("Laura Gómez", "B-002");
        Barista barista3 = new Barista("Andrés Torres", "B-003");

        System.out.println("=== Sistema de Cooperativa de Cafés Especiales ===\n");

        cooperativa.suscribir(barista1);
        cooperativa.suscribir(barista2);
        cooperativa.suscribir(barista3);

        System.out.println("\n--- Lote 1 ---");
        cooperativa.registrarNuevoLote(
            "Bourbón Rosado",
            "Notas de frutos rojos, moras, cereza, caramelo, acidez media alta y residual prolongado a cacao",
            "Acevedo, Huila",
            1250,
            "Finca El Paraíso",
            45.0
        );

        System.out.println("\n--- Eliminando suscripción de " + barista2.getNombre() + " ---");
        cooperativa.eliminarSuscripcion(barista2);

        System.out.println("\n--- Lote 2 ---");
        cooperativa.registrarNuevoLote(
            "Geisha",
            "Notas florales de jazmín, bergamota, durazno blanco y té verde",
            "Génova, Quindío",
            1800,
            "Hacienda La Montaña",
            30.0
        );

        System.out.println("\n--- Intentando suscribir barista ya registrado ---");
        cooperativa.suscribir(barista1);

        System.out.println("\n--- Lote 3 ---");
        cooperativa.registrarNuevoLote(
            "Tabi",
            "Notas de chocolate negro, panela, frutas tropicales y cuerpo cremoso",
            "Pitalito, Huila",
            1600,
            "Finca Bella Vista",
            50.0
        );
    }
}
