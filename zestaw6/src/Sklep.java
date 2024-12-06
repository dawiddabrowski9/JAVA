import java.util.ArrayList;

public class Sklep {
    ArrayList<Produkt> produkty;

    public Sklep() {
        this.produkty = new ArrayList<>();
    }

    public void dodajProdukt(Produkt produkt){
        produkty.add(produkt);
    }

    public void wyswietlOferty(){
        for(Produkt produkt : produkty){
            produkt.wyswietlInformacje();
        }
    }

    public Produkt wyszukajProduktu(String nazwa){
        for(Produkt produkt : produkty){
            if(produkt.getNazwa().equals(nazwa)) return produkt;
        }
        return null;
    }

    public void zakupy(String nazwa, int ilosc, KoszykZakupowy koszyk){
        Produkt produkt = wyszukajProduktu(nazwa);
        if(produkt != null){
            if(produkt.getIloscNaMagazynie() >= ilosc){
                koszyk.dodajProdukt(produkt, ilosc);
                produkt.usunZMagazynu(ilosc);
            }
        }
    }
}
