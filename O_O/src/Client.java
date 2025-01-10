import java.util.Objects;

public class Client implements Comparable<Client> {
    private String lastName;
    private double balance;

    public Client(String lastName, double balance) {
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public int compareTo(Client other) {
        int balanceComparison = Double.compare(this.balance, other.balance);
        if (balanceComparison != 0) {
            return balanceComparison;
        }
        return this.lastName.compareTo(other.lastName);
    }

    @Override
    public String toString() {
        return "Client{lastName='" + lastName + "', balance=" + balance + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return Double.compare(client.balance, balance) == 0 && Objects.equals(lastName, client.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, balance);
    }
}
