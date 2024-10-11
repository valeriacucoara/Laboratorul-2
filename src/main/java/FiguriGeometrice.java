public class FiguriGeometrice {
    private String forma;
    private double lungime;
    private double latime;
    private String culoare;

    public FiguriGeometrice(String forma,double lungime, double latime, String culoare) {
        this.forma=forma;
        this.lungime = lungime;
        this.latime = latime;
        this.culoare = culoare;
    }
    public String getForma(){
        return this.forma;
    }
    public void setForma(String forma){
        this.forma=forma;
    }
    public double getLungime(){
        return this.lungime;
    }
    public void setLungime(double lungime) {
        this.lungime = lungime;
    }
    public double getLatime(){
        return this.latime;
    }
    public void setLatime(double latime){
        this.latime = latime;
    }
    public String getCuloare(){
        return this.culoare;
    }
    public void setCuloare(String culoare){
        this.culoare = culoare;
    }
    public String toString(){
        return this.forma + " " + this.lungime + " " + this.latime + " " + this.culoare + " ";
    }
}
