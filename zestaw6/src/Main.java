public class Main {
    public static void main(String[] args) {
        System.out.println("Zadanie 1: ");
        Produkt produkt = new Produkt("Ser", 4,50);
        produkt.wyswietlInformacje();
        produkt.dodajDoMagazynu(50);
        produkt.wyswietlInformacje();
        produkt.usunZMagazynu(90);
        produkt.wyswietlInformacje();

        System.out.println("Zadanie 2: ");
        KoszykZakupowy koszyk = new KoszykZakupowy();
        Produkt produkt1 = new Produkt("Awokado", 9.30,50);
        Produkt produkt2 = new Produkt("Mleko", 6.50,25);
        Produkt produkt3 = new Produkt("Szynka", 2.80,45);
        koszyk.dodajProdukt(produkt1, 1);
        koszyk.dodajProdukt(produkt2, 3);
        koszyk.dodajProdukt(produkt3, 3);
        koszyk.wyswietlZawartoscKoszyka();
        System.out.println("Wartosc koszyka: "+koszyk.obliczCalkowitaWartosc());
        produkt1.wyswietlInformacje();
        produkt2.wyswietlInformacje();
        produkt3.wyswietlInformacje();

        System.out.println("Zadanie 3:");
        Zamowienie zamowienie = new Zamowienie(koszyk, "Przyjęty");
        zamowienie.wyswietlZamowienie();
        zamowienie.ustawStatusZamowienia("Opłacony");
        zamowienie.wyswietlZamowienie();

        System.out.println("Zadanie 4:");
        KoszykZakupowy koszyk2 = new KoszykZakupowy();
        koszyk2.dodajProdukt(produkt2, 5);
        koszyk2.dodajProdukt(produkt1, 3);
        Zamowienie zamowienie1 = new Zamowienie(koszyk2, "Przyjęty");
        Klient k1 = new Klient("Paweł", "Kowalski");
        k1.dodajZamowienie(zamowienie);
        k1.dodajZamowienie(zamowienie1);
        k1.wyswietlHistorieZamowien();
        System.out.println("Łączny koszt zamowien: " + k1.obliczLacznyKosztZamowien());

        System.out.println("Zadanie 5:");
        Sklep sklep1 = new Sklep();
        sklep1.dodajProdukt(produkt1);
        sklep1.dodajProdukt(produkt3);
        System.out.println("Sklep:");
        sklep1.wyswietlOferty();
        sklep1.zakupy("Szynka", 3, koszyk2);
        System.out.println("Koszyk:");
        koszyk2.wyswietlZawartoscKoszyka();

        //ZESTAW 7
        Magazyn magazyn = new Magazyn();
        magazyn.dodajProdukt(produkt,5);
        magazyn.wyswietlAsortyment();

    }
}