public class FiguriGeometrice {
    private String forma;
    private String simetrie;
    private double suprafata;
    private double aria;
    private int dimensiune;
    private String culoare;

    public FiguriGeometrice(String forma,String simetrie, double suprafata, double aria,int dimensiune,
   String culoare ) {
        this.forma=forma;
        this.simetrie = simetrie;
        this.suprafata = suprafata;
        this.aria = aria;
        this.dimensiune = dimensiune;
        this.culoare = culoare;
    }
    public String getForma(){
        return this.forma;
    }
    public void setForma(String forma){
        this.forma=forma;
    }
    public String getSimetrie(){
        return this.simetrie;
    }
    public void setSimetrie(String simetrie) {
        this.simetrie = simetrie;
    }
    public double getSuprafata(){
        return this.suprafata;
    }
    public void setSuprafata(double suprafata){
        this.suprafata = suprafata;
    }
    public double getAria(){
        return this.aria;
    }
    public void setAria(double aria) {
        this.aria = aria;
    }
    public int getDimensiune(){
        return this.dimensiune;
        }
    public void setDimensiune(int dimensiune){
            this.dimensiune = dimensiune;
        }
    public String getCuloare(){
        return this.culoare;
    }
    public void setCuloare(String culoare){
        this.culoare = culoare;
    }
}
