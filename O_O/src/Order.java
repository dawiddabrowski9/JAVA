public class Order implements Comparable<Order> {
    private String productName;
    private int quantity;
    private double unitPrice;

    public Order(String productName, int quantity, double unitPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    @Override
    public int compareTo(Order other) {
        int priceComparison = Double.compare(other.unitPrice, this.unitPrice);
        if (priceComparison != 0) {
            return priceComparison;
        }
        return Integer.compare(this.quantity, other.quantity);
    }
}
