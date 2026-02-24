
package com.mycompany.caficultores;

public class LoteCafe {
    private String varietal;
    private String notasCata;
    private String lugarOrigen;
    private double alturaCultivo; 
    private String nombreProductor;
    private double cantidadLibras;

    public LoteCafe(String varietal, String notasCata, String lugarOrigen,
                    double alturaCultivo, String nombreProductor, double cantidadLibras) {
        this.varietal = varietal;
        this.notasCata = notasCata;
        this.lugarOrigen = lugarOrigen;
        this.alturaCultivo = alturaCultivo;
        this.nombreProductor = nombreProductor;
        this.cantidadLibras = cantidadLibras;
    }

    public String getVarietal() { return varietal; }
    public String getNotasCata() { return notasCata; }
    public String getLugarOrigen() { return lugarOrigen; }
    public double getAlturaCultivo() { return alturaCultivo; }
    public String getNombreProductor() { return nombreProductor; }
    public double getCantidadLibras() { return cantidadLibras; }

    @Override
    public String toString() {
        return "=== Nuevo Lote de Café Especial ===" +
               "\n  Varietal       : " + varietal +
               "\n  Notas de cata  : " + notasCata +
               "\n  Origen         : " + lugarOrigen +
               "\n  Altura cultivo : " + alturaCultivo + " msnm" +
               "\n  Productor      : " + nombreProductor +
               "\n  Disponible     : " + cantidadLibras + " libras";
    }
}
