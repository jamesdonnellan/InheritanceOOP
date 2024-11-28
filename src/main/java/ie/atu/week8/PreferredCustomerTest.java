package ie.atu.week8;

import java.sql.SQLOutput;

public class PreferredCustomerTest
{
    public static void main(String[] args)
    {
        PreferredCustomer preferredCustomer2 = new PreferredCustomer("Paul", "ATU", "091 775678", 1002, false);

    preferredCustomer2.addLoyaltyPoints(700);
    System.out.println(preferredCustomer2);

    preferredCustomer2.addLoyaltyPoints(800);
    System.out.println(preferredCustomer2);
    }
}

