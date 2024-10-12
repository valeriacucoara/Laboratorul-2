public class Figura2 extends FiguriGeometrice {

    private int lungime;
    private int latime;

    public Figura2(String forma,String simetrie, double suprafata, double aria,int dimensiune,
                   String culoare, int lungime, int latime) {
        super(forma, simetrie, suprafata, aria, dimensiune, culoare);
        this.lungime = lungime;
        this.latime = latime;
    }
    public int getLungime(){
        return this.lungime;
    }
    public void setLungime(int lungime){
        this.lungime= lungime;
    }
    public int getLatime(){
        return this.latime;
    }
    public void setLatime(int latime){
        this.latime=latime;
    }
    public String toString(){
            return getForma() + " " + getSimetrie() + " " + getSuprafata() + " " + getAria() + " " +
                    getDimensiune() + " " + getCuloare() + " " + this.lungime + " " + this.latime;
        }
    }
