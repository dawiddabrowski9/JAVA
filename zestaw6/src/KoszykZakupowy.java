import java.util.ArrayList;

public class KoszykZakupowy {
    private ArrayList<Produkt> lista_produktow;
    private ArrayList<Integer> ilosc_produktow;

    public KoszykZakupowy() {
        this.lista_produktow = new ArrayList<>();
        this.ilosc_produktow = new ArrayList<>();
    }

    public void dodajProdukt(Produkt produkt, int ilosc) {
        if(produkt.getIloscNaMagazynie() >= ilosc){
            lista_produktow.add(produkt);
            ilosc_produktow.add(ilosc);
            produkt.usunZMagazynu(ilosc);
        }
    }

    public void wyswietlZawartoscKoszyka(){
        int i = 0;
        for (Produkt produkt : lista_produktow) {
            System.out.println("Nazwa: "+produkt.getNazwa()+" Cena: "+produkt.getCena()+" Ilość w koszyku: "+ilosc_produktow.get(i));
            i++;
        }
    }

    public double obliczCalkowitaWartosc() {
        double suma = 0;
        for (int i = 0; i < lista_produktow.size(); i++) {
            Produkt produkt = lista_produktow.get(i);
            int ilosc = ilosc_produktow.get(i);
            suma += produkt.getCena() * ilosc;
        }
        return Math.round(suma * 100.0) / 100.0;
    }
}
