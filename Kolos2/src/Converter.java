interface Converter{
    abstract double convertToEuro(double amount);
    abstract double convertToUSD(double amount);
    abstract double getConversionRate(String currency);
}