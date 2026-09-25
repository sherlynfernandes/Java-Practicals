class User
{
    int userID;
    String userName;
    String mobileNumber;

    User(int id, String name, String mobile)
    {
        userID = id;
        userName = name;
        mobileNumber = mobile;
    }

    void displayUserDetails()
    {
        System.out.println("User ID: " + userID);
        System.out.println("User Name: " + userName);
        System.out.println("Mobile Number: " + mobileNumber);
    }
}


class Customer extends User
{
    String customerAddress;
    int orderID;

    Customer(int id, String name, String mobile, String address, int order)
    {
        super(id, name, mobile);

        customerAddress = address;
        orderID = order;
    }
}


class PremiumCustomer extends Customer
{
    String membershipType;
    double discountPercentage;

    PremiumCustomer(int id, String name, String mobile,
                    String address, int order,
                    String membership, double discount)
    {
        super(id, name, mobile, address, order);

        membershipType = membership;
        discountPercentage = discount;
    }

    double calculateDiscount(double amount)
    {
        return amount * discountPercentage / 100;
    }

    double finalBill(double amount)
    {
        double discount = calculateDiscount(amount);

        return amount - discount;
    }

    void displayDetails()
    {
        System.out.println("----- Premium Customer Details -----");

        displayUserDetails();

        System.out.println("Customer Address: " + customerAddress);
        System.out.println("Order ID: " + orderID);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Discount Percentage: " + discountPercentage + "%");
    }


    public static void main(String[] args)
    {
        PremiumCustomer customer = new PremiumCustomer(
            101,
            "Sherlyn",
            "9876543210",
            "Mumbai",
            5001,
            "Gold",
            20
        );

        customer.displayDetails();

        double orderAmount = 5000;

        double discount = customer.calculateDiscount(orderAmount);
        double bill = customer.finalBill(orderAmount);

        System.out.println("\nOrder Amount: Rs." + orderAmount);
        System.out.println("Discount Amount: Rs." + discount);
        System.out.println("Final Bill Amount: Rs." + bill);
    }
}