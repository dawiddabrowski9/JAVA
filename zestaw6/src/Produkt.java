public class Produkt {

    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public void wyswietlInformacje(){
        System.out.println("Nazwa: " + nazwa + " Cena: " + cena + " Ilość na magazynie: "+ iloscNaMagazynie);
    }

    public void dodajDoMagazynu(int ilosc){
        iloscNaMagazynie += ilosc;
    }

    public void usunZMagazynu(int ilosc){
        if(iloscNaMagazynie-ilosc > 0){
            iloscNaMagazynie -= ilosc;
        }
    }

    public int getIloscNaMagazynie() {
        return iloscNaMagazynie;
    }
    public double getCena() {
        return cena;
    }
    public String getNazwa() {
        return nazwa;
    }
}
