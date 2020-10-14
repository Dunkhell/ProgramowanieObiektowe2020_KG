package uwm.lab03;

public class zadanie1 {
    public int nieparzyste=0;
    public int parzyste=0;
    public int ujemne=0;
    public int dodatnie=0;
    public int zera=0;
    public int max;
    public int ileRazy=1;
    public int sumDodatnie=0;
    public int sumUjemne=0;
    public int maxDl=0;
    public int terazDl=1;

    public void przyka(int []tab, int n){
        for (int i=0;i<n;i++){
            if (tab[i]%2==0){
                this.parzyste+=1;
            }
            else{
                this.nieparzyste+=1;
            }
        }
    }
    public void przykb(int []tab,int n){
        for (int i=0;i<n;i++){
            if (tab[i]==0)
                this.zera+=1;
            else if (tab[i]>=0)
                this.dodatnie+=1;
            else
                this.ujemne+=1;
        }
    }
    public void przykc(int[]tab,int n){
        this.max=tab[0];
        for (int i=1;i<n;i++){
            if (tab[i]>this.max){
                this.max=tab[i];
                this.ileRazy=1;
            }
            if (tab[i]==this.max){
                this.ileRazy=+1;
            }
        }
    }
    public void przykd(int []tab,int n){
        for (int i=0;i<n;i++){
            if (tab[i]>=0){
                this.sumDodatnie+=tab[i];
            }
            else{
                this.sumUjemne+=tab[i];
            }
        }
    }
    public void przyke(int []tab, int n){
        for (int i=0;i<n;i++){
            if (tab[i]>=0)
                this.terazDl+=1;
            if (this.terazDl>this.maxDl)
                this.maxDl=terazDl;
            if (tab[i]<0){
                this.terazDl=0;
            }
        }
    }
    public void przykf (int[] tab,int n){
        System.out.println("zmieniona tablica: ");
        for (int i=0;i<n;i++){
            if (tab[i]<0){
                tab[i]=-1;
            }
            else
                tab[i]=1;
            System.out.println("tab["+i+"]= "+tab[i]);
        }
    }
    public void przykg (int []tab, int n,int lewy, int prawy){
        int []klon= new int [n];
        int koniec=prawy;
        System.arraycopy(tab,0,klon,0,n);
        for (int i=lewy;i<prawy+1;i++) {
            tab[i] = klon[koniec];
            koniec -= 1;
        }
        System.out.println("zmieinona tablica przyklad G: ");
        for (int i=0;i<n;i++){
            System.out.println("tab["+i+"]= "+tab[i]);
        }
    }

}
