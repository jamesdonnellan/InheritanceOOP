package ie.atu.week8;

public class PreferredCustomer extends Customer {
    private int loyaltyPoints;
    private double DiscountReceived;


    public PreferredCustomer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList) // Constructor that calls customer constructor//
    {
        super(name,address,phoneNumber, customerNumber, mailingList); // Calls parent constructor from customer class //
        this.loyaltyPoints = 0;
        this.DiscountReceived = 0.0;
    }

    public PreferredCustomer(int loyaltyPoints)
    {
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        setDiscountReceived(); // Sets Discount based on loyalty points //
    }

    public int getLoyaltyPoints()
    {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints)
    {
        this.loyaltyPoints = loyaltyPoints;
        setDiscountReceived(); // Recalculating discount when loyalty points change //
    }

    public double getDiscountReceived()
    {
        return DiscountReceived;
    }

    public void setDiscountReceived()
    {
        if(loyaltyPoints >= 2000)
        {
            DiscountReceived = 0.10;
        }
        else if(loyaltyPoints >= 1500)
        {
            DiscountReceived = 0.07;
        }
        else if(loyaltyPoints >= 1000)
        {
            DiscountReceived = 0.06;
        }
        else if(loyaltyPoints >= 500)
        {
            DiscountReceived = 0.05;
        }
        else
        {
            DiscountReceived = 0.0;
        }
    }

    @Override
    public String toString() {
        return "PreferredCustomer{" +
                "loyaltyPoints='" + loyaltyPoints + '\'' +
                ", discountReceived= '" + (DiscountReceived * 100) + '\'' +
                '}';
    }
}