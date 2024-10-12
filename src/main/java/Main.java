public class Main {
    public static void main(String[] args){
        Figura1 cerc = new Figura1("Cerc","Simetric fata de orice axa care trece prin centrul sau"
                ,7.21,5.55,15,"Albastru",6,2.9);
        Figura2 dreptunghi = new Figura2("Dreptunghi"," Simetric fata de axele sale de simetrie",
                23.4,4.5,25,"Portocaliu",2,4);

        System.out.println("Figura1 este:"+cerc);
        System.out.println("Figura2 este:"+dreptunghi);
    }
}