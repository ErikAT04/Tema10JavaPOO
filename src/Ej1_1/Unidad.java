package Ej1_1;

public class Unidad {
    private String medidaDims;
    private String medidaVolumen;

    public Unidad(String medidaDims, String medidaVolumen) {
        this.medidaDims = medidaDims;
        this.medidaVolumen = medidaVolumen;
    }

    public String getMedidaDims() {
        return medidaDims;
    }

    public String getMedidaVolumen() {
        return medidaVolumen;
    }
}