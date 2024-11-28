package ie.atu.week8;

public class Customer extends Person
{
    private String cust_num;
    private boolean mailingList;


    public Customer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList) // calls parent
    {
        super(); // calls parent constructor from person class //
    }

    public Customer(String name, String address, String phone, String cust_num, boolean mailingList)
    {

        super(name, address, phone); // this asks the parent to deal with these fields //
        this.cust_num = cust_num;
        this.mailingList = mailingList;
    }

    public String getCust_num() {
        return cust_num;
    }

    public void setCust_num(String cust_num) {
        this.cust_num = cust_num;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() { // calls customer.tostring() //
        // This calls person.tostring() //
        return super.toString() + " " + "Customer" +
                "cust_num='" + cust_num + '\'' +
                ", mailingList=" + mailingList +
                '}';
    }
}

