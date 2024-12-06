public class Platnosc {
    private double kwota;
    private String statusPlatnosci;

    public Platnosc(double kwota) {
        this.statusPlatnosci = "Nieopłacone";
        this.kwota = kwota;
    }

    public void zaplac(double kwota){
        statusPlatnosci = "Opłacone";
        this.kwota = kwota;
    }

    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }
}
