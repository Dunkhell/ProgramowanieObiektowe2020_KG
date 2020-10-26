package wmii.uwm.edu.pl;

class RachunekBankowy{
    private static double rocznaStopaProcentowa;
    private double saldo;

    public RachunekBankowy(double saldoStartowe){
        this.saldo=saldoStartowe;
    }

    public void wypiszSaldo(){
        System.out.println("Saldo wynosi: "+saldo);
    }

    public void obliczMiesieczneOdsetki(){
        this.saldo+=(this.saldo*rocznaStopaProcentowa)/12;
    }

    public static void setRocznaStopaProcentowa(double nowaRocznaStopa){
        rocznaStopaProcentowa= nowaRocznaStopa;
    }

}