public class UnitConverter implements Converter{
    @Override
    public double convertToEuro(double amount) {
        return amount * 4.2;
    }

    @Override
    public double convertToUSD(double amount) {
        return amount * 3.5;
    }

    @Override
    public double getConversionRate(String currency) {
        if(currency == "USD"){
            return 3.5;
        } else if (currency=="Euro") {
            return 4.2;
        }
        else{
            return 0;
        }
    }
}
