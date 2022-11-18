package com.company.TemplatePattern;

public class CryptoOrder extends OrderProcessTemplate {

    public CryptoOrder()
    {
        System.out.println("------------- Selecting items online (crypto order)");
    }

    @Override
    public void handlePayment(PaymentType paymentType) {
        if (isValidpaymentType(paymentType))
            System.out.println("Handling Payment for ordering by digital currency. Payment type is: " + paymentType);

        else System.out.println("Invalid Payment!");

    }

    private boolean isValidpaymentType(PaymentType paymentType)
    {
        return paymentType == PaymentType.CRYPTO;
    }

    @Override
    public void handleDelivery(Customer customer) {

        System.out.println(customer.getFirstName() + " " +  customer.getLastName() +" It will take some time to deliver the physical items to your" +
                " address");
        System.out.println("Your order of " + customer.getListOfItem().size() + " has been processed!");
    }
}
