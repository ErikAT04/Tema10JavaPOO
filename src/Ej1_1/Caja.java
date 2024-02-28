package Ej1_1;

public class Caja {
    int ancho;
    int alto;
    int fondo;
    String etiqueta;
    Unidad unidad;
    public Caja(int ancho, int alto, int fondo, Unidad unidad){
        this.unidad = unidad;
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
    }
    double getVolumen() {
        if (unidad.getMedidaDims().equals("cm")&&unidad.getMedidaVolumen().equals("m3")){
            return (double) (ancho*alto*fondo)/1000000;
        } else if (unidad.getMedidaDims().equals("m")&&unidad.getMedidaVolumen().equals("cm3")){
            return (ancho*alto*fondo)*1000000;
        } else {
            return (ancho*alto*fondo);
        }
    }
    void setEtiqueta(String etiqueta){
        this.etiqueta = etiqueta;
    }

    @Override
    public String toString() {
        return ("Caja: " + this.etiqueta +
                "\nAltura: " + this.alto + unidad.getMedidaDims() +
                "\nAncho: " + this.ancho + unidad.getMedidaDims() +
                "\nProfundidad: " + this.fondo + unidad.getMedidaDims()) +
                "\nVolumen: " + getVolumen() + unidad.getMedidaVolumen();
    }
}
