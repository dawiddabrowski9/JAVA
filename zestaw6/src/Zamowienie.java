public class Zamowienie {
    private KoszykZakupowy koszykZakupowy;
    private String statusZamowienia;
    private Platnosc platnosc;

    public Zamowienie(KoszykZakupowy koszykZakupowy, String statusZamowienia) {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = statusZamowienia;
        this.platnosc = new Platnosc(koszykZakupowy.obliczCalkowitaWartosc());
    }

    public void ustawStatusZamowienia(String status) {
        this.statusZamowienia = status;
    }

    public void wyswietlZamowienie(){
        System.out.println("Status zamówienia: "+statusZamowienia);
        koszykZakupowy.wyswietlZawartoscKoszyka();
    }

    public KoszykZakupowy getKoszykZakupowy(){
        return koszykZakupowy;
    }

    public void finalizujZamowienie(){
        if(platnosc.getStatusPlatnosci().equals("Opłacony")) {
            statusZamowienia = "Gotowe do wysyłki";
        }
    }

    /*
    public void zwrocProdukt(String nazwaProduktu, int ilosc) {
        koszykZakupowy.zwrocProdukt(nazwaProduktu, ilosc);
        platnosc = new Platnosc(koszykZakupowy.obliczCalkowitaWartosc());
    }
     */
}
