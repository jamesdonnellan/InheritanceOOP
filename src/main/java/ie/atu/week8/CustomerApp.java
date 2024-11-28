package ie.atu.week8;

public class CustomerApp
{
    public static void main(String[] args) {
        Customer Cust1 = new Customer("James", "ATU", "34567", "ATU123", false);
        System.out.println(Cust1.toString());
    }
}