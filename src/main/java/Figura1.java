public class Figura1 extends FiguriGeometrice {
    private int raza;
    private double circumferinta;

    public Figura1(String forma, String simetrie, double suprafata, double aria, int dimensiune,
                   String culoare, int raza, double circumferinta) {
        super(forma, simetrie, suprafata, aria, dimensiune, culoare);
        this.raza = raza;
        this.circumferinta = circumferinta;
    }

    public int getRaza() {
        return this.raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }

    public double getCircumferinta() {
        return this.circumferinta;
    }

    public void setCircumferinta(double circumferinta) {
        this.circumferinta = circumferinta;
    }

    public String toString() {
            return getForma() + " " + getSimetrie() + " " + getSuprafata() + " " + getAria() + " " +
                    getDimensiune() + " " + getCuloare() + " " + this.raza + " " + this.circumferinta;
    }
}