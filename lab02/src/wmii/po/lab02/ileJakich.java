package wmii.po.lab02;

public class ileJakich {
    public int dodatnie;
    public int ujemne;
    public int zera;

    public ileJakich(int x,int y,int z){
        this.dodatnie=x;
        this.ujemne=y;
        this.zera=z;
    }
    static public void wypisz(ileJakich x)
    {
        System.out.println(
                "Liczb dodatnich jest: " +x.dodatnie+"\n"+
                "Liczby ujemnych jest: " +x.ujemne+"\n"+
                "Zer jest: " +x.zera);

    }

}
